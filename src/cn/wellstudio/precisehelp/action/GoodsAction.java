package cn.wellstudio.precisehelp.action;

import java.util.List;



import cn.wellstudio.precisehelp.entity.Goodsinfo;
import cn.wellstudio.precisehelp.service.IGoodsService;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * 商品控制器
 * 
 * @author huhong&xxmodd
 *
 */
public class GoodsAction extends ActionSupport implements
		ModelDriven<Goodsinfo> {
	private static final long serialVersionUID = 1L;
	// 接收的数据
	private Goodsinfo goodsInfo = new Goodsinfo();
	
	// 返回的数据
	private List<Goodsinfo> goodsList;

	public void setGoodsList(List<Goodsinfo> goodsList) {
		this.goodsList = goodsList;
	}

	public List<Goodsinfo> getGoodsList() {
		return goodsList;
	}
	
	public void setGoodsInfo(Goodsinfo goodsInfo) {
		this.goodsInfo = goodsInfo;
	}
	public Goodsinfo getGoodsInfo() {
		return goodsInfo;
	}
	
	

	/*
	 * private Map<String, List<Goodsinfo>> mapRes = new HashMap<String,
	 * List<Goodsinfo>>(); public void setMapRes(Map<String, List<Goodsinfo>>
	 * mapRes) { this.mapRes = mapRes; } public Map<String, List<Goodsinfo>>
	 * getMapRes() { return mapRes; }
	 */

	IGoodsService goodsService;

	public void setGoodsService(IGoodsService goodsService) {
		this.goodsService = goodsService;
	}
	public IGoodsService getGoodsService() {
		return goodsService;
	}

	/**
	 * 发布一个商品
	 * 
	 * @return
	 */
	public String createGoods() {
		if (goodsService.createGoods(goodsInfo)) {
			return "createSuccess";
		}
		return "createFail";
	}

	/**
	 * 更新商品信息
	 * 
	 * @return
	 */
	public String updateGoods() {
		if (goodsService.updateGoods(goodsInfo)) {
			return "updateSuccess";
		}
		return "updateFail";
	}

	/**
	 * 根据id查询商品信息
	 * goodsId
	 * @return
	 */
	public String findGoodsById() {
		
		System.out.println(goodsInfo.getGoodsId());
		
		goodsInfo = goodsService.findGoodsById(goodsInfo.getGoodsId());
		if (goodsInfo != null) {
			System.out.println(goodsInfo);
			return "goodsDetailInfo";
		}
		return "error";
	}

	/**
	 * 查询全部商品信息 ok
	 * null
	 * @return
	 */
	public String findAllGoods() {
		this.goodsList = goodsService.findAllGoods();

		System.out.println(goodsList);

		// mapRes.put("goodsList", goodsList);

		if (goodsList != null) {
			return "findAllGoods";
		}
		return "error";
	}

	/**
	 * 根据种类查询商品信息 ok
	 * goodstypeId
	 * @return
	 */
	public String findGoodsByType() {
		
		System.out.println("hahaha");
		System.out.println("hahaha");
		System.out.println("热不俗？？");
		
		this.goodsList = goodsService.findGoodsByType(goodsInfo.getGoodstypeId());
		if (goodsList != null) {
			return "findGoodsByType";
		}
		return "error";
	}

	/**
	 * 根据名称查询商品信息 ok
	 * goodsName
	 * @return
	 */
	public String findGoodsByName() {
		System.out.println(goodsInfo.getGoodsName());
		this.goodsList = goodsService.findGoodsByName(goodsInfo.getGoodsName());
		if (goodsList != null) {
			return "findGoodsByName";
		}
		return "error";
	}

	/**
	 * 根据产地查询商品信息 ok
	 * goodsareaId
	 * @return
	 */
	public String findGoodsByArea() {
		this.goodsList = goodsService.findGoodsByArea(goodsInfo.getGoodsareaId());
		System.out.println(goodsList);
		if (goodsList != null) {
			return "findGoodsByArea";
		}
		return "error";
	}

	@Override
	public Goodsinfo getModel() {
		return goodsInfo;
	}
}
