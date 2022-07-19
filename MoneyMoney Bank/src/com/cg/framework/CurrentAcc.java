package com.cg.framework;

public abstract class CurrentAcc extends BankAcc{

	private final float creditLimit=100;
	

	public CurrentAcc(int accNo, String accNm, float accBal) {
		super(accNo, accNm, accBal);
		
	}


	
 public float getCreditLimit() {
		return creditLimit;
	}


 public void withdraw(float creditLimit) {
	 
	 System.out.println("Account balance:"+creditLimit);
	 
 }


@Override
public String toString() {
	return "CurrentAcc [creditLimit=" + creditLimit + ", getCreditLimit()=" + getCreditLimit() + ", getAccNo()="
			+ getAccNo() + ", getAccNm()=" + getAccNm() + ", getAccBal()=" + getAccBal() + ", toString()="
			+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
}



}