package homework0928;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Prob5 {
	
	private static void printEmployeeList(String cityName, String deptName) throws Exception{
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
		
		PreparedStatement pstmt=con.prepareStatement("SELECT l.city, d.department_name, e.first_name, e.salary\r\n" + 
				"FROM locations l, departments d, employees e\r\n" + 
				"WHERE e.department_id=d.department_id\r\n" + 
				"AND d.location_id=l.location_id\r\n" + 
				"AND LOWER(l.city) LIKE LOWER('%'||?||'%')\r\n" + 
				"AND LOWER(d.department_name) LIKE LOWER('%'||?||'%')");
		
		pstmt.setString(1, cityName);
		pstmt.setString(2, deptName);
		
		ResultSet rs=pstmt.executeQuery();
		
		while(rs.next()) {
			
			String city=rs.getString(1);
			String departmentName=rs.getString(2);
			String firstName=rs.getString(3);
			int salary=rs.getInt(4);
			
			System.out.println(city+"\t"+departmentName+"\t"+firstName+"\t"+salary);
			
		}
		
		rs.close();
		pstmt.close();
		con.close();

	}

	public static void main(String[] args) throws Exception{
		
		printEmployeeList("south", "it");

	}

}
