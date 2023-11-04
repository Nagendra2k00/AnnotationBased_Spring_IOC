package Rrce.BankAccount;

import org.springframework.stereotype.Component;

@Component
public interface Account {

	public void withdraw(double amt);
	public void deposit(double amt);
}
