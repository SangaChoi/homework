//package c.modeling.ex02;

public class TestAccount{

	public static void main(String[] args) throws Exception{

		String accNo;
		int balance;

		Account accObj=new Account("078-3762-293");
		accNo=accObj.getAccNo();
		balance=accObj.getBalance();
		System.out.println(accNo+" ������ �ܰ�� "+balance+"�����Դϴ�.");

		accObj.save(100);
		balance=accObj.getBalance();
		System.out.println(accObj.getAccNo()+" ������ �ܰ�� "+balance+"�����Դϴ�.");

		accObj.deposit(30);
		balance=accObj.getBalance();
		System.out.println(accNo+" ������ �ܰ�� "+balance+"�����Դϴ�.");

	}

}