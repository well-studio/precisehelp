var router = require('koa-router')();

var USER   = './view-html/me.html',
USERINFO   = './view-html/user-info.html',
ORDERS = './view-html/cart.html';

//个人主页
router.get('/:id',function *(next){
  yield this.render(USER);
});
//个人订单页
router.get('/:id/orders',function *(next){
  yield this.render(ORDERS);
});
//个人资料页
router.get('/:id/data',function *(next){
  yield this.render(USERINFO);
});
module.exports = router;