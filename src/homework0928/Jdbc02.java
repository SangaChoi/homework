package homework0928;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Jdbc02 {
	
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void printStatistics(int maxSalary) throws SQLException, ClassNotFoundException{
		
		String url="jdbc:oracle:thin:@127.0.0.1:1521:xe";
		
		Connection con=DriverManager.getConnection(url, "hr", "hr");
		
		System.out.println("============================");
		System.out.println("Max Salary : "+maxSalary);
		System.out.println("============================");
		
		String sql="SELECT j.job_title, AVG(e.salary)\r\n" + 
				"FROM employees e, jobs j\r\n" + 
				"WHERE e.job_id=j.job_id\r\n" + 
				"AND e.salary>="+maxSalary+"\r\n" + 
				"GROUP BY j.job_title\r\n" + 
				"ORDER BY AVG(e.salary) DESC";
		
		PreparedStatement pstmt=con.prepareStatement(sql);
		
		ResultSet rs=pstmt.executeQuery();
		
		while(rs.next()) {
			
			String jobTitle=rs.getString(1);
			int salary=rs.getInt(2);
			
			System.out.println("["+jobTitle+"] "+salary);
		}
		
		rs.close();
		pstmt.close();
		con.close();
	}

	public static void main(String[] args) throws SQLException, ClassNotFoundException{
		
		int maxSalary=10000;
		new Jdbc02().printStatistics(maxSalary);
		
		maxSalary=15000;
		new Jdbc02().printStatistics(maxSalary);
	}

}
