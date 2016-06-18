package cn.wellstudio.precisehelp.dao.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import cn.wellstudio.precisehelp.dao.IGoodsAreaDAO;
import cn.wellstudio.precisehelp.entity.Goodsarea;
import cn.wellstudio.precisehelp.entity.Goodsinfo;
import cn.wellstudio.precisehelp.entity.Goodstype;
import cn.wellstudio.precisehelp.util.HibernateSessionFactory;
import cn.wellstudio.precisehelp.util.Operation;

/** 
 * 商品产地的增删改查
 * @author xxmodd 
 */
public class GoodsareaManage extends ObjectManage implements IGoodsAreaDAO{
	// 根据商品产地id获取商品类型
	public Goodsarea findAreaByareaId(int goodsareaId) {
		String hql = "from Goodsarea as ga where ga.areaId = ?";
		@SuppressWarnings("unchecked")
		List<Goodsarea> goodsareas = Operation.hqlQuery(hql, goodsareaId);
		return goodsareas.get(0);
	}


	@Override
	public boolean addArea(Goodsarea goods) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateArea(Goodsarea goods) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeArea(Goodsarea goods) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Goodsarea> findAllArea() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Goodsarea findAreaById(int goodsId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Goodsarea findAreaByName(String goodsName) {
		// TODO Auto-generated method stub
		return null;
	}
}
