package com.github.luguo126.ReemploymentAdministration.dao;

import com.github.luguo126.ReemploymentAdministration.vo.CV;
import com.github.luguo126.ReemploymentAdministration.vo.Employee;


public interface IEmployeeDAO extends IDAO<Employee>{
	
	public boolean findLogin(Employee vo) throws Exception;
	public boolean findEmployeeId(Employee vo) throws Exception;
	public boolean storeCV(CV vo);
	public CV findCVByUid(String uid) throws Exception;
}
