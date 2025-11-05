package org.quickmonie.core.service;

import org.junit.jupiter.api.Test;
import org.quickmonie.core.dto.request.AccountDepositRequest;
import org.quickmonie.core.dto.response.AccountDepositResponse;
import org.quickmonie.core.dto.response.AccountResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
public class AccountServiceTest {

    @Autowired
    private AccountService accountService;

    @Test
    public void testCanMakeDeposit(){
        AccountDepositRequest request = new AccountDepositRequest();
        request.setAccountNumber("0123456789");
        request.setAmount(new BigDecimal("20,000"));
        request.setBank("OPAY Digital");
        request.setNarration("our very first deposit test");


        AccountDepositResponse response = new AccountDepositResponse();
        assertThat(response).isNotNull();
        assertThat(response.isStatus()).isTrue();

        AccountResponse account = accountService.getAccount("012345678");

        assertThat(account).isNotNull();
        assertThat(account.getBalance())
                .isEqualTo(new BigDecimal(20_000).toString());

    }
}
