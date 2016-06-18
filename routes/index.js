var router = require('koa-router')();
var service= require('../bin/service.js');
//配置项
var INDEX  = './view-html/index.jade',
SIGNIN     = './view-html/signin.jade',
SIGNUP     = './view-html/signup.jade',
USER       = './view-html/me.jade',
//资源请求路径配置
pathConfig = {
  goods:'/precisehelp/goods_findAllGoods.action',
  register:'/precisehelp/user_register.action',
  signin:'/precisehelp/user_login.action?'
};
//首页
router.get('/', function *(next) {
  var self = this;
  //存放分类和商品数据
  var goods,categories;
  //获取所有商品数据
  goods = yield service.get(pathConfig.goods)
    .then(function (data){
      //返回解析过的JSON数据
      return JSON.parse(data);
    },function (err){
      //失败，返回错误
      console.log('Dont get anything:'+err);
      return "error："+err;
    });
  //传入获取到的数据，解析模板并返回html给客户端
  yield self.render(INDEX,{
    goods: goods,
    categories: [
      {
        id: 1,
        name:'浓香腊味',
        img:'/images/素材/车厘子.jpg'
      },
      {
        id: 2,
        name:'浓香经典',
        img:'/images/素材/车厘子.jpg'
      },
      {
        id: 1,
        name:'美味腌菜',
        img:'/images/素材/车厘子.jpg'
      },
      {
        id: 2,
        name:'给力干货',
        img:'/images/素材/车厘子.jpg'
      }
    ]
  });
});
//登录页
router.get('signin', function *(next){
  this.session = null;
  yield this.render(SIGNIN);
});

router.post('signin',function *(next){
  var self = this,
  userData,signin=pathConfig.signin;

  signin += 'userAccount='+this.request.body.phone+'&userPsw='+this.request.body.pass;

  userData = yield service.get(signin)
    .then(function (data){
      return JSON.parse(data);
    },function (err){
      //失败，返回错误
      console.log('Dont get anything:'+err);
      return "error："+err;
    });
  if(userData === 'Fail'){
    this.status = 500;
    return this.body = 'Fail';
  }else{
    //登录成功
    //session之类的逻辑
    this.session = userData;
    return this.body = userData;
  }

});
//注册页
router.get('signup', function *(next){
  yield this.render(SIGNUP);
});
//发送注册信息
router.post('signup', function *(next){
  var self = this,
  userData, requestBody;
  //获取表单信息
  requestBody = {
    userAccount: this.request.body.phone,
    userPsw: this.request.body.pass,
    userPsw2: this.request.body.pass_sec,
    userPayPsw: this.request.body.pass_pay
  }
  //注册
  userData = yield service.get(
    pathConfig.register
    +'?userAccount='+ requestBody.userAccount
    +'&userPsw='+requestBody.userPsw
    +'&userPsw2='+requestBody.userPsw2
    +'&userPayPsw='+requestBody.userPayPsw)
    .then(function (data){
      //返回解析过的JSON数据
      return JSON.parse(data);
    },function (err){
      //失败，返回错误
      console.log('Dont get anything:'+err);
      return "error："+err;
    });
  //返回用户数据
  this.body = userData;
});

module.exports = router;
