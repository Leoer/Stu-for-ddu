var str = 'abc'
;(function($){
  function _color(){ // 私有函数
    $(this).css('color','red') // 谁调用，this就指向谁
  }
  var x = '前端开发'
  $.fn.color = _color
  $.fn.x = x
})(jQuery);