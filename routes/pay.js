var router = require('koa-router')();

var PAY = './view-html/pay.jade';
//支付页 订单id
router.post('/:id',function *(next){
  yield this.render(PAY);
});

module.exports = router;