package com.github.luguo126.ReemploymentAdministration.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.github.luguo126.ReemploymentAdministration.dao.ICompanyDAO;
import com.github.luguo126.ReemploymentAdministration.dbc.impl.DatabaseConnectionImpl;
import com.github.luguo126.ReemploymentAdministration.vo.Company;
import com.github.luguo126.ReemploymentAdministration.vo.ZhaoPinInfo;

public class CompanyDAOImpl implements ICompanyDAO{
	private Connection conn;
	private PreparedStatement pstmt;
	
	public CompanyDAOImpl(Connection conn) {
		super();
		this.conn = conn;
	}

	@Override
	public boolean doCreate(Company vo) throws Exception {
		String sql = "Insert into Company(id,name,password,nature,contactperson,contacttel) values(?,?,?,?,?,?)";
		pstmt = conn.prepareStatement(sql);
		
		pstmt.setString(1, vo.getId());
		pstmt.setString(2, vo.getName());
		pstmt.setString(3, vo.getPassword());
		pstmt.setString(4, vo.getNature());
		pstmt.setString(5, vo.getContactPerson());
		pstmt.setString(6, vo.getContactTel());
		
		pstmt.executeUpdate();
	    pstmt.close();
		return true;
	}

	@Override
	public boolean doUpdate(Company vo) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean doRemove(Company vo) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Boolean findById(Company vo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Company> findAll(Company vo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean findLogin(Company vo) throws Exception {
		boolean flag = false;
		String sql = "SELECT id FROM company WHERE id=? AND password=?";
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
	public boolean findCompanyId(Company vo) throws Exception {
		boolean flag = false;
		String sql = "SELECT id FROM company WHERE id=?";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, vo.getId());
		ResultSet rs = this.pstmt.executeQuery();
		
		if (rs.next()) {
			flag = true;
		}
		
		rs.close();
	    pstmt.close();
		
	    
		return flag;
	}
	
	
	
	public boolean save_zhaopin(ZhaoPinInfo vo) {
		Connection conn = new DatabaseConnectionImpl().getConnection();
		PreparedStatement pstmt = null;
		
		String sql = "insert into zhaopin(title,category,salary,welfare,company,address,release_date,content) values(?,?,?,?,?,?,?,?)";
		try {
			pstmt = conn.prepareStatement(sql);
//			ZhaoPinInfo vo = new ZhaoPinInfo();
			pstmt.setString(1, vo.getTitle());
			pstmt.setString(2, vo.getCategory());
			pstmt.setString(3, vo.getSalary());
			pstmt.setString(4, vo.getWelfare());
			pstmt.setString(5, vo.getCompany());
			pstmt.setString(6, vo.getAddress());
			pstmt.setString(7, vo.getRelease_date());
			pstmt.setString(8, vo.getContent());		
			
			pstmt.executeUpdate();
		    pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}		
		
		
		return true;		
	}

	@Override
	public boolean resetPassword(Company vo) throws Exception {
		boolean flag = true;
		String sql = "UPDATE company SET password="+vo.getPassword()+" WHERE id="+vo.getId() ;
		this.pstmt = conn.prepareStatement(sql);
		pstmt.executeUpdate();
	    pstmt.close();
	    
		return flag;
	}

}
