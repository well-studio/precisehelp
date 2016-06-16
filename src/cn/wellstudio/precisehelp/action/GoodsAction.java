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
public class GoodsAction extends ActionSupport implements ModelDriven<Goodsinfo>{
	private static final long serialVersionUID = 1L;
	// 接收的数据
	private String goodId;
	private String goodType;
	private String goodName;
	private String goodArea;
	private Goodsinfo goodsInfo = new Goodsinfo();

	// 返回的数据
	private Goodsinfo goodsInfoById;
	private List<Goodsinfo> goodsList;
	public void setGoodsList(List<Goodsinfo> goodsList) {
		this.goodsList = goodsList;
	}
	public List<Goodsinfo> getGoodsList() {
		return goodsList;
	}

	IGoodsService goodsService;

	public String getGoodId() {
		return goodId;
	}

	public void setGoodId(String goodId) {
		this.goodId = goodId;
	}

	public String getGoodType() {
		return goodType;
	}

	public void setGoodType(String goodType) {
		this.goodType = goodType;
	}

	public String getGoodName() {
		return goodName;
	}

	public void setGoodName(String goodName) {
		this.goodName = goodName;
	}

	public String getGoodArea() {
		return goodArea;
	}

	public void setGoodArea(String goodArea) {
		this.goodArea = goodArea;
	}

	public void setGoodsService(IGoodsService goodsService) {
		this.goodsService = goodsService;
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
	 * 
	 * @return
	 */
	public String findGoodsById() {
		this.goodsInfoById = goodsService.findGoodsById(goodId);
		if(goodsInfoById!=null){
			return "findGoodsById";
		}
		return "error";
	}

	/**
	 * 查询全部商品信息
	 * 
	 * @return
	 */
	public String findAllGoods() {
		System.out.println("**************");
		this.goodsList = goodsService.findAllGoods();
		
		System.out.println(goodsList);
		
		if(goodsList!=null){
			return "findAllGoods";
		}
		return "error";
	}

	/**
	 * 根据种类查询商品信息
	 * 
	 * @return
	 */
	public String findGoodsByType() {
		this.goodsList = goodsService.findGoodsByType(goodType);
		if(goodsList!=null){
			return "findGoodsByType";
		}
		return "error";
	}

	/**
	 * 根据名称查询商品信息
	 * 
	 * @return
	 */
	public String findGoodsByName() {
		this.goodsList = goodsService.findGoodsByName(goodName);
		if(goodsList!=null){
			return "findGoodsByName";
		}
		return "error";
	}

	/**
	 * 根据产地查询商品信息
	 * 
	 * @return
	 */
	public String findGoodsByArea() {
		this.goodsList = goodsService.findGoodsByArea(goodArea);
		System.out.println(goodsList);
		if(goodsList!=null){
			return "findGoodsByArea";
		}
		return "error";
	}

	@Override
	public Goodsinfo getModel() {
		return goodsInfo;
	}
}
