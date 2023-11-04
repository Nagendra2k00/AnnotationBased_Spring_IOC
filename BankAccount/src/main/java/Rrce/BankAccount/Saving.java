package Rrce.BankAccount;

import org.springframework.stereotype.Component;

@Component
public class Saving implements Account{
	
	private double bal;
	
	
	@Override
	public void withdraw(double amt) {
		if(bal < 0 && bal < amt) {
			System.out.println("Insufficient Balance");
		}
		else {
			bal -= amt;
			System.out.println("Balance : " + bal);
		}
	}

	@Override
	public void deposit(double amt) {
		bal += amt;
		System.out.println("Total amount : " + bal);
	}

}
