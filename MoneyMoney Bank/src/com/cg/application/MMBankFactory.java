package com.cg.application;

import com.cg.framework.BankFactory;
import com.cg.framework.CurrentAcc;
import com.cg.framework.SavingAcc;

public class MMBankFactory implements BankFactory{

	@Override
	public SavingAcc getNewSavingAccount(int AccNo, String accNm, float accBal, float isSalaried) {
		
		MMSavingAcc mmsa = new MMSavingAcc(AccNo, accNm, isSalaried, false);
		
		return mmsa;
	}

	@Override
	public CurrentAcc getNewCurrentAccount(int AccNo, String accNm, float accBal, float creditLimit) {
	
		MMCurrentAcc mmca = new MMCurrentAcc(AccNo, accNm, creditLimit);
		
		return mmca;
	}
}
