var n=0;//存储图片加载到的位置，避免每次第一张图开始遍历
function lazyload(imgs) {
  // 获取可视区的高度
  var height = document.documentElement.clientHeight;
  console.log(height)
  // 获取滚动条的位置
  var scrollTop = document.body.scrollTop || document.documentElement.scrollTop;
  console.log(scrollTop)
  //遍历图片 
  for (var i = 0; i < imgs.length; i++) {
    if (imgs[i].offsetTop < height + scrollTop) {
      if(imgs[i].getAttribute('src')==''||!imgs[i].getAttribute('src')){
        // imgs[i].setAttribute('src',imgs[i].getAttribute('data-src'))
        imgs[i].src=imgs[i].getAttribute('data-src')
      }
      n=i+1;
    }
  }
}