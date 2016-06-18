package cn.wellstudio.precisehelp.dao.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
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
		// 先查询出原密码
		String hql = "select u.userPsw from Users as u where u.userAccount = ?";
		String psw = null;
		Transaction tr = null;
		Query query;
		try {
			Session session = HibernateSessionFactory.getCurrentSession();
			tr = session.beginTransaction();
			psw = (String)session.createQuery(hql).setString(0, user.getUserAccount()).uniqueResult();
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
		if(psw==null){
			return false;
		}else{
			if(psw.equals(user.getUserPsw())){
				return true;
			}else{
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

	@Override
	public Usersinfo queryUsersinfo(String id) {
		String hql = "from Usersinfo as u where u.userId = ?";
		@SuppressWarnings("unchecked")
		List<Usersinfo> usersinfos = Operation.hqlQuery(hql, id);
		if (usersinfos != null) {
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
		return add(users);
	}
}
