package com.example.mycommunity.data.controller.user;

import com.example.mycommunity.data.service.user.UserService;
import org.apache.catalina.User;
import org.springframework.web.bind.annotation.GetMapping;

public class UserController {

    private final UserService userService;

    // 유저 정보 출력
    @GetMapping("/information")
    public User selectUser(int user_pk){
        return userService.selectUser(user_pk);
    }
}
