var router = require('koa-router')();
//配置项
var INDEX  = './view-html/index.html',
SIGNIN     = './view-html/signin.html',
SIGNUP     = './view-html/signup.html';
//首页
router.get('/', function *(next) {
  yield this.render(INDEX);
});
//登录页
router.get('signin', function *(next){
  yield this.render(SIGNIN);
});
//注册页
router.get('signup', function *(next){
  this.body = '<h1>sign up</h1>';
});

module.exports = router;
