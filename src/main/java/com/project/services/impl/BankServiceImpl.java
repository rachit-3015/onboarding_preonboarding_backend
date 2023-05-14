package com.project.services.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.project.model.FormModel;
import com.project.repositories.BankRepo;
import com.project.services.BankService;

public class BankServiceImpl implements BankService {

	/*
	 * @Autowired private BankEntity bankEntity;
	 */
	
	@Autowired
	private BankRepo bankRepo;

	@Override
	public void gettingBankData(FormModel formModel) {
		// TODO Auto-generated method stub
		
	}
	
	/*
	 * @Override public void gettingBankData(FormModel formModel) {
	 * this.bankEntity.setBankName(formModel.getBankName());
	 * this.bankEntity.setAccountNo(formModel.getAccountNo());
	 * this.bankEntity.setBranchCode(formModel.getBranchCode());
	 * this.bankEntity.setIfscCode(formModel.getIfscCode());
	 * this.bankEntity.setCifNo(formModel.getCifNo());
	 * this.bankEntity.setLoginEntity(formModel.getLoginEntity());
	 * 
	 * //saving data to db bankRepo.save(bankEntity); }
	 */

}
