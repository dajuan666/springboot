package com.liu.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.liu.bean.Params;
import com.liu.bean.User;
import com.liu.dao.IUserDao;
import com.liu.service.IUserService;

@Service
public class UserServiceImpl implements IUserService  {
	
	@Autowired
	public IUserDao userDao ;

	public List<User> findUsers(Params params) {
		return userDao.findUsers(params);
	}

	public User getUser(Integer id) {
		return null;
	}

	public int saveUser(User user) {
		return 0;
	}

	public int updateUser(User user) {
		return 0;
	}

	public int deleteUser(Integer id) {
		return 0;
	}

	
}
