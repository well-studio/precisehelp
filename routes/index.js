var router = require('koa-router')();
//配置项
var INDEX  = './view-html/index.jade',
SIGNIN     = './view-html/signin.jade',
SIGNUP     = './view-html/signup.jade';
//首页
router.get('/', function *(next) {
  yield this.render(INDEX, {
    title:'你我帮扶',
    cats:{
      cat1:{
        name:'分类一',
        href:'#',
        img:'/images/素材/车厘子.jpg'
      },
      cat2:{
        name:'分类二',
        href:'#',
        img:'/images/素材/葡萄.jpg'
      },
      cat3:{
        name:'分类三',
        href:'#',
        img:'/images/素材/葡萄.jpg'
      },
      cat4:{
        name:'分类四',
        href:'#',
        img:'/images/素材/山竹.jpg'
      }
    }
  });
});
//登录页
router.get('signin', function *(next){
  yield this.render(SIGNIN);
});
//注册页
router.get('signup', function *(next){
  yield this.render(SIGNUP);
});

module.exports = router;
