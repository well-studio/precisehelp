package cn.wellstudio.precisehelp.sqlhelp;

import org.hibernate.Session;
import org.hibernate.Transaction;

import cn.wellstudio.precisehelp.entity.Admins;
import cn.wellstudio.precisehelp.util.HibernateSessionFactory;

/** 
 * @author xxmodd 
 * 管理员管理类
 */
public class LetterManage {
	private static Session session;
	
	//删除管理员
	public static boolean deleteLetter(Letter letter){
		Transaction tr = null;
		try {
			//获取session
			session = HibernateSessionFactory.getCurrentSession();
			tr = session.beginTransaction();
			session.delete(letter);
			tr.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			tr.rollback();
			return false;
		} finally{
			try {
				close();
			} catch (Exception e2) {
				return false;
			}
		}
	}
	
	//添加修改管理员
	public static boolean addOrupdateAdmin(Admins admin){
		Transaction tr = null;
		try {
			//获取session
			session = HibernateSessionFactory.getCurrentSession();
			tr = session.beginTransaction();
			session.saveOrUpdate(admin);
			tr.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			tr.rollback();
			return false;
		} finally{
			try {
				close();
			} catch (Exception e2) {
				return false;
			}
		}
		
	}
	
	
	//关闭session
		private static void close(){
			HibernateSessionFactory.closeCurrentSession();
		}
		
}
