var router = require('koa-router')();

//404及其他情况处理,根据状态码做不同的处理.
router.get('*',function *(next){
  //404:返回404页面  
  if(this.status === 404){
    yield this.render('error.jade',{
      message:'您访问的页面不存在!',
      error:{
        status:this.status
      }
    });
  }else{
    yield next;
  }  
   
},function *(){
  this.body = this.status;
});

module.exports = router; 