package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteTest {

	public static void main(String[] args) {

		// 1. 드라이버 로드(생략 가능)
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				
		// 2. Connection 객페 생성
				String dbUrl = "jdbc:oracle:thin:@localhost:1521:xe";
				// String dbUrl = "jdbc:mysql://localhost:3306/project";
				Connection conn = DriverManager.getConnection(dbUrl, "scott", "tiger"); 
		
		// 3. Statement 또는 PreparedStatement 
				// update 
				String sql="delete from dept where deptno=?";
				PreparedStatement pstmt = conn.prepareStatement(sql);
				
				pstmt.setInt(1, 50); 

				int result = pstmt.executeUpdate();
				
				if(result>0) {
					System.out.println("삭제되었습니다. ");
				}
				
				pstmt.close();
				conn.close();
				
		// 4. ResultSet		
		
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		

	}

}
