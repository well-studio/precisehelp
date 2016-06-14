package cn.wellstudio.precisehelp.dao;

import java.util.List;

import cn.wellstudio.precisehelp.entity.Toaddress;
import cn.wellstudio.precisehelp.entity.Users;

public interface IToaddressDAO {
	public List<Toaddress> toaddressQuery(Users user);
}
