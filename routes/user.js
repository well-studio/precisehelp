var router = require('koa-router')();

var USER = 'user.html';
//个人主页
router.get('/:id',function *(next){
  this.body = '<h1>User page</h1>';
});
//个人订单页
router.get('/:id/orders',function *(next){
  this.body = '<h1>User\'s orderlist page</h1>';
});
//个人资料页
router.get('/:id/data',function *(next){
  this.body = '<h1>User\'s data page</h1>';
});
module.exports = router;