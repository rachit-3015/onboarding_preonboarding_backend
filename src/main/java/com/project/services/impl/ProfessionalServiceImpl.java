package com.project.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.project.model.FormModel;
import com.project.repositories.ProfessionalRepo;
import com.project.services.ProfessionalService;

@Component
public class ProfessionalServiceImpl implements ProfessionalService {
	
	/*
	 * @Autowired private ProfessionalEntity professionalEntity;
	 */
	
	@Autowired
	private ProfessionalRepo professionalRepo;
	
	@Override
	public void saveProfessionalData(FormModel formModel) {
		//dp is left to be set
		/*
		 * this.professionalEntity.setOnboardedDate(formModel.getOnboardedDate());
		 * this.professionalEntity.setPosition(formModel.getPosition());
		 * this.professionalEntity.setAssignedGroup(formModel.getAssignedGroup());
		 * this.professionalEntity.setSalary(formModel.getSalary());
		 * this.professionalEntity.setPanNo(formModel.getPanNo());
		 * this.professionalEntity.setEducation(formModel.getEducation());
		 * this.professionalEntity.setAlmaMater(formModel.getAlmaMater());
		 * this.professionalEntity.setYop(formModel.getYop());
		 * this.professionalEntity.setPriorCompaniesName(formModel.getPriorCompaniesName
		 * ()); this.professionalEntity.setLoginEntity(formModel.getLoginEntity());
		 * 
		 * //saving data to db this.professionalRepo.save(professionalEntity);
		 */
	}

}
