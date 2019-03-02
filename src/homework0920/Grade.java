package homework0920;

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
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		String str=null;
		String[] temp;
		int sum=0;
		int avg=1;
		int line=0;
		
		while(true) {

				try {
					str=br.readLine();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if(str==null) {
					break;
				}
		
			line++;
			temp=str.split(",");
			
			System.out.println(temp[0]+"의 점수는 "+Integer.parseInt(temp[1])+"점 입니다.");
			sum+=Integer.parseInt(temp[1]);
			avg=sum/line;
			
		}
		System.out.println("모두의 총점은 "+sum+"점 입니다.");
		System.out.println("모두의 평균은 "+avg+"점 입니다.");
		
		try {
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

	public static void main(String[] args) {
		
		Grade grade=new Grade();
		String fileName="score.txt";
		grade.printGrade(fileName);
	}

}
