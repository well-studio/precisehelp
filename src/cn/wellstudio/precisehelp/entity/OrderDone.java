package cn.wellstudio.precisehelp.entity;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;


/**
 * 已完成的订单   管理员已处理完，用户已确认收货
 * @author huhong
 *
 */
@SuppressWarnings("serial")
public class OrderDone  implements java.io.Serializable {


    // Fields    
 	private Integer orderdoneId; // 订单id

// 	private Goodsinfo goodsinfo; // 商品信息 old
 	private String orderContent;//商品号以及商品数量
 	private String orderNum; // 订单编号
 	private String orderPs; // 订单注释
 	private String orderKcom; // 订单快递公司
 	private String orderKnum; // 订单快递单号
 	private Timestamp orderTime; // 订单下单时间
 	private Timestamp orderDonetime; // 订单完成的时间
 	private Integer orderComment; // 是否评价(++++) 0 尚未评价 1 已评价
    private Integer addressId;
    private String userId;
    private String admId;
    private Integer expressId;
 	private Users users; // 下单用户
 	private Express express; // 物流信息
 	private Admins admins; // 处理的管理员
 	private Toaddress toaddress; // 1:1 收货地址
 	private List<Comments> commentses = new ArrayList<Comments>(); // 完成的订单对应的评论
 	
    // Constructors

    /** default constructor */
    public OrderDone() {
    }

    
    /** full constructor */
    public OrderDone(String orderNum, String orderPs, Timestamp orderTime, Integer addressId, String orderKcom, String orderKnum, Timestamp orderDonetime, Integer orderComment, String userId, String admId, Integer expressId, String orderContent) {
        this.orderNum = orderNum;
        this.orderPs = orderPs;
        this.orderTime = orderTime;
        this.addressId = addressId;
        this.orderKcom = orderKcom;
        this.orderKnum = orderKnum;
        this.orderDonetime = orderDonetime;
        this.orderComment = orderComment;
        this.userId = userId;
        this.admId = admId;
        this.expressId = expressId;
        this.orderContent = orderContent;
    }

   
    // Property accessors

    public Integer getOrderdoneId() {
        return this.orderdoneId;
    }
    
    public void setOrderdoneId(Integer orderdoneId) {
        this.orderdoneId = orderdoneId;
    }

    public String getOrderNum() {
        return this.orderNum;
    }
    
    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    public String getOrderPs() {
        return this.orderPs;
    }
    
    public void setOrderPs(String orderPs) {
        this.orderPs = orderPs;
    }

    public Timestamp getOrderTime() {
        return this.orderTime;
    }
    
    public void setOrderTime(Timestamp orderTime) {
        this.orderTime = orderTime;
    }

    public Integer getAddressId() {
        return this.addressId;
    }
    
    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public String getOrderKcom() {
        return this.orderKcom;
    }
    
    public void setOrderKcom(String orderKcom) {
        this.orderKcom = orderKcom;
    }

    public String getOrderKnum() {
        return this.orderKnum;
    }
    
    public void setOrderKnum(String orderKnum) {
        this.orderKnum = orderKnum;
    }

    public Timestamp getOrderDonetime() {
        return this.orderDonetime;
    }
    
    public void setOrderDonetime(Timestamp orderDonetime) {
        this.orderDonetime = orderDonetime;
    }

    public Integer getOrderComment() {
        return this.orderComment;
    }
    
    public void setOrderComment(Integer orderComment) {
        this.orderComment = orderComment;
    }

    public String getUserId() {
        return this.userId;
    }
    
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getAdmId() {
        return this.admId;
    }
    
    public void setAdmId(String admId) {
        this.admId = admId;
    }

    public Integer getExpressId() {
        return this.expressId;
    }
    
    public void setExpressId(Integer expressId) {
        this.expressId = expressId;
    }

    public String getOrderContent() {
        return this.orderContent;
    }
    
    public void setOrderContent(String orderContent) {
        this.orderContent = orderContent;
    }


	public Users getUsers() {
		return users;
	}


	public void setUsers(Users users) {
		this.users = users;
	}


	public Express getExpress() {
		return express;
	}


	public void setExpress(Express express) {
		this.express = express;
	}


	public Admins getAdmins() {
		return admins;
	}


	public void setAdmins(Admins admins) {
		this.admins = admins;
	}


	public Toaddress getToaddress() {
		return toaddress;
	}


	public void setToaddress(Toaddress toaddress) {
		this.toaddress = toaddress;
	}


	public List<Comments> getCommentses() {
		return commentses;
	}


	public void setCommentses(List<Comments> commentses) {
		this.commentses = commentses;
	}


	@Override
	public String toString() {
		return "OrderDone [orderdoneId=" + orderdoneId + ", orderContent="
				+ orderContent + ", orderNum=" + orderNum + ", orderPs="
				+ orderPs + ", orderKcom=" + orderKcom + ", orderKnum="
				+ orderKnum + ", orderTime=" + orderTime + ", orderDonetime="
				+ orderDonetime + ", orderComment=" + orderComment
				+ ", addressId=" + addressId + ", userId=" + userId
				+ ", admId=" + admId + ", expressId=" + expressId
				+ ", getOrderdoneId()=" + getOrderdoneId() + ", getOrderNum()="
				+ getOrderNum() + ", getOrderPs()=" + getOrderPs()
				+ ", getOrderTime()=" + getOrderTime() + ", getAddressId()="
				+ getAddressId() + ", getOrderKcom()=" + getOrderKcom()
				+ ", getOrderKnum()=" + getOrderKnum()
				+ ", getOrderDonetime()=" + getOrderDonetime()
				+ ", getOrderComment()=" + getOrderComment() + ", getUserId()="
				+ getUserId() + ", getAdmId()=" + getAdmId()
				+ ", getExpressId()=" + getExpressId() + ", getOrderContent()="
				+ getOrderContent() + ", getUsers()=" + getUsers()
				+ ", getExpress()=" + getExpress() + ", getAdmins()="
				+ getAdmins() + ", getToaddress()=" + getToaddress()
				+ ", getCommentses()=" + getCommentses() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
    

}