package cn.wellstudio.precisehelp.sqlhelp;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import cn.wellstudio.precisehelp.entity.Shoppingcart;
import cn.wellstudio.precisehelp.entity.Users;
import cn.wellstudio.precisehelp.util.HibernateSessionFactory;

/**
 * 购物车增删改查类
 * @author xxmodd
 */
public class ShoppingcartManage extends ObjectManage {

	// 用户查询自己的购物车
	@SuppressWarnings("unchecked")
	public static List<Shoppingcart> userShoppingcartQuery(Users user) {
		List<Shoppingcart> shoppingList = null;
		// String hql = "from Shoppingcart s left join Users u "
		// + "on s.id.users.userId = u.userId "
		// + "left join Goodsinfo g on s.id.goodsinfo.goodsId"
		// + " = g.goodsId "
		// + "where u.userId = '" + user.getUserId()+"'";
		// shoppingList = Operation.hqlQuery(hql);
		String hql = "from Shoppingcart as sc where sc.id.users.userId = '"+user.getUserId()+"'";
		Transaction tr = null;
		Query query;
		try {
			Session session = HibernateSessionFactory.getCurrentSession();
			tr = session.beginTransaction();
			query = session.createQuery(hql);
			shoppingList = query.list();
			//懒加载处理
			for (Shoppingcart shoppingcart : shoppingList) {
				shoppingcart.getId().getGoodsinfo().toString();
				shoppingcart.getGoodsNum();
			}
			tr.commit();
		} catch (Exception e) {
			e.printStackTrace();
			try {
				tr.rollback();
			} catch (HibernateException e1) {
				e1.printStackTrace();
				return null;
			}
			return null;
		} finally {
			try {
				HibernateSessionFactory.closeCurrentSession();
			} catch (Exception e2) {
				return null;
			}
		}
		return shoppingList;
	}
}
