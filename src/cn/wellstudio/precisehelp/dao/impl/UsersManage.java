package cn.wellstudio.precisehelp.dao.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import cn.wellstudio.precisehelp.dao.IUsersDAO;
import cn.wellstudio.precisehelp.entity.Users;
import cn.wellstudio.precisehelp.entity.Usersinfo;
import cn.wellstudio.precisehelp.util.HibernateSessionFactory;
import cn.wellstudio.precisehelp.util.Operation;

/**
 * 用户账号管理
 * 
 * @author xxmodd
 */
public class UsersManage extends ObjectManage implements IUsersDAO {

	// 管理员获取全部用户账号,不包含关联信息
	@SuppressWarnings("unchecked")
	public List<Users> getAllUsersMeg() {
		List<Users> userList = null;
		String hql = "from Users";
		userList = Operation.hqlQuery(hql);
		return userList;
	}

	@Override
	public boolean userLogin(Users user) {
		// System.out.println(user.toString());
		// 先查询出原密码
		String hql = "select u.userPsw from Users as u where u.userAccount = ?";
		String psw = null;
		Transaction tr = null;
		try {
			Session session = HibernateSessionFactory.getCurrentSession();
			tr = session.beginTransaction();
			psw = (String) session.createQuery(hql)
					.setString(0, user.getUserAccount()).uniqueResult();
			tr.commit();
		} catch (Exception e) {
			e.printStackTrace();
			try {
				tr.rollback();
			} catch (HibernateException e1) {
				e1.printStackTrace();
				return false;
			}
			return false;
		} finally {
			try {
				HibernateSessionFactory.closeCurrentSession();
			} catch (Exception e2) {
				return false;
			}
		}
		if (psw == null) {
			return false;
		} else {
			System.out.println(psw);
			System.out.println(user.getUserPsw());
			if (psw.equals(user.getUserPsw())) {
				// System.out.println("登入成功");
				return true;
			} else {
				return false;
			}

		}
	}

	//
	@Override
	// (先不写)
	public boolean userPay(Users user) {

		return false;
	}

	// 根据账号查询用户基本信息
	@Override
	public Usersinfo queryUsersinfo(String account) {
		// String hql = "from Usersinfo as u where u.userId = ?";
		String hql = "from Usersinfo as u where u.userId = (select userId from Users as us where us.userAccount=?)";
		@SuppressWarnings("unchecked")
		List<Usersinfo> usersinfos = Operation.hqlQuery(hql, account);
		if (usersinfos.size() != 0) {
			return usersinfos.get(0);
		}
		return null;
	}

	@Override
	public boolean updateInfo(Users user) {
		return update(user);
	}

	@Override
	public boolean addUser(Users users) {
		boolean flag1 = false;
		boolean flag2 = false;
		System.out.println(users.toString());
		if (queryUsersinfo(users.getUserAccount()) != null) {
			flag1 = false;
		} else {
			flag1 = add(users);
			if (flag1) {
				flag2 = add(new Usersinfo(
						"http://xxmodd.com:8080/precisehelp/imgs/users/default.jpg",
						"男", "有缘人", "快点来签名吧~", users.getUserAccount(), "", "",
						users.getUserId()));
			}
		}
		return flag1 && flag2;
	}

}
