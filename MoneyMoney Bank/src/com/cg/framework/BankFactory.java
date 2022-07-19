package com.cg.framework;

public interface BankFactory {
	public SavingAcc getNewSavingAccount(int AccNo, String accNm, float accBal, float isSalaried);
	public CurrentAcc getNewCurrentAccount(int AccNo, String accNm, float accBal, float creditLimit);

}
