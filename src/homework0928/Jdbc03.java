package homework0928;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Jdbc03 {
	
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void printEmployee(String name, int salary) throws SQLException{
		
		String dburl="jdbc:oracle:thin:@localhost:1521:xe";
		
		Connection conn=DriverManager.getConnection(dburl, "hr", "hr");
		
		String sql="SELECT employee_id, first_name, salary\r\n" + 
				"FROM employees\r\n" + 
				"WHERE salary>="+salary+"\r\n" + 
				"AND LOWER(first_name) LIKE LOWER('%"+name+"%')";
		
		PreparedStatement pstmt=conn.prepareStatement(sql);
		
		ResultSet rs=pstmt.executeQuery();
		
		while(rs.next()) {
			
			String employeeId=rs.getString(1);
			String ename=rs.getString(2);
			int esalary=rs.getInt(3);
			
			System.out.println(employeeId+"\t"+ename+"\t"+esalary);
		}
		
		rs.close();
		pstmt.close();
		conn.close();
		
	}

	public static void main(String[] args) throws SQLException{
		
		new Jdbc03().printEmployee("al",4000);
		
	}

}
