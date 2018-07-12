package com.github.luguo126.ReemploymentAdministration.dao.proxy;

import java.util.List;

import com.github.luguo126.ReemploymentAdministration.dao.IAdminDAO;
import com.github.luguo126.ReemploymentAdministration.dao.impl.AdminDAOImpl;
import com.github.luguo126.ReemploymentAdministration.dbc.DatabaseConnection;
import com.github.luguo126.ReemploymentAdministration.dbc.impl.DatabaseConnectionImpl;
import com.github.luguo126.ReemploymentAdministration.vo.Administrator;

public class AdminDAOProxy implements IAdminDAO{
	
	private DatabaseConnection dbc = null;
	private IAdminDAO dao = null;
	
	public AdminDAOProxy() {
		super();
		dbc = new DatabaseConnectionImpl();
		dao = new AdminDAOImpl(dbc.getConnection());		
	}
	
	
	
	@Override
	public boolean doCreate(Administrator vo) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean doUpdate(Administrator vo) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean doRemove(Administrator vo) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Boolean findById(Administrator vo) throws Exception {
		// TODO Auto-generated method stub
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
	public boolean findAdministratorId(Administrator vo) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}



	@Override
	public boolean resetPassword(Administrator vo) throws Exception {
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
