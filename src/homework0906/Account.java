public class Account{

/////////Field
	private String accNo;
	private int balance;


///////////Constructor
	public Account(){
	}

	public Account(String no){
		accNo=no;
		System.out.println(accNo+" ���°� �����Ǿ����ϴ�.");
	}


///////Method
	public void save(int money){
		balance=balance+money;
		System.out.println(accNo+" ���¿� "+money+"������ �ԱݵǾ����ϴ�.");
	}

	public void deposit(int money){
		balance=balance-money;
		System.out.println(accNo+" ���¿� "+money+"������ ��ݵǾ����ϴ�.");
	}


///////////////GetMethod
	public String getAccNo(){
		return accNo;
	}

	public int getBalance(){
		return balance;
	}

}