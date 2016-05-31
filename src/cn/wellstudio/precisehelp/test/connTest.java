package cn.wellstudio.precisehelp.test;

import org.hibernate.Session;

import cn.wellstudio.precisehelp.entity.Admins;
import cn.wellstudio.precisehelp.util.HibernateSessionFactory;
/*
 * 连接测试
 */
public class connTest {
	public static void main(String[] args) {
		conn();
	}
	
	public static void conn(){
		Session session = HibernateSessionFactory.getCurrentSession();
		Admins admin = (Admins)session.get(Admins.class, 1);
		System.out.println(admin.toString());
	}
}
