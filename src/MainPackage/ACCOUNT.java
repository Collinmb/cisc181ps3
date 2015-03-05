package MainPackage;
import.util.scanner

public class ACCOUNT {
	
	private int id=0;
	
	private double balance=0;
	
	private double annualInterestRate=0;
	
	private Date dateCreated;
	
	private double monthlyInterestRate=annualInterestRate;
	
	public int DefaultAcct(){
		this.id=0;
		this.balance=0;
		this.annualInterestRate=0;
		this.dateCreated=0;
		
	
	}
	
	public int createdAcct(int id,int balance,int annualInterestRate,int dateCreated){
		this.id=id;
		this.balance= balance;
		this.annualInterestRate=annualInterestRate;
		this.dateCreated=dateCreated;
		
		
		
		
	}
	
	public int AccessId(){
		return id;
	}
	public double AccessBalance(){
		return balance;
	}
	public double AccessAnnualInterestRate(){
		return annualInterestRate;
	}
	public Date AccessdateCreated(){
		return dateCreated;
	}
	public void setId(){
		this.id=id;	
	}
	public void setBalance(){
		this.balance=balance;
	}
	public void setannualInterest(){
		this.annualInterestRate=annualInterestRate;
	}
	public double getMonthlyInterestRate(){
				return monthlyInterestRate;
	}	
	public double widthdraw(double balance, double widthdraw){
		system.out.print("wht is the ammount that you wish to withdraw?:");
		withdraw==input.doubleNext;
		for(balance-withdraw)=new balance;
				return balance;
				if (balance-withdraw<=0);
					return("overdrawing from the account, please enter a different amount");				
						
	}
	public double deposit(double balance, double deposit){
		system.out.print("what is the ammount that you wish to deposit?:");
		deposit=input.doubleNext;
		for(balance+deposit)=new balance;
				return balance;

		
	}
	

}
