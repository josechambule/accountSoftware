package mz.co.webapi.dao;

import java.io.Serializable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.hibernate.Session;

public class GenericImplemetationDao<T, PK extends Serializable> implements IGenericDao<T,PK>  {

	@Override
	public boolean saveOrUpdate(Object obj) {	
		boolean ret = true;
        try {
        	Session session = Conexao.getSession();
        	session.beginTransaction();
            session.saveOrUpdate(obj);
            session.getTransaction().commit();
            session.close();
        } catch (Exception e) {
            Logger lgr = Logger.getLogger(GenericImplemetationDao.class.getName());
            lgr.log(Level.SEVERE, e.getMessage(), e);
            ret = false;
        }
        return ret;
	}
	
	@Override
	public boolean update(Object obj){
		boolean ret = true;
		try {
			Session session = Conexao.getSession();
			session.beginTransaction();
            session.update(obj);
            session.getTransaction().commit();
            session.close();
        } catch (Exception e) {
        	Logger lgr = Logger.getLogger(GenericImplemetationDao.class.getName());
            lgr.log(Level.SEVERE, e.getMessage(), e);
            ret = false;
        }
		return ret;
	}
	
	@Override
	public boolean delete(Object obj) {		
		boolean ret = true;
        try {
        	Session session = Conexao.getSession();
			session.beginTransaction();
            session.delete(obj);
            session.getTransaction().commit();
            session.close();
        } catch (Exception e) {
        	Logger lgr = Logger.getLogger(GenericImplemetationDao.class.getName());
            lgr.log(Level.SEVERE, e.getMessage(), e);
            ret = false;
        }
        return ret;
	}

	@SuppressWarnings("rawtypes")
	@Override
	public List findAll(Class clazz) {		
		try {
			Session session = Conexao.getSession();
			session.beginTransaction();
			List lista= session.createQuery("from " + clazz.getName()).list();
			session.getTransaction().commit();
            session.close();
			return lista;
		} catch (Exception erro) {
			throw new RuntimeException(erro);
		}
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public Object find(Class clazz, Long id) {		
		try {			
			Session session = Conexao.getSession();
			session.beginTransaction();
			Object lista =session.get(clazz, id);
			lista.toString();
			session.getTransaction().commit();
            session.close();
			return lista;			
		} catch (NullPointerException error) {
			throw new RuntimeException(error);
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public T get(PK id) {
		return (T) Conexao.getSession();
	}
}
