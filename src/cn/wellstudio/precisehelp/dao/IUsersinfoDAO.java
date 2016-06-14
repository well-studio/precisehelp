package cn.wellstudio.precisehelp.dao;

import cn.wellstudio.precisehelp.entity.Users;
import cn.wellstudio.precisehelp.entity.Usersinfo;

public interface IUsersinfoDAO {
	// 用户获取基本信息
	public Usersinfo userinfoQuery(Users users);
}
