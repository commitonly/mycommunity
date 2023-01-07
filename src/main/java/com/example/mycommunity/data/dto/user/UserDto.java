package com.example.mycommunity.data.dto.user;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;
import org.apache.ibatis.type.Alias;

import java.sql.Timestamp;

@Getter
@Setter
@Alias("user")
public class UserDto {
    private int usernum;
    private String u_type;
    private String login_type;
    private String u_id;
    private String u_pass;
    private String u_name;
    private String u_nick;
    private String u_photo;
    private String u_email;
    private String u_gender;
    private String u_phone;
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "Asia/Seoul")
    private Timestamp u_birth;


}
