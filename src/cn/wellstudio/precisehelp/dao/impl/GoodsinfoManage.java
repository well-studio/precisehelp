package cn.wellstudio.precisehelp.dao.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import cn.wellstudio.precisehelp.dao.IGoodsDAO;
import cn.wellstudio.precisehelp.entity.Goodsinfo;
import cn.wellstudio.precisehelp.entity.Goodstype;
import cn.wellstudio.precisehelp.util.HibernateSessionFactory;
import cn.wellstudio.precisehelp.util.Operation;

/**
 * 商品信息的增删改查
 * @author xxmodd
 */
public class GoodsinfoManage extends ObjectManage implements IGoodsDAO{

	@Override
	public List<Goodsinfo> findAllGoods() {
		String hql = "from Goodsinfo";
		@SuppressWarnings("unchecked")
		List<Goodsinfo> goodList= Operation.hqlQuery(hql);
		return goodList;
	}

	// 粗略信息
	public Goodsinfo findroughGoodsById(String goodId) {
		String hql = "from Goodsinfo as gs where gs.goodsId = ?";
		Goodsinfo goodsinfo;
		Transaction tr = null;
		try {
			Session session = HibernateSessionFactory.getCurrentSession();
			tr = session.beginTransaction();
			goodsinfo = (Goodsinfo) session.createQuery(hql)
					.setString(0, goodId).uniqueResult();
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
		return goodsinfo;
	}
		
	//详细信息，包括评论，类型，产地
	@Override
	public Goodsinfo findGoodsById(String goodId) {
		String hql = "from Goodsinfo as gs where gs.goodsId = ?";
		Goodsinfo goodsinfo;
		Transaction tr = null;
		try {
			Session session = HibernateSessionFactory.getCurrentSession();
			tr = session.beginTransaction();
			goodsinfo = (Goodsinfo)session.createQuery(hql).setString(0,goodId).uniqueResult();
			tr.commit();
			//手动获取评论
			goodsinfo.setCommentses(new CommentsManage().commentsBygoodsIdQuery(goodId));
			//手动获取商品类型
			goodsinfo.setGoodstype(new GoodstypeManage().findTypeBytypeId(goodsinfo.getGoodstypeId()));
			//手动获取商品产地
			goodsinfo.setGoodsarea(new GoodsareaManage().findAreaByareaId(goodsinfo.getGoodsareaId()));
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
		return goodsinfo;
	}
	

	@Override
	public List<Goodsinfo> findGoodsByName(String goodName) {
		String hql = "from Goodsinfo as gs where gs.goodsName like ?";
		@SuppressWarnings("unchecked")
		List<Goodsinfo> goodList= Operation.hqlQuery(hql, "%"+goodName+"%");
		return goodList;
	}

	@Override
	public List<Goodsinfo> findGoodsByType(Integer goodType) {
		String hql = "from Goodsinfo as gs where gs.goodstypeId = ?";
		@SuppressWarnings("unchecked")
		List<Goodsinfo> goodList= Operation.hqlQuery(hql, goodType);
		for (Goodsinfo goodsinfo : goodList) {
			goodsinfo.setGoodstype(new GoodstypeManage().findTypeBytypeId(goodsinfo.getGoodstypeId()));
		}
		
		return goodList;
	}

	@Override
	public List<Goodsinfo> findGoodsByArea(Integer goodArea) {
		String hql = "from Goodsinfo as gs where gs.goodsareaId = ?";
		@SuppressWarnings("unchecked")
		List<Goodsinfo> goodList = Operation.hqlQuery(hql, goodArea);
		return goodList;
	}

	@Override
	public boolean createGoods(Goodsinfo goodsInfo) {
		
		return add(goodsInfo);
	}

	@Override
	public boolean updateGoods(Goodsinfo goodsInfo) {
		
		return update(goodsInfo);
	}
	
	
	
}
