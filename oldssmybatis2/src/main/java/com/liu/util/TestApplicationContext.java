package com.liu.util;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.liu.bean.User;
import com.liu.dao.IUserDao;
import com.liu.dao.impl.UserDaoImpl;

public class TestApplicationContext {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		/*String[] names = context.getBeanDefinitionNames();
		for (String string : names) {
			System.out.println("==============>"+string);
		}*/
		
		IUserDao userDao = context.getBean(UserDaoImpl.class);
		List<User> users = userDao.findUsers(null);
		for (User user : users) {
			System.out.println(user.getId()+"===="+user.getUsername());
		}
	}
}
