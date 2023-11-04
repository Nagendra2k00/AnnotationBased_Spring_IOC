package Rrce.BankAccount;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component    				//used to create the object
public class Customer {
	

	@Value("01")			//used to inject value
	private int cid;
	@Value("Naruto")
	private String cname;
	@Value("9742970382")
	private long phno;
	@Autowired				//Data member level annotation , used to inject implementation class obj
	@Qualifier("current")	//used to store the object of implementation class in the reference
	private Account ac;
	
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public long getPhno() {
		return phno;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}
	public Account getAc() {
		return ac;
	}
	public void setAc(Account ac) {
		this.ac = ac;
	}
	
	
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", phno=" + phno + ", ac=" + ac + "]";
	}
		
}
