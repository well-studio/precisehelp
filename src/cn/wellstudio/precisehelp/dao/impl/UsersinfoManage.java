package cn.wellstudio.precisehelp.dao.impl;

import cn.wellstudio.precisehelp.dao.IUsersinfoDAO;
import cn.wellstudio.precisehelp.entity.Users;
import cn.wellstudio.precisehelp.entity.Usersinfo;
import cn.wellstudio.precisehelp.util.Operation;

/**
 * 用户基本信息管理
 * @author xxmodd
 */
public class UsersinfoManage extends ObjectManage implements IUsersinfoDAO{

	// 用户获取基本信息
	public Usersinfo userinfoQuery(Users users) {
		Usersinfo usersinfo = null;
		String sql = "select * from usersinfo where user_id = ?";
		usersinfo = (Usersinfo)Operation.sqlQuery(sql,new Usersinfo(),users.getUserId()).get(0);
		return usersinfo;
	}
}
