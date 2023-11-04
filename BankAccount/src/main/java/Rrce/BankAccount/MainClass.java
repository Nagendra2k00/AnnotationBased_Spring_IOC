package Rrce.BankAccount;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	
	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
		Customer bean = ac.getBean(Customer.class);
		System.out.println(bean);
		
		Account a = bean.getAc();
		a.deposit(1000);
		a.withdraw(500);
	}

}
