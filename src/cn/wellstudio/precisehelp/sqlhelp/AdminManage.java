package cn.wellstudio.precisehelp.sqlhelp;

import java.util.List;

import cn.wellstudio.precisehelp.entity.Admins;
import cn.wellstudio.precisehelp.entity.Adminsinfo;
import cn.wellstudio.precisehelp.util.Operation;

/**
 * 管理员管理类，增删改查
 * @author xxmodd
 */
public class AdminManage extends ObjectManage{

	// 根据管理员账号修改基本信息，（有些信息不能随意更改，待补充）  test true
	public static boolean adminsinfoUpdate(Adminsinfo adminsinfo) {
		return Operation.update(adminsinfo);
	}

	// 根据管理员编号查询管理员基本信息，一个管理员对应一个基本信息表 test true
	public static Adminsinfo adminInfoQuery(Admins adm) {
		String hql = "from Adminsinfo as adm where adm.admins.admId = ?";
		@SuppressWarnings("unchecked")
		List<Adminsinfo> admList = Operation.hqlQuery(hql,adm.getAdmId());
		if (admList.size() == 0) {
			return null;
		}
		return admList.get(0);
	}

	// 查询所有管理员账号信息,不包括密码 test true
	@SuppressWarnings("unchecked")
	public static List<Admins> adminsQuery() {
		String hql = "from Admins";
		List<Admins> admList = Operation.hqlQuery(hql);
		if (admList.size() == 0) {
			return null;
		}
		return admList;
	}
}
