;(function($){
  $.extend({
    formatDate: function(message) {
       var now = new Date(),
           y = now.getFullYear(), // 获取年
           m = now.getMonth() + 1 >= 10 ? now.getMonth() + 1 : '0' + (now.getMonth() + 1), // JavaScript中月份是从0开始的，稍作处理！
           d = now.getDate(), // 获取日期
           h = now.getHours(), 
           min = now.getMinutes(),
           s = now.getSeconds();
       var time = y + '-' + m + '-' + d + ' ' + h + ':' + min + ':' + s;
       return time + ' myLog: ' + message;
    }
   });
})(jQuery);