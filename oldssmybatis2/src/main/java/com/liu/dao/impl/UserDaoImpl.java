package com.liu.dao.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.liu.bean.Params;
import com.liu.bean.User;
import com.liu.dao.IUserDao;

@Repository
public class UserDaoImpl implements IUserDao {
	
	@Autowired
	private SqlSessionTemplate sessionTemplate;

	public List<User> findUsers(Params params) {
		return sessionTemplate.selectList("com.liu.dao.IUserMapper.findUsers",params);
	}

	public User getUser(Integer id) {
		return sessionTemplate.selectOne("com.liu.dao.IUserMapper.getUser",id);
	}

	public int saveUser(User user) {
		return sessionTemplate.update("com.liu.dao.IUserMapper.saveUser",user);
	}

	public int updateUser(User user) {
		return sessionTemplate.update("com.liu.dao.IUserMapper.updateUser",user);
	}

	public int deleteUser(Integer id) {
		return sessionTemplate.update("com.liu.dao.IUserMapper.deleteUser",id);
	} 

}
