var router = require("koa-router")(),
service    = require('../bin/service.js');

router.get('/', function *(){
  //返回服务调用的promise对象

  this.body = yield service.get(this.query.path)
    .then(function (data){
      console.log(data);
      return JSON.parse(data);
    },function (err){
      console.log('Dont get anything:'+err);
      return "error";
    });
});

module.exports = router;
