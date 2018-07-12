package com.github.luguo126.ReemploymentAdministration.dao.proxy;

import java.util.List;

import com.github.luguo126.ReemploymentAdministration.dao.ICompanyDAO;
import com.github.luguo126.ReemploymentAdministration.dao.impl.CompanyDAOImpl;
import com.github.luguo126.ReemploymentAdministration.dbc.DatabaseConnection;
import com.github.luguo126.ReemploymentAdministration.dbc.impl.DatabaseConnectionImpl;
import com.github.luguo126.ReemploymentAdministration.vo.Company;
import com.github.luguo126.ReemploymentAdministration.vo.ZhaoPinInfo;

public class CompanyDAOProxy implements ICompanyDAO {
	private DatabaseConnection dbc = null;
	private ICompanyDAO dao = null;
	
	public CompanyDAOProxy() {
		super();
		dbc = new DatabaseConnectionImpl();
		dao = new CompanyDAOImpl(dbc.getConnection());		
	}
	
	
	
	@Override
	public boolean doCreate(Company vo) throws Exception {
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
	public boolean findCompanyId(Company vo) throws Exception {
		boolean flag = false;

		try {
			flag = dao.findCompanyId(vo);
		} catch (Exception e) {
			throw e;
		} finally {
			//dbc.closeConnection();
		}
		
		return flag;
	}



	@Override
	public boolean save_zhaopin(ZhaoPinInfo vo) {
		boolean flag = false;

		try {
			flag = dao.save_zhaopin(vo);
		} catch (Exception e) {
			throw e;
		} finally {
			//dbc.closeConnection();
		}
		
		return flag;
	}



	@Override
	public boolean resetPassword(Company vo) throws Exception {
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
