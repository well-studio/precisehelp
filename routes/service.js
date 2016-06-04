var router = require("koa-router")(),
service    = require('../bin/service.js');

router.get('/', function *(){
  this.body = this.query;
});

module.exports = router;
