//packagae e.api.ex04;

import java.util.*;

public class ArrayCopy{

	
	public List<String>moveToVector(String[] datas){

		Vector<String> vector=new Vector<String>();
		for(int i=datas.length-1; i>=0; i--){
				vector.add(datas[i]);			
		}

		return vector;
	}

	public static void main(String args[]){
		ArrayCopy ac=new ArrayCopy();
		String datas[]={"1","2","3","4","5"};
		System.out.println(ac.moveToVector(datas));
	}
}