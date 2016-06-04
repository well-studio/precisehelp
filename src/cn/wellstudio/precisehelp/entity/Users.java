package cn.wellstudio.precisehelp.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Users entity. @author MyEclipse Persistence Tools
 */

public class Users implements java.io.Serializable {

	// Fields

	private String userId;
	private String userAccount;
	private String userPsw;
	private String userPayPsw;
	private Set couponses = new HashSet(0);
	private Set shoppingcarts = new HashSet(0);
	private Set lettersesForLetTo = new HashSet(0);
	private Set lettersesForLetFrom = new HashSet(0);
	private Set orderDoings = new HashSet(0);
	private Set goodsquestions = new HashSet(0);
	private Set usersinfos = new HashSet(0);
	private Set orderDones = new HashSet(0);
	private Set usersfavorites = new HashSet(0);
	private Set toaddresses = new HashSet(0);
	private Set orderTodos = new HashSet(0);
	private Set questionreplies = new HashSet(0);

	// Constructors

	/** default constructor */
	public Users() {
	}

	/** full constructor */
	public Users(String userAccount, String userPsw, String userPayPsw,
			Set couponses, Set shoppingcarts, Set lettersesForLetTo,
			Set lettersesForLetFrom, Set orderDoings, Set goodsquestions,
			Set usersinfos, Set orderDones, Set usersfavorites,
			Set toaddresses, Set orderTodos, Set questionreplies) {
		this.userAccount = userAccount;
		this.userPsw = userPsw;
		this.userPayPsw = userPayPsw;
		this.couponses = couponses;
		this.shoppingcarts = shoppingcarts;
		this.lettersesForLetTo = lettersesForLetTo;
		this.lettersesForLetFrom = lettersesForLetFrom;
		this.orderDoings = orderDoings;
		this.goodsquestions = goodsquestions;
		this.usersinfos = usersinfos;
		this.orderDones = orderDones;
		this.usersfavorites = usersfavorites;
		this.toaddresses = toaddresses;
		this.orderTodos = orderTodos;
		this.questionreplies = questionreplies;
	}

	// Property accessors

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserAccount() {
		return this.userAccount;
	}

	public void setUserAccount(String userAccount) {
		this.userAccount = userAccount;
	}

	public String getUserPsw() {
		return this.userPsw;
	}

	public void setUserPsw(String userPsw) {
		this.userPsw = userPsw;
	}

	public String getUserPayPsw() {
		return this.userPayPsw;
	}

	public void setUserPayPsw(String userPayPsw) {
		this.userPayPsw = userPayPsw;
	}

	public Set getCouponses() {
		return this.couponses;
	}

	public void setCouponses(Set couponses) {
		this.couponses = couponses;
	}

	public Set getShoppingcarts() {
		return this.shoppingcarts;
	}

	public void setShoppingcarts(Set shoppingcarts) {
		this.shoppingcarts = shoppingcarts;
	}

	public Set getLettersesForLetTo() {
		return this.lettersesForLetTo;
	}

	public void setLettersesForLetTo(Set lettersesForLetTo) {
		this.lettersesForLetTo = lettersesForLetTo;
	}

	public Set getLettersesForLetFrom() {
		return this.lettersesForLetFrom;
	}

	public void setLettersesForLetFrom(Set lettersesForLetFrom) {
		this.lettersesForLetFrom = lettersesForLetFrom;
	}

	public Set getOrderDoings() {
		return this.orderDoings;
	}

	public void setOrderDoings(Set orderDoings) {
		this.orderDoings = orderDoings;
	}

	public Set getGoodsquestions() {
		return this.goodsquestions;
	}

	public void setGoodsquestions(Set goodsquestions) {
		this.goodsquestions = goodsquestions;
	}

	public Set getUsersinfos() {
		return this.usersinfos;
	}

	public void setUsersinfos(Set usersinfos) {
		this.usersinfos = usersinfos;
	}

	public Set getOrderDones() {
		return this.orderDones;
	}

	public void setOrderDones(Set orderDones) {
		this.orderDones = orderDones;
	}

	public Set getUsersfavorites() {
		return this.usersfavorites;
	}

	public void setUsersfavorites(Set usersfavorites) {
		this.usersfavorites = usersfavorites;
	}

	public Set getToaddresses() {
		return this.toaddresses;
	}

	public void setToaddresses(Set toaddresses) {
		this.toaddresses = toaddresses;
	}

	public Set getOrderTodos() {
		return this.orderTodos;
	}

	public void setOrderTodos(Set orderTodos) {
		this.orderTodos = orderTodos;
	}

	public Set getQuestionreplies() {
		return this.questionreplies;
	}

	public void setQuestionreplies(Set questionreplies) {
		this.questionreplies = questionreplies;
	}

}