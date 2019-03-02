package homework0914;

public class CellPhone {
	
////////////Field
	private String model=null;
	private double battery=0;
	
////////////Constructor	
	public CellPhone() {	
	}
	public CellPhone(String model) {
		this.model=model;
	}

///////////////Get	
	public String getModel() {
		return model;
	}

	public double getBattery() {
		return battery;
	}
	
/////////////Set
	public void setModel(String model) {
		this.model = model;
	}

	public void setBattery(double battery) {
		this.battery = battery;
	}
	
////////Method
	public void call(int time) throws IllegalArgumentException{
		if(time<0) {
			throw new IllegalArgumentException("��ȭ�ð��Է¿���");
		}
		System.out.println("��ȭ �ð� : "+time+"��");
		double amount=time*0.5;
		if(this.battery<amount) {
			this.battery=0;
		}else {
			this.battery -=amount;
		}
				
	}
	
	public void charge(int time) {
		if(time<0) {
			throw new IllegalArgumentException("�����ð��Է¿���");
		}
		System.out.println("���� �ð� : "+time+"��");
		double amount=time*3;
		if(this.battery+amount>100) {
			this.battery=100;
		}else {
			this.battery +=amount;
		}
				
	}
	
	public void printBattery() {
		System.out.println("���� ���͸� �� : "+this.battery);
	}
	
	public boolean equals(Object obj) {
		if(obj==null) {
			return false;
		}else if(!(obj instanceof CellPhone)) {
			return false;
		}else {
			return model.equals(((CellPhone)obj).model);
		}
		
	}
	


}