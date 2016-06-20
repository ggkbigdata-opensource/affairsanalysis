var UC_SAFE_LOGIN={};(function(){var D={isIE:!!window.ActiveXObject,isPluginInstall:function(){if(D.isIE){if(navigator.plugins["Baidu.Medusa"]){return true}else{try{var G=new ActiveXObject("Baidu.Medusa")}catch(K){return false}return true}}else{var L=navigator.mimeTypes["application/x-baidu-safe"];if(L){return L.enabledPlugin}else{return false}}},loadPlugin:function(M){var K=[];var G=document.getElementById(H);if(!D.isPluginInstall()){D.setInstallTip();return}K.push('<object type="application/x-baidu-safe" ');for(var L in M){K.push(" "+L+'="'+M[L]+'"')}K.push("/>");o(G,'<input name="sid" type="hidden" id="'+d+'" />');o(G,'<input name="pwd" type="hidden" id="'+l+'" />');o(G,K.join(""))},getPlugin:function(G){return document.getElementById(G)},getPassword:function(G){return D.getPlugin(G).getPassword()},getVersion:function(G){return D.getPlugin(G).getVersion()},sendCompleted:function(G){return D.getPlugin(G).sendCompleted()},getSessionId:function(G){return D.getPlugin(G).getSessionId()},sendEnvironmentInfo:function(G){return D.getPlugin(G).sendEnvironmentInfo()},getLastErrorCode:function(G){return D.getPlugin(G).getLastErrorCode()},getSendBackMessage:function(G){return D.getPlugin(G).getSendBackMessage()},checkPassword:function(G){return D.getPlugin(G).checkPassword()},requestSid:function(G){D.getPlugin(G).requestSid()},setInstallTip:function(){var K='<a id="ucsl-link-install" class="install-plug" href="http://aq.baidu.com/nologin/aqplugindown/">请点此安装控件</a>';var G=q(H);G.innerHTML=K;var L="安装安全控件后，请刷新或重启浏览器";x(q("ucsl-link-install"),"click",function(){B.showDialog(k.title,L)});h()}};function t(K){var G=document.createElement("link");G.setAttribute("rel","stylesheet");G.setAttribute("type","text/css");G.setAttribute("href",K);document.getElementsByTagName("head")[0].appendChild(G)}function o(L,K){if(D.isIE){L.insertAdjacentHTML("BeforeEnd",K)}else{var M=L.ownerDocument.createRange();M.setStartBefore(L);var G=M.createContextualFragment(K);L.appendChild(G)}}function x(M,L,K){var G=M;if(G==null){return false}L=L||"click";if((typeof K).toLowerCase()!="function"){return}if(G.attachEvent){G.attachEvent("on"+L,K)}else{if(G.addEventListener){G.addEventListener(L,K,false)}else{G["on"+L]=K}}return true}var e=false;function v(K,O,G){e=false;var N=+(G||a);var L=window.setInterval(function(){if(0==K()){e=true;clearInterval(L);clearTimeout(M);O(0)}},F);var M=window.setTimeout(function(){if(false===e){clearInterval(L);O(K())}clearTimeout(M)},N)}var B={dialgHtml:['<div id="dialog" style="position:absolute; left:-3000px" class="ucsl-dialog">','<div class="ucsl-dialog-title">','<span id="dialog-close" class="ucsl-dialog-title-close">',"</span>",'<span id="dialog-title" class="ucsl-dialog-title-word">安全控件提示</span>',"</div>",'<div class="ucsl-dialog-content">','<div id="dialog-content" class="orange">',"安装安全控件后，请重启浏览器","</div>","</div>","</div>",'<div class="ucsl-layerMask" id="layerMask"></div>'],setStyle:function(G,K,L){G.style[K]=L},showDialog:function(O,K){var Q=document.documentElement||document.body;var N=Math.max(Q.scrollWidth,Q.clientWidth);var R=Math.max(Q.scrollHeight,Q.clientHeight);var M=B.$("dialog");var L=B.$("layerMask");var G=B.$("dialog-title");var P=B.$("dialog-content");G.innerHTML=O;P.innerHTML=K;B.setStyle(M,"left",(parseInt(N/2)-288+"px"));B.setStyle(L,"width",N+"px");B.setStyle(L,"height",R+"px");if(q(s)){q(s).style.display="none"}L.style.display="block"},closeDialog:function(){var K=B.$("dialog");var G=B.$("layerMask");B.setStyle(K,"left","-3000px");if(q(s)){q(s).style.display="block"}G.style.display="none"},$:function(G){return document.getElementById(G)},prepare:function(){var G=("https:"==document.location.protocol);var K=(G?" https://":" http://");var L="ucsl"+(G?".https":"")+".css";t(K+"cas.baidu.com/ucsl/"+L);o(document.body,B.dialgHtml.join(""));x(B.$("dialog-close"),"click",B.closeDialog)}};B.prepare();var s="password_edit";var c={};var H="plugin-container";var f="entered_imagecode";var F=200;var a=8000;var A="1.0.1";var J=false;var w=new Function();var h=new Function();var d="ucsl-input-sid";var l="ucsl-input-pwd";var y=D.isPluginInstall();var k={title:"安全控件提示",loginMsg:"登录中，请稍候···",serverError:"服务有异常，请稍候再试！错误码：",negative98:'<div style="text-align:left"><span style="display:inline-block;margin: 4px 0;">本次登录失败可能由于以下情况导致，请尝试：</span><span style="display:inline-block;margin: 4px 0;">(1) 您电脑的日期设置有误，请调准您电脑的日期设置。</span><span style="display:inline-block;margin: 4px 0;">(2) 您尚未安装控件证书，请<a style="color: #5277c7;font-weight:normal;" href="http://aq.baidu.com/Downloads/BaiduSafeRoot.zip">点击安装</a>。</span><span style="display:inline-block;margin: 4px 0;">(3) 控件可能被某些安全软件拦截，请在相应安全软件中将控件设置为信任。</span><br /><br /><span style="display:inline-block;margin: 4px 0;color: #999;font-size: 12px;font-weight:normal;">控件安装或使用过程中有其它疑问，请<a style="color: #5277c7;" href="http://aq.baidu.com/Downloads/BaiduSafeFaq.doc">点击下载FAQ</a></span></div>',negative99:"安全控件加载失败，请刷新页面后重试。",noInstall:"请点击链接安装控件",updateInfo:"控件已经更新，请重新下载安装!"};var q=function(G){return document.getElementById(G)};function I(){try{var G=D.getVersion(s);var L=G.lastIndexOf(".");var K=G.substring(0,L);if(K!=A){B.showDialog(k.title,k.updateInfo);D.setInstallTip()}}catch(M){try{x(q(s),"echo",function(N,O){if(O==9){document.getElementById(f).focus()}})}catch(M){}}}function E(){var G=D.sendCompleted(s);return G}function g(){D.sendEnvironmentInfo(s);v(E,C)}function m(){D.requestSid(s);v(E,u)}function u(){var G=D.getLastErrorCode(s);if(0==G){g()}else{B.showDialog(k.title,k.serverError+G);h()}}function C(){var G=D.getLastErrorCode(s);if(0==G||-1==G){J=true;w();return}h();if(-3==G){B.showDialog(k.title,D.getSendBackMessage(s))}else{if(-4==G){m()}else{if(-98==G){B.showDialog(k.title,k.negative98)}else{if(-99==G){B.showDialog(k.title,k.negative99)}else{B.showDialog(k.title,k.serverError+G)}}}}}function i(G){if(0==G){g()}else{B.showDialog(k.title,k.negative99)}}function j(){v(E,i,5000)}function z(G){H=G.fid;c.id=s;c.width=G.style.width||175;c.height=G.style.height||30;c.tabindex=G.style.tabindex||2;h=G.fail||new Function();if(!y){D.setInstallTip();return}D.loadPlugin(c);f=G.tabout||f;w=G.ready;I();j()}function n(){var G=D.getSessionId(s);var K=D.getPassword(s);var M=q(d);var L=q(l);if(M){M.value=G}if(L){L.value=K}return{sid:G,pwd:K}}function b(){if(J){if(D.checkPassword(s)){n();return true}}else{alert("插件加载中")}return false}function p(){var K=navigator.userAgent;var G=/windows/i.test(K);var L=/msie/i.test(K)&&/x64/i.test(K);return G&&!L}function r(){if(y){return true}return false}UC_SAFE_LOGIN.init=z;UC_SAFE_LOGIN.verify=b;UC_SAFE_LOGIN.dialog=B.showDialog;UC_SAFE_LOGIN.support=p;UC_SAFE_LOGIN.isInstall=r()})();var ucsl=UC_SAFE_LOGIN;