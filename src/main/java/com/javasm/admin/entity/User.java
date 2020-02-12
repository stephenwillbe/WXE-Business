package com.javasm.admin.entity;

import lombok.*;

import java.util.Date;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {
    private String userId;

    private String userName;

    private String userPass;

    private Integer userAge;

    private String userDept;

    private String userPhone;

    private Date createTime;

    private Date updateTime;


}