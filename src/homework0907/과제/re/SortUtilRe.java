public class SortUtilRe{

//////////////Method
	public int[] ascending(int[] inputNumbers){

/*		int[] array=inputNumbers;

		for(int j=0;j<array.length-1;j++){

			for(int k=0;k<array.length-1;k++){

				int temp01=array[k];
				int temp02=array[k+1];

				if(array[k]>array[k+1]){
					array[k]=temp02;
					array[k+1]=temp01;
				}
				
			}

		}

		return array;
*/
		int temp=0;

		for(int j=0;j<inputNumbers.length-1;j++){

			for(int k=j+1;k<inputNumbers.length;k++){
				if(inputNumbers[j]>inputNumbers[k]){
					temp=inputNumbers[j];
					inputNumbers[j]=inputNumbers[k];
					inputNumbers[k]=temp;
				}
			}
		} return inputNumbers;

	}
////////////////////////main
	public static void main(String[] args){

		SortUtilRe util=new SortUtilRe();
		int[] numbers=new int[]{7, 5, 2, 19, 34, 51, 32, 11, 67, 21};

		numbers=util.ascending(numbers);

		for(int i=0;i<numbers.length;i++){
			System.out.print(numbers[i]);

			if(i !=numbers.length-1){
				System.out.print(" ");
			}else{
				System.out.print("");

			}
			
		}
		System.out.println(" Successful!!");
	}

}