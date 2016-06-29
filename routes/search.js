var router = require('koa-router')();
var service= require('../bin/service.js');

var SEARCH = './view-html/search.jade',
RESULT     = './view-html/result.jade',
pathConfig = {
  search:'/precisehelp/goods_findGoodsByName.action'
};
//搜索页
router.get('/',function *(next){
  if(this.query.search){
    console.log(pathConfig.search + '?goodsName=' + encodeURI(this.query.search));
    var res = yield service.get(pathConfig.search + '?goodsName=' + encodeURI(this.query.search))
    .then(function(data){
      return JSON.parse(data);
    }, function(err){
      return err;
    });
    console.log(res);
    yield this.render(SEARCH, {
      session: this.session,
      title: '搜索商品',
      query: this.query,
      goods: res
    });
    console.log
  }else{
    yield this.render(SEARCH, {
      session: this.session,
      title: '搜索商品',
      query: {
        search: ''
      },
    });
  }
});

module.exports = router;
