package cn.wellstudio.precisehelp.dao.impl;

import cn.wellstudio.precisehelp.util.Operation;

/**
 * 对象处理父类，各对象`增删改`方法一致
 * @author xxmodd
 */
public abstract class ObjectManage {

	// 添加对象
	public static boolean add(Object obj) {
		return Operation.add(obj);
	}

	// 更新对象
	public static boolean update(Object obj) {
		return Operation.update(obj);
	}
	
	// 删除对象
	public static boolean delete(Object obj) {
		return Operation.delete(obj);
	}



	// 查询用户评论 -----这个暂时不写，还有父id问题
	// public static Comments commentsQuery(){
	//
	// }

}
