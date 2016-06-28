package cn.wellstudio.precisehelp.dao.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import cn.wellstudio.precisehelp.dao.IOrderTodoDao;
import cn.wellstudio.precisehelp.entity.OrderTodo;
import cn.wellstudio.precisehelp.entity.Users;
import cn.wellstudio.precisehelp.util.HibernateSessionFactory;
import cn.wellstudio.precisehelp.util.Operation;

/** 
 * 待做订单增删改查
 * @author xxmodd 
 */
public class OrderTodoManage extends ObjectManage implements IOrderTodoDao{

	// 生成待做订单
	@Override
	public boolean createTodoOrder(OrderTodo order) {
		return add(order);
	}

	// 查询全部todo订单(管理员)
	@SuppressWarnings("unchecked")
	@Override
	public List<OrderTodo> findAllTodoOrders() {
		String hql = "from OrderTodo";
		return Operation.hqlQuery(hql);
	}


	//  根据用户查询全部todo订单
	@SuppressWarnings("unchecked")
	@Override
	public List<OrderTodo> findAllTodoOrderByUser(String userId) {
		String hql = "from OrderTodo as od where od.userId = ?";
		return Operation.hqlQuery(hql, userId);
	}
	
	//根据订单编号更新订单
	@Override
	public OrderTodo updateOrderByNum(String orderNum) {
		return null;
	}

	//根据订单编号取消订单(针对没有付款的订单)
	@Override
	public boolean cancelOrder(String orderNum) {
		String sql = "DELETE FROM `order_todo` WHERE (`order_number`=?)";
		return Operation.sqlExecute(sql, orderNum);
	}

	//根据订单编号退款(针对已经付款但是还处于待处理状态的订单)
	@Override
	public boolean cancelMoney(String orderNum) {
		String sql ="UPDATE `order_todo` SET `order_cancel`='1' WHERE (`order_number`=?);";
		return Operation.sqlExecute(sql, orderNum);
	}
	/*
	//用户查询自己未支付的订单
	@SuppressWarnings("unchecked")
	public static List<OrderTodo> OrderTodoByUser(Users user) {
		List<OrderTodo> orderTodos = null;
		String sql = "select * from order_todo where user_id = '"
				+ user.getUserId() + "'";
		orderTodos = Operation.sqlQuery(sql, new OrderTodo());
		return orderTodos;
	}
	*/

	@Override
	public OrderTodo viewTodoOrder(OrderTodo orderTodo) {
		String hql = "from OrderTodo as od where od.orderNumber = ?";
		OrderTodo orderTodo2;
		Transaction tr = null;
		try{
			Session session = HibernateSessionFactory.getCurrentSession();
			tr = session.beginTransaction();
			orderTodo2 = (OrderTodo)session.createQuery(hql).setString(0, orderTodo.getOrderNumber()).uniqueResult();
			tr.commit();
			//手动获取收获地址
			orderTodo2.setToaddress(new ToaddressManage().findAddressById(orderTodo2.getAddressId()));
			//手动获取下单用户
			orderTodo2.setUsers(new Users(new UsersinfoManage().findUserInfo(orderTodo2.getUserId())));
		}catch(Exception e){
			e.printStackTrace();
			try {
				tr.rollback();
			} catch (HibernateException e1) {
				e1.printStackTrace();
				return null;
			}
			return null;
		}finally{
			try {
				HibernateSessionFactory.closeCurrentSession();
			} catch (Exception e2) {
				return null;
			}
		}
		return orderTodo2;
	}
}
