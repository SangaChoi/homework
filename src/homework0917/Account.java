package homework0917;

public class Account {
	
//////////Field
	
	private String accountNo=null;
	private boolean creditLine=false;
	private int creditLineLimit=0;
	private int balance=0;
	
/////////////Constructor
	public Account() {
		// TODO Auto-generated constructor stub
	}
	public Account(String accountNo, boolean creditLine, int creditLineLimit, int balance) {
		super();
		this.accountNo = accountNo;
		this.creditLine = creditLine;
		this.creditLineLimit = creditLineLimit;
		this.balance = balance;
}

///////////////Get	
	public String getAccountNo() {
		return accountNo;
	}
	public boolean isCreditLine() {
		return creditLine;
	}
	public int getCreditLineLimit() {
		return creditLineLimit;
	}
	public int getBalance() {
		return balance;
	}
///////////////Set	
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public void setCreditLine(boolean creditLine) {
		this.creditLine = creditLine;
	}
	public void setCreditLineLimit(int creditLineLimit) {
		this.creditLineLimit = creditLineLimit;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
////////////Method
	public void withdraw(int money) throws Exception{
		if((!creditLine)&&balance<money) {
			throw new Exception("�ܰ���� ��ݺҰ� �մϴ�");
		}
		if(creditLine&&(creditLineLimit+balance)<money) {
			throw new Exception("�ܰ���� ��ݺҰ� �մϴ�");
		}
		
		balance -=money;
	}
	public void deposit(int money){
		balance +=money;
	}
	public String toString() {
		return "���¹�ȣ :"+accountNo+", �ܰ� :"+balance+"��"+(creditLine ? "  [[-"+creditLineLimit+"�� ���̳ʽ�����]]":"");
	}

	
	
}
