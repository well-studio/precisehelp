package cn.wellstudio.precisehelp.dao.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import cn.wellstudio.precisehelp.dao.IShoppingCartDAO;
import cn.wellstudio.precisehelp.entity.Shoppingcart;
import cn.wellstudio.precisehelp.util.HibernateSessionFactory;

/**
 * 购物车增删改查类
 * @author xxmodd
 */
public class ShoppingcartManage extends ObjectManage implements IShoppingCartDAO{

	//用户查询购物车   test  true
	@Override
	public List<Shoppingcart> findCartByUser(String userId) {
		List<Shoppingcart> shoppingList = null;
		// String hql = "from Shoppingcart s left join Users u "
		// + "on s.id.users.userId = u.userId "
		// + "left join Goodsinfo g on s.id.goodsinfo.goodsId"
		// + " = g.goodsId "
		// + "where u.userId = '" + user.getUserId()+"'";
		// shoppingList = Operation.hqlQuery(hql);
//		String hql = "from Shoppingcart as sc where sc.id.users.userId = '"+user.getUserId()+"'";
//		String sql = "select * from shoppingcart where user_id = ?";
		String hql ="from Shoppingcart as s where s.id.userId = ?";
		Transaction tr = null;
		Query query;
		try {
			Session session = HibernateSessionFactory.getCurrentSession();
			tr = session.beginTransaction();
			query = session.createQuery(hql).setString(0, userId);
			shoppingList = query.list();
			tr.commit();
			//手动添加商品信息
			for (Shoppingcart shoppingcart : shoppingList) {
				shoppingcart.getId().setGoodsinfo(new GoodsinfoManage().findroughGoodsById(shoppingcart.getId().getGoodsId()));
			}
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

	//添加商品到购物车
	@Override
	public boolean addGoodsToCart(Shoppingcart shoppingcart) {
		return add(shoppingcart);
	}

	@Override
	public boolean updateGoodsNum(Shoppingcart shoppingcart) {
		return update(shoppingcart);
	}

	@Override
	public boolean removeGoods(Shoppingcart shoppingcart) {
		return delete(shoppingcart);
	}

}
