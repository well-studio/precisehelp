package cn.wellstudio.precisehelp.test.actionTest;

import java.util.List;
import java.util.UUID;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.wellstudio.precisehelp.action.AdminAction;
import cn.wellstudio.precisehelp.dao.impl.AdminManage;
import cn.wellstudio.precisehelp.dao.impl.GoodsinfoManage;
import cn.wellstudio.precisehelp.dao.impl.UsersManage;
import cn.wellstudio.precisehelp.entity.Admins;
import cn.wellstudio.precisehelp.entity.Goodsinfo;
import cn.wellstudio.precisehelp.entity.Users;
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
	
	// DAO goodsInfo测试
	@Test
	public void test4(){
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		GoodsinfoManage manage = (GoodsinfoManage) context.getBean("goodsInfoManage");
		List<Goodsinfo> goods= manage.findAllGoods();
		System.out.println(goods);
	}
	
	// add User
	@Test
	public void test5(){
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		UsersManage manage = (UsersManage) context.getBean("usersManage");
		Users user = new Users();
		user.setUserId(UUID.randomUUID().toString());
		user.setUserPayPsw("123456");
		user.setUserPsw("4567890");
		boolean res = manage.addUser(user);
		System.out.println(res);
	}
}




