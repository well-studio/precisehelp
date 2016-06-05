var router = require('koa-router')();

var DETAIL = './view-html/detail.html';
//商品详情页
router.get('/:id',function *(next){
  yield this.render(DETAIL);
});

module.exports = router;