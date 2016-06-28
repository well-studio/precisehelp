package cn.wellstudio.precisehelp.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cn.wellstudio.precisehelp.entity.Shoppingcart;
import cn.wellstudio.precisehelp.service.IShoppingCartService;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
/**
 * 购物车控制器
 * @author huhong
 *
 */
@SuppressWarnings("serial")
public class ShoppingCartAction extends ActionSupport implements ModelDriven<Shoppingcart>{
	
	IShoppingCartService shoppingCartService;
	public void setShoppingCartService(IShoppingCartService shoppingCartService) {
		this.shoppingCartService = shoppingCartService;
	}
	Shoppingcart shoppingcart = new Shoppingcart();
	String userId;
	String goodsId;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getGoodsId() {
		return goodsId;
	}
	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}
	private Map<String, Object> valueMap = new HashMap<String, Object>();
	//返回的数据
	private String Msg;//返回请求信息
	public void setMsg(String msg) {
		Msg = msg;
	}
	public String getMsg() {
		return Msg;
	}
	public Map<String, Object> getValueMap() {
		return valueMap;
	}
	public void setValueMap(Map<String, Object> valueMap) {
		this.valueMap = valueMap;
	}
	
	
	/**
	 * 商品加入购物车
	 * @return
	 */
	public String addGoodsToCart() {
		shoppingcart.getId().setGoodsId(goodsId);
		shoppingcart.getId().setUserId(userId);
		if(shoppingCartService.addGoodsToCart(shoppingcart)){
			//登入成功，保存登入信息
			valueMap.put("Msg", "成功添至购物车!");
			return "valueMap";
		} else {
			valueMap.put("Msg", "添至购物车失败!");
			return "valueMap";
		}
	}
	
	/**
	 * 更新购物车中商品数量 OK
	 * @return
	 */
	public String updateGoodsNum() {
		shoppingcart.getId().setGoodsId(goodsId);
		shoppingcart.getId().setUserId(userId);
		if(shoppingCartService.updateGoodsNum(shoppingcart)){
			//登入成功，保存登入信息
			valueMap.put("Msg", "更新数量成功!");
			return "valueMap";
		} else {
			valueMap.put("Msg", "更新数量失败!");
			return "valueMap";
		}
	}
	
	/**
	 * 从购物车中移除商品 OK
	 * @return
	 */
	public String removeGoods() {
		shoppingcart.getId().setGoodsId(goodsId);
		shoppingcart.getId().setUserId(userId);
		if(shoppingCartService.removeGoods(shoppingcart)){
			//登入成功，保存登入信息
			valueMap.put("Msg", "删除商品成功!");
			return "valueMap";
		} else {
			valueMap.put("Msg", "删除商品失败!");
			return "valueMap";
		}
	}
	
	/**
	 * 根据用户查询购物车商品信息 OK
	 * @return
	 */
	public String findCartByUser() {
		List<Shoppingcart> cartList = shoppingCartService.findCartByUser(userId);
			if(cartList.size() > 0){
			//登入成功，保存登入信息
			valueMap.put("Msg", "查询购物车成功!");
			valueMap.put("cartList", cartList);
			return "valueMap";
		} else {
			valueMap.put("Msg", "查询购物车失败!");
			return "valueMap";
		}
	}
	@Override
	public Shoppingcart getModel() {
		return shoppingcart;
	}
	
}
