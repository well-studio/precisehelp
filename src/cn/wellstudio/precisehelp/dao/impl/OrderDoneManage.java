package cn.wellstudio.precisehelp.dao.impl;

import java.util.List;

import cn.wellstudio.precisehelp.entity.Admins;
import cn.wellstudio.precisehelp.entity.OrderDone;
import cn.wellstudio.precisehelp.entity.Users;
import cn.wellstudio.precisehelp.util.Operation;

/**
 * 已完成订单的增删改查类
 * @author xxmodd
 */
public class OrderDoneManage {

	// 用户查询自己已支付且已确认收货订单
	@SuppressWarnings("unchecked")
	public static List<OrderDone> OrderDoneByUser(Users user) {
		List<OrderDone> orderDoings = null;
		String sql = "select * from order_done where user_id = '"
				+ user.getUserId() + "'";
		orderDoings = Operation.sqlQuery(sql, new OrderDone());
		return orderDoings;
	}

	// 管理员查询自己已处理完的订单
	@SuppressWarnings("unchecked")
	public static List<OrderDone> OrderDoneByAdmin(Admins admin) {
		List<OrderDone> orderDoings = null;
		String sql = "select * from order_done where adm_id = '"
				+ admin.getAdmId() + "'";
		orderDoings = Operation.sqlQuery(sql, new OrderDone());
		return orderDoings;
	}

}
