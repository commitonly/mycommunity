package com.example.mycommunity.data.service.user;

import com.example.mycommunity.data.dao.user.UserDao;

@Service
public class UserService {

    private final UserDao userdao;

    //유저 정보 출력
    public User selectUser(int user_pk){
        return userdao.selectUser(user_pk);
    }
}
