package re;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Grade {

	public Grade() {
		// TODO Auto-generated constructor stub
	}
	
	public void printGrade(String fileName) {
		
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(fileName));
			
			String str=null;
			String[] temp;
			int sum=0;
			int avg=1;
			int line=0;
		
			while((str=br.readLine())!=null) {


		
			line++;
			temp=str.split(",");
			
			System.out.println(temp[0]+"�� ������ "+Integer.parseInt(temp[1])+"�� �Դϴ�.");
			sum+=Integer.parseInt(temp[1]);
			avg=sum/line;
			
			}
		System.out.println("����� ������ "+sum+"�� �Դϴ�.");
		System.out.println("����� ����� "+avg+"�� �Դϴ�.");
		}catch(Exception e) {
			System.out.println(e);
		}finally {
			if(br !=null) {
				try {br.close();
				}catch(IOException e) {
				}
			}
		}
	}

	public static void main(String[] args) {
		
		Grade grade=new Grade();
		String fileName="score.txt";
		grade.printGrade(fileName);
	}

}