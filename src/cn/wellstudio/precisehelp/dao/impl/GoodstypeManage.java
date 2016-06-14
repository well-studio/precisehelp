package cn.wellstudio.precisehelp.dao.impl;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import cn.wellstudio.precisehelp.entity.Goodsinfo;
import cn.wellstudio.precisehelp.entity.Goodstype;
import cn.wellstudio.precisehelp.util.HibernateSessionFactory;

/** 
 * 商品类型增删改查类
 * @author xxmodd 
 */
public class GoodstypeManage extends ObjectManage {
	
	//根据商品信息获取商品类型
	public static Goodstype goodstypeQuery(Goodsinfo goodsinfo){
		Goodstype goodstype = null;
		Session session;
		Transaction tr = null;
		try {
			session = HibernateSessionFactory.getCurrentSession();
			tr = session.beginTransaction();
			// 持久化orderDoing
			goodsinfo = (Goodsinfo) session.get(Goodsinfo.class,
					goodsinfo.getGoodsId());
			goodstype = goodsinfo.getGoodstype();
			// 懒加载处理
			goodstype.toString();
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
		return goodstype;
	}
}
