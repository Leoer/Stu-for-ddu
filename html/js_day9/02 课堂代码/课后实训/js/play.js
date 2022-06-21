;(function(){
  $(function(){ // jQuery中的ready事件，等待所有DOM加载完成后才执行其中的代码

    // 音乐文件数据mock
    var data = [
      {
        name: '走着走着就散了',
        path: './music/走着走着就散了.mp3',
        songText: './lrc/走着走着就散了.lrc'
      },
      {
        name: '葫芦娃',
        path: '',
        songText: ''
      },
      {
        name: '马叫',
        path: './music/horse.mp3',
        songText: ''
      },
      {
        name: '西游记',
        path: '',
        songText: ''
      },
      {
        name: '没有你陪伴真的好孤单',
        path: '',
        songText: './lrc/没有你陪伴真的好孤单.lrc'
      },
      {
        name: '平凡之路',
        path: './music/平凡之路.mp3',
        songText: './lrc/平凡之路.lrc'
      }
    ]

    // 初始化变量
    var player = document.getElementById('player'), // 播放器，播放器使用play()和pause()方法时，必须用JS原生获取DOM，不能用JQ去获取
        AllTime = null, // 音乐总时长
        timer = null, // 计时器
        singlePlay = false, // 是否单曲循环
        allPlay = true, // 是否全部循环
        vol = 50, // 音量
        index = 5,// 默认播放的音乐的下标
        musicTextTimer = null; // 歌词计时器

    // 初始化处理
    function init(){
      // 将歌曲添加到页面中
      $.each(data, function(idx, song){
        // console.log(song)
        $('.music').append('<li data-path="' + song.path + '">' + song.name + '</li>')
      })

      // 设置第一首默认播放的音乐
      $('.music li').eq(index).addClass('on');
      player.src = data[index].path

      // 初始化初始歌曲的歌词
      getTxtInfo(data[index].songText)

      // 初始化音量
      setVol(vol)

       // 初始化总时长
      player.addEventListener("loadedmetadata",function () {  // 加载完成后
        Alltime = parseInt(player.duration);
        var m = parseInt(parseInt(player.duration)/60);
        var s = parseInt(player.duration)-m*60;
        var time = (m<10?"0"+m:m)+":"+(s<10?"0"+s:s);
        $(".allTime").html(time);
      })
      // 初始化底部循环按钮状态
      if(singlePlay){
        $(".loopSigle").addClass("on");
      }
      if(allPlay){
        $(".loopAll").addClass("on");
      }
    }

    init();

    // 播放/暂停
    $('.controls .btn').click(function(){
      if($(this).hasClass('play')){
        $(this).removeClass('play')
        player.pause()
      }else{ 
        $(this).addClass('play')
        player.play()
      }
    })
   
    // 歌曲列表点击切换
    $('.music li').click(function(){
      var nowindex = $(this).index();
      // console.log(nowindex)
      playing(nowindex);
      if(!$('.controls .btn').hasClass('play')){
        $('.controls .btn').addClass('play')
      }
    })

    // 播放歌曲列表中选中的歌曲
    function playing(idx){
      var lis = $('.music li')
      lis.removeClass('on') // 移除歌曲列表中所有li标签被激活的样式
      lis.eq(idx).addClass('on') // 给当前单击选中的歌曲添加样式

      player.src = data[idx].path
      $('.controls .btn').addClass('play')

      getTxtInfo(data[idx].songText)

      player.play()
    }

    // 上一曲
    $('.controls .prev').click(function(){
      index = index - 1 < 0 ? data.length - 1 : index - 1
      if(!$('.controls .btn').hasClass('play')){
        $('.controls .btn').addClass('play')
      }
      playing(index)
    })

    // 下一曲
    $('.controls .next').click(function(){
      index = index + 1 >= data.length ? 0 : index + 1
      if(!$('.controls .btn').hasClass('play')){
        $('.controls .btn').addClass('play')
      }
      playing(index)
    })

    // 歌词切割处理
    function getTxtInfo(url){
      if(url == ''){
        $('.singWord').html('对不起，没有歌词！')
        return
      }
      var txtArray = [];
      $.get(url).then(function(data){
        // console.log(data)
        var reg = /\[(\d{2}):(\d{2}).(\d{2})\].*/g
        var songTxt = data
        songTxt = songTxt.match(reg)
        // console.log(songTxt)
        for(var i=0;i<songTxt.length;i++){
          var singleTxt = songTxt[i].substr(1).split(']');
          // console.log(singleTxt)
          var timeStr = singleTxt[0]
          var m = timeStr[0] == 0 ? timeStr[1] : timeStr.substr(0,2)
          var s = timeStr[3] == 0 ? timeStr[4] : timeStr.substr(3,2)
          var hs = timeStr[6] == 0 ? timeStr[7] : timeStr.substr(6,2)
          // console.log(m,s,hs)

          var wordTime = parseInt(m*60)+parseInt(s)+parseFloat(hs / 1000)
          txtArray.push({
            time: wordTime, // 歌词时间
            text: singleTxt[1] // 歌词内容
          })
        }
        // console.log(txtArray)
        setMusicText(txtArray)
      })
    }

    // 歌词同步切换
    function setMusicText(arr){
      clearInterval(musicTextTimer) // 回收内存
      $('.singWord').html('热爱歌词，热爱音乐！')
      musicTextTimer = setInterval(function(){
        $.each(arr, function(i,v){
          var currentTime = v.time - player.currentTime
          if(currentTime < 0){
            $('.singWord').html(v.text) // 当歌曲向后继续进行时，歌词也随之切换
          }
        })
      },1000)
    }

    // 音量重构
    function setVol(vol){
      if(vol == 0){
        player.volume = 0
        $('#volLine').height(0)
        $('.vol b').html('0%')
      }else{
        player.volume = vol / 100
        $('#volLine i').height(vol)
        $('.vol b').html(vol + '%')
      }
    }

    // 调整音量
    $('#volLine').click(function(e){
      if($('.vol em').hasClass('on')){
        $('.vol em').removeClass('on')
        $('.vol i').css('background','yellow')
      }

      // 点击时，设置音量显示的css
      vol = $('#volLine').height() - (getMousePosition(e).top - $('#volLine').offset().top)
      setVol(vol)
    })

    // 获取鼠标在页面点击的位置
    function getMousePosition(e){
      var e = e || window.event;
      var scrollX = document.documentElement.scrollLeft || document.body.scrollLeft;
      var scrollY = document.documentElement.scrollTop || document.body.scrollTop;

      var x = e.pageX || e.clientX + scrollX;
      var y = e.pageY || e.clientY + scrollY;
      return {'left': x,'top': y}
    }

    // 设置静音
    $('.vol em').click(function(){
      if($(this).hasClass('on')){ // 非静音
        $(this).removeClass('on')
        // $('.vol i').css('background-color','yellow')
        setVol(vol)
      }else{
        $(this).addClass('on') // 静音
        // $('.vol i').css('background-color','red')
        setVol(0)
      }
    })

    // 单曲循环
    $('.loopSigle').click(function(){
      $('.loop').removeClass('on')
      singlePlay = false;
      allPlay = false;
      $(this).addClass('on');
      singlePlay = true;
    })

    // 顺序循环全部歌曲
    $('.loopAll').click(function(){
      $('.loop').removeClass('on')
      singlePlay = false;
      allPlay = false;
      $(this).addClass('on');
      allPlay = true;
    })

    // 获取当前时长
    player.addEventListener("playing",function () {
      // 获取当前时长
      timer = setInterval(function () {
          setCurTime(player.currentTime);
      },1000)
    })

    // 播放结束时
    player.addEventListener("ended",function () {
      clearInterval(timer);
      $(".controls .btn").removeClass("play");
      // 进度条显示100%；
      $(".progress p").width($(".progress").width());
      time= null;
      if(allPlay && !singlePlay){  // 循环播放
          index = (index+1)<data.length?index+1:0;
          playing(index);
      }
      if(singlePlay && !allPlay){
          $path = $("#container ul li").eq(index).attr("data-path");
          playing(index);
      }
    })

    //  设置当前时间 【代码重构，传入当前index】
    function setCurTime(nowTime,sking){  // sking 参数用来表明是否是跳跃修改
      if(sking){  // 判断是否是跳跃修改
        //  修改当前播放时间 【chrome不支持修改】
        player.currentTime = nowTime;
      }
       // 获取当前时间
      var curTime = parseInt(player.currentTime);
      var m = parseInt(parseInt(player.currentTime)/60);
      var s = parseInt(player.currentTime)-m*60;
      var time = (m<10?"0"+m:m)+":"+(s<10?"0"+s:s);
      $(".curTime").html(time);
      // 进度条显示
      var meter = (curTime/ Alltime)*($(".progress").width());
    // 长度判断
      meter = meter<$(".progress").width()?meter:$(".progress").width();
      $(".progress p").width(meter);
    }

    // 进度条点击跳转 【chrome不支持】
    $(".progress").click(function () {
      // 鼠标在进度条点击位置的相对位置
    var long = (getMousePosition().left)-($(".progress").offset().left);
      $(".progress .p").width(long);
      //  求出对应的当前时间
      var nowTime = (long/$(".progress").width())*Alltime;
      // 设置当前时间
      clearInterval(timer);
      setCurTime(nowTime,true);
    })
  })
})();