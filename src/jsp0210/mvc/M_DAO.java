package jsp0210.mvc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;


public class M_DAO {


	private static M_DAO mdao=new M_DAO(); 
	private ResultSet rs;
	private PreparedStatement pstmt;
	private Connection conn;
	private DataSource ds;
	
		//생성자에서 인터넷연결 시도
		private M_DAO() {
			try {
				Context ctx=new InitialContext();
				ds=(DataSource)ctx.lookup("java:comp/env/jdbc/orcl");
			}catch(Exception e) {
				e.printStackTrace();
				System.out.println("생성 실패");
			}
		}
		
		public static M_DAO getInstance() {
			return mdao;
		}
		
		public int Login(String id,String pw) {
			try {
				conn=ds.getConnection();
				String sql="select pw from member where id =?";
				pstmt=conn.prepareStatement(sql);
				pstmt.setString(1, id);
				rs=pstmt.executeQuery();
				if(rs.next()) {
					if(rs.getString("pw").equals(pw)) {
						return 1;
					}else {
						return 0;
					}
				}
			}catch(Exception e) {
				System.out.println("login 실패");
				e.printStackTrace();
			}finally {
				close(pstmt, conn, rs);
			}
			return -1;
			
			
		}
	
		private void close(PreparedStatement pstmt,Connection conn,ResultSet rs) {
			if(rs!=null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(pstmt!=null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(conn!=null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
}
