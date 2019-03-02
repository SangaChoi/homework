package homework0913;

public class StringUtil {
	
	private static String replaceString(String[] arr) {
		
		int sum=0;
		int max=0;
		int index=0;
		String result1=null;
		
		for(int i=0; i< arr.length; i++) {
			sum=0; //sum 초기화
			
			for(int j=0; j<arr[i].length(); j++) {
				if(arr[i].charAt(j)=='a') {
					sum++;
				}
			}
			if(sum>=max) {
				max=sum;
				index=i;
			}
		}
		result1=arr[index].replace('a', 'A');
		
		return result1;
	}

	public static void main(String[] args) {
		
		String[] arr= {"java program","array","java program area","append"};
		String result=StringUtil.replaceString(arr);
		System.out.println("변경된 문자열 : "+result);
	}

}
