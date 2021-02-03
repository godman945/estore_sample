package com.fet.db.oracle.service.base;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.repository.Repository;

public interface IBaseService<T, PK extends Serializable> {
	
	
	public T findOne(Serializable id);
	
	public List<T> loadAll();
	
//	public PK save(T entity);
//	
	public void saveOrUpdate(T entity);
//	
//	
//	
//	public void delete(T entity);
//	
//	public T get(Serializable id);
}
