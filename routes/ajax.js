var router = require('koa-router')();
var service= require('../bin/service.js');

pathConfig = {
	add2cart: '/precisehelp/shoppingCart_addGoodsToCart.action',//?userId=1&goodsId=2&goodsNum=1
	updateCart: '/precisehelp/shoppingCart_updateGoodsNum.action',//?userId=1&goodsId=2&goodsNum=100
	deleteCart: '/precisehelp/shoppingCart_removeGoods.action'//?userId=1&goodsId=1
};
router.post('/', function *(next){
	/* 判断登录 */
	if(!this.session.userinfo || !this.session.userinfo.userId){
		this.status = 500;
		this.body = '';
		return;
	}
	var data = '';
	var url = '';
	if(this.request.body.func === 'add2cart'){
		url = pathConfig.add2cart + '?' + [
			'userId=' + encodeURI(this.session.userinfo.userId),
			'goodsId=' + encodeURI(this.request.body.goodsId),
			'goodsNum=' + encodeURI(this.request.body.goodsNum)
		].join('&');
		data = yield service.get(url).then(function(data){
			return data;
		}, function(err){
			console.log('Don\'t get anything:'+err);
			return "error：" + err;
		});
	}else if(this.request.body.func === 'updateCart'){
		url = pathConfig.updateCart + '?' + [
			  'userId=' + encodeURI(this.session.userinfo.userId),
			 'goodsId=' + encodeURI(this.request.body.goodsId),
			'goodsNum=' + encodeURI(this.request.body.goodsNum)
		].join('&');
		data = yield service.get(url).then(function(data){
			return data;
		}, function(err){
			console.log('Don\'t get anything:'+err);
			return "error：" + err;
		});
	}else if(this.request.body.func === 'deleteCart'){
		url = pathConfig.deleteCart + '?' + [
			 'userId=' + encodeURI(this.session.userinfo.userId),
			'goodsId=' + encodeURI(this.request.body.goodsId),
		].join('&');
		data = yield service.get(url).then(function(data){
			return data;
		}, function(err){
			console.log('Don\'t get anything:'+err);
			return "error：" + err;
		});
	}

	return this.body = data;
});
router.get('/', function *(next){
	this.body = '404'
});
module.exports = router;
