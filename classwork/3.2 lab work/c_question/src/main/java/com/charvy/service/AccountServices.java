package com.charvy.service;

import com.charvy.dao.AccountDAO;
import com.charvy.model.Account;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AccountService {

    private final AccountDAO accountDAO;

    public AccountService(AccountDAO accountDAO) {
        this.accountDAO = accountDAO;
    }

    @Transactional
    public void transferMoney(int fromId, int toId, double amount) {
        Account from = accountDAO.getById(fromId);
        Account to = accountDAO.getById(toId);

        if(from.getBalance() < amount) {
            throw new RuntimeException("Insufficient funds");
        }

        from.setBalance(from.getBalance() - amount);
        to.setBalance(to.getBalance() + amount);

        accountDAO.update(from);
        accountDAO.update(to);
        System.out.println("Transferred " + amount + " from " + from.getName() + " to " + to.getName());
    }

    @Transactional
    public void createAccount(Account account) {
        accountDAO.save(account);
    }
}
