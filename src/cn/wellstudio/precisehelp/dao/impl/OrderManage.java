package cn.wellstudio.precisehelp.dao.impl;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import cn.wellstudio.precisehelp.dao.IOrderDAO;
import cn.wellstudio.precisehelp.entity.OrderDoing;
import cn.wellstudio.precisehelp.entity.OrderDone;
import cn.wellstudio.precisehelp.entity.OrderTodo;
import cn.wellstudio.precisehelp.util.Operation;

/**
 * 正在进行的订单增删改查类
 * 
 * @author xxmodd
 */
public class OrderManage extends ObjectManage implements IOrderDAO {

	@Override
	public List<?> findAllOrdersByUser(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	// 根据订单编号查询订单(查询订单详情)
	@SuppressWarnings("unchecked")
	@Override
	public Object findOrderByNum(String orderNum) {
		List<Object> orderList = null;
		String orderDoinghql = "from OrderDoing as od where od.orderNum = ?";
		String orderDonehql = "from OrderDone as od where od.orderNum = ?";
		String orderTodohql = "from OrderTodo as od where od.orderNumber = ?";
		if((orderList = Operation.hqlQuery(orderDoinghql, orderNum))!=null){
//			System.out.println("orderDoing");
			if(orderList.size()!=0){
				return orderList.get(0);
			}
		}else if((orderList = Operation.hqlQuery(orderDonehql, orderNum))!=null){
//			System.out.println("OrderDone");
			if(orderList.size()!=0){
				return orderList.get(0);
			}
		}else if((orderList = Operation.hqlQuery(orderTodohql, orderNum))!=null){
//			System.out.println("OrderTodo");
			if(orderList.size()!=0){
				return orderList.get(0);
			}
		}
		return null;
//		String hql = "from OrderDoing as o1,OrderDone as o2,OrderTodo as";
	}
	
	//根据时间段查询订单
	@SuppressWarnings({ "unchecked", "null" })
	public List<Object> findOrdersByTime(Timestamp startTime,Timestamp endTime) {
		List<Object> orderList = new ArrayList<Object>();
		String orderDoinghql = "from OrderDoing as od where od.orderTime>? and od.orderTime<?";
		String orderDonehql = "from OrderDone as od where od.orderTime>? and od.orderTime<?";
		String orderTodohql = "from OrderTodo as od where od.orderTime>? and od.orderTime<?";
//		System.out.println(startTime);
//		System.out.println(endTime);
		List<OrderDoing> orderDoings = Operation.hqlQuery(orderDoinghql, startTime,endTime);
		List<OrderDone> orderDones = Operation.hqlQuery(orderDonehql, startTime,endTime);
		List<OrderTodo> orderTodos = Operation.hqlQuery(orderTodohql, startTime,endTime);
//		System.out.println(orderDoings);
//		System.out.println(orderDones);
//		System.out.println(orderTodos);
//		System.out.println(orderDoings.size()+orderDones.size()+orderTodos.size());
		if(orderDoings!=null&&orderDoings.size()!=0){
			orderList.addAll(orderDoings);
		}
		if(orderDones!=null&&orderDones.size()!=0){
			orderList.addAll(orderDones);
		}
		if(orderTodos!=null&&orderTodos.size()!=0){
			orderList.addAll(orderTodos);
		}
		return orderList;
//		String hql = "from OrderDoing as o1,OrderDone as o2,OrderTodo as";
	}

	

}
