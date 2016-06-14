package cn.wellstudio.precisehelp.action;

import cn.wellstudio.precisehelp.service.ICommentService;

import com.opensymphony.xwork2.ActionSupport;
/**
 * 评论控制器
 * @author huhong
 *
 */
public class CommentAction extends ActionSupport{
	
	ICommentService commentsAction;
	public void setCommentsAction(ICommentService commentsAction) {
		this.commentsAction = commentsAction;
	}
	
	/**
	 * 添加评论
	 * @return
	 */
	public String addComment() {
		
		return null;
	}
	
	/**
	 * 评论点赞
	 * @return
	 */
	public String upComment() {
		
		return null;
	}
	
	/**
	 * 取消评论点赞
	 * @return
	 */
	public String up2Comment() {
		
		return null;
	}
	
	
	/**
	 * 根据id更新评论
	 * @return
	 */
	public String updateCommentById() {
		
		return null;
	}
	
	
	/**
	 * 删除评论
	 * @return
	 */
	public String deleteComment() {
		
		return null;
	}
	
	/**
	 * 根据id查询评论信息
	 * @return
	 */
	public String findCommentById() {
		
		return null;
	}
	
	/**
	 * 查询用户的评论
	 * @return
	 */
	public String findCommentByUser() {
		
		return null;
	}
	
	
	/**
	 * 查询商品的评论
	 * @return
	 */
	public String findCommentByGoods() {
		
		return null;
	}
	
	
	/**
	 * 查询全部评论
	 * @return
	 */
	public String findAllComments() {
		
		return null;
	}
	

	
}
