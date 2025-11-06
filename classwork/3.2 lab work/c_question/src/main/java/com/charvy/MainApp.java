package com.charvy;

import com.charvy.config.AppConfig;
import com.charvy.model.Account;
import com.charvy.service.AccountService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        AccountService service = context.getBean(AccountService.class);

        // Create Accounts
        service.createAccount(new Account("Alice", 1000));
        service.createAccount(new Account("Bob", 500));

        // Transfer Money
        try {
            service.transferMoney(1, 2, 300);  // Alice -> Bob
        } catch(Exception e) {
            System.out.println("Transaction failed: " + e.getMessage());
        }

        context.close();
    }
}
