
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
)



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
)



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
)



-- 购物车表 (这个没讨论 暂时不知道！)




-- 订单表(订单基础信息表 - 待处理订单表 - 处理中的订单表 - 处理完毕的订单表)


-- 订单基础信息表   减少冗余(但是这样 太依赖 order_base 扫描效率不高！ )
create table order_base (
	orderbase_id int primary key auto_increment, -- 订单id
	order_ps varchar(200), -- 订单备注
	order_time date, -- 订单下单时间
	-- order_pay int, -- 是否付款(0 未付款 1 已付款  -- 肯定为1 -- 所以去掉)
	user_id int, -- 关联用户表
	goods_id int, -- 关联商品
	constraint foreign key(user_id) references users(user_id),
	constraint foreign key(goods_id) references goodsinfo(goods_id)
)


-- 待处理订单表(必须要已付款的订单)
create table order_todo (
	ordertodo_id int primary key auto_increment, -- 待处理订单id
	ordertodo_
	orderbase_id int, -- 关联订单基础信息表
	constraint foreign key(orderbase_id) references order_todo(orderbase_id)
)



-- 处理中订单表(已有管理员后台接手处理的订单  ~ 确认收货之前)
create table order_doing (
	
	
)



-- 已完成订单表(已经确认收货的订单)
create table order_done (
	

) 










-- 物流表





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
)


-- 商品分类表
create table goodstype (
	type_id int primary key auto_increment, -- 类型id
	type_name varchar(20), -- 类型名称
	type_stat varhcar(250) -- 该类型商品的简单描述
)


-- 商品产地表
create table goodsarea (
	area_id int primary key auto_increment, -- 产地id
	area_name varchar(50), -- 产地名称
	area_location varchar(100), -- 产地地理位置
	area_stat text -- 产地详细描述
)








-- 评论表







-- 站内信表





----------------------------
-- 后台隐秘部分 表设计
----------------------------

-- 管理员表




-- 












