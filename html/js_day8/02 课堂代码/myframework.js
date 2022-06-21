/*
  version: 1.0.0
  author: Harriosn
  date: xxxx.xx.xx
  company:xxxxxx
  .....
*/
; (function (global) {  
  'use strict';// 严格代码格式（变量必须先申明后使用）
  // console.log(global);

  // 核心模块封装

  // 核心模块如果使用普通函数封装，将不利于后期功能（或属性）的扩展，解决方法：用构造函数（可以通过函数的原型进行扩展）
  // var myFramework = function(){
  //   return ....
  // }
  var myFramework = function (selector) {
    return new myFramework.core.init(selector)
  }
  // 设置原型(为了后面方便操作原型对象，在这里用core代替原型对象)
  myFramework.core = myFramework.prototype = {
    version: '1.0.0',
    constructor: myFramework,
    myFramework: myFramework
  }

  // 真正创建myFramework对象的构造函数
  var init = myFramework.core.init = function (selector) {
    // console.log('这里是构造函数.....');

    // 功能模块
    // 创建和获取DOM
    if (!selector) {
      return this;
    } else if(typeof selector === 'string'){
      return parseStringToDom(selector,this)
    }
  }
  // 让init和myFramework拥有共同原型对象
  init.prototype = myFramework.core

  // 创建和获取DOM函数封装
  // 分析：1)如果传的参数是：<div class="box" title="这是一个虚拟的标签">测试</div>，则创建该DOM
  // 2)如传入的参数是：#box,.box,span，则获取DOM
  function parseStringToDom(selector, target) {
    // 1)如果传的参数是：<div class="box" title="这是一个虚拟的标签">测试</div>，则创建该DOM
    // console.log(selector[0]);
    if (selector[0] === '<' && selector[selector.length - 1] === '>' && selector.length >= 3) {
      target[0] = selector;
      target.length = 1
    } else { // 2)获取DOM
      if (/^#/.test(selector)) { // 传入的是ID选择器
        var dom = document.getElementById(selector.slice(1));
        target[0] = dom;
        target.length = 1;
      } else if (/^\./.test(selector)) { // 传入的是class选择器
        var doms = document.getElementsByClassName(selector.slice(1));
        for (var i = 0; i < doms.length; i++){
          target[i] = doms[i]
        }
        target.length = doms.length
      } else {// 传入的是标签选择器
        var doms = document.getElementsByTagName(selector);
        for (var i = 0; i < doms.length; i++) {
          target[i] = doms[i]
        }
        target.length = doms.length
      }      
    }
    return target;
  }

  myFramework.extend = myFramework.core.extend = function (obj) {
    for (var key in obj) {
      this[key] = obj[key];
    }
  };
  
  // 为了便于扩展方法，添加extend来方便后续的操作
  myFramework.extend = myFramework.core.extend = function (obj) {
    for (var key in obj) {
      this[key] = obj[key]
    }
  }

  // 添加扩展方法
  myFramework.core.extend({
    first: function () {
      return this[0]
    },
    last: function () {
      return this[this.length - 1]
    },
    get: function (idx) {
      return this[idx]
    },
    each: function (callback) {
      for (var i = 0; i < this.length; i++){
        callback(this[i],i,this)
      }
    }
  })

  // 扩展事件
  myFramework.core.extend({
    click: function (callback) {
      this.each(function (item,index) {
        item.onclick = function (event) {
          callback(event)
        }
      })
    }
  })
  
  global.myFramework = global.my = myFramework
})(typeof window === 'undefined' ? window : this);