package cn.wellstudio.precisehelp.dao;

import java.util.List;

import cn.wellstudio.precisehelp.entity.Admins;
import cn.wellstudio.precisehelp.entity.Todolist;

public interface ITodoListDAO {
	public List<Todolist> todolistQuery(Admins admins);
}
