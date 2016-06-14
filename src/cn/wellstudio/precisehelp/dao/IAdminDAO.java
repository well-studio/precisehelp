package cn.wellstudio.precisehelp.dao;

import java.util.List;

import cn.wellstudio.precisehelp.entity.Admins;
import cn.wellstudio.precisehelp.entity.Adminsinfo;

public interface IAdminDAO {
	// 根据管理员账号修改基本信息，（有些信息不能随意更改，待补充）  test true
	public boolean adminsinfoUpdate(Adminsinfo adminsinfo);
	// 根据管理员编号查询管理员基本信息，一个管理员对应一个基本信息表 test true
	public Adminsinfo adminInfoQuery(Admins adm);
	// 查询所有管理员账号信息,不包括密码 test true
	public List<Admins> adminsQuery();
}
