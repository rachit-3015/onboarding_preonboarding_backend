package com.project.services;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;


@Component
public class ImageUploadHelper {

	public final String UPLOAD_DIR="C:\\Users\\RACHIT\\Documents\\workspace-spring-tool-suite-4-4.16.1.RELEASE\\project_backend\\src\\main\\resources\\static\\image";

	public boolean uploadImage(MultipartFile multipartFile) {
		boolean f = false;
		try {
			InputStream is = multipartFile.getInputStream();
			byte data[] = new byte[is.available()];
			is.read(data);
			
			//write
//			FileOutputStream fileOutputStream = new FileOutputStream(UPLOAD_DIR+File.separator+multipartFile.getOriginalFilename());
//			fileOutputStream.write(data);
//			fileOutputStream.flush();
//			fileOutputStream.close();
//			f = true;
			
			Files.copy(multipartFile.getInputStream(),Paths.get(UPLOAD_DIR+File.separator+multipartFile.getOriginalFilename()),StandardCopyOption.REPLACE_EXISTING);
			f=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}

}
