package com.github.luguo126.ReemploymentAdministration.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import com.github.luguo126.ReemploymentAdministration.dao.IAdminDAO;
import com.github.luguo126.ReemploymentAdministration.vo.Administrator;

public class AdminDAOImpl implements IAdminDAO {
	private Connection conn;
	private PreparedStatement pstmt;
	
	public AdminDAOImpl(Connection conn) {
		super();
		this.conn = conn;
	}
	
	
	@Override
	public boolean doCreate(Administrator vo) throws Exception {
		return false;
	}

	@Override
	public boolean doUpdate(Administrator vo) throws Exception {
		return false;
	}

	@Override
	public boolean doRemove(Administrator vo) throws Exception {
		return false;
	}

	@Override
	public Boolean findById(Administrator vo) throws Exception {
		return null;
	}

	@Override
	public List<Administrator> findAll(Administrator vo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean findLogin(Administrator vo) throws Exception {
		
		boolean flag = false;
		String sql = "SELECT id FROM admin WHERE id=? AND password=?";
		this.pstmt = conn.prepareStatement(sql);
		this.pstmt.setString(1, vo.getId());
		this.pstmt.setString(2, vo.getPassword());
		
		ResultSet rs = this.pstmt.executeQuery();
		if (rs.next()) {
			flag = true;
		}
		
		rs.close();
	    pstmt.close();
	    
	    
		return flag;
	}

	@Override
	public boolean findAdministratorId(Administrator vo) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean resetPassword(Administrator vo) throws Exception {
		boolean flag = true;
		String sql = "UPDATE admin SET password=" + vo.getPassword()+" WHERE id="+vo.getId() ;
		this.pstmt = conn.prepareStatement(sql);
		pstmt.executeUpdate();
	    pstmt.close();
	    
		return flag;
	}

}
