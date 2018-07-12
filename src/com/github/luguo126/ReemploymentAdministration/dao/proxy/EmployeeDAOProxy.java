package com.github.luguo126.ReemploymentAdministration.dao.proxy;

import java.util.List;

import com.github.luguo126.ReemploymentAdministration.dao.IEmployeeDAO;
import com.github.luguo126.ReemploymentAdministration.dao.impl.EmployeeDAOImpl;
import com.github.luguo126.ReemploymentAdministration.dbc.DatabaseConnection;
import com.github.luguo126.ReemploymentAdministration.dbc.impl.DatabaseConnectionImpl;
import com.github.luguo126.ReemploymentAdministration.vo.CV;
import com.github.luguo126.ReemploymentAdministration.vo.Employee;



public class EmployeeDAOProxy implements IEmployeeDAO {
	
	private DatabaseConnection dbc = null;
	private IEmployeeDAO dao = null;
	

	public EmployeeDAOProxy() {
		super();
		dbc = new DatabaseConnectionImpl();
		dao = new EmployeeDAOImpl(dbc.getConnection());
	}

	
	@Override
	public boolean doCreate(Employee vo) throws Exception {
		try {
			dao.doCreate(vo);
		} catch (Exception e) {
			throw e;
		} finally {
			dbc.closeConnection();
		}
		
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

		try {
			flag = dao.findLogin(vo);
		} catch (Exception e) {
			throw e;
		} finally {
			//dbc.closeConnection();
		}
		
		return flag;
	}

	@Override
	public boolean findEmployeeId(Employee vo) throws Exception {
		boolean flag = false;

		try {
			flag = dao.findEmployeeId(vo);
		} catch (Exception e) {
			throw e;
		} finally {
			//dbc.closeConnection();
		}
		
		return flag;
	}


	@Override
	public boolean storeCV(CV vo){
		try {
			if(dao.storeCV(vo)) {
				return true;
			}else {
				return false;
			}
		} catch (Exception e) {
			throw e;
		} finally {
			dbc.closeConnection();
		}
		
//		return true;
	}


	@Override
	public CV findCVByUid(String uid) throws Exception {
		CV vo = dao.findCVByUid(uid);
		
		return vo;
	}


	@Override
	public boolean resetPassword(Employee vo) throws Exception {
		boolean flag = false;

		try {
			flag = dao.resetPassword(vo);
		} catch (Exception e) {
			throw e;
		} finally {
			//dbc.closeConnection();
		}
		
		return flag;
	}

}
