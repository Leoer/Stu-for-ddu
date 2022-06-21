;(function($){
  var that;
  var e;  // 用于存储用户定义的事件

  $.fn.showData = function showData(option){
    that = this;
    // console.log(option);

    // 配置默认参数
    var def = {url: 'default.json'}
    var setting = $.extend({}, def, option)

    // 遍历用户事件时，不能用url，所以要执行删除操作
    delete option.url
    e = option
    // console.log(e);


    // 创建一个iframe标签用来获取远程数据
    // 服务端启动时，刷新时要用强制刷新（Ctrl+F5）
    var iframe = $('<iframe src="' + setting.url + '" style="display:none;"></iframe>').appendTo('body')

    // iframe中的文件是异步加载的
    iframe.on('load',function(){ // on:绑定事件  load事件为当DOM加载完成后，才执行下面的代码
      var data = JSON.parse($(this.contentDocument).find('body').text())
      // console.log(data);

      htmlContent(data)      
    })

    
    // 数据的动态渲染
    function htmlContent(data){
      var txt = ''
      for(var i in data){
        txt += '<tr>'
        txt += '<td>' + data[i].sno + '</td>'
        txt += '<td>' + data[i].sname + '</td>'
        txt += '<td>' + data[i].saddr + '</td>'
        txt += '<td>' + data[i].stel + '</td>'
        txt += '<td><a href="javascript:void(0)">删除</a></td>'
        txt += '</tr>'           
      }
      // console.log(that);
      that.html(txt)

      // 调用用户事件
      addEvent()
    }

    // 
    function addEvent(){
      $.each(e, function(event,callback){
        // 父元素DOM.on(事件名,子元素,事件处理函数)  -- 事件委派（委托）
        $(that).on(event, 'tr', callback)
      })
    }
    return that;
  }
})(jQuery);