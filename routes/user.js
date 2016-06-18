var router = require('koa-router')();
var service= require('../bin/service.js');


var USER   = './view-html/me.jade',
USERINFO   = './view-html/user-info.jade',
ORDERS = './view-html/cart.jade',
pathConfig = {
  userInfo:'/precisehelp/userinfo_findUserInfo.action?userId='
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

  yield this.render(USER,{
    userData: userData
  });
});
//个人订单页
router.get('/:id/orders',function *(next){
  yield this.render(ORDERS);
});
//个人资料页
router.get('/:id/data',function *(next){
  var self = this,
  userId   = this.params.id;
  if(!this.session.usersinfo || this.session.usersinfo.userId != this.params.id) {
    console.log(this.session.usersinfo.userId);
    console.log(this.params.id);
    //伪重定向
    return this.body = '<script>window.location.href="/signin"</script>';
  }
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
    userData:userData
  });

});

router.post('/info', function *(next){
  //update userinfo path
  console.log(this.request.body);
  var path = '/precisehelp/userinfo_updateUserInfo.action';
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