package homework0921;

public class test {
public static void main(String[] args) {
	String value="ȫ";
	byte[] temp=value.getBytes();
	System.out.println(Integer.toHexString(temp[0]));
	System.out.println(Integer.toHexString(temp[1]));
	
}
}
