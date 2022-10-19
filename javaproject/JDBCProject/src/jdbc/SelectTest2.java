package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectTest2 {

	public static void main(String[] args) {

		// 1. 드라이버 로드(생략 가능)
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				
		// 2. Connection 객페 생성
				String dbUrl = "jdbc:oracle:thin:@localhost:1521:xe";
				// String dbUrl = "jdbc:mysql://localhost:3306/project";
				Connection conn = DriverManager.getConnection(dbUrl, "scott", "tiger"); 
				
				if(conn!=null) {
					System.out.println("데이터 베이스 연결!!!");
					// conn.close();
				}
		
		// 3. Statement 또는 PreparedStatement 
				String sql="select * from dept where deptno=?";
				PreparedStatement pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, 10); // 첫 번쨰 물음표에 10 값을 넣는다는 뜻
				
				// Select 의 결과를 담고 있는 객체
				ResultSet rs = pstmt.executeQuery();

				
				if(rs.next()) {

					int deptno = rs.getInt(1);
					String dname = rs.getString(2);
					String loc = rs.getString(3);
					
					System.out.printf("%d \t %s \t %s \n", deptno, dname, loc);
				}
				
				rs.close();
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
