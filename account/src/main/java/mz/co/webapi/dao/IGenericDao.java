package mz.co.webapi.dao;

import java.io.Serializable;
import java.util.List;

public interface IGenericDao<T, PK extends Serializable> {

	public T get(PK id);
	
	public boolean saveOrUpdate(Object obj);
	
	public boolean update(Object obj);
	
	@SuppressWarnings("rawtypes")
	public List findAll(Class clazz);

	@SuppressWarnings("rawtypes")
	public Object find(Class clazz, Long id);
	
	public boolean delete(Object obj);
}
