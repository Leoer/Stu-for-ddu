;(function($){
  // 在原型上绑定单个方法
  $.fn.chSize = function chSize(w, h){
    $(this).width(w)
    $(this.height(h))
  }

  // 批量绑定方法
  $.fn.extend({
    // 扩展方法1
    setHtml:function(htmlText){
      this.html(htmlText);
      return this
    },
    // 扩展方法2
    getHtml:function(){
      return this.html();
    }
    // 扩展方法N .....
  })
})(jQuery);