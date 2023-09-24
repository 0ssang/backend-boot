package com.devfun.statapi.request_info;

import com.devfun.statapi.request_code.RequestCode;
import com.devfun.statapi.user.User;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class RequestInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn(name = "requestinfo_code")
    private RequestCode requestCode;

    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn(name = "requestinfo_uid")
    private User user;

    @Column
    private String time;
}
