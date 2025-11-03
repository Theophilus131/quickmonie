package org.quickmonie.core.dto.response;



import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;


@Setter
@Getter
public class AccountDepositResponse {

    private boolean status;
    private LocalDateTime timeStamp;
    private BigDecimal amount;

}
