;(function($){
  var that;

  var methods = {
    init: function(content){
      console.log(content);
      console.log('init.........')
      // this.html('这init初始化后的内容。')
      this.html(content.txt)
    },
    setData: function(){
      console.log('setData')
    },
    getData: function(){
      console.log('getData')
    },
    show: function(){
      console.log('show')
    },
    update: function(){
      console.log('update')
    },
    destroy: function(){
      console.log('destroy')
    }
  }

  $.fn.namespace = function(option){
    that = this;
    // methods[option.fn]() // 这种方法中的this指向会出问题
    methods[option.fn].apply(that,arguments)
    return that;
  }
})(jQuery);