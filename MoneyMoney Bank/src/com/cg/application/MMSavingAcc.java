
package com.cg.application;

import com.cg.framework.SavingAcc;

public class MMSavingAcc extends SavingAcc{


	private static final float MINBAL=100;
	
	public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalary) {
		super(accNo, accNm, accBal, isSalary);
	}


    public void withdraw(float accBal){
    	
    	System.out.println("Dear Savings Account Customer, Your cash is withdrawn and the current balance is:"+accBal);
		
	}


	@Override
	public String toString() {
		return "MMSavingAcc [isSalary()=" + isSalary() + ", toString()=" + super.toString() + ", getAccNo()="
				+ getAccNo() + ", getAccNm()=" + getAccNm() + ", getAccBal()=" + getAccBal() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}}