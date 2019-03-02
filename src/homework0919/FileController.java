package homework0919;

import java.io.*;
import java.util.*;

public class FileController {

	public FileController() {
		// TODO Auto-generated constructor stub
	}
	
	public void reverseLine(String oldf, String newf)throws Exception{
		
		BufferedReader br=new BufferedReader(new FileReader(oldf));
		BufferedWriter bw=new BufferedWriter(new FileWriter(newf));
		Stack<String> stack=new Stack<String>();
		
		while(true) {
			String str1=br.readLine();
			
			if(str1==null) {
				break;
			}
			stack.push(str1);
		}
		
		while(!stack.isEmpty()) {
			String str2=stack.pop();
			bw.write(str2);
			bw.newLine();
		}
		
		bw.flush();
		
		br.close();
		bw.close();
	}

	public static void main(String[] args) throws Exception{
		
		FileController c=new FileController();
		String oldf="files/oldf.txt";
		String newf="files/newf.txt";
		c.reverseLine(oldf, newf);

	}

}
