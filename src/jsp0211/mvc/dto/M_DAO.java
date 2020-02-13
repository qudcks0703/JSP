package jsp0211.mvc.dto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class M_DAO {


	private static M_DAO mdao=new M_DAO(); 
	ResultSet rs;
	PreparedStatement pstmt;
	Connection conn;
	DataSource ds;
	
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
		
		public int signup(M_DTO mdto) {
			try {
				conn=ds.getConnection();
				String sql="insert into member values (?,?,?)";
				pstmt=conn.prepareStatement(sql);
				pstmt.setString(1, mdto.getId());
				pstmt.setString(2, mdto.getPw());
				pstmt.setString(3, mdto.getName());
				return pstmt.executeUpdate();
				
			}catch(Exception e) {
				System.out.println("signup 실패");
				e.printStackTrace();
			}finally {
				close(pstmt, conn, rs);
			}
			return 0;
		}
		public int delete(String id) {
			try {
				conn=ds.getConnection();
				String sql="delete from member where id=?";
				pstmt=conn.prepareStatement(sql);
				pstmt.setString(1, id);
				return pstmt.executeUpdate();
				
			}catch(Exception e) {
				System.out.println("signup 실패");
				e.printStackTrace();
			}finally {
				close(pstmt, conn, rs);
			}
			return 0;
		}
		
		public int update(M_DTO mdto) {
			try {
				conn=ds.getConnection();
				String sql="update member set pw=?,name=? where id=?";
				pstmt=conn.prepareStatement(sql);
				pstmt.setString(1, mdto.getPw());
				pstmt.setString(2, mdto.getName());
				pstmt.setString(3, mdto.getId());
				return pstmt.executeUpdate();
				
			}catch(Exception e) {
				System.out.println("signup 실패");
				e.printStackTrace();
			}finally {
				close(pstmt, conn, rs);
			}
			return 0;
		}
		public M_DTO selectId(String id) {
			M_DTO mdto=new M_DTO();
			try {
				conn=ds.getConnection();
				String sql="select * from member where id=?";
				pstmt=conn.prepareStatement(sql);
				pstmt.setString(1, id);
				rs=pstmt.executeQuery();
				if(rs.next()) {
					mdto.setId(rs.getString("id"));
					mdto.setPw(rs.getString("pw"));
					mdto.setName(rs.getString("name"));
				}
			}catch(Exception e) {
				System.out.println("signup 실패");
				e.printStackTrace();
			}finally {
				close(pstmt, conn, rs);
			}
			return mdto;
		}
		
		public List select() {
			M_DTO mdto=null;
			List list=new ArrayList();
			try {
				conn=ds.getConnection();
				String sql="select * from member";
				pstmt=conn.prepareStatement(sql);
				rs=pstmt.executeQuery();
				while(rs.next()) {
					mdto=new M_DTO();
					mdto.setId(rs.getString("id"));
					mdto.setPw(rs.getString("pw"));
					mdto.setName(rs.getString("name"));
					list.add(mdto);
				}
			}catch(Exception e) {
				System.out.println("signup 실패");
				e.printStackTrace();
			}finally {
				close(pstmt, conn, rs);
			}
			return list;
		}
		
		
		
	
		public void close(PreparedStatement pstmt,Connection conn,ResultSet rs) {
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
