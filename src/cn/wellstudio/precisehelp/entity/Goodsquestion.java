package cn.wellstudio.precisehelp.entity;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;


/**
 * 商品问题
 * @author huhong
 *
 */
@SuppressWarnings("serial")
public class Goodsquestion  implements java.io.Serializable {


    // Fields    
 	private String quesId; // id
	private String quesTitle; // 问题标题
	private String quesContent; // 问题内容
    private String userId;
    private String goodsId;
	private Timestamp quesTime; // 问题时间
	private Integer quesClose; // 问题是否关闭(0 没 1 是)
	private Users users; // 关联用户
	private Goodsinfo goodsinfo; // 商品信息
	private List<Questionreply> questionreplies = new ArrayList<Questionreply>(); // 关联提问的回答


    // Constructors

    /** default constructor */
    public Goodsquestion() {
    }

    
    /** full constructor */
    public Goodsquestion(String quesTitle, String quesContent, Timestamp quesTime, Integer quesClose, String userId, String goodsId) {
        this.quesTitle = quesTitle;
        this.quesContent = quesContent;
        this.quesTime = quesTime;
        this.quesClose = quesClose;
        this.userId = userId;
        this.goodsId = goodsId;
    }

   
    // Property accessors

    public String getQuesId() {
        return this.quesId;
    }
    
    public void setQuesId(String quesId) {
        this.quesId = quesId;
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

    public Timestamp getQuesTime() {
        return this.quesTime;
    }
    
    public void setQuesTime(Timestamp quesTime) {
        this.quesTime = quesTime;
    }

    public Integer getQuesClose() {
        return this.quesClose;
    }
    
    public void setQuesClose(Integer quesClose) {
        this.quesClose = quesClose;
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


	public Users getUsers() {
		return users;
	}


	public void setUsers(Users users) {
		this.users = users;
	}


	public Goodsinfo getGoodsinfo() {
		return goodsinfo;
	}


	public void setGoodsinfo(Goodsinfo goodsinfo) {
		this.goodsinfo = goodsinfo;
	}


	public List<Questionreply> getQuestionreplies() {
		return questionreplies;
	}


	public void setQuestionreplies(List<Questionreply> questionreplies) {
		this.questionreplies = questionreplies;
	}


	@Override
	public String toString() {
		return "Goodsquestion [quesId=" + quesId + ", quesTitle=" + quesTitle
				+ ", quesContent=" + quesContent + ", userId=" + userId
				+ ", goodsId=" + goodsId + ", quesTime=" + quesTime
				+ ", quesClose=" + quesClose + "]";
	}
   



}