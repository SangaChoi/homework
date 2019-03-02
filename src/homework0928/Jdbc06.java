package homework0928;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Jdbc06 {
/*	
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void printEmployee(String city, int lo, int hi) throws SQLException{
		
		String dburl="jdbc:oracle:thin:@localhost:1521:xe";
		
		Connection conn=DriverManager.getConnection(dburl, "hr", "hr");
		
		PreparedStatement pstmt=conn.prepareStatement("SELECT e.last_name, d.department_name\r\n" + 
				"FROM employees e, departments d, locations l\r\n" + 
				"WHERE e.department_id=d.department_id\r\n" + 
				"AND d.location_id=l.location_id\r\n" + 
				"AND e.salary BETWEEN ? AND ? \r\n" + 
				"AND l.city= ?");
		
		pstmt.setInt(1, lo);
		pstmt.setInt(2, hi);
		pstmt.setString(3, city);
		
		ResultSet rs=pstmt.executeQuery();
		
		while(rs.next()) {
			
			String lastName=rs.getString(1);
			String departmentName=rs.getString(2);
			
			System.out.println(lastName+"\t"+departmentName);
			
		}
		
		rs.close();
		pstmt.close();
		conn.close();
	}
*/
	
	public void printEmployee(String city, int lo, int hi) throws SQLException {
		
		Connection con=DbUtil.getConnection();
		
		PreparedStatement pstmt=con.prepareStatement("SELECT e.last_name, d.department_name\r\n" + 
				"FROM employees e, departments d, locations l\r\n" + 
				"WHERE e.department_id=d.department_id\r\n" + 
				"AND d.location_id=l.location_id\r\n" + 
				"AND e.salary BETWEEN ? AND ? \r\n" + 
				"AND l.city= ?");
		
		pstmt.setInt(1, lo);
		pstmt.setInt(2, hi);
		pstmt.setString(3, city);
		
		ResultSet rs=pstmt.executeQuery();
		
		while(rs.next()) {
			
			String lastName=rs.getString(1);
			String departmentName=rs.getString(2);
			
			System.out.println(lastName+"\t"+departmentName);
			
		}
		
		rs.close();
		pstmt.close();
		con.close();
		
	}
	
	
	public static void main(String[] args) throws SQLException{
		
		new Jdbc06().printEmployee("South San Francisco", 7000, 10000);

	}

}
