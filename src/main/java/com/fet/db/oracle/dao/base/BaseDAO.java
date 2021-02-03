package com.fet.db.oracle.dao.base;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

//import org.springframework.transaction.annotation.Transactional;


@Transactional
public abstract class BaseDAO<T, PK extends Serializable> implements IBaseDAO<T, PK> {


	@PersistenceContext
	private EntityManager entityManager;

	private Class<T> clazz;
	
	protected Class<T> getMyClass() {
		if (clazz == null) {
			clazz = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
		}
		return clazz;
	}
	
	public T findOne(Serializable id) {
		return entityManager.find(getMyClass(), id);
	}

	public List<T> loadAll() {
		return entityManager.createQuery("from " + getMyClass().getName()).getResultList();
	}

	
	public void saveOrUpdate(T entity) {
		entityManager.merge(entity);
//		entityManager.persist(entity);
	}

//	public void update(T entity) {
//		entityManager.merge(entity);
//	}
//
//	public void delete(T entity) {
//		entityManager.remove(entity);
//	}



}
