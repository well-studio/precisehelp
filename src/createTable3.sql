
 
 
-- 更新自 2016.5.28
-- 在原有的讨论基础上 进行了细微修改 大家看看 有什么地方需要改进！再讨论？



----------------------------
-- 对外开放部分 表设计
----------------------------

-- 用户表
create table users (
	user_id int primary key auto_increment, -- 用户id
	user_account varchar(30), -- 用户账号
	user_psw varchar(30), -- 用户登录密码
	user_zf_psw varchar(30) -- 用户支付密码
);



-- 用户个人资料表
create table usersinfo (
	user_img varchar(100), -- 用户头像
	user_sex varchar(5), -- 用户性别
	user_nickname varchar(30), -- 用户昵称
	user_sign varchar(250), -- 用户个性签名
	user_idnum varchar(25), -- 用户身份证号码
	user_rname varchar(10), -- 用户真实姓名
	user_id int, -- 关联用户表
	constraint foreign key(user_id) references users(user_id)
);



-- 用户收货地址表
create table toaddress (
	address_id int primary key auto_increment, -- 收货地址id
	address_province varchar(20), -- 省份
	address_city varchar(20), -- 城市
	address_area varchar(30), -- 区
	address_road varchar(30), -- 街道
	address_detail varchar(100), -- 详细地址
	address_postcode varchar(10), -- 邮编
	address_name varchar(10), -- 收货人姓名
	address_phone varchar(20), -- 收货人手机号码
	user_id int, -- 关联用户表
	constraint foreign key(user_id) references users(user_id)
);



-- 购物车表 (这个没讨论 暂时不知道！)




-- 订单表(待处理订单表 - 处理中的订单表 - 处理完毕的订单表)


-- 待处理订单表(必须要已付款的订单)
create table order_todo (
	ordertodo_id int primary key auto_increment, -- 订单id
	order_number varchar(30), -- 订单编号
	order_ps varchar(200), -- 订单备注
	order_time date, -- 订单下单时间
	-- order_pay int, -- 是否付款(0 未付款 1 已付款  -- 肯定为1 -- 所以去掉)
	user_id int, -- 关联用户表
	goods_id int, -- 关联商品
	constraint foreign key(user_id) references users(user_id),
	constraint foreign key(goods_id) references goodsinfo(goods_id)
);



-- 处理中订单表(已有管理员后台接手处理的订单  ~ 确认收货之前)
create table order_doing (
	orderdoing_id int primary key auto_increment, -- 订单id
	order_num varchar(30), -- 订单编号
	order_ps varchar(200), -- 订单备注
	order_time date, -- 订单下单时间
	order_stat int, -- 订单受理状态(0 无人受理 1正在受理 2受理完毕 起初默认为0)(++++)
	order_kcom varchar(20), -- 快递公司名称(+++)
	order_knum varchar(50), -- 快递单号(+++)
	user_id int, -- 关联用户
	goods_id int, -- 关联商品
	adm_id int, -- 关联处理人员(+++)
	express_id int, -- 关联快递(物流)表(+++)
	constraint foreign key(user_id) references users(user_id),
	constraint foreign key(goods_id) references goodsinfo(goods_id),
	constraint foreign key(adm_id) references admins(adm_id),
	constraint foreign key(express_id) references express(express_id)
	
);



-- 已完成订单表(已经确认收货的订单)  和评论之间  用hibernate many-to-one unique=true 模拟 一对一关系
create table order_done (
	orderdone_id int primary key auto_increment, -- 订单id
	order_num varchar(30), -- 订单编号
	order_ps varchar(200), -- 订单备注
	order_time date, -- 订单下单时间
	order_kcom varchar(20), -- 快递公司名称
	order_knum varchar(50), -- 快递单号
	order_donetime date, -- 订单完成时间(++++)  订单完成后  即可评价该商品
	order_comment int, -- 是否评价(++++) 0 尚未评价 1 已评价
	user_id int, -- 关联用户
	goods_id int, -- 关联商品
	adm_id int, -- 关联处理人员
	express_id int, -- 关联快递(物流)表
	-- comment_id int, -- 关联评论表(++++)
	constraint foreign key(user_id) references users(user_id),
	constraint foreign key(goods_id) references goodsinfo(goods_id),
	constraint foreign key(adm_id) references admins(adm_id),
	constraint foreign key(express_id) references express(express_id)
	-- constraint foreign key(comment_id) references comments(com_id)
);





