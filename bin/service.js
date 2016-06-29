var http = require('http');
//配置对象,需填充path和method
var options = {
  protocol: 'http://',
  hostname: 'xxmodd.com',
  port: 80
};
//服务对象

var service = {
  /**
   * 调取服务的get方法
   * @param  {String}   path 请求服务的路径
   * @param  {Function} fn   处理数据的回调函数
   * @return {null}          若参数错误，返回null
   */
  get:function(path){
    if(!path){
      return null;
    }

    var url = options.protocol+options.hostname+':'+options.port+path;

    var get = new Promise((resolve,reject) => {
      http.get(url, (res) => {
        var data='';
        res.setEncoding('utf8');
        //接收返回的数据
        res.on('data', (chunk) => {
          data+=chunk;
        });
        //数据传输完毕后，调用回调函数进行操作
        res.on('end', () => {
          resolve(data);
        });

      }).on('error', (e) => {
        //错误处理交给回调函数
        reject(e);
      });
    });
    return get;
  },
  /**
   * 调取服务的post方法
   * @param  {String}   path 请求服务的路径
   * @param  {Object}   data 报文体
   * @param  {Function} fn   处理数据的回调函数
   * @return {null}          若参数错误，返回null
   */
  post:function(path, data){

    if(!!path || !!data){
      return null;
    }
    //填充请求路径和报文头
    options.path = path;
    options.headers = {
      'Content-Type': 'application/x-www-form-urlencoded',
      'Content-Length': data.length
    }
    var post = new Promise((resolve,reject) => {
      //发送post请求
      http.request(options, (res) => {
        var data = '';
        res.setEncoding('utf8');
        //接收数据
        res.on('data', (chunk) => {
          data += chunk;
        });
        //数据传输完毕后，调用回调函数进行操作
        res.on('end', () => {
          resolve(data);
        })
      }).on('error', (e) => {
        //错误处理交给回调函数
        reject(e);
      }).write(data).end();
    });

    return post;
  }
};

module.exports = service;