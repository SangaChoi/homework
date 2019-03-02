package homework0919;

import java.io.*;

public class FileCalculator {

	public FileCalculator() {
		// TODO Auto-generated constructor stub
	}
	
	public void addCalculateResult(String inputFileName) throws Exception{
		
		BufferedReader br=new BufferedReader(new FileReader(inputFileName));
		BufferedWriter bw=new BufferedWriter(new FileWriter(inputFileName,true));
		
		int sum=0;
		int pro=1;
		String a=null;
		
		while(true) {
			a=br.readLine();
			if(a==null) {
				break;
			}	
		sum +=Integer.parseInt(a);
		pro *=Integer.parseInt(a);	
		}
		bw.write(Integer.toString(sum));
		bw.newLine();
		bw.write(Integer.toString(pro));
				
		bw.flush();
		br.close();
		bw.close();
	}

	public static void main(String[] args) throws Exception{
		FileCalculator fc=new FileCalculator();
		fc.addCalculateResult("D:\\test.dat");
	}

}
