package homework0921;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Prob03 {
	
	private static int[] generateRandomNumber() {
		
		int[] randomValueArrary=new int[10];
		Random random=new Random();
		
		for(int i=0; i<10; i++) {
			boolean duplicationCheck=true;
			
			while(duplicationCheck) {
				randomValueArrary[i]=random.nextInt(20)+1;
				duplicationCheck=false;
				
				for(int j=0; j<i; j++) {
					if(randomValueArrary[i]==randomValueArrary[j]||randomValueArrary[i]==21) {
						duplicationCheck=true;
					}//������ ���ų� 21�̸� true -> while������ �ٽ� ���� ����
				}
			}
		}
		
		return randomValueArrary;
	}
	
	public static void printStatistics(int[] array) {
		BufferedWriter bw=null;
		try {
			bw=new BufferedWriter(new FileWriter("store.txt"));
			int max=array[0];
			int min=array[0];
			int sum=array[0];
			
			for(int i=0; i<array.length; i++) {
				bw.write(Integer.toString(array[i]));
				bw.newLine();
				
				if(i !=0) {
					max=Math.max(max,array[i]);
					min=Math.min(min,array[i]);
					sum +=array[i];
				}
			}
			
			bw.write("�ִ밪 : "+max);
			bw.newLine();
			bw.write("�ּҰ� : "+min);
			bw.newLine();
			bw.write("��հ� : "+(double)sum/10);
			bw.newLine();
			
			bw.flush();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(bw !=null)
				try {bw.close();
				}catch(IOException e) {
					e.printStackTrace();
				}
		}
	}

	public static void main(String[] args) {
		int[] array=generateRandomNumber();
		printStatistics(array);

	}

}
