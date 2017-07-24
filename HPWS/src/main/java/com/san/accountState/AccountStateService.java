package com.san.accountState;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

@Service
public class AccountStateService {
	
    @Autowired
    private AccountStateRepository accountStateRepository;

    public List<AccountState> getAll() {
        List<AccountState> records = new ArrayList<>();
        accountStateRepository.findAll().forEach(records::add);
        return records;
    }

    public AccountState getOne(Integer id) {
        return accountStateRepository.findOne(id);
    }

    public void add(AccountState accountState) {
        accountStateRepository.save(accountState);
    }

    public void update(AccountState accountState) {
        // if exists updates otherwise inserts
        accountStateRepository.save(accountState);
    }

    public void delete(Integer id) {
        accountStateRepository.delete(id);
    }
}
