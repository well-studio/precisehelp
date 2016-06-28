package cn.wellstudio.precisehelp.entity;

import java.util.ArrayList;
import java.util.List;



/**
 * 用户
 * 
 * @author huhong
 *
 */
@SuppressWarnings("serial")
public class Users  implements java.io.Serializable {

    // Fields    
 	private String userId; // 用户id
 	private String userAccount; // 用户账号
 	private String userPsw; // 用户密码
 	private String userPayPsw; // 用户支付密码
 	private String userPsw2;// 重复密码
 	private List<Letters> lettersesForLetTo = new ArrayList<Letters>(); // 发出去的信
 	private List<Letters> lettersesForLetFrom = new ArrayList<Letters>(); // 收到的信
 	private List<OrderDoing> orderDoings = new ArrayList<OrderDoing>(); // 正在处理的订单
 	private List<Comments> commentses = new ArrayList<Comments>(); // 发出的评论列表
// 	private List usersinfos = new ArrayList(0); // 用户信息   old
 	private Usersinfo usersinfo;// 用户信息，一对一

 	private List<OrderDone> orderDones = new ArrayList<OrderDone>(); // 该用户已完成的订单
 	private List<Toaddress> toaddresses = new ArrayList<Toaddress>(); // 该用户的收货地址
 	private List<OrderTodo> orderTodos = new ArrayList<OrderTodo>(); // 该用户待处理的订单

 	// +++
 	private List<Coupons> couponses = new ArrayList<Coupons>(); // 关联购物券
 	private List<Shoppingcart> shoppingcarts = new ArrayList<Shoppingcart>(); // 关联购物车
 	private List<Goodsquestion> goodsquestions = new ArrayList<Goodsquestion>(); // 关联商品提问
 	private List<Questionreply> questionreplies = new ArrayList<Questionreply>(); // 关联提问回答
 	private List<Usersfavorite> usersfavorites = new ArrayList<Usersfavorite>(); // 关联商品收藏夹


    // Constructors

    /** default constructor */
    public Users() {
    }

    

   
    public Users(Usersinfo usersinfo) {
		super();
		this.usersinfo = usersinfo;
	}




	public Users(String userId) {
		super();
		this.userId = userId;
	}




	public Users(String userId, String userAccount, String userPsw,
			String userPayPsw, String userPsw2) {
		super();
		this.userId = userId;
		this.userAccount = userAccount;
		this.userPsw = userPsw;
		this.userPayPsw = userPayPsw;
		this.userPsw2 = userPsw2;
	}


	// Property accessors

    public String getUserId() {
        return this.userId;
    }
    
    public void ListUserId(String userId) {
        this.userId = userId;
    }

    public String getUserAccount() {
        return this.userAccount;
    }
    
    public void ListUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public String getUserPsw() {
        return this.userPsw;
    }
    
    public void ListUserPsw(String userPsw) {
        this.userPsw = userPsw;
    }

    public String getUserPayPsw() {
        return this.userPayPsw;
    }
    
    public void ListUserPayPsw(String userPayPsw) {
        this.userPayPsw = userPayPsw;
    }


	public String getUserPsw2() {
		return userPsw2;
	}


	public void setUserPsw2(String userPsw2) {
		this.userPsw2 = userPsw2;
	}


	public List<Letters> getLettersesForLetTo() {
		return lettersesForLetTo;
	}


	public void setLettersesForLetTo(List<Letters> lettersesForLetTo) {
		this.lettersesForLetTo = lettersesForLetTo;
	}


	public List<Letters> getLettersesForLetFrom() {
		return lettersesForLetFrom;
	}


	public void setLettersesForLetFrom(List<Letters> lettersesForLetFrom) {
		this.lettersesForLetFrom = lettersesForLetFrom;
	}


	public List<OrderDoing> getOrderDoings() {
		return orderDoings;
	}


	public void setOrderDoings(List<OrderDoing> orderDoings) {
		this.orderDoings = orderDoings;
	}


	public List<Comments> getCommentses() {
		return commentses;
	}


	public void setCommentses(List<Comments> commentses) {
		this.commentses = commentses;
	}


	public Usersinfo getUsersinfo() {
		return usersinfo;
	}


	public void setUsersinfo(Usersinfo usersinfo) {
		this.usersinfo = usersinfo;
	}


	public List<OrderDone> getOrderDones() {
		return orderDones;
	}


	public void setOrderDones(List<OrderDone> orderDones) {
		this.orderDones = orderDones;
	}


	public List<Toaddress> getToaddresses() {
		return toaddresses;
	}


	public void setToaddresses(List<Toaddress> toaddresses) {
		this.toaddresses = toaddresses;
	}


	public List<OrderTodo> getOrderTodos() {
		return orderTodos;
	}


	public void setOrderTodos(List<OrderTodo> orderTodos) {
		this.orderTodos = orderTodos;
	}


	public List<Coupons> getCouponses() {
		return couponses;
	}


	public void setCouponses(List<Coupons> couponses) {
		this.couponses = couponses;
	}


	public List<Shoppingcart> getShoppingcarts() {
		return shoppingcarts;
	}


	public void setShoppingcarts(List<Shoppingcart> shoppingcarts) {
		this.shoppingcarts = shoppingcarts;
	}


	public List<Goodsquestion> getGoodsquestions() {
		return goodsquestions;
	}


	public void setGoodsquestions(List<Goodsquestion> goodsquestions) {
		this.goodsquestions = goodsquestions;
	}


	public List<Questionreply> getQuestionreplies() {
		return questionreplies;
	}


	public void setQuestionreplies(List<Questionreply> questionreplies) {
		this.questionreplies = questionreplies;
	}


	public List<Usersfavorite> getUsersfavorites() {
		return usersfavorites;
	}


	public void setUsersfavorites(List<Usersfavorite> usersfavorites) {
		this.usersfavorites = usersfavorites;
	}


	public void setUserId(String userId) {
		this.userId = userId;
	}


	public void setUserAccount(String userAccount) {
		this.userAccount = userAccount;
	}


	public void setUserPsw(String userPsw) {
		this.userPsw = userPsw;
	}


	public void setUserPayPsw(String userPayPsw) {
		this.userPayPsw = userPayPsw;
	}


	@Override
	public String toString() {
		return "Users [userId=" + userId + ", userAccount=" + userAccount
				+ ", userPsw=" + userPsw + ", userPayPsw=" + userPayPsw
				+ ", userPsw2=" + userPsw2 + "]";
	}
    
}