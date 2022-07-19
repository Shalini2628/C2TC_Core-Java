package com.cg.client;

import com.cg.application.MMBankFactory;
import com.cg.application.MMCurrentAcc;
import com.cg.application.MMSavingAcc;
import com.cg.framework.BankFactory;
import com.cg.framework.CurrentAcc;
import com.cg.framework.SavingAcc;

public class Client {

	public static void main(String[] args) {
		
		BankFactory bf = new MMBankFactory();
		SavingAcc sa = new MMSavingAcc(1234, "shalini", 10000, false);
		CurrentAcc ca = new MMCurrentAcc(4567, "pooja", 200000);
		
		sa.withdraw(sa.getAccBal());
		sa.toString();
		ca.withdraw(ca.getCreditLimit());
		ca.toString();
		
	}

}