package homework0921;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Vector;

public class Prob02 {

	public Prob02() {
		// TODO Auto-generated constructor stub
	}
	
	public Vector getList() throws Exception{
		
		BufferedReader br =  new BufferedReader(new FileReader("list.txt"));
		Vector vector=new Vector();
		String str=null;
		String[] temp=null;
		
		while((str=br.readLine())!=null) {
			
			temp=str.split("/");
			
			if(temp[1].equalsIgnoreCase("java") && Integer.parseInt(temp[2])>=80) {
				vector.add(temp[0]+temp[1]+temp[2]+"수료");	
			}else if(temp[1].equalsIgnoreCase("java") && Integer.parseInt(temp[2])<80){
				vector.add(temp[0]+temp[1]+temp[2]+"미수료");	
			}
			
			if(temp[1].equalsIgnoreCase("sql") && Integer.parseInt(temp[2])>=90) {
				vector.add(temp[0]+temp[1]+temp[2]+"수료");	
			}else if(temp[1].equalsIgnoreCase("sql") && Integer.parseInt(temp[2])<90){
				vector.add(temp[0]+temp[1]+temp[2]+"미수료");	
			}
	
		}		
		
		return vector;
	}



	public static void main(String[] args) throws Exception{
		
		Prob02 e=new Prob02();
		Vector scores=e.getList();
		for(int i=0; i<scores.size(); i++) {
			System.out.println(scores.get(i));
		}

	}

}
