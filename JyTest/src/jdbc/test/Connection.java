package jdbc.test;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Connection {

	public static void main(String[] args) {
		
		
		String dbUrl = "jdbc:mysql://localhost:3306/project";
		java.sql.Connection conn;
		try {
			conn = DriverManager.getConnection(dbUrl, "scott", "tiger");
			
			if(conn!=null) {
				System.out.println("데이터 베이스 연결!!!");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
