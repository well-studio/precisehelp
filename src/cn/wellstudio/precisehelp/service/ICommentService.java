package cn.wellstudio.precisehelp.service;

import java.util.List;

import cn.wellstudio.precisehelp.entity.Comments;

/**
 * 评论业务接口设计
 * @author huhong
 *
 */
public interface ICommentService {
	
	/**
	 * 发布评论
	 * @param comment
	 * @return
	 */
	public boolean addComment(Comments comment);
	
	/**
	 * 评论点赞
	 * @param comId
	 * @return
	 */
	public boolean upComment(int comId);
	
	
	/**
	 * 取消评论点赞
	 * @param comId
	 * @return
	 */
	public boolean up2Comment(int comId);
	
	/**
	 * 更新评论信息
	 * @param comId
	 * @return
	 */
	public boolean updateCommentById(int comId);
	
	/**
	 * 根据id删除评论
	 * @param comId
	 * @return
	 */
	public boolean deleteCommentById(int comId);
	
	/**
	 * 删除该用户的所有评论
	 * @param userId
	 * @return
	 */
	public boolean deleteAllCommentByUser(int userId);
	
	/**
	 * 根据id查询评论
	 * @param comId
	 * @return
	 */
	public Comments findCommentById(int comId);
	
	/**
	 * 查询用户的全部评论
	 * @param usersId
	 * @return
	 */
	public List<Comments> findCommentsByUser(int usersId);

	/**
	 * 查询商品的全部评论
	 * @param goodsName
	 * @return
	 */
	public List<Comments> findCommentsByGoods(String goodsName);

	/**
	 * 查询全部评论
	 * @return
	 */
	public List<Comments> findAllComments();
}
