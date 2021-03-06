package homework0920;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;

class Score{
	
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int sum;
	
	
	public Score() {
		
	}
	public Score(String name, int kor, int eng, int math, int sum) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.sum = sum;
	}

	public String getName() {
		return name;
	}

	public int getKor() {
		return kor;
	}

	public int getEng() {
		return eng;
	}

	public int getMath() {
		return math;
	}

	public int getSum() {
		return sum;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}
	@Override
	public String toString() {
		return "Score [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", sum=" + sum + "]";
	}
	
	
}


public class Prob {

	public Prob() {
		// TODO Auto-generated constructor stub
	}
	
	public Vector getScore(String fileName) {
		
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(fileName));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Vector vector=new Vector();
		String str=null;
		
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
			
			String[] arr=str.split("/");
			Score sc = new Score(arr[0],Integer.parseInt(arr[1]),Integer.parseInt(arr[2]),Integer.parseInt(arr[3])
					,Integer.parseInt(arr[1])+Integer.parseInt(arr[2])+Integer.parseInt(arr[3]));
			vector.add(sc);
			
		}		
		
		return vector;

	}

	public static void main(String[] args) {
		
		Prob p2=new Prob();
		Vector scores=p2.getScore("src/data.txt");
		
/*		for(int i=0; i<scores.size(); i++) {
			Score score=(Score)scores.get(i);
			System.out.println(score.getName()+" : "
					+score.getKor()+" "+score.getEng()+" "
					+score.getMath()+" "+score.getSum());
		}
*/
		for(Object obj : scores) {
			System.out.println((Score)obj);
		}//toString() 오버라이딩 필요
	}
	
}
