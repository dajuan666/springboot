package com.liu.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.liu.bean.Content;
import com.liu.mapper.IContentMapper;

@Controller
@RequestMapping
public class IndexController {
	@Autowired
	private IContentMapper contentMapper;
	@RequestMapping("/index")
	public String index(Model model){
		List<Content> contents = contentMapper.queryContent();
		model.addAttribute("contents", contents);
		return "index";
	}
}
