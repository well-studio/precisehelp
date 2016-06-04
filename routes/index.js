var router = require('koa-router')();
//配置项
var INDEX  = 'index2.html';
//首页
router.get('/', function *(next) {
  yield this.render(INDEX);
});
//登录页
router.get('signin', function *(next){
  this.body = '<h1>sign in</h1>';
});
//注册页
router.get('signup', function *(next){
  this.body = '<h1>sign up</h1>';
});

module.exports = router;
