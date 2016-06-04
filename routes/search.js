var router = require('koa-router')();

var RESULT = 'result.html';
//搜索页
router.get('/',function *(next){
  this.body = '<h1>result page</h1>';
});
//搜索结果页
router.get('/result', function *(next){
  this.body = '<h1>result page</h1>';
});
module.exports = router;