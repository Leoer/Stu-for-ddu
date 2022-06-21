/* ;(function($){
  $.fn.setAttr = function(w,h,s,fc,bc){
    var that = this;
    that.css('width',w)
    that.css('height',h)
    that.css('font-size',s)
    that.css('color',fc)
    that.css('background-color',bc)

    return that;
  }
})(jQuery); */

/* // 改造后：
;(function($){
  $.fn.setAttr = function(config){
    var that = this;
    that.css('width',config.width)
    that.css('height',config.height)
    that.css('font-size',config.fontSize)
    that.css('color',config.color)
    that.css('background-color',config.background)

    return that;
  } */


// 默认参数设置
;(function($){
  $.fn.setAttr = function(config){
    var that = this;

    // 默认值设置
    var def = {width:'200px',height:'100px',fontSize: '14px',color:'#fff',background:'red'}
    // 将def和config合并成一个对象。注意：用户传值的对象要写在最后！
    var settings = $.extend({},def,config)

    that.css('width',settings.width)
    that.css('height',settings.height)
    that.css('font-size',settings.fontSize)
    that.css('color',settings.color)
    that.css('background-color',settings.background)

    return that;
  }
})(jQuery);