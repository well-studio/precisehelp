angular.module('app.controller',[])

  .controller('index',function($scope){
    $scope.index = {
      cat: [{
        name: '分类一',
        url: '#',
        imgSrc: '#'
      },{
        name: '分类二',
        url: '#',
        imgSrc: '#'
      },{
        name: '分类三',
        url: '#',
        imgSrc: '#'
      },{
        name: '分类四',
        url: '#',
        imgSrc: '#'
      }],
      name:'index'
    };

  });