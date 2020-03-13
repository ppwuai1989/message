package com.paopao.mycloud.dao;

import com.paopao.mycloud.entity.User;

public interface UserMapper {

    int insert(User record);

    int insertSelective(User record);
}
