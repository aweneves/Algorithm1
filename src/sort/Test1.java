package sort;
/**
 * 
 * @author Administrator
 *
 */
class User{
	private String account;		//帐号
	private double balance;		//余额
	
	
	public User(String account, double balance) {
		super();
		this.account = account;
		this.balance = balance;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	/**
	 * 
	 * @param in	转入帐号
	 * @param m		转帐金额
	 * @return 		转账结果
	 */
	public boolean transfer(User in, double m){		
		if(this.balance < m)	//余额不足
			return false;
			in.setBalance(in.getBalance()+m);
			this.balance -= m;
		return true;
	}
	
}
public class Test1 {
	
	public static void main(String[] args) {
		User in = new User("in", 1000.0);
		User out = new User("out", 2000.0);
		User temp = new User("temp", 0);
		boolean hasSucceed = false;
		boolean isSatisfy = false; 
		isSatisfy = true;
		if(hasSucceed && isSatisfy){
			temp.transfer(in, temp.getBalance());
		}
	}
}
