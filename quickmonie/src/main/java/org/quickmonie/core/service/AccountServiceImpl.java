package org.quickmonie.core.service;

import org.quickmonie.core.dto.request.AccountDepositRequest;
import org.quickmonie.core.dto.response.AccountDepositResponse;
import org.quickmonie.core.dto.response.AccountResponse;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService{


    @Override
    public AccountDepositResponse deposit(AccountDepositRequest request) {
        return null;
    }

    @Override
    public AccountResponse getAccount(String number) {
        return null;
    }
}
