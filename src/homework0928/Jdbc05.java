package homework0928;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class Jdbc05 {

	public static void main(String[] args) {
		
		if(args.length !=1) {
			System.out.println("부서의 아이디를 입력하세요...");
			System.exit(1);
		}
		
		String dept_id=args[0];	
		Connection con=null;
		ResultSet rs=null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url="jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String user="hr";
			String password="hr";
						
			con=DriverManager.getConnection(url, user, password);
			
			String sql="SELECT e.employee_id, d.department_name, e.salary, vt.AVG\r\n" + 
					"FROM employees e, departments d,\r\n" + 
					"(SELECT AVG(salary) AVG, department_id\r\n" + 
					"FROM employees\r\n" + 
					"GROUP BY department_id\r\n" + 
					"HAVING department_id='"+dept_id+"') vt\r\n" + 
					"WHERE e.department_id=d.department_id\r\n" + 
					"AND e.department_id=vt.department_id";
			
			PreparedStatement pstmt=con.prepareStatement(sql);
			
			rs=pstmt.executeQuery();
			
			ResultSetMetaData md=rs.getMetaData();
			
			System.out.println(md.getColumnName(1)+"\t"+md.getColumnName(2)+"\t"+md.getColumnName(3)+"\t"+md.getColumnName(4));
			
			while(rs.next()) {
				
				String employeeId=rs.getString(1);
				String departmentName=rs.getString(2);
				int salary=rs.getInt(3);
				int avgSalary=rs.getInt(4);
				
				System.out.println(employeeId+"\t\t"+departmentName+"\t"+salary+"\t"+avgSalary);
				
			}
			
			rs.close();
			pstmt.close();
			con.close();
						
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
