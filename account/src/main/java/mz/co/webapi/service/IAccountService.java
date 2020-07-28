package mz.co.webapi.service;

import java.util.List;

import mz.co.webapi.model.Account;

public interface IAccountService {

    public List<Account> findAll();

    public boolean save(Account account);

    public Account find(Long id);
    
    public boolean update(Account account);

    public boolean delete(Account account);
}
