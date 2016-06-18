package cn.wellstudio.precisehelp.dao.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import cn.wellstudio.precisehelp.dao.IGoodsTypeDAO;
import cn.wellstudio.precisehelp.entity.Goodsinfo;
import cn.wellstudio.precisehelp.entity.Goodstype;
import cn.wellstudio.precisehelp.util.HibernateSessionFactory;
import cn.wellstudio.precisehelp.util.Operation;

/** 
 * 商品类型增删改查类
 * @author xxmodd 
 */
public class GoodstypeManage extends ObjectManage implements IGoodsTypeDAO{
	
	//根据商品类型id获取商品类型
	public Goodstype findTypeBytypeId(int goodstypeId){
		String hql = "from Goodstype as gs where gs.typeId = ?";
		@SuppressWarnings("unchecked")
		List<Goodstype> goodstypes = Operation.hqlQuery(hql, goodstypeId);
		return goodstypes.get(0);
	}

	@Override
	public boolean addType(Goodstype goods) {
		return false;
	}

	@Override
	public boolean updateType(Goodstype goods) {
		return false;
	}

	@Override
	public boolean removeType(Goodstype goods) {
		return false;
	}

	@Override
	public List<Goodstype> findAllType() {
		return null;
	}

	@Override //(unuse)
	public Goodstype findTypeById(int goodsId) {
		return null;
	}

	@Override
	public Goodstype findTypeByName(String goodsName) {
		return null;
	}
}
