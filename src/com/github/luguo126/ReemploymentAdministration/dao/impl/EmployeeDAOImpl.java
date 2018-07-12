package com.github.luguo126.ReemploymentAdministration.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.github.luguo126.ReemploymentAdministration.dao.IEmployeeDAO;
import com.github.luguo126.ReemploymentAdministration.vo.CV;
import com.github.luguo126.ReemploymentAdministration.vo.Employee;

public class EmployeeDAOImpl implements IEmployeeDAO {
	private Connection conn;
	private PreparedStatement pstmt;
	
	public EmployeeDAOImpl(Connection conn) {
		this.conn = conn;
	}

	@Override
	public boolean doCreate(Employee vo) throws Exception {
		String sql = "INSERT INTO employee(id, name, gender, password, birthday, workage, major, education) VALUES(?,?,?,?,?,?,?,?)";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, vo.getId());
		pstmt.setString(2, vo.getName());
		pstmt.setString(3, vo.getGender());
		pstmt.setString(4, vo.getPassword());
		pstmt.setString(5, vo.getBirthday());
		pstmt.setString(6, vo.getWorkage());
		pstmt.setString(7, vo.getMajor());
		pstmt.setString(8, vo.getEducation());		
		pstmt.executeUpdate();
	    pstmt.close();
		
		return false;
	}

	@Override
	public boolean doUpdate(Employee vo) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean doRemove(Employee vo) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Boolean findById(Employee vo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> findAll(Employee vo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean findLogin(Employee vo) throws Exception {
		
		boolean flag = false;
		String sql = "SELECT id FROM employee WHERE id=? AND password=?";
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
	public boolean findEmployeeId(Employee vo) throws Exception {
		
		boolean flag = false;
		String sql = "SELECT id FROM employee WHERE id=?";
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

	@Override
	public boolean storeCV(CV vo) {
		String sql = "INSERT INTO cv(uid,name, sex, age, tel, email, jobIntent, selfDescription, workExperience, education) VALUES(?,?,?,?,?,?,?,?,?,?)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getUid());
			pstmt.setString(2, vo.getName());
			pstmt.setString(3, vo.getSex());
			pstmt.setString(4, vo.getAge());
			pstmt.setString(5, vo.getTel());
			pstmt.setString(6, vo.getEmail());
			pstmt.setString(7, vo.getJobIntent());
			pstmt.setString(8, vo.getSelfDescription());
			pstmt.setString(9, vo.getWorkExperience());
			pstmt.setString(10, vo.getEducation());		
			pstmt.executeUpdate();
		    pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}

		
		return true;
	}

	@Override
	public CV findCVByUid(String uid) throws Exception {
		// TODO Auto-generated method stub
		String sql = "select * from cv where uid="+uid;
		pstmt = conn.prepareStatement(sql);
		ResultSet rs = this.pstmt.executeQuery();
		CV vo = new CV();
		
		if (rs.next()) {
			vo.setName(rs.getString("name"));
			vo.setAge(rs.getString("age"));
			vo.setSex(rs.getString("sex"));
			vo.setTel(rs.getString("tel"));
			vo.setEmail(rs.getString("email"));
			vo.setJobIntent(rs.getString("jobIntent"));
			vo.setSelfDescription(rs.getString("selfDescription"));
			vo.setWorkExperience(rs.getString("workExperience"));
			vo.setEducation(rs.getString("education"));
		}
		
		return vo;
	}

	@Override
	public boolean resetPassword(Employee vo) throws Exception {
		boolean flag = true;
		String sql = "UPDATE employee SET password="+vo.getPassword()+" WHERE id="+vo.getId() ;
		this.pstmt = conn.prepareStatement(sql);
		pstmt.executeUpdate();
	    pstmt.close();
	    
		return flag;
	}

}
