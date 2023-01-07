package com.example.mycommunity.data.controller.user;

import com.example.mycommunity.data.dto.user.UserDto;
import com.example.mycommunity.data.service.user.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    // 유저 정보 출력
    @GetMapping("/information")
    public UserDto selectUser(int user_pk){

        return userService.selectUser(user_pk);
    }
}
