package cn.wellstudio.precisehelp.entity;

import java.sql.Timestamp;


/**
 * 提问回应表
 * @author huhong
 *
 */
@SuppressWarnings("serial")
public class Questionreply  implements java.io.Serializable {


    // Fields    

 	private Integer replyId; // id
 	private String replyContent; // 回答内容
 	private Timestamp replyTime; // 回答时间
 	private Integer replyAdm; // 是否是管理员回答
    private String admId;
    private String quesId;
    private String userId;
 	private Users users; // 关联用户
 	private Admins admin; // 关联管理员
 	private Goodsquestion goodsquestion; // 关联商品提问
    // Constructors

    /** default constructor */
    public Questionreply() {
    }

	/** minimal constructor */
    public Questionreply(String replyContent) {
        this.replyContent = replyContent;
    }
    
    /** full constructor */
    public Questionreply(String replyContent, Timestamp replyTime, String admId, String quesId, String userId) {
        this.replyContent = replyContent;
        this.replyTime = replyTime;
        this.admId = admId;
        this.quesId = quesId;
        this.userId = userId;
    }

   
    // Property accessors

    public Integer getReplyId() {
        return this.replyId;
    }
    
    public void setReplyId(Integer replyId) {
        this.replyId = replyId;
    }

    public String getReplyContent() {
        return this.replyContent;
    }
    
    public void setReplyContent(String replyContent) {
        this.replyContent = replyContent;
    }

    public Timestamp getReplyTime() {
        return this.replyTime;
    }
    
    public void setReplyTime(Timestamp replyTime) {
        this.replyTime = replyTime;
    }

    public String getAdmId() {
        return this.admId;
    }
    
    public void setAdmId(String admId) {
        this.admId = admId;
    }

    public String getQuesId() {
        return this.quesId;
    }
    
    public void setQuesId(String quesId) {
        this.quesId = quesId;
    }

    public String getUserId() {
        return this.userId;
    }
    
    public void setUserId(String userId) {
        this.userId = userId;
    }

	public Integer getReplyAdm() {
		return replyAdm;
	}

	public void setReplyAdm(Integer replyAdm) {
		this.replyAdm = replyAdm;
	}

	public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public Admins getAdmin() {
		return admin;
	}

	public void setAdmin(Admins admin) {
		this.admin = admin;
	}

	public Goodsquestion getGoodsquestion() {
		return goodsquestion;
	}

	public void setGoodsquestion(Goodsquestion goodsquestion) {
		this.goodsquestion = goodsquestion;
	}

	@Override
	public String toString() {
		return "Questionreply [replyId=" + replyId + ", replyContent="
				+ replyContent + ", replyTime=" + replyTime + ", replyAdm="
				+ replyAdm + ", admId=" + admId + ", quesId=" + quesId
				+ ", userId=" + userId + "]";
	}
   

}