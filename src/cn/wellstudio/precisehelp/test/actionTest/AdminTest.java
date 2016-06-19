package cn.wellstudio.precisehelp.test.actionTest;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
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
	public void test1() {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		System.out.println(context);
		AdminAction action = (AdminAction) context.getBean("adminAction");
	}

	@Test
	public void test2() {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		AdminService service = (AdminService) context.getBean("adminService");
		service.adminsQuery();
	}

	// DAO层测试
	@Test
	public void test3() {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		AdminManage manage = (AdminManage) context.getBean("adminManage");
		List<Admins> adminsQuery = manage.adminsQuery();
		System.out.println(adminsQuery.size());
	}

	// DAO goodsInfo测试
	@Test
	public void test4() {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		GoodsinfoManage manage = (GoodsinfoManage) context
				.getBean("goodsInfoManage");
		List<Goodsinfo> goods = manage.findAllGoods();
		System.out.println(goods);
	}

	// add User
	@Test
	public void test5() {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		UsersManage manage = (UsersManage) context.getBean("usersManage");
		Users user = new Users();
		user.setUserId(UUID.randomUUID().toString());
		user.setUserPayPsw("123456");
		user.setUserPsw("4567890");
		boolean res = manage.addUser(user);
		System.out.println(res);
	}

	@Test
	public void test6() {
		Date date = new Date();
		long time = date.getTime();
		Timestamp endTime = new Timestamp(time);
		System.out.println(time);
		System.out.println(endTime);

		// 完整显示今天日期时间
		String str = (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS"))
				.format(new Date());
		System.out.println(str);

		// 创建 Calendar 对象
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar.getTimeInMillis());
		calendar.set(calendar.YEAR, calendar.MONTH, calendar.DAY_OF_WEEK - 1);
		System.out.println(calendar.getTimeInMillis());
		
		/*
		// 对 calendar 设置时间的方法
		// 设置传入的时间格式
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-M-d H:m:s");
		
		// 指定一个日期
		try {
			Date date2 = dateFormat.parse("2013-6-1 13:24:16");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		// 对 calendar 设置为 date 所定的日期
		
		calendar.setTime(date);

		// 按特定格式显示刚设置的时间
		str = (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS")).format(calendar
				.getTime());
		System.out.println(str);
		*/

	}
}
