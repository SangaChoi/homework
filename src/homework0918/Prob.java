package homework0918;

import java.util.Vector;

public class Prob {

	public Prob() {
	}
	
	private static String[] stringSplit(String str1, String str2) {
		
		Vector<String> vector=new Vector<String>();
		String strs="";
		
		for(int j=0; j<str1.length(); j++) {
			char c=str1.charAt(j);
			
			if(c==str2.charAt(0)) {
				vector.add(strs);
				strs="";
			}else {
				strs+=c;			
			}
		}vector.add(strs);
		
		String[] result=new String[vector.size()];
		
		for(int k=0; k<vector.size(); k++) {
			result[k]=vector.elementAt(k);
		}
		
		return result;
	}

	public static void main(String[] args) {
		String str=("PROD-001#X-note#Samsung#3#6000000");
		String[] strs=Prob.stringSplit(str,"#");
		System.out.println("===문자열 처리 결과===");
		for(int i=0; i<strs.length; i++) {
			System.out.println(strs[i]);
		}
	}

}