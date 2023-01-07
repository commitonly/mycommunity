package com.example.mycommunity.data.service.user;

import com.example.mycommunity.data.dao.user.UserDao;
import com.example.mycommunity.data.dto.user.UserDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserDao userdao;

    //유저 정보 출력
    public UserDto selectUser(int user_pk)
    {
        return userdao.selectUser(user_pk);
    }
    //회원 정보 수정
    public void updateUser(UserDto user){
        userdao.updateUser(user);
    }
    //회원가입 아이디 중복 체크
    public int searchId(String u_id){
        return userdao.searchId(u_id);
    }
    //회원가입
    public void insertUser(UserDto user){
        userdao.insertUser(user);
    }
}
