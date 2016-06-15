package cn.wellstudio.precisehelp.service.impl;

import java.util.List;

import cn.wellstudio.precisehelp.dao.IGoodsTypeDAO;
import cn.wellstudio.precisehelp.entity.Goodstype;
import cn.wellstudio.precisehelp.service.IGoodsTypeService;

/**
 * 商品种类业务实现类
 * @author huhong
 *
 */
public class GoodsTypeService implements IGoodsTypeService {

	IGoodsTypeDAO goodsTypeDao;
	public void setGoodsTypeDao(IGoodsTypeDAO goodsTypeDao) {
		this.goodsTypeDao = goodsTypeDao;
	}
	
	public boolean addType(Goodstype goods) {
		
		boolean res = goodsTypeDao.addType(goods);
		
		return res;
	}

	public List<Goodstype> findAllType() {
		
		List<Goodstype> typeList = goodsTypeDao.findAllType();
		
		return typeList;
	}

	public Goodstype findTypeById(int goodsId) {
		
		Goodstype goodsType = goodsTypeDao.findTypeById(goodsId);
		
		return goodsType;
	}

	public Goodstype findTypeByName(String goodsName) {
		
		Goodstype goodsType = goodsTypeDao.findTypeByName(goodsName);
		
		return goodsType;
	}

	public boolean removeType(Goodstype goods) {
		
		boolean res = goodsTypeDao.removeType(goods);
		
		return res;
	}

	public boolean updateType(Goodstype goods) {
		
		boolean res = goodsTypeDao.updateType(goods);
		
		return res;
	}

}
