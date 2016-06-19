var ERROR    = './error.jade';

exports.userAuth = function *(next){
  var self = this,
  userId   = this.params.id || encodeURI(this.request.body.userId);
  //权限验证
  if(!this.session.userData || this.session.userData.userinfo.userId != this.params.id) {

    //无权限返回403
    this.status = 403;
    yield this.render(ERROR,{
      title:'无权限访问',
      message:'您无权访问本页面！',
      error:{
        status:403
      }
    });
  }else{
    yield next;
  }
};

module.exports = exports;