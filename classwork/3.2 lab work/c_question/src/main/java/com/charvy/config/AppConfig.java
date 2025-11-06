package com.charvy.config;

import com.charvy.dao.AccountDAO;
import com.charvy.service.AccountService;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.orm.hibernate5.HibernateTransactionManager;

@EnableTransactionManagement
@ComponentScan(basePackages = "com.charvy")
public class AppConfig {

    @Bean
    public SessionFactory sessionFactory() {
        return new Configuration().configure().buildSessionFactory();
    }

    @Bean
    public HibernateTransactionManager transactionManager() {
        return new HibernateTransactionManager(sessionFactory());
    }

    @Bean
    public AccountDAO accountDAO() {
        return new AccountDAO(sessionFactory());
    }

    @Bean
    public AccountService accountService() {
        return new AccountService(accountDAO());
    }
}
