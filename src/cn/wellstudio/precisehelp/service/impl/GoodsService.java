package cn.wellstudio.precisehelp.service.impl;

import java.util.List;





import cn.wellstudio.precisehelp.dao.IGoodsDAO;
import cn.wellstudio.precisehelp.entity.Goodsinfo;
import cn.wellstudio.precisehelp.service.IGoodsService;

/**
 * 商品业务实现类
 * @author huhong
 *
 */
public class GoodsService implements IGoodsService {

	
	IGoodsDAO goodsDao;
	public void setGoodsDao(IGoodsDAO goodsDao) {
		this.goodsDao = goodsDao;
	}
	
	@Override
	public List<Goodsinfo> findAllGoods() {
		
		List<Goodsinfo> goodsList = goodsDao.findAllGoods();
		
		return goodsList;
	}
	
	@Override
	public List<Goodsinfo> findGoodsByName(String goodName) {
		
		List<Goodsinfo> goodsList = goodsDao.findGoodsByName(goodName);
		
		return goodsList;
	}
	
	@Override
	public List<Goodsinfo> findGoodsByType(String goodType) {
		
		List<Goodsinfo> goodsList = goodsDao.findGoodsByType(goodType);
		
		return goodsList;
	}
	
	@Override
	public List<Goodsinfo> findGoodsByArea(String goodArea) {
		
		List<Goodsinfo> goodsList = goodsDao.findGoodsByArea(goodArea);
		
		return goodsList;
	}
	
	@Override
	public boolean createGoods(Goodsinfo goodsInfo) {
		
		boolean res = goodsDao.createGoods(goodsInfo);
		
		return res;
	}
	
	@Override
	public boolean updateGoods(Goodsinfo goodsInfo) {
		
		boolean res = goodsDao.updateGoods(goodsInfo);
		
		return res;
	}

	@Override
	public Goodsinfo findGoodsById(String goodId) {
		
		Goodsinfo goodsinfo = goodsDao.findGoodsById(goodId);
		
		return null;
	}
	
	

}
