package mz.co.webapi.service;

import java.io.Serializable;
import java.util.List;
import javax.inject.Inject;

import mz.co.webapi.dao.IGenericDao;
import mz.co.webapi.model.Account;

public class AccountService<T, PK extends Serializable> implements IAccountService {

	@Inject
    private IGenericDao<T, Serializable> accountDao;
	
	@SuppressWarnings("unchecked")
	@Override
    public List<Account> findAll() {
        return accountDao.findAll(Account.class);
    }

    @Override
    public boolean save(Account account) {
    	return accountDao.saveOrUpdate(account);
    }

    @Override
    public Account find(Long id) {        
        return (Account) accountDao.find(Account.class, id);
    }
    
    @Override
    public boolean delete(Account account) {        
    	return accountDao.delete(account.getId());
    }
    
    @Override
    public boolean update(Account account) {
    	return accountDao.saveOrUpdate(account);
    }
    
}
