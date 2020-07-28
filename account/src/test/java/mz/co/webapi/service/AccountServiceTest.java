package mz.co.webapi.service;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Date;

import org.junit.jupiter.api.Test;

import mz.co.webapi.dao.GenericImplemetationDao;
import mz.co.webapi.dao.IGenericDao;
import mz.co.webapi.model.Account;

class AccountServiceTest {

	@SuppressWarnings("rawtypes")
	IGenericDao accountDao = new GenericImplemetationDao();
	
	@Test
	void test() {
	     Account account = new Account();
	     long millis = System.currentTimeMillis();  
	     Date date = new Date(millis);
	     account.setBalance(100);
	     account.setCreationdate(date);
	     assertTrue(accountDao.saveOrUpdate(account));
	}

}