-- 快递(物流)表 - 第三方查询(这个不需要建立表吧？ -- 我们需要存储物流信息吗？)
create table express (
	express_id int primary key auto_increment, -- 物流id
	express_kcom varchar(20), -- 快递公司名称
	express_knum varchar(50), -- 快递单号
	express_content text -- 物流信息(第三方查询)
);






-- 商品表
create table goodsinfo (
	goods_id int primary key auto_increment, -- 商品id
	goods_name varchar(50), -- 商品名称
	goods_stat text, -- 商品描述
	goods_last_price varchar(20), -- 商品上一次价格
	goods_now_price varchar(20), -- 商品现在的价格
	goods_price_unit varchar(10), -- 单价对应的商品重量(数量)单位
	--	goods_from 详细的产地名称 (我们弄张产地表)
	goodsarea_id int, -- 关联生产地
	goodstype_id int, -- 关联商品类型
	constraint foreign key(goodsarea_id) references goodsarea(area_id),
	constraint foreign key(goodstype_id) references goodstype(type_id)
);


-- 商品分类表
create table goodstype (
	type_id int primary key auto_increment, -- 类型id
	type_name varchar(20), -- 类型名称
	type_stat varchar(250) -- 该类型商品的简单描述
);


-- 商品产地表
create table goodsarea (
	area_id int primary key auto_increment, -- 产地id
	area_name varchar(50), -- 产地名称
	area_location varchar(100), -- 产地地理位置
	area_stat text -- 产地详细描述
);






-- 评论表(暂定 一个订单 对应 一条评论)
create table comments (
	com_id int primary key auto_increment, -- 评论id
	com_content varchar(250), -- 评论内容
	orderdone_id int, -- 关联已完成订单表
	goods_id int, -- 关联商品
	constraint foreign key(orderdone_id) references order_done(orderdone_id),
	constraint foreign key(goods_id) references goodsinfo(goods_id)
);






-- 站内信表
create table letters (
	let_id int primary key auto_increment, -- 信id
	let_title varchar(30), -- 信标题
	let_content text, -- 信内容
	let_time date, -- 发信时间
	let_stat int, -- 是否已读 (0 收信人未读  1 收信人已读)
	let_from int, -- 发信人 关联用户
	let_to int, -- 收信人 关联用户
	constraint foreign key(let_from) references users(user_id),
	constraint foreign key(let_to) references users(user_id)
);




----------------------------
-- 后台隐秘部分 表设计
----------------------------

-- 管理员登录表
create table admins (
	adm_id int primary key auto_increment, -- 管理员id
	adm_account varchar(20), -- 账号
	adm_psw varchar(50) -- 密码
);



-- 管理员资料信息表
create table adminsinfo (
	adminfo_id int primary key auto_increment, -- 管理员资料id
	adm_num varchar(20), -- 管理员员工编号
	adm_nickname varchar(20), -- 管理员昵称
	adm_name varchar(10), -- 管理员真实姓名
	adm_phone varchar(20), -- 管理员电话号码
	adm_idnum varchar(20), -- 管理员身份证号码
	adm_id int, -- 关联管理员登录表
	constraint foreign key(adm_id) references admins(adm_id)
);



-- 订单处理任务表(加入处理队列的订单 受理状态设为1 处理完设为2)
create table todolist (
	todo_id int primary key auto_increment, -- 任务id
	todo_time date, -- 加入队列的时间(队列按时间排序优先处理) 方便程序处理超时
	orderdoing_id int, -- 关联订单 
	constraint foreign key(orderdoing_id) references order_doing(orderdoing_id)
);










 
 