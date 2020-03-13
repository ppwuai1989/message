package com.paopao.mycloud.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paopao.mycloud.dao.UserMapper;
import com.paopao.mycloud.entity.User;
import com.paopao.mycloud.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;

	@Override
	public int addMessage(User user) {
		return userMapper.insert(user);
	}
}
