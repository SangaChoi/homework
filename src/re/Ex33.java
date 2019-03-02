public class  Ex33
{
	public static void main(String[] args) 
	{

		if(args.length!=2){
			System.out.println("두 개의 값을 입력하세요.");
		}

		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int c;
		int i=a;
		int sum=0;

		if(a>b){
			c=a;
			a=b;
			b=c;
		}

		if(a<b){
			while(i<=b){
				sum=sum+i;
				i++;
			}System.out.println(sum);
		}else if(a==b){
			System.out.println("서로 다른 값을 입력하세요.");
		}
		
			
	}//
}//
