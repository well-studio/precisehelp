package cn.wellstudio.precisehelp.sqlhelp;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import cn.wellstudio.precisehelp.entity.Goodsinfo;
import cn.wellstudio.precisehelp.entity.OrderDoing;
import cn.wellstudio.precisehelp.entity.OrderDone;
import cn.wellstudio.precisehelp.entity.OrderTodo;
import cn.wellstudio.precisehelp.util.HibernateSessionFactory;

/**
 * 商品信息的增删改查
 * 
 * @author xxmodd
 */
public class GoodsinfoManage extends ObjectManage {
	// 根据正在进行的订单查询商品信息 test true
	public static Goodsinfo goodsinfoByOrderDoingQuery(OrderDoing orderDoing) {
		Goodsinfo goodsinfo = null;
		Session session;
		Transaction tr = null;
		try {
			session = HibernateSessionFactory.getCurrentSession();
			tr = session.beginTransaction();
			// 持久化orderDoing
			orderDoing = (OrderDoing) session.get(OrderDoing.class,
					orderDoing.getOrderdoingId());
			goodsinfo = orderDoing.getGoodsinfo();
			// 懒加载处理
			goodsinfo.toString();
			tr.commit();
		} catch (Exception e) {
			e.printStackTrace();
			try {
				tr.rollback();
			} catch (HibernateException e1) {
				e1.printStackTrace();
			}
		} finally {
			try {
				HibernateSessionFactory.closeCurrentSession();
			} catch (HibernateException e) {
				e.printStackTrace();
			}
		}
		return goodsinfo;
	}

	// 根据已完成的订单查询商品信息 test true
	public static Goodsinfo goodsinfoByOrderDoneQuery(OrderDone orderDone) {
		Goodsinfo goodsinfo = null;
		Session session;
		Transaction tr = null;
		try {
			session = HibernateSessionFactory.getCurrentSession();
			tr = session.beginTransaction();
			// 持久化orderDoing
			orderDone = (OrderDone) session.get(OrderDone.class,
					orderDone.getOrderdoneId());
			goodsinfo = orderDone.getGoodsinfo();
			// 懒加载处理
			goodsinfo.toString();
			tr.commit();
		} catch (Exception e) {
			e.printStackTrace();
			try {
				tr.rollback();
			} catch (HibernateException e1) {
				e1.printStackTrace();
			}
		} finally {
			try {
				HibernateSessionFactory.closeCurrentSession();
			} catch (HibernateException e) {
				e.printStackTrace();
			}
		}
		return goodsinfo;
	}

	// 根据待处理的订单查询商品信息 test true
	public static Goodsinfo goodsinfoByOrderTodoQuery(OrderTodo orderTodo) {
		Goodsinfo goodsinfo = null;
		Session session;
		Transaction tr = null;
		try {
			session = HibernateSessionFactory.getCurrentSession();
			tr = session.beginTransaction();
			// 持久化orderDoing
			orderTodo = (OrderTodo) session.get(OrderTodo.class,
					orderTodo.getOrdertodoId());
			goodsinfo = orderTodo.getGoodsinfo();
			// 懒加载处理
			goodsinfo.toString();
			tr.commit();
		} catch (Exception e) {
			e.printStackTrace();
			try {
				tr.rollback();
			} catch (HibernateException e1) {
				e1.printStackTrace();
			}
		} finally {
			try {
				HibernateSessionFactory.closeCurrentSession();
			} catch (HibernateException e) {
				e.printStackTrace();
			}
		}
		return goodsinfo;
	}

}
