var router = require('koa-router')();
var service= require('../bin/service.js');
 //资源请求路径配置
  var pathConfig = {
    goods:'/precisehelp/goods_findGoodsById.action?goodsId='
  };
var DETAIL = './view-html/detail.jade';
//商品详情页
router.get('/:id',function *(next){
  var self = this,
  goodsId  = this.params.id,
  goods;
  console.log('require url[' +pathConfig.goods+goodsId+ ']');

  //获取商品详情
  goods = yield service.get(pathConfig.goods+goodsId)
    .then(function (data){
      //返回解析过的JSON数据
      return data;
    },function (err){
      //失败，返回错误
      console.log('Dont get anything:'+err);
      return "error："+err;
    });
  console.log(goods);
  //传入获取到的数据，解析模板并返回html给客户端
  yield this.render(DETAIL, {
    session: this.session,
    goods:JSON.parse(goods)
  });
});

module.exports = router;