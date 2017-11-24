package ssmybatis2;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.liu.bean.Content;
import com.liu.mapper.IContentMapper;

public class Test {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		IContentMapper contentMapper = context.getBean(IContentMapper.class);
		List<Content> contents = contentMapper.queryContent();
		for (Content content : contents) {
			System.out.println(content.getTitle());
		}
	}
}
