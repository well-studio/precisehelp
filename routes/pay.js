var router = require('koa-router')();

var PAY = 'pay.html';
//支付页 订单id
router.get('/:id',function *(next){
  this.body = '<h1>pay page</h1>';
});

module.exports = router;