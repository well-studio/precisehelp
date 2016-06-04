package cn.wellstudio.precisehelp.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * 商品提问
 * @author huhong
 *
 */
public class Goodsquestion implements java.io.Serializable {

	// Fields

	private String quesId; // id
	private Users users; // 关联用户
	private Goodsinfo goodsinfo; // 商品信息
	private String quesTitle; // 问题标题
	private String quesContent; // 问题内容
	private Date quesTime; // 问题时间
	private Integer quesClose; // 问题是否关闭(0 没 1 是)
	private Set questionreplies = new HashSet(0); // 关联提问的回答

	// Constructors

	/** default constructor */
	public Goodsquestion() {
	}

	/** full constructor */
	public Goodsquestion(Users users, Goodsinfo goodsinfo, String quesTitle,
			String quesContent, Date quesTime, Integer quesClose,
			Set questionreplies) {
		this.users = users;
		this.goodsinfo = goodsinfo;
		this.quesTitle = quesTitle;
		this.quesContent = quesContent;
		this.quesTime = quesTime;
		this.quesClose = quesClose;
		this.questionreplies = questionreplies;
	}

	// Property accessors

	public String getQuesId() {
		return this.quesId;
	}

	public void setQuesId(String quesId) {
		this.quesId = quesId;
	}

	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public Goodsinfo getGoodsinfo() {
		return this.goodsinfo;
	}

	public void setGoodsinfo(Goodsinfo goodsinfo) {
		this.goodsinfo = goodsinfo;
	}

	public String getQuesTitle() {
		return this.quesTitle;
	}

	public void setQuesTitle(String quesTitle) {
		this.quesTitle = quesTitle;
	}

	public String getQuesContent() {
		return this.quesContent;
	}

	public void setQuesContent(String quesContent) {
		this.quesContent = quesContent;
	}

	public Date getQuesTime() {
		return this.quesTime;
	}

	public void setQuesTime(Date quesTime) {
		this.quesTime = quesTime;
	}

	public Integer getQuesClose() {
		return this.quesClose;
	}

	public void setQuesClose(Integer quesClose) {
		this.quesClose = quesClose;
	}

	public Set getQuestionreplies() {
		return this.questionreplies;
	}

	public void setQuestionreplies(Set questionreplies) {
		this.questionreplies = questionreplies;
	}

}