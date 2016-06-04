var router = require('koa-router')();

var DETAIL = 'detail.html';
//商品详情页
router.get('/:id',function *(next){
  this.body = '<h1>detail page</h1>';
});

module.exports = router;