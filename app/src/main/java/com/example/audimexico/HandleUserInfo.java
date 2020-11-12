package com.example.audimexico;

import com.amplifyframework.datastore.generated.model.User;

public class HandleUserInfo {
    static void sign_up(String name, String email, String phonenumber) {
        User item = User.builder()
                .name("Victor Canales")
                .email("victorcanlima@gmail.com")
                .phoneNumber("2464904970")
                .build();
    }
}
