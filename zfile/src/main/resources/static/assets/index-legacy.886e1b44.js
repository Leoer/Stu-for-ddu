System.register(["./event-legacy.0bfbd831.js"],(function(e){"use strict";var t,n;return{setters:[function(e){t=e.a,n=e.b}],execute:function(){e("v",{beforeMount(e,u){let l,o=null;const r=()=>u.value&&u.value(),a=()=>{Date.now()-l<100&&r(),clearInterval(o),o=null};t(e,"mousedown",(e=>{0===e.button&&(l=Date.now(),n(document,"mouseup",a),clearInterval(o),o=setInterval(r,100))}))}})}}}));
