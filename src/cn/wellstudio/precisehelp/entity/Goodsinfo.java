package cn.wellstudio.precisehelp.entity;

import java.util.ArrayList;
import java.util.List;



/**
 * 商品信息的增删改查
 * 
 * @author huhong
 *
 */
@SuppressWarnings("serial")
public class Goodsinfo  implements java.io.Serializable {

    // Fields    

	private String goodsId; // 商品id
	private String goodsName; // 商品姓名
	private String goodsStat; // 商品描述
	private Double goodsLastPrice; // 商品上一次价格
	private Double goodsNowPrice; // 商品现在的价格
	private Double goodsDiscount = 1.0; // 商品折扣率(默认为1)
	private String goodsPriceUnit; // 商品单位
	private String goodsImg;  // 商品展示圖片
	private Integer goodsareaId;
	private Integer goodstypeId;
	private Goodstype goodstype; // 商品类型
	private Goodsarea goodsarea; // 商品产地
	private List<OrderTodo> orderTodos = new ArrayList<OrderTodo>(); // 该商品待处理的订单 old
	private List<OrderDoing> orderDoings = new ArrayList<OrderDoing>(); // 该商品正在处理的订单 old
	private List<OrderDone> orderDones = new ArrayList<OrderDone>(); // 该商品處理完畢的订单 old
	private List<Comments> commentses = new ArrayList<Comments>(); // 该商品对应的评论列表
	private List<Goodsquestion> goodsquestions = new ArrayList<Goodsquestion>(); // 关联商品提问
	private List<Usersfavorite> usersfavorites = new ArrayList<Usersfavorite>();  // 关联用户喜欢
	private List<Shoppingcart> shoppingcarts = new ArrayList<Shoppingcart>();  // 关联用户喜欢
	

    // Constructors

    /** default constructor */
    public Goodsinfo() {
    }

    
    /** full constructor */
    public Goodsinfo(String goodsName, String goodsImg, String goodsStat, Double goodsLastPrice, Double goodsNowPrice, Double goodsDiscount, String goodsPriceUnit, Integer goodsareaId, Integer goodstypeId) {
        this.goodsName = goodsName;
        this.goodsImg = goodsImg;
        this.goodsStat = goodsStat;
        this.goodsLastPrice = goodsLastPrice;
        this.goodsNowPrice = goodsNowPrice;
        this.goodsDiscount = goodsDiscount;
        this.goodsPriceUnit = goodsPriceUnit;
        this.goodsareaId = goodsareaId;
        this.goodstypeId = goodstypeId;
    }

   
    // Property accessors

    public String getGoodsId() {
        return this.goodsId;
    }
    
    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return this.goodsName;
    }
    
    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsImg() {
        return this.goodsImg;
    }
    
    public void setGoodsImg(String goodsImg) {
        this.goodsImg = goodsImg;
    }

    public String getGoodsStat() {
        return this.goodsStat;
    }
    
    public void setGoodsStat(String goodsStat) {
        this.goodsStat = goodsStat;
    }

    public Double getGoodsLastPrice() {
        return this.goodsLastPrice;
    }
    
    public void setGoodsLastPrice(Double goodsLastPrice) {
        this.goodsLastPrice = goodsLastPrice;
    }

    public Double getGoodsNowPrice() {
        return this.goodsNowPrice;
    }
    
    public void setGoodsNowPrice(Double goodsNowPrice) {
        this.goodsNowPrice = goodsNowPrice;
    }

    public Double getGoodsDiscount() {
        return this.goodsDiscount;
    }
    
    public void setGoodsDiscount(Double goodsDiscount) {
        this.goodsDiscount = goodsDiscount;
    }

    public String getGoodsPriceUnit() {
        return this.goodsPriceUnit;
    }
    
    public void setGoodsPriceUnit(String goodsPriceUnit) {
        this.goodsPriceUnit = goodsPriceUnit;
    }

    public Integer getGoodsareaId() {
        return this.goodsareaId;
    }
    
    public void setGoodsareaId(Integer goodsareaId) {
        this.goodsareaId = goodsareaId;
    }

    public Integer getGoodstypeId() {
        return this.goodstypeId;
    }
    
    public void setGoodstypeId(Integer goodstypeId) {
        this.goodstypeId = goodstypeId;
    }
    
    

	public Goodstype getGoodstype() {
		return goodstype;
	}


	public void setGoodstype(Goodstype goodstype) {
		this.goodstype = goodstype;
	}


	public Goodsarea getGoodsarea() {
		return goodsarea;
	}


	public void setGoodsarea(Goodsarea goodsarea) {
		this.goodsarea = goodsarea;
	}


	public List<OrderTodo> getOrderTodos() {
		return orderTodos;
	}


	public void setOrderTodos(List<OrderTodo> orderTodos) {
		this.orderTodos = orderTodos;
	}


	public List<OrderDoing> getOrderDoings() {
		return orderDoings;
	}


	public void setOrderDoings(List<OrderDoing> orderDoings) {
		this.orderDoings = orderDoings;
	}


	public List<OrderDone> getOrderDones() {
		return orderDones;
	}


	public void setOrderDones(List<OrderDone> orderDones) {
		this.orderDones = orderDones;
	}


	public List<Comments> getCommentses() {
		return commentses;
	}


	public void setCommentses(List<Comments> commentses) {
		this.commentses = commentses;
	}


	public List<Goodsquestion> getGoodsquestions() {
		return goodsquestions;
	}


	public void setGoodsquestions(List<Goodsquestion> goodsquestions) {
		this.goodsquestions = goodsquestions;
	}


	public List<Usersfavorite> getUsersfavorites() {
		return usersfavorites;
	}


	public void setUsersfavorites(List<Usersfavorite> usersfavorites) {
		this.usersfavorites = usersfavorites;
	}


	public List<Shoppingcart> getShoppingcarts() {
		return shoppingcarts;
	}


	public void setShoppingcarts(List<Shoppingcart> shoppingcarts) {
		this.shoppingcarts = shoppingcarts;
	}


	@Override
	public String toString() {
		return "Goodsinfo [goodsId=" + goodsId + ", goodsName=" + goodsName
				+ ", goodsImg=" + goodsImg + ", goodsStat=" + goodsStat
				+ ", goodsLastPrice=" + goodsLastPrice + ", goodsNowPrice="
				+ goodsNowPrice + ", goodsDiscount=" + goodsDiscount
				+ ", goodsPriceUnit=" + goodsPriceUnit + ", goodsareaId="
				+ goodsareaId + ", goodstypeId=" + goodstypeId + "]\n";
	}
   



    




}