package homework0919;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class FileCompareUtil {

	public FileCompareUtil() {
		// TODO Auto-generated constructor stub
	}
	
	public ArrayList<String> compareFile(String fstFileName, String scdFileName) throws Exception{
		
		ArrayList<String> arr=new ArrayList<String>();
		
		BufferedReader br1=new BufferedReader(new FileReader(fstFileName));
		BufferedReader br2=new BufferedReader(new FileReader(scdFileName));
		
		String str1=br1.readLine();
		String str2=br2.readLine();
		
		while(true) {
			
			if(str1==null) {
				break;
			}
			
			if(str1.equals(str2)) {				
			}else {
				arr.add(str2);
			}
			
			str1=br2.readLine();
			str2=br2.readLine();
		}
		
		br1.close();
		br2.close();
		
		return arr;			
	}
	

/*		String str1=br1.readLine();
		String str2=br2.readLine();
		
		int lineNum=0;
	
		
		while(str1!=null) {
			lineNum++;
			if(!str1.equals(str2)) {
				arr.add("LINE"+lineNum+":"+str2);
			}
			str1=br1.readLine();
			str2=br2.readLine();
			
		}
		br1.close();
		br2.close();
		
		return arr;
	}
*/		
		

	public static void main(String[] args) throws Exception{
		
		FileCompareUtil util=new FileCompareUtil();
		System.out.println(util.compareFile("files/fstFile1.txt","files/scdFile1.txt"));
		System.out.println("Successful!!!");
	}

}
