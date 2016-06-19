package cn.wellstudio.precisehelp.dao.impl;

import java.util.List;

import cn.wellstudio.precisehelp.dao.IOrderDAO;
import cn.wellstudio.precisehelp.dao.IOrderDoingDao;
import cn.wellstudio.precisehelp.entity.Admins;
import cn.wellstudio.precisehelp.entity.OrderDoing;
import cn.wellstudio.precisehelp.entity.OrderDone;
import cn.wellstudio.precisehelp.util.Operation;

public class OrderDoingManage extends ObjectManage implements IOrderDoingDao {

	// 创建正在处理订单(添加到管理员todolist)
	@Override
	public boolean createDoingOrder(OrderDoing order) {
		return add(order);
	}

	// 查询全部doing订单(管理员)
	@SuppressWarnings("unchecked")
	@Override
	public List<OrderDoing> findAllDoingOrders() {
		String hql = "from OrderDoing";
		return Operation.hqlQuery(hql);
	}

	// 根据用户查询全部doing订单(用户)
	@SuppressWarnings("unchecked")
	public List<OrderDoing> findAllDoingOrderByUser(String userId) {
		String hql = "from OrderDoing as od where od.userId = ?";
		return  Operation.hqlQuery(hql, userId);
	}


	//完成订单(确认收货)
	@Override
	public boolean confirmOrder(OrderDone order) {
		String deleteSql = "DELETE FROM `order_doing` WHERE (`order_num`=?)";
		boolean flag1 = Operation.sqlExecute(deleteSql, order.getOrderNum());
		if(flag1){
			return add(order);
		}else{
			return false;
		}
		
	}
	
	
	// 根据admin查询正在处理的订单(todolist正在执行的)
	@Override
	public List<OrderDoing> findAllDoingOrderByAdmin(Admins admins) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
