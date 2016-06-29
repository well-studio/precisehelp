var router = require('koa-router')();
var service= require('../bin/service.js');


var USER   = './view-html/me.jade',
USERINFO   = './view-html/user-info.jade',
ORDERS = './view-html/cart.jade',
CART = './view-html/cart.jade',
pathConfig = {
  userInfo:'/precisehelp/userinfo_findUserInfo.action?userId=',
  updateUserInfo: '/precisehelp/userinfo_updateUserInfo.action',
  cartInfo: '/precisehelp/shoppingCart_findCartByUser.action'
};

//个人主页
router.get('/:id',function *(next){
  var self = this,
  userId   = this.params.id;

  var userData = yield service.get(pathConfig.userInfo+userId)
      .then(function (data){
      //返回解析过的JSON数据
      return JSON.parse(data);
    },function (err){
      //失败，返回错误
      console.log('Dont get anything:'+err);
      return "error：" +err;
    });

  yield this.render(USER, {
    userData: userData,
    session:this.session
  });
});
//个人订单页
router.get('/:id/orders',function *(next){
  yield this.render(ORDERS, {
    session:this.session
  });
});

/* 个人购物车 */
router.get('/:id/cart', function *(next){
  var self = this,
  userId   = this.params.id;
  /* 判断登录 */
  if(!this.session.userinfo || this.session.userinfo.userId != this.params.id){
    this.redirect('/signin');
    return;
  }
  var cartData = yield service.get(pathConfig.cartInfo + '?userId=' + userId)
  .then(function(data){
      return JSON.parse(data);
    }, function(err){
      console.log('Don\'t get anything:'+err);
      return "error：" + err;
  });
  console.log(cartData);
  yield this.render(CART, {
    list: cartData.cartList,
    session:this.session
  });
})

//个人资料页
router.get('/:id/data',function *(next){
  var self = this,
  userId   = this.params.id;
  /* 判断登录 */
  if(!this.session.userinfo || this.session.userinfo.userId != this.params.id){
    this.redirect('/signin');
    return;
  }
  var userData = yield service.get(pathConfig.userInfo+userId)
    .then(function (data){
      //返回解析过的JSON数据
      return JSON.parse(data);
    },function (err){
      //失败，返回错误
      console.log('Don\'t get anything:'+err);
      return "error：" + err;
  });

  yield this.render(USERINFO,{
    userData:userData,
    session:this.session
  });

});

/* 个人信息修改页 */
router.post('/info', function *(next){
  //update userinfo path
  /* 判断登录 */
  if(!this.session.userinfo || this.session.userinfo.userId != this.params.id){
    this.redirect('/signin');
    return;
  }
  console.log(this.request.body);
  var path = pathConfig.updateUserInfo;
  var data = [
    'userNickname=' + encodeURI(this.request.body.nickname),
    'userPhone=' + encodeURI(this.request.body.phone),
    'userRname=' + encodeURI(this.request.body.rname),
    'userIdnum=' + encodeURI(this.request.body.idnum),
    'userSign=' + encodeURI(this.request.body.sign),
    'userId=' + encodeURI(this.request.body.userId)
  ].join('&');
  console.log(path + '?' + data);
  var res = yield service.get(path + '?' + data);
  if(res === '"error"'){
    this.status = 500;
  }
  console.log(res);
  return this.body = res;
});

module.exports = router;
