public class ArrayCompare{

	static boolean a;


	private static boolean equalsArr(int[] ary1, int[] ary2){
		if(ary1==ary2){
			a=true;
		}return a;
	}

	public static void main(String[] args){
		int[] arr1={3,5,6,9,10,2,7};
		int[] arr2={3,5,6,9,10,2,7};

		if(equalsArr(arr1, arr2)){
			System.out.println("two array equals");
		}else{
			System.out.println("two array not-equals");
		}

		System.out.println("======================");
		System.out.println(a);

/*		int[] arr3={3,5,6,9};
		int[] arr4={3,5,6,9,8};
		if(equalsArr(arr3, arr4)){
			System.out.println("two array equals");
		}else{
			System.out.println("two array not-equals");
		}
*/		
	}

}//