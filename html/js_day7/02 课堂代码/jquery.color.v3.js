;(function($){
  var that
  function _color(){ // 私有函数
    that = this // this指向的是对象本身
    that.css('color','blue') // 谁调用，this就指向谁

    return that
  }
  $.fn.color = _color
})(jQuery);