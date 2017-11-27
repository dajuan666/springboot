package com.liu.dao;

import java.util.List;

import com.liu.bean.User;

public interface IUserMapper {

	public List<User> findUsers();
}
