package homework0917;

import java.util.Arrays;

public class Median {

	public Median() {
	}
	
	public int findMedian(int[] values) {
		
		int sum=0;
		int avg=0;
		
		for(int i=0; i<values.length; i++) {
			sum += values[i];
		}
		
		avg=sum/values.length;
		int[] arr=new int[values.length-1];
		
		for(int j=0; j<values.length; j++) {
			arr[j]=values[j]-avg;			
		}
		
		return arr[0];
	}
	
	
	public static void main(String[] args) {
		
		Median median=new Median();
		
		int[] values1= {10, 4, 53, 63, 17, 37, 52, 16, 33, 65};
		System.out.println("input: "+Arrays.toString(values1));
		System.out.println("median: "+median.findMedian(values1));
		System.out.println("==============================");
		
		int[] values2={32, 53, 52, 76, 15, 98, 76, 65, 36, 10};
		System.out.println("input: "+Arrays.toString(values2));
		System.out.println("median: "+median.findMedian(values2));
		

		
	}

}
