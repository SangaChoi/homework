package homework0917;

public class SmartPhone extends CellPhone{

///////////Field
	private boolean MonthlyFixedRate=false;
	private int monthlyFixedFee=0;

//////////Constructor	
	public SmartPhone() {
	}
	public SmartPhone(String phoneNumber, int feePerCallTIme) {
		super(phoneNumber, feePerCallTIme);
	}
	public SmartPhone(String phoneNumber, int feePerCallTime, boolean MonthlyFixedRate, int monthlyFixedFee) {
		super(phoneNumber, feePerCallTime);
		this.MonthlyFixedRate=MonthlyFixedRate;
		this.monthlyFixedFee=monthlyFixedFee;
	}

/////////Get
	public boolean isMonthlyFixedRate() {
		return MonthlyFixedRate;
	}
	public int getMonthlyFixedFee() {
		return monthlyFixedFee;
	}
///////////Set	
	public void setMonthlyFixedRate(boolean monthlyFixedRate) {
		MonthlyFixedRate = monthlyFixedRate;
	}
	public void setMonthlyFixedFee(int monthlyFixedFee) {
		this.monthlyFixedFee = monthlyFixedFee;
	}
///////////Method
	public void calculateTotalFee() {
		
		if(MonthlyFixedRate==false) {
			super.calculateTotalFee();
		}else {
			System.out.println("고객님은 "+monthlyFixedFee+" 정액 요금제입니다.");
			setTotalFee(monthlyFixedFee);
		}
		
	}


}
