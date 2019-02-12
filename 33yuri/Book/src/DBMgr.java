import java.sql.*;
import java.util.*;

public class DBMgr {	//db의 데이터를 조작하거나 받아오는 메소드
	DBCon conn;	
	
	public DBMgr() {
		conn = new DBCon(); 
	}
	
	public ArrayList<AdminBean> login(){
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		ArrayList<AdminBean> list = new ArrayList<AdminBean>();
		String sql = "select * from admin";
		AdminBean bean;
		
		try {
			con = conn.getConnection();
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				bean = new AdminBean();
				bean.setId(rs.getString(1));
				bean.setPw(rs.getString(2));
				list.add(bean);
			}
		}catch(SQLException e) {
				e.printStackTrace();
			}finally {
				try {
					rs.close();
					stmt.close();
					con.close();
				}catch(SQLException e) {
					e.printStackTrace();
				}
			}
			return list;
		}	
	
	public ArrayList<MbBean> allmb(){			//데이터를 셀렉하여 값을 반환하는 메소드
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		ArrayList<MbBean> list = new ArrayList<MbBean>();
		String sql = "select * from member";
		try {
			con = conn.getConnection();
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				MbBean bean = new MbBean();
				bean.setMb_name(rs.getString(1));
				bean.setMb_num(rs.getString(2));
				bean.setMb_phone(rs.getString(3));
				bean.setMb_addr(rs.getString(4));
				list.add(bean);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {		// 예외없이 아래의 트라이 캐치를 무조건 실행하도록!  닫아줘야지 프로그램의 속도면에서 빨라진다
			try {
				rs.close();
				stmt.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}
	
	public ArrayList<MbBean> insertMb(String name, String number, String phone, String addr){
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		ArrayList<MbBean> list = new ArrayList<MbBean>();
		String sql = "insert into member values('" + name + "','" + number + "','" + phone + "','" + addr + "')";
		try {
			con = conn.getConnection();
			stmt = con.createStatement();
			stmt.executeUpdate(sql);		//insert니까 업데이트!
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				stmt.close();
				//con 까지 닫아버리면 데이터베이스랑 접속 끊어버리는것
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}
	
	public ArrayList<MbBean> deleteMb(String phone){
		Connection con = null;
		Statement stmt = null;
		ArrayList<MbBean> list = new ArrayList<MbBean>();
		String sql = "delete from member where mb_phone = '" + phone + "'";
		try {
			con = conn.getConnection();
			stmt = con.createStatement();
			stmt.executeUpdate(sql);
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				stmt.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}
	
	public ArrayList<MbBean> searchMb(String phone){
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		ArrayList<MbBean> list = new ArrayList<MbBean>();
		String sql = "select * from member where mb_phone = '" + phone + "'";
		try {
			con = conn.getConnection();
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				MbBean bean = new MbBean();
				bean.setMb_name(rs.getString(1));
				bean.setMb_num(rs.getString(2));
				bean.setMb_phone(rs.getString(3));
				bean.setMb_addr(rs.getString(4));
				list.add(bean);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				rs.close();
				stmt.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}
	
	public  ArrayList<MbBean> updateMb(String phone){
		Connection con =null;
		Statement stmt = null;
		ResultSet rs = null;
		ArrayList<MbBean> list = new ArrayList<MbBean>();
		String sql = "select * from member where mb_phone = '" + phone + "'";
		try {
			con = conn.getConnection();
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				MbBean bean = new MbBean(); 
				bean.setMb_name(rs.getString(1));
				bean.setMb_num(rs.getString(2));
				bean.setMb_phone(rs.getString(3));
				bean.setMb_addr(rs.getString(4));
				list.add(bean);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				rs.close();
				stmt.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}
	
	public ArrayList<MbBean> updateMb2(String name, String num, String phone, String addr){
		Connection con =null;
		PreparedStatement pstmt = null;
		ArrayList<MbBean> list = new ArrayList<MbBean>();
		String sql = "update member set mb_name = ?, mb_num = ?, mb_phone = ?, mb_addr = ?";
		try {
			con = conn.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, num);
			pstmt.setString(3, phone);
			pstmt.setString(4, addr);
			pstmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				con.close();
				pstmt.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}
}
