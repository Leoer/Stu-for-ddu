;(function(){
  function _color(){ // 私有函数
    $(this).css('color','red') // 谁调用，this就指向谁
  }
  jQuery.prototype.color = _color
})();