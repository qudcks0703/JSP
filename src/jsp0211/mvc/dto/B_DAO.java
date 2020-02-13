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

public class B_DAO {


	private static B_DAO bdao=new B_DAO(); 
	ResultSet rs;
	PreparedStatement pstmt;
	Connection conn;
	DataSource ds;
	
		//생성자에서 인터넷연결 시도
		private B_DAO() {
			try {
				Context ctx=new InitialContext();
				ds=(DataSource)ctx.lookup("java:comp/env/jdbc/orcl");
			}catch(Exception e) {
				e.printStackTrace();
				System.out.println("생성 실패");
			}
		}
		
		public static B_DAO getInstance() {
			return bdao; 
		}
		
		public List select() {
			List list=new ArrayList();
			B_DTO bdto=null;
			try {
				conn=ds.getConnection();
				String sql="select * from (select num,id,title,content,reg,rownum r from board) order by r";
				pstmt=conn.prepareStatement(sql);
				rs=pstmt.executeQuery();
				while(rs.next()) {
					bdto=new B_DTO();
					bdto.setNum(rs.getInt("num"));
					bdto.setId(rs.getString("id"));
					bdto.setTitle(rs.getString("title"));
					bdto.setContent(rs.getString("content"));
					bdto.setR(rs.getInt("r"));
					bdto.setReg(rs.getTimestamp("reg"));
					list.add(bdto);
				}
			}catch(Exception e) {
				System.out.println("login 실패");
				e.printStackTrace();
			}finally {
				close(pstmt, conn, rs);
			}
			return list;
		}
		
		public List ex_select(String select,String select_value) {
			List list=new ArrayList();
			B_DTO bdto=null;
			String sql=null;
			try {
				conn=ds.getConnection();
				sql="select * from (select num,id,title,content,reg,rownum r from board) where "+select+" like ? order by r";
				pstmt=conn.prepareStatement(sql);
				pstmt.setString(1, "%"+select_value+"%");
				rs=pstmt.executeQuery();
				while(rs.next()) {
					bdto=new B_DTO();
					bdto.setNum(rs.getInt("num"));
					bdto.setId(rs.getString("id"));
					bdto.setTitle(rs.getString("title"));
					bdto.setContent(rs.getString("content"));
					bdto.setR(rs.getInt("r"));
					bdto.setReg(rs.getTimestamp("reg"));
					list.add(bdto);
				}
			}catch(Exception e) {
				System.out.println("login 실패");
				e.printStackTrace();
			}finally {
				close(pstmt, conn, rs);
			}
			return list;
		}
		
		public B_DTO content(int num) {
			List list=new ArrayList();
			B_DTO bdto=null;
			try {
				conn=ds.getConnection();
				String sql="select * from board where num=?";
				pstmt=conn.prepareStatement(sql);
				pstmt.setInt(1, num);
				rs=pstmt.executeQuery();
				while(rs.next()) {
					bdto=new B_DTO();
					bdto.setNum(rs.getInt("num"));
					bdto.setId(rs.getString("id"));
					bdto.setTitle(rs.getString("title"));
					bdto.setContent(rs.getString("content"));
					bdto.setReg(rs.getTimestamp("reg"));
				}
			}catch(Exception e) {
				System.out.println("글 보기 실패");
				e.printStackTrace();
			}finally {
				close(pstmt, conn, rs);
			}
			return bdto;
		}
		public int write(B_DTO bdto){
			try {
				conn=ds.getConnection();
				String sql="insert into board values (board_num.nextval,?,?,?,sysdate)";
				pstmt=conn.prepareStatement(sql);
				pstmt.setString(1, bdto.getId());
				pstmt.setString(2, bdto.getTitle());
				pstmt.setString(3, bdto.getContent());
				return pstmt.executeUpdate();
			}catch(Exception e) {
				System.out.println("글작성 실패");
				e.printStackTrace();
			}finally {
				close(pstmt, conn, rs);
			}
			return 0;
		}
		public int update(B_DTO bdto){
			try {
				conn=ds.getConnection();
				String sql="update board set title=?,content=? where num=?";
				pstmt=conn.prepareStatement(sql);
				pstmt.setString(1, bdto.getTitle());
				pstmt.setString(2, bdto.getContent());
				pstmt.setInt(3, bdto.getNum());
				return pstmt.executeUpdate();
			}catch(Exception e) {
				System.out.println("글작성 실패");
				e.printStackTrace();
			}finally {
				close(pstmt, conn, rs);
			}
			return 0;
		}
		public int delete(int num){
			try {
				conn=ds.getConnection();
				String sql="delete from board where num=?";
				pstmt=conn.prepareStatement(sql);
				pstmt.setInt(1, num);
				return pstmt.executeUpdate();
			}catch(Exception e) {
				System.out.println("글작성 실패");
				e.printStackTrace();
			}finally {
				close(pstmt, conn, rs);
			}
			return 0;
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
