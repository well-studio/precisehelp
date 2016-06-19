package cn.wellstudio.precisehelp.dao.factory;

import cn.wellstudio.precisehelp.dao.impl.AdminManage;
import cn.wellstudio.precisehelp.dao.impl.CommentsManage;
import cn.wellstudio.precisehelp.dao.impl.CouponsManage;
import cn.wellstudio.precisehelp.dao.impl.ExpressManage;
import cn.wellstudio.precisehelp.dao.impl.GoodsareaManage;
import cn.wellstudio.precisehelp.dao.impl.GoodsinfoManage;
import cn.wellstudio.precisehelp.dao.impl.GoodsquestionManage;
import cn.wellstudio.precisehelp.dao.impl.GoodstypeManage;
import cn.wellstudio.precisehelp.dao.impl.LettersManage;
import cn.wellstudio.precisehelp.dao.impl.OrderManage;
import cn.wellstudio.precisehelp.dao.impl.QuestionreplyManage;
import cn.wellstudio.precisehelp.dao.impl.ShoppingcartManage;
import cn.wellstudio.precisehelp.dao.impl.ToaddressManage;
import cn.wellstudio.precisehelp.dao.impl.TodolistManage;
import cn.wellstudio.precisehelp.dao.impl.UsersFavoriteManage;
import cn.wellstudio.precisehelp.dao.impl.UsersManage;
import cn.wellstudio.precisehelp.dao.impl.UsersinfoManage;

public class DaoFactory {
	//生产用户对象
	public static UsersManage getUsers(){
		return new UsersManage();
	}
	
	//生产用户资料对象
	public static UsersinfoManage getUsersinfo(){
		return new UsersinfoManage();
	}
	
	//生产用户收藏夹对象
	public static UsersFavoriteManage getUserFavorite(){
		return new UsersFavoriteManage();
	}
	
	//生产任务列表对象
	public static TodolistManage getTodoList(){
		return new TodolistManage();
	}
	
	//生产发货地址对象
	public static ToaddressManage gettoaddress(){
		return new ToaddressManage();
	}
	
	//生产购物车对象
	public static ShoppingcartManage getShoppingCart(){
		return new ShoppingcartManage();
	}
	
	//生产问题回答对象
	public static QuestionreplyManage getQuestionReply(){
		return new QuestionreplyManage();
	}
	
	
	//生产正在处理中的订单对象
	public static OrderManage getOrderDoing(){
		return new OrderManage();
	}

	
	//生产站内信对象
	public static LettersManage getLetters(){
		return new LettersManage();
	}
	
	//生产商品类型对象
	public static GoodstypeManage getGoodsType(){
		return new GoodstypeManage();
	}
	
	//生产商品问题对象
	public static GoodsquestionManage getGoodsQues(){
		return new GoodsquestionManage();
	}
	
	//生产商品资料对象
	public static GoodsinfoManage getGoodsinfo(){
		return new GoodsinfoManage();
	}
	public static GoodsareaManage getGoodsArea(){
		return new GoodsareaManage();
	}
	public static ExpressManage getExpress(){
		return new ExpressManage();
	}
	public static CouponsManage getCoupons(){
		return new CouponsManage();
	}
	public static CommentsManage getComments(){
		return new CommentsManage();
	}
	//生产管理员对象
	public static AdminManage getAdmin(){
		return new AdminManage();
	}
	
}
