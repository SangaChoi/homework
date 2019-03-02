//package a.base.ex06

public class Prob05{

	public static void main(String args[]){

		int[] array={3, 24, 1, 55, 17, 43, 5};

		for(int i=0;i<array.length-1;i++){
			System.out.println("**********************************i : "+i);

			for(int k=0;k<array.length-1;k++){

				int temp01=array[k];
				int temp02=array[k+1];

				System.out.println("k : "+k);
				System.out.println("temp01 : "+temp01);
				System.out.println("temp02 : "+temp02);
				System.out.println("=====================");

				if(array[k]>array[k+1]){//array[k]>array[k+1]이면=>조건을 만족하지 않으면 다시 반복
					array[k]=temp02;
					array[k+1]=temp01;

					System.out.println("arraya[k] : "+array[k]);
					System.out.println("array[k+1] : "+array[k+1]);
					System.out.println("====================");
				}
				
			}
				System.out.println("array["+i+"] : "+array[i]);
				System.out.println("\n");
		}

		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+", ");
		}
		
	}
}












	




