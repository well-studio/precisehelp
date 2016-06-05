var router = require('koa-router')();

var SEARCH = './view-html/search.html',
RESULT     = './view-html/result.html';
//搜索页
router.get('/',function *(next){
  yield this.render(SEARCH);
});
//搜索结果页
router.get('/result', function *(next){
  yield this.render(RESULT);
});
module.exports = router;