package homework0914;

import java.util.Vector;

public class Prob02 {
	
	public Prob02() {
	}
	
	public Vector<String> dataChange(String[] strData){
		
		Vector<String> vector=new Vector<String>();

		for(int i=strData.length-1; i>=0; i--) {
			StringBuffer buffer=new StringBuffer(strData[i]);
			buffer.reverse();
			vector.add(buffer.toString());
		}	
			
		return vector;
	}
	
	public static void main(String[] args) {
		
		Prob02 st=new Prob02();
		String[] strData= {"Java Programming", "JDBC", "Oracle10g", "JSP/Servlet"};
		Vector<String> v=st.dataChange(strData);
		
		for(int i=0; i<v.size(); i++) {
			System.out.println(v.elementAt(i));
		}
		
	}
	
}
