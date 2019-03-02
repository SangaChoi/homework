public class Prob11{

	public void calc(int[] ix){

			int c=0;
			int d=0;

			for(int i=0;i<ix.length;i++){
				if(ix[i]%2 !=0){
					c=c+ix[i];
				}else{
					d=d+ix[i];
				}
			}
			System.out.println("홀수의 합 : "+c);
			System.out.println("짝수의 합 : "+d);	
	}

	public static void main(String[] args){

		int[] ia=new int[]{3,7,1,8,10,2,15,2,10};
		int[] ib=new int[]{1,2,3,4,5};

		Prob11 p=new Prob11();
		System.out.println("(배열 ia)");
		p.calc(ia);
		System.out.println("(배열 ib)");
		p.calc(ib);
	}

}