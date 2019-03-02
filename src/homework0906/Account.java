public class Account{

/////////Field
	private String accNo;
	private int balance;


///////////Constructor
	public Account(){
	}

	public Account(String no){
		accNo=no;
		System.out.println(accNo+" 계좌가 개설되었습니다.");
	}


///////Method
	public void save(int money){
		balance=balance+money;
		System.out.println(accNo+" 계좌에 "+money+"만원이 입금되었습니다.");
	}

	public void deposit(int money){
		balance=balance-money;
		System.out.println(accNo+" 계좌에 "+money+"만원이 출금되었습니다.");
	}


///////////////GetMethod
	public String getAccNo(){
		return accNo;
	}

	public int getBalance(){
		return balance;
	}

}