var router = require('koa-router')();

var SEARCH = './view-html/search.jade',
RESULT     = './view-html/result.jade';
//搜索页
router.get('/',function *(next){
  yield this.render(SEARCH);
});
//搜索结果页
router.get('/result', function *(next){
  yield this.render(RESULT);
});
module.exports = router;