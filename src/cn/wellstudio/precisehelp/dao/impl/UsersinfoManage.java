package cn.wellstudio.precisehelp.dao.impl;

import java.util.List;

import cn.wellstudio.precisehelp.dao.IUsersinfoDAO;
import cn.wellstudio.precisehelp.entity.Usersinfo;
import cn.wellstudio.precisehelp.util.Operation;

/**
 * 用户基本信息管理
 * @author xxmodd
 */
public class UsersinfoManage extends ObjectManage implements IUsersinfoDAO{


	@Override
	public boolean updateUserInfo(Usersinfo usersinfo) {
		return update(usersinfo);
	}


	@Override
	public Usersinfo findUserInfo(String userId) {
		String sql = "select * from usersinfo where user_id = ?";
		@SuppressWarnings("unchecked")
		List<Usersinfo> usersList = Operation.sqlQuery(sql,new Usersinfo(),userId);
//		System.out.println(usersList.size());
		System.out.println(usersList.get(0));
		return usersList.get(0);
	}


}
