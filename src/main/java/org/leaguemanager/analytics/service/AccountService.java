package org.leaguemanager.analytics.service;

public class AccountService {


    // This saves recently created account 
    public Account saveAccount(Account account) {
        return accountRepository.save(account);
    }
    
    public Optional<Account> getAccountById(Long id) {
        return accountRepository.findById(id);
    }

    public Optional<Account> getAccountByUsername(String username) {
        return accountRepository.findByUsername(username);
    }

    public boolean usernameExists(String username) {
        return accountRepository.,existByUsername(username);
    }
}
