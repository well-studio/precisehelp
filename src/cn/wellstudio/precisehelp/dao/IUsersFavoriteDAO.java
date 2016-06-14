package cn.wellstudio.precisehelp.dao;

import java.util.List;

import cn.wellstudio.precisehelp.entity.Goodsinfo;
import cn.wellstudio.precisehelp.entity.Users;

public interface IUsersFavoriteDAO {
	public List<Goodsinfo> favoriteQuery(Users users);
}
