public class Prob06{



	public Prob06(){
	}

	public int abs(int num1, int num2){

		int result;
		result=num1-num2;
		if(result<0){
			result=result*-1;
		}
		return result;
	}

	public static void main(String[] args){
		int num1=6;
		int num2=15;
		Prob06 prob=new Prob06();
		System.out.println("두 수의 차는 : "+prob.abs(num1,num2));
	}
}
