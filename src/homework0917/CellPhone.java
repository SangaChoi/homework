package homework0917;

public class CellPhone {

//////////Field
	private String phoneNumber=null;
	private int totalCallTime=0;
	private int totalFee=0;
	private int feePerCallTime=0;
	
////////////Constructor
	public CellPhone() {
	}
	public CellPhone(String phoneNumber, int feePerCallTime) {
		this.phoneNumber=phoneNumber;
		this.feePerCallTime=feePerCallTime;
	}

//////////////Get	
	public String getPhoneNumber() {
		return phoneNumber;
	}

	public int getTotalCallTime() {
		return totalCallTime;
	}

	public int getTotalFee() {
		return totalFee;
	}

	public int getFeePerCallTime() {
		return feePerCallTime;
	}
	
//////////////Set
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setTotalCallTime(int totalCallTime) {
		this.totalCallTime = totalCallTime;
	}

	public void setTotalFee(int totalFee) {
		this.totalFee = totalFee;
	}

	public void setFeePerCallTime(int feePerCallTime) {
		this.feePerCallTime = feePerCallTime;
	}
/////////////Method
	public void call(String phoneNumber, int callTime) {
		System.out.println(phoneNumber+" 번호로 "+callTime+" 통화함.");
		this.totalCallTime += callTime;
	}
	public void calculateTotalFee() {
		this.totalFee=totalCallTime*feePerCallTime;
	}


}
