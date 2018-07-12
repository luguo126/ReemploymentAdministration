package com.github.luguo126.ReemploymentAdministration.dao;

import com.github.luguo126.ReemploymentAdministration.vo.Company;
import com.github.luguo126.ReemploymentAdministration.vo.ZhaoPinInfo;

public interface ICompanyDAO extends IDAO<Company>{
	
	public boolean findLogin(Company vo) throws Exception;
	public boolean findCompanyId(Company vo) throws Exception;
	public boolean save_zhaopin(ZhaoPinInfo vo);
}
