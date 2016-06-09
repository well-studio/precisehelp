package cn.wellstudio.precisehelp.sqlhelp;

import java.util.List;

import cn.wellstudio.precisehelp.entity.Admins;
import cn.wellstudio.precisehelp.entity.Todolist;
import cn.wellstudio.precisehelp.util.Operation;

/**
 * 管理员处理订单列表，用户已付款
 * @author xxmodd
 */
public class TodolistManage extends ObjectManage{

	// 管理员查询自己已接受的订单,不包括订单信息，订单信息到OrderDoing中查询
	@SuppressWarnings("unchecked")
	public static List<Todolist> todolistQuery(Admins admins) {
		List<Todolist> todolists = null;
		// `orderdoing_id`,`order_num`,`order_ps`,`order_time`,`order_stat`,`order_kcom`,`order_knum`
		String sql = "select * from todolist where adm_id = ?";
		todolists = Operation.sqlQuery(sql, new Todolist(),
				admins.getAdmId());
		return todolists;
	}
}
