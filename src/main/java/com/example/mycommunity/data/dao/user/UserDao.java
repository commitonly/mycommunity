package com.example.mycommunity.data.dao.user;


import com.example.mycommunity.data.dto.user.UserDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao {
    public UserDto selectUser(int usernum); // 유저 정보 출력
    public void updateUser(UserDto user);
    public int searchId(String u_id);
    public void insertUser(UserDto user);
    public int selectNickname(String u_nick);
    public String selectPass(UserDto user);
    public void updatePass(UserDto user);
    public void deleteUser(String u_id);
    public String selectFindId(String u_phone);
    public String selectFindPass(UserDto user);
    public int selectCheckPhone(String u_phone);
    public int selectCheckInfo(UserDto user);


}
