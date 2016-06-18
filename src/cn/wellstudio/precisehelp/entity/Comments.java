package cn.wellstudio.precisehelp.entity;

import java.sql.Timestamp;


/**
 * 评论实体
 *
 * @author huhong
 *
 */
@SuppressWarnings("serial")
public class Comments  implements java.io.Serializable {


    // Fields    
 	private Integer comId; // id
    private Integer comRes;
    private Integer orderdoneId;
    private Integer comParentId;
    private String userId;
    private String goodsId;
 	private String comContent; // 评论内容
 	private Timestamp comTime; // 评论时间
 	private Integer comUps; // 评论赞数
 	private Users users; // 关联用户
 	private Comments comParent; // 关联父亲
 	private Comments comChild; // 关联儿子评论
 	private OrderDone orderDone; // 关联已完成的订单
 	private Goodsinfo goodsinfo; // 关联商品信息

    // Constructors

    /** default constructor */
    public Comments() {
    }
    
    public Comments(Integer comId, Integer comRes, Integer orderdoneId,
			Integer comParentId, String userId, String goodsId,
			String comContent, Timestamp comTime, Integer comUps) {
		super();
		this.comId = comId;
		this.comRes = comRes;
		this.orderdoneId = orderdoneId;
		this.comParentId = comParentId;
		this.userId = userId;
		this.goodsId = goodsId;
		this.comContent = comContent;
		this.comTime = comTime;
		this.comUps = comUps;
	}


	public void setComId(Integer comId) {
        this.comId = comId;
    }

    public String getComContent() {
        return this.comContent;
    }
    
    public void setComContent(String comContent) {
        this.comContent = comContent;
    }

    public Timestamp getComTime() {
        return this.comTime;
    }
    
    public void setComTime(Timestamp comTime) {
        this.comTime = comTime;
    }

    public Integer getComUps() {
        return this.comUps;
    }
    
    public void setComUps(Integer comUps) {
        this.comUps = comUps;
    }

    public Integer getComRes() {
        return this.comRes;
    }
    
    public void setComRes(Integer comRes) {
        this.comRes = comRes;
    }

    public Integer getOrderdoneId() {
        return this.orderdoneId;
    }
    
    public void setOrderdoneId(Integer orderdoneId) {
        this.orderdoneId = orderdoneId;
    }

    public String getUserId() {
        return this.userId;
    }
    
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getGoodsId() {
        return this.goodsId;
    }
    
    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

	public Integer getComParentId() {
		return comParentId;
	}

	public void setComParentId(Integer comParentId) {
		this.comParentId = comParentId;
	}

	public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public Comments getComParent() {
		return comParent;
	}

	public void setComParent(Comments comParent) {
		this.comParent = comParent;
	}

	public Comments getComChild() {
		return comChild;
	}

	public void setComChild(Comments comChild) {
		this.comChild = comChild;
	}

	public OrderDone getOrderDone() {
		return orderDone;
	}

	public void setOrderDone(OrderDone orderDone) {
		this.orderDone = orderDone;
	}

	public Goodsinfo getGoodsinfo() {
		return goodsinfo;
	}

	public void setGoodsinfo(Goodsinfo goodsinfo) {
		this.goodsinfo = goodsinfo;
	}

	public Integer getComId() {
		return comId;
	}

	@Override
	public String toString() {
		return "Comments [comId=" + comId + ", comRes=" + comRes
				+ ", orderdoneId=" + orderdoneId + ", comParentId="
				+ comParentId + ", userId=" + userId + ", goodsId=" + goodsId
				+ ", comContent=" + comContent + ", comTime=" + comTime
				+ ", comUps=" + comUps + "]";
	}
    


}