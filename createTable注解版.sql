-- V3.0 2016.6.13

-- 大问题：订单表的下单内容处理！！

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



-- 商品表
create table goodsinfo (
	goods_id varchar(60) primary key, -- 商品id
	goods_name varchar(50), -- 商品名称
	goods_img varchar(100), -- 商品首页图片展示
	goods_stat text, -- 商品描述
	goods_last_price double, -- 商品上一次价格
	goods_now_price double, -- 商品现在的价格
	goods_discount double default 1.0, -- 商品折扣
	goods_price_unit varchar(10), -- 单价对应的商品重量(数量)单位
	--	goods_from 详细的产地名称 (我们弄张产地表)
	goodsarea_id int, -- 关联生产地
	goodstype_id int, -- 关联商品类型
	constraint foreign key(goodsarea_id) references goodsarea(area_id),
	constraint foreign key(goodstype_id) references goodstype(type_id)
);




-- 用户表
create table users (
	user_id varchar(60) primary key, -- 用户id
	user_account varchar(30), -- 用户账号
	user_psw varchar(30), -- 用户登录密码
	user_pay_psw varchar(30) -- 用户支付密码
);



-- 用户个人资料表(1:1用户)
create table usersinfo (
	usersinfo_id int primary key auto_increment, -- 用户资料id
	user_img varchar(100), -- 用户头像
	user_sex varchar(5), -- 用户性别
	user_nickname varchar(30), -- 用户昵称
	user_sign varchar(250), -- 用户个性签名
	user_phone varchar(20), -- 用户手机号码
	user_idnum varchar(25), -- 用户身份证号码
	user_rname varchar(10), -- 用户真实姓名
	user_id varchar(60), -- 关联用户表
	constraint foreign key(user_id) references users(user_id)
);



-- 收藏夹(n:m 用户)
create table usersfavorite(
	user_id varchar(60), -- 关联用户
	goods_id varchar(60), -- 收藏的商品id
	add_time timestamp, -- 添加的时间
	primary key(user_id,goods_id),
	constraint foreign key(user_id) references users(user_id),
	constraint foreign key(goods_id) references goodsinfo(goods_id)
);



-- 购物券类型(1:n 购物券)
create table couponstype (
	type_id int primary key auto_increment,
	type_name varchar(30), -- 购物券名称
	type_goods varchar(80), -- 该类购物券使用范围
	type_invalid int default 1, -- 该购物券是否有效(0 无效 1 有效)
	type_candis int default 1, -- 能否用于折扣商品(1 能 0 不能)
	type_require double, -- 门槛金额
	type_value double, -- 抵用金额
	type_percent double -- 抵用折扣率
);



-- 购物券表(n:1 用户 n:1 购物券类型)
create table coupons (
	cou_id varchar(60) primary key, -- 购物券编号/主键
	cou_number varchar(30), -- 购物券编号
	cou_start_time timestamp, -- 购物券开始时间(判断能否使用)
	cou_end_time timestamp, -- 购物券结束时间(判断是否失效)
	cou_use_time timestamp, -- 购物券使用时间
	user_id varchar(60), -- 关联用户
	cou_typeid int, -- 关联购物券类型
	constraint foreign key(user_id) references users(user_id),
	constraint foreign key(cou_typeid) references couponstype(type_id)
);



-- 购物车表 (这个没讨论 暂时不知道！)(商品 n:m 用户)
create table shoppingcart(
	user_id varchar(60), -- 关联用户
	goods_id varchar(60), -- 关联商品
	goods_num int default 0, -- 物品数量
	primary key(user_id,goods_id),
	constraint foreign key(user_id) references users(user_id),
	constraint foreign key(goods_id) references goodsinfo(goods_id)
);



-- 快递(物流)表 - 第三方查询(这个不需要建立表吧？ -- 我们需要存储物流信息吗？)

create table express (
	express_id int primary key auto_increment, -- 物流id
	express_kcom varchar(20), -- 快递公司名称
	express_knum varchar(50), -- 快递单号
	express_content text -- 物流信息(第三方查询)
);



-- 商品提问表
create table goodsquestion (
	ques_id varchar(60) primary key, -- 问题id
	ques_title varchar(50), -- 问题标题
	ques_content text, -- 问题内容
	ques_time timestamp, -- 提问时间
	ques_close int default 0, -- 是否关闭(0 不 1 是)
	user_id varchar(60), -- 关联用户
	goods_id varchar(60), -- 关联商品
	constraint foreign key(user_id) references users(user_id),
	constraint foreign key(goods_id) references goodsinfo(goods_id)
);



-- 站内信表(消息通知)
create table letters (
	let_id varchar(60) primary key, -- 信id
	let_title varchar(30), -- 信标题
	let_content text, -- 信内容
	let_time timestamp, -- 发信时间
	let_draft int default 1, -- 是否是草稿(0 不是 1 是 )
	let_stat int default 0, -- 是否已读 (0 收信人未读  1 收信人已读)
	let_sys int default 0, -- 是否是系统消息(0 不是 1 是)
	let_from varchar(60), -- 发信人 关联用户
	let_to varchar(60), -- 收信人 关联用户
	constraint foreign key(let_from) references users(user_id),
	constraint foreign key(let_to) references users(user_id)
);



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
	user_id varchar(60), -- 关联用户表
	constraint foreign key(user_id) references users(user_id)
);



-- 管理员登录表
create table admins (
	adm_id varchar(60) primary key, -- 管理员id
	adm_account varchar(20), -- 账号
	adm_power int, -- 权限标记(0 superAdmin)(+++)
	adm_psw varchar(50) -- 密码
);



-- 管理员资料信息表
create table adminsinfo (
	adminfo_id int primary key auto_increment, -- 管理员资料id
	adm_num varchar(20), -- 管理员员工编号
	adm_nickname varchar(20), -- 管理员昵称
	adm_img varchar(50), -- 管理员头像
	adm_name varchar(10), -- 管理员真实姓名
	adm_phone varchar(20), -- 管理员电话号码
	adm_idnum varchar(20), -- 管理员身份证号码
	adm_id varchar(60), -- 关联管理员登录表
	constraint foreign key(adm_id) references admins(adm_id)
);



-- 订单商品内容表(待商议)
create table order_content (
	ordercontent_id int primary key auto_increment, -- 订单内容id
	ordertodo_id int, -- 关联待处理订单
	orderdoing_id int, -- 关联处理订单
	orderdone_id int, -- 关联完毕订单
	goods_id varchar(60), -- 关联商品
	goods_num int default 1, -- 商品数量
	constraint foreign key(goods_id) references goodsinfo(goods_id),
	constraint foreign key(ordertodo_id) references order_todo(ordertodo_id),
	constraint foreign key(orderdoing_id) references order_doing(orderdoing_id),
	constraint foreign key(orderdone_id) references order_done(orderdone_id)
);


-- 订单表(待处理订单表 - 处理中的订单表 - 处理完毕的订单表)


-- 待处理订单表(订单未付款 + 付款了但是并没有处理)(n:1 用户 n:1 商品)
create table order_todo (
	ordertodo_id int primary key auto_increment, -- 订单id
	order_number varchar(30), -- 订单编号
	order_ps varchar(200), -- 订单备注
	order_time timestamp, -- 订单下单时间
	order_pay int default 0, -- 是否付款(0 未付款 1 已付款)
	order_cancel int default 0, -- 是否退款取消(0 没 1 是)
	address_id int, -- 关联收获地址
	user_id varchar(60), -- 关联用户表
	-- goods_id varchar(60), -- 关联商品
	order_content varchar(250), -- 订单内容(商品1的id 数量，商品2的id 数量，商品3的id 数量 .........) 拿出来再解析
	goods_num int default 1, -- 商品数量
	constraint foreign key(address_id) references toaddress(address_id),
	constraint foreign key(user_id) references users(user_id),
	constraint foreign key(goods_id) references goodsinfo(goods_id)
);



-- 处理中订单表(必须要已付款的订单 - 已有管理员后台接手处理的订单  ~ 确认收货之前)
-- (n:1 用户 n:1 商品 n:1 管理员 1:1 物流)
create table order_doing (
	orderdoing_id int primary key auto_increment, -- 订单id
	order_num varchar(30), -- 订单编号
	order_ps varchar(200), -- 订单备注
	order_time timestamp, -- 订单下单时间
	address_id int, -- 关联收获地址
	order_handle_time timestamp, -- 订单处理时间(+++)
	order_stat int 0, -- 订单受理状态(0 无人受理 1正在受理 2受理完毕 起初默认为0)(++++)
	order_kcom varchar(20), -- 快递公司名称(+++)
	order_knum varchar(50), -- 快递单号(+++)
	user_id varchar(60), -- 关联用户
	-- goods_id varchar(60), -- 关联商品
	order_content varchar(250), -- 订单内容(商品1的id 数量，商品2的id 数量，商品3的id 数量 .........) 拿出来再解析
	goods_num int default 1, -- 商品数量
	adm_id varchar(60), -- 关联处理人员(+++)
	express_id int, -- 关联快递(物流)表(+++)
	constraint foreign key(address_id) references toaddress(address_id),
	constraint foreign key(user_id) references users(user_id),
	constraint foreign key(goods_id) references goodsinfo(goods_id),
	constraint foreign key(adm_id) references admins(adm_id),
	constraint foreign key(express_id) references express(express_id)

);



-- 已完成订单表(已经确认收货的订单)
-- (n:1 用户 n:1 商品 n:1 管理员 1:1 物流)
create table order_done (
	orderdone_id int primary key auto_increment, -- 订单id
	order_num varchar(30), -- 订单编号
	order_ps varchar(200), -- 订单备注
	order_time timestamp, -- 订单下单时间
	address_id int, -- 关联收获地址
	order_kcom varchar(20), -- 快递公司名称
	order_knum varchar(50), -- 快递单号
	order_donetime timestamp, -- 订单完成时间(++++)  订单完成后  即可评价该商品
	order_comment int default 0, -- 是否评价(++++) 0 尚未评价 1 已评价
	user_id varchar(60), -- 关联用户
	-- goods_id varchar(60), -- 关联商品
	order_content varchar(250), -- 订单内容(商品1的id 数量，商品2的id 数量，商品3的id 数量 .........) 拿出来再解析
	-- goods_num int default 1, -- 商品数量
	adm_id varchar(60), -- 关联处理人员
	express_id int, -- 关联快递(物流)表
	-- comment_id int, -- 关联评论表(++++)
	constraint foreign key(address_id) references toaddress(address_id),
	constraint foreign key(user_id) references users(user_id),
	constraint foreign key(goods_id) references goodsinfo(goods_id),
	constraint foreign key(adm_id) references admins(adm_id),
	constraint foreign key(express_id) references express(express_id)
	-- constraint foreign key(comment_id) references comments(com_id)
);



-- 订单处理任务表(加入处理队列的订单 受理状态设为1 处理完设为2)
create table todolist (
	todo_id int primary key auto_increment, -- 任务id
	todo_time timestamp, -- 加入队列的时间(队列按时间排序优先处理) 方便程序处理超时
	adm_id varchar(60), -- 关联管理员
	orderdoing_id int, -- 关联订单
	constraint foreign key(adm_id) references admins(adm_id),
	constraint foreign key(orderdoing_id) references order_doing(orderdoing_id)
);




-- 提问回答表
create table questionreply (
	reply_id int primary key auto_increment, -- 回答id
	reply_content varchar(200) not null, -- 回答内容
	reply_time timestamp, -- 回答时间
	adm_id varchar(60) default null, -- 关联管理员(非NULL则是管理员回答)
	ques_id varchar(60), -- 关联问题
	user_id varchar(60), -- 关联用户
	constraint foreign key(adm_id) references admins(adm_id),
	constraint foreign key(ques_id) references goodsquestion(ques_id),
	constraint foreign key(user_id) references users(user_id)
);



-- 评论表(暂定 一个订单 对应 一条评论)
create table comments (
	com_id int primary key auto_increment, -- 评论id
	com_content varchar(250), -- 评论内容
	com_time timestamp, -- 评论时间
	com_ups int default 0, -- 点赞人数
	com_res int default 3, -- 好评 3 中评 2 差评 1
	orderdone_id int, -- 关联已完成订单
	com_parent int, -- 父级评论
	user_id varchar(60), -- 关联用户
	goods_id varchar(60), -- 关联商品
	constraint foreign key(orderdone_id) references order_done(orderdone_id),
	constraint foreign key(com_parent) references comments(com_id),
	constraint foreign key(user_id) references users(user_id),
	constraint foreign key(goods_id) references goodsinfo(goods_id)
);









