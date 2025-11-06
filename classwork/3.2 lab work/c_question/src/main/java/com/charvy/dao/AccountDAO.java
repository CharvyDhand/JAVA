package com.charvy.dao;

import com.charvy.model.Account;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AccountDAO {

    private final SessionFactory sessionFactory;

    public AccountDAO(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void save(Account account) {
        Session session = sessionFactory.getCurrentSession();
        session.save(account);
    }

    public Account getById(int id) {
        return sessionFactory.getCurrentSession().get(Account.class, id);
    }

    public void update(Account account) {
        sessionFactory.getCurrentSession().update(account);
    }

    public List<Account> getAll() {
        return sessionFactory.getCurrentSession().createQuery("from Account", Account.class).list();
    }
}
