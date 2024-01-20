package com.codelab.HiloATMApp.model;

import lombok.Data;

@Data
public class HiloUser {

    private Long userId;
    private String username;
    private String password;
    private String email;
    private String firstName;
    private String lastName;


}
