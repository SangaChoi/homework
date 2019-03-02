package homework0928;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Jdbc04 {
	
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void printEmployee(String jobs[]) throws SQLException{
		
		String dburl="jdbc:oracle:thin:@localhost:1521:xe";
		
		Connection conn=DriverManager.getConnection(dburl, "hr", "hr");
		
		String sql="SELECT e.employee_id, e.first_name, e.salary\r\n" + 
				"FROM employees e, jobs j\r\n" + 
				"WHERE e.job_id=j.job_id\r\n" + 
				"AND j.job_title IN ('"+jobs[0]+"','"+jobs[1]+"')";
		
		PreparedStatement pstmt=conn.prepareStatement(sql);
		
		ResultSet rs=pstmt.executeQuery();
		
		while(rs.next()) {
			
			String employeeId=rs.getString(1);
			String name=rs.getString(2);
			int salary=rs.getInt(3);
			
			System.out.println(employeeId+"\t"+name+"\t"+salary);
		}
		
		rs.close();
		pstmt.close();
		conn.close();
		
	}

	public static void main(String[] args) throws SQLException{
		
		String[] jobs= {"Accountant","Stock Clerk"};
		new Jdbc04().printEmployee(jobs);

	}

}
