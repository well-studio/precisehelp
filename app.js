var app      = require('koa')()
, koa        = require('koa-router')()
, logger     = require('koa-logger')
, json       = require('koa-json')
, views      = require('koa-views')
, session    = require('koa-session');

//路由
var index = require('./routes/index'),
category  = require('./routes/category'),
detail    = require('./routes/detail'),
search    = require('./routes/search'),
order     = require('./routes/order'),
pay       = require('./routes/pay'),
user      = require('./routes/user'),
error     = require('./routes/error'),
service   = require('./routes/service');
ajax      = require('./routes/ajax');

// global middlewares
app.use(views('views', {
  root: __dirname + '/views',
  map: { html: 'swig' },
  default: 'jade'
}));

app.use(require('koa-bodyparser')());
app.keys = ['precise help'];
app.use(session(app));
app.use(json());
app.use(logger());


app.use(function *(next){
  var start = new Date;
  yield next;
  var ms = new Date - start;
  console.log('%s %s - %s ms', this.method, this.url, ms);
});

app.use(require('koa-static')(__dirname + '/public'));

// 视图请求路由
koa.use('/', index.routes(), index.allowedMethods());
koa.use('/category', category.routes(), category.allowedMethods());
koa.use('/detail', detail.routes(), detail.allowedMethods());
koa.use('/search', search.routes(), search.allowedMethods());
koa.use('/order', order.routes(), order.allowedMethods());
koa.use('/pay', pay.routes(), pay.allowedMethods());
koa.use('/user', user.routes(), user.allowedMethods());
koa.use('/service', service.routes(), service.allowedMethods());
koa.use('/ajax', ajax.routes(), ajax.allowedMethods());

//404及其他情况处理
koa.get('*', error.routes(), error.allowedMethods());

// mount root routes
app.use(koa.routes());

module.exports = app;
