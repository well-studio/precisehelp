package cn.wellstudio.precisehelp.test.actionTest;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.wellstudio.precisehelp.action.AdminAction;
import cn.wellstudio.precisehelp.dao.impl.AdminManage;
import cn.wellstudio.precisehelp.entity.Admins;
import cn.wellstudio.precisehelp.service.impl.AdminService;

public class AdminTest {
	@Test
	public void test1(){
		ApplicationContext context = 
			new ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println(context);
		AdminAction action = (AdminAction) context.getBean("adminAction");
	}
	@Test
	public void test2(){
		ApplicationContext context = 
			new ClassPathXmlApplicationContext("applicationContext.xml");
		AdminService service = (AdminService) context.getBean("adminService");
		service.adminsQuery();
	}
	// DAO层测试
	@Test
	public void test3(){
		ApplicationContext context = 
			new ClassPathXmlApplicationContext("applicationContext.xml");
		AdminManage manage = (AdminManage) context.getBean("adminManage");
		List<Admins> adminsQuery = manage.adminsQuery();
		System.out.println(adminsQuery.size());
	}
}




