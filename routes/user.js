var router = require('koa-router')();
var service= require('../bin/service.js');
var auth = require('../bin/authenticate.js');

var USER = './view-html/me.jade',
USERINFO = './view-html/user-info.jade',
ORDERS   = './view-html/cart.jade',
ERROR    = './error.jade',
pathConfig = {
  userInfo:'/precisehelp/userinfo_findUserInfo.action?userId=',
  updateUser:'/precisehelp/userinfo_updateUserInfo.action'
};

//个人主页
router.get('/:id', auth.userAuth, function *(next){
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

  yield this.render(USER,{
    title:'益启帮-'+userData.userinfo.userNickname,
    userData: userData
  });
});
//个人订单页
router.get('/:id/orders', auth.userAuth, function *(next){
  yield this.render(ORDERS, {
    title:'益启帮-'+this.session.userData.userinfo.userNickname,
    userData: this.session.userData
  });
});
//个人资料页
router.get('/:id/data',auth.userAuth,function *(next){
  var self = this,
  userId   = this.params.id;

  var userData = yield service.get(pathConfig.userInfo+userId)
      .then(function (data){
      //返回解析过的JSON数据
      return JSON.parse(data);
    },function (err){
      //失败，返回错误
      console.log('Dont get anything:'+err);
      return "error：" + err;
    });

  yield this.render(USERINFO,{
    title:'益启帮-'+userData.userinfo.userNickname,
    userData:userData
  });

});

router.post('/info', auth.userAuth, function *(next){
  //update userinfo path
  console.log(this.request.body);
  var path = pathConfig.updateUser;
  var data = [
    'userNickname=' + encodeURI(this.request.body.nickname),
    'userPhone=' + encodeURI(this.request.body.phone),
    'userRname=' + encodeURI(this.request.body.rname),
    'userIdnum=' + encodeURI(this.request.body.idnum),
    'userSign=' + encodeURI(this.request.body.sign),
    'userId=' + encodeURI(this.request.body.userId)
  ].join('&');

  console.log(path + '?' + data);
  var res = yield service.get(path + '?' + data)
  .then(function (data){
    return data;
  },function(err){
    return err;
  });
  //服务器错误
  if(res === '"error"'){
    this.status = 500;
  }
  console.log(res);
  this.body = res;
});

module.exports = router;