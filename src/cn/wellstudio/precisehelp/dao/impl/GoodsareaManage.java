package cn.wellstudio.precisehelp.dao.impl;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import cn.wellstudio.precisehelp.entity.Goodsarea;
import cn.wellstudio.precisehelp.entity.Goodsinfo;
import cn.wellstudio.precisehelp.util.HibernateSessionFactory;

/** 
 * 商品产地的增删改查
 * @author xxmodd 
 */
public class GoodsareaManage extends ObjectManage{
	//根据商品查询产地信息 test true
	public static Goodsarea goodsAreaQuery(Goodsinfo goodsinfo){
		Goodsarea goodsarea = null;
		Session session;
		Transaction tr = null;
		try{
			session = HibernateSessionFactory.getCurrentSession();
			tr = session.beginTransaction();
			//持久化goodsinfo
			goodsinfo = (Goodsinfo)session.get(Goodsinfo.class, goodsinfo.getGoodsId());
			goodsarea = goodsinfo.getGoodsarea();
			//懒加载处理
			goodsarea.toString();
			tr.commit();
		}catch(Exception e){
			e.printStackTrace();
			try {
				tr.rollback();
			} catch (HibernateException e1) {
				e1.printStackTrace();
			}
		}finally{
			try {
				HibernateSessionFactory.closeCurrentSession();
			} catch (HibernateException e) {
				e.printStackTrace();
			}
		}
		return goodsarea;
	}
}
