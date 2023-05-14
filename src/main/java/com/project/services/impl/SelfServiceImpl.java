package com.project.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.project.model.FormModel;
import com.project.repositories.SelfRepo;
import com.project.services.SelfService;

@Component
public class SelfServiceImpl implements SelfService{

	@Autowired
	private SelfRepo selfRepo;
	
	/*
	 * @Autowired private SelfEntity selfEntity;
	 */
	
	@Override
	public void gettingSelfData(FormModel formModel) {
		/*
		 * this.selfEntity.setName(formModel.getName());
		 * this.selfEntity.setBirthDate(formModel.getBirthDate());
		 * this.selfEntity.setAge(formModel.getAge());
		 * this.selfEntity.setMobileNo(formModel.getMobileNo());
		 * this.selfEntity.setInhabitant(formModel.getInhabitant());
		 * this.selfEntity.setAadharNo(formModel.getAadharNo());
		 * this.selfEntity.setCast(formModel.getCast());
		 * this.selfEntity.setEmail(formModel.getEmail());
		 * this.selfEntity.setLanguages(formModel.getLanguages());
		 * this.selfEntity.setAddress(formModel.getAddress());
		 * this.selfEntity.setLoginEntity(formModel.getLoginEntity());
		 * 
		 * //saving data to db this.selfRepo.save(selfEntity);
		 */
	}

}
