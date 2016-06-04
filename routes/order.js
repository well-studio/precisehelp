var router = require('koa-router')();

var ORDER = 'order.html';
//订单详情页
router.get('/:id',function *(next){
  this.body = '<h1>order page</h1>';
});

module.exports = router;