//package a.base.ex07

public class Prob07{

	public static void main(String[] args){

		int year=2010;
		int month=2;
		int maxDay=0;

		maxDay=11;


/*		if(year%4==0 || (year%100==0 && year%400==0)){
			maxDay=29;
		}else{
			maxDay=28;
		}
*/

		if(year%4==0){
			maxDay=29;

			if(year%100==0){
				maxDay=28;

				if(year%400==0){
					maxDay=29;
				}
			}
		}
		System.out.println(year+"년 "+month+"월의 말일은 "+maxDay+"일 입니다.");
	}
}