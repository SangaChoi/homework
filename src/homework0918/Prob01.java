package homework0918;

public class Prob01 {

	public Prob01() {
		// TODO Auto-generated constructor stub
	}
	
	private static String getParameter(String url, String paramName) {
		
		String[] temp=url.split("&");
		String result=null;
		
		for(int i=0; i<temp.length; i++) {
			if(temp[i].startsWith(paramName)) {
				String[] temp2=temp[i].split("=");
				result=temp2[1];
			}
		}
		return result;
	}

	public static void main(String[] args) {
		String url1
		="http://localhost/order?prodid=PROD-001&prodName=갤럭시3&price=980000";
		
		String prodName=getParameter(url1, "prodName");
		System.out.println("제품 이름 : "+prodName);
		
		String url2
		="http://localhost/registUser?userId=USER-001&userName=홍길동&address=서울시 강남구&userAge=26";
		
		String userAddress=getParameter(url2, "address");
		System.out.println("회원 주소 : "+userAddress);

	}

}
