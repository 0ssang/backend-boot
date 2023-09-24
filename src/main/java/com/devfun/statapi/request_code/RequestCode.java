package com.devfun.statapi.request_code;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class RequestCode {
    @Id
    private String code;

    @Column
    private String codeExplain;
}
