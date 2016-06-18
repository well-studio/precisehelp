package cn.wellstudio.precisehelp.dao.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import cn.wellstudio.precisehelp.dao.ICommentDAO;
import cn.wellstudio.precisehelp.entity.Comments;
import cn.wellstudio.precisehelp.entity.Goodsinfo;
import cn.wellstudio.precisehelp.entity.OrderDone;
import cn.wellstudio.precisehelp.util.HibernateSessionFactory;
import cn.wellstudio.precisehelp.util.Operation;

/**
 * 评论的增删改查(之后再讨论)
 * @author xxmodd
 */
public class CommentsManage extends ObjectManage implements ICommentDAO {

//	// 查询父亲评论
//	public static Comments comParentQuery(Comments comments) {
//		Comments parent = null;
//		Transaction tr = null;
//		try {
//			Session session = HibernateSessionFactory.getCurrentSession();
//			tr = session.beginTransaction();
//			// 实体化
//			comments = (Comments) session.get(Comments.class, comments.getComId());
//			// 获取父亲评论
//			parent = comments.getComParent();
//			parent.toString();
//		} catch (Exception e) {
//			try {
//				tr.rollback();
//			} catch (HibernateException e1) {
//				return null;
//			}
//			return null;
//		} finally {
//			try {
//				HibernateSessionFactory.closeCurrentSession();
//			} catch (Exception e1) {
//				return null;
//			}
//		}
//		return parent;
//	}

//	// 查询孩子评论
//	public static Comments comChildQuery(Comments comments) {
//		Comments child = null;
//		Transaction tr = null;
//		try {
//			Session session = HibernateSessionFactory.getCurrentSession();
//			tr = session.beginTransaction();
//			// 实体化
//			comments = (Comments) session.get(Comments.class,comments.getComId());
//			// 获取孩子评论
//			child = comments.getComChild();
//			child.toString();
//		} catch (Exception e) {
//			e.printStackTrace();
//			try {
//				tr.rollback();
//			} catch (HibernateException e1) {
//				return null;
//			}
//			return null;
//		} finally {
//			try {
//				HibernateSessionFactory.closeCurrentSession();
//			} catch (Exception e1) {
//				return null;
//			}
//		}
//		return child;
//	}
	
	//用户或管理员根据商品查看评论
	@SuppressWarnings("unchecked")
	public List<Comments> commentsByGoodsinfoQuery(Goodsinfo goodsinfo){
		List<Comments> comList = null;
		String sql = "select * from comments where goods_id = '" + goodsinfo.getGoodsId() + "'";
		comList = Operation.sqlQuery(sql, new Comments());
		return comList;
	}
	
	//用户或管理员根据已完成的订单查看自己的评论
	@SuppressWarnings("unchecked")
	public List<Comments> commentsByOrderDoneQuery(OrderDone orderDone){
		List<Comments> comList = null;
		String sql = "select * from comments where orderdone_id = " + orderDone.getOrderdoneId();
		comList = Operation.sqlQuery(sql, new Comments());
		return comList;
	}

	@Override
	public boolean addComment(Comments comment) {
		// TODO Auto-generated method stub
		return false;
	}

	//根据商品id查询评论
	public List<Comments> commentsBygoodsIdQuery(String goodsId){
		String hql = "from Comments as c where c.goodsId = ?";
		@SuppressWarnings("unchecked")
		List<Comments> comments = Operation.hqlQuery(hql, goodsId);
		return comments;
	}
	
	@Override
	public boolean upComment(int comId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean up2Comment(int comId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateCommentById(int comId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteCommentById(int comId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteAllCommentByUser(int userId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Comments findCommentById(int comId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Comments> findCommentsByUser(int usersId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Comments> findCommentsByGoods(String goodsName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Comments> findAllComments() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
