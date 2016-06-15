var router = require('koa-router')();

var CATEGORY = 'category.jade';
//分类页
router.get('/:id',function *(next){
  yield this.render(CATEGORY);
});

module.exports = router;