package cn.wellstudio.precisehelp.service.impl;

import java.util.List;

import cn.wellstudio.precisehelp.dao.ICommentDAO;
import cn.wellstudio.precisehelp.entity.Comments;
import cn.wellstudio.precisehelp.service.ICommentService;

/**
 * 评论业务实现类
 * @author huhong
 *
 */
public class CommentService implements ICommentService{
	
	ICommentDAO commentDao;
	public void setCommentDao(ICommentDAO commentDao) {
		this.commentDao = commentDao;
	}

	public boolean addComment(Comments comment) {
		
		boolean res = commentDao.addComment(comment);
		
		return res;
	}

	public boolean deleteAllCommentByUser(int userId) {
		
		boolean res = commentDao.deleteAllCommentByUser(userId);
		
		return res;
	}

	public boolean deleteCommentById(int comId) {
		
		boolean res = commentDao.deleteCommentById(comId);
		
		return res;
	}

	public List<Comments> findAllComments() {
		
		List<Comments> comList = commentDao.findAllComments();
		
		return null;
	}

	public Comments findCommentById(int comId) {
		
		Comments com = commentDao.findCommentById(comId);
		
		return com;
	}

	public List<Comments> findCommentsByGoods(String goodsName) {

		List<Comments> comList = commentDao.findCommentsByGoods(goodsName);
		
		return comList;
	}

	public List<Comments> findCommentsByUser(int usersId) {
		
		List<Comments> comList = commentDao.findCommentsByUser(usersId);
		
		return comList;
	}

	public boolean up2Comment(int comId) {
		
		boolean res = commentDao.up2Comment(comId);
		
		return res;
	}

	public boolean upComment(int comId) {
		
		boolean res = commentDao.upComment(comId);
		
		return res;
	}

	public boolean updateCommentById(int comId) {
		
		boolean res = commentDao.updateCommentById(comId);
		
		return res;
	}

}
