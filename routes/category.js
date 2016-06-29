var router = require('koa-router')();
var service= require('../bin/service.js');

var CATEGORY = './view-html/category.jade';
//分类页
router.get('/:id',function *(next){
  var self       = this;
  var categoryId = this.params.id,
  goods;

  //资源请求路径配置
  var pathConfig = {
    goods:'/precisehelp/goods_findGoodsByType.action?goodstypeId='+categoryId
  };
  //获取相应分类的商品
  goods = yield service.get(pathConfig.goods)
    .then(function (data){
      //返回解析过的JSON数据
      return JSON.parse(data);
    },function (err){
      //失败，返回错误
      console.log('Dont get anything:'+err);
      return "error："+err;
    });
  //传入获取到的数据，解析模板并返回html给客户端
  yield this.render(CATEGORY,{
    session: this.session,
    goods:goods
  });

});
module.exports = router;