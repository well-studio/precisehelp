package cn.wellstudio.precisehelp.dao.impl;

import java.util.List;

import cn.wellstudio.precisehelp.dao.ILetterDAO;
import cn.wellstudio.precisehelp.entity.Letters;
import cn.wellstudio.precisehelp.entity.Users;
import cn.wellstudio.precisehelp.util.Operation;

/** 
 * 站内信的增删改查
 * @author xxmodd 
 */
public class LettersManage extends ObjectManage implements ILetterDAO{
	//用户查询收件箱
	@SuppressWarnings("unchecked")
	public static List<Letters> inboxQuery(Users user){
		List<Letters> letters= null;
		String sql = "select * from letters where let_from = " + user.getUserId();
		letters = Operation.sqlQuery(sql,new Letters());
		return letters;
	}
	
	//用户查询发件箱
	@SuppressWarnings("unchecked")
	public static List<Letters> outboxQuery(Users user){
		List<Letters> letters= null;
		String sql = "select * from letters where let_to = " + user.getUserId();
		letters = Operation.sqlQuery(sql,new Letters());
		return letters;
	}

	@Override
	public boolean createLetter(Letters letters) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateLetter(Letters letters) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean saveLetter(Letters letters) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean sendLetter(Letters letters) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Letters findLettersById(int lettersId) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
