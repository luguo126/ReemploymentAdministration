package com.github.luguo126.ReemploymentAdministration.dao;

import java.util.List;

public interface IDAO<T> {
	public boolean doCreate(T vo) throws Exception;

	public boolean doUpdate(T vo) throws Exception;

	public boolean doRemove(T vo) throws Exception;

	public Boolean findById(T vo) throws Exception;

	public List<T> findAll(T vo) throws Exception;
	
	public boolean resetPassword(T vo) throws Exception;
}