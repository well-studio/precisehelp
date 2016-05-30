package cn.wellstudio.precisehelp.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Users entity. @author MyEclipse Persistence Tools
 */

public class Users implements java.io.Serializable {

	// Fields

	private Integer userId;
	private String userAccount;
	private String userPsw;
	private String userZfPsw;
	private Set lettersesForLetTo = new HashSet(0);
	private Set lettersesForLetFrom = new HashSet(0);
	private Set orderDoings = new HashSet(0);
	private Set usersinfos = new HashSet(0);
	private Set orderDones = new HashSet(0);
	private Set toaddresses = new HashSet(0);
	private Set orderTodos = new HashSet(0);

	// Constructors

	/** default constructor */
	public Users() {
	}

	/** full constructor */
	public Users(String userAccount, String userPsw, String userZfPsw,
			Set lettersesForLetTo, Set lettersesForLetFrom, Set orderDoings,
			Set usersinfos, Set orderDones, Set toaddresses, Set orderTodos) {
		this.userAccount = userAccount;
		this.userPsw = userPsw;
		this.userZfPsw = userZfPsw;
		this.lettersesForLetTo = lettersesForLetTo;
		this.lettersesForLetFrom = lettersesForLetFrom;
		this.orderDoings = orderDoings;
		this.usersinfos = usersinfos;
		this.orderDones = orderDones;
		this.toaddresses = toaddresses;
		this.orderTodos = orderTodos;
	}

	// Property accessors

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
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

	public String getUserZfPsw() {
		return this.userZfPsw;
	}

	public void setUserZfPsw(String userZfPsw) {
		this.userZfPsw = userZfPsw;
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

}