package com.example.mycommunity.data.dao.user;


import org.apache.ibatis.annotations.Mapper;

@Mapper
public class UserDao {
    public User selectUser(int user_pk); // 마이페이지 유저 정보 출력
}
