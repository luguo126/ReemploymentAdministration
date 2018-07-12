package com.github.luguo126.ReemploymentAdministration.dao;

import com.github.luguo126.ReemploymentAdministration.vo.Administrator;

public interface IAdminDAO extends IDAO<Administrator>{
	public boolean findLogin(Administrator vo) throws Exception;
	public boolean findAdministratorId(Administrator vo) throws Exception;
}
