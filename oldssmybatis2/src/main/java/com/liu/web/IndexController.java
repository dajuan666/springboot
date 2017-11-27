package com.liu.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.liu.bean.Params;
import com.liu.dao.IUserDao;
import com.liu.service.IUserService;

@Controller
public class IndexController {
	
	@Autowired
	//如果一个接口有两个子类的话需要指明实现类@Qualifier("")
	private IUserDao userDao;

	@RequestMapping("/index")
	public String index(Model model,Params params){
		model.addAttribute("users",userDao.findUsers(params));
		return "index";
	}
}
