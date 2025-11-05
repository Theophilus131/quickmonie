package org.quickmonie.core.service;

import org.quickmonie.core.dto.request.AccountDepositRequest;
import org.quickmonie.core.dto.response.AccountDepositResponse;
import org.quickmonie.core.dto.response.AccountResponse;


public interface AccountService {
    AccountDepositResponse deposit(AccountDepositRequest request);

    AccountResponse getAccount(String number);
}
