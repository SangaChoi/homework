package homework0912;

public class Util{

	public int findPrimeCount(int limit){

		boolean isPrime=false;
		int sum=0;

		for(int i=2;i<=limit;i++){
			isPrime=true;

			for(int j=2;j<i;j++){
				if(i%j==0){
					isPrime=false;
					break;
				}
			}if(isPrime){
				sum++;
			}
		}return sum;	
	}


	public int[] findPrimeReturnArray(int limit){

		boolean isPrime=false;

		int sum=findPrimeCount(limit);
		int[] prime=new int[sum];
		int temp=0;

		for(int i=2;i<=limit;i++){
			isPrime=true;

			for(int j=2;j<i;j++){
				if(i%j==0){
					isPrime=false;
					break;
				}
			}
			if(isPrime){
				prime[temp]=i;
				temp++;
			}
		}
		return prime;
	}

}