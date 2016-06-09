package cn.wellstudio.precisehelp.sqlhelp;

import java.util.List;

import cn.wellstudio.precisehelp.entity.Admins;
import cn.wellstudio.precisehelp.entity.OrderDoing;
import cn.wellstudio.precisehelp.entity.Users;
import cn.wellstudio.precisehelp.util.Operation;

/**
 * 正在进行的订单增删改查类
 * @author xxmodd
 */
public class OrderDoingManage extends ObjectManage {

	// 用户查询自己的正在进行处理的订单（用户已付款） 一对多查询
	@SuppressWarnings("unchecked")
	public static List<OrderDoing> OrderDoingByUser(Users user) {
		List<OrderDoing> orderDoings = null;
		// `orderdoing_id`,`order_num`,`order_ps`,`order_time`,`order_stat`,`order_kcom`,`order_knum`
		String sql = "select * from order_doing where user_id = ?";
		orderDoings = Operation.sqlQuery(sql, new OrderDoing(),user.getUserId());
		return orderDoings;
	}

	// 管理员查询自己正在进行处理的订单（用户已付款） 一对多查询
	@SuppressWarnings("unchecked")
	public static List<OrderDoing> OrderDoingByAdmin(Admins admins) {
		List<OrderDoing> orderDoings = null;
		// `orderdoing_id`,`order_num`,`order_ps`,`order_time`,`order_stat`,`order_kcom`,`order_knum`
		String sql = "select * from order_doing where adm_id = ?";
		orderDoings = Operation.sqlQuery(sql, new OrderDoing(),admins.getAdmId());
		return orderDoings;
	}
}
