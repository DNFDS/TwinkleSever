<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%> 
<%@ page contentType="text/html;charset=utf-8"%> 
<!DOCTYPE html>
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>成为会员</title>
<script src="http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
<style>
*, *:before, *:after {
  box-sizing: border-box;
  margin: 0;
  padding: 0;
}
body {
  background: #15181A;
  font-family: "Open Sans", Helvetica, Arial, sans-serif;
}
.skw-pages {
  overflow: hidden;
  position: relative;
  height: 100vh;
}
.skw-page {
  position: absolute;
  left: 0;
  top: 0;
  width: 100%;
}
.skw-page__half {
  position: absolute;
  top: 0;
  width: 50%;
  height: 100vh;
  transition: -webkit-transform 1s;
  transition: transform 1s;
  transition: transform 1s, -webkit-transform 1s;
}
.skw-page__half--left {
  left: 0;
  -webkit-transform: translate3d(-32.4vh, 100%, 0);
  transform: translate3d(-32.4vh, 100%, 0);
}
.skw-page__half--right {
  left: 50%;
  -webkit-transform: translate3d(32.4vh, -100%, 0);
  transform: translate3d(32.4vh, -100%, 0);
}
.skw-page.active .skw-page__half {
  -webkit-transform: translate3d(0, 0, 0);
  transform: translate3d(0, 0, 0);
}
.skw-page__skewed {
  overflow: hidden;
  position: absolute;
  top: 0;
  width: 140%;
  height: 100%;
  -webkit-transform: skewX(-18deg);
  transform: skewX(-18deg);
  background: #000;
}
.skw-page__half--left .skw-page__skewed {
  left: -40%;
}
.skw-page__half--right .skw-page__skewed {
  right: -40%;
}
.skw-page__content {
  display: flex;
  align-items: center;
  justify-content: center;
  flex-flow: column wrap;
  position: absolute;
  left: 0;
  top: 0;
  width: 100%;
  height: 100%;
  padding: 0 30%;
  color: #fff;
  -webkit-transform: skewX(18deg);
  transform: skewX(18deg);
  transition: opacity 1s, -webkit-transform 1s;
  transition: transform 1s, opacity 1s;
  transition: transform 1s, opacity 1s, -webkit-transform 1s;
  background-size: cover;
}
.skw-page__half--left .skw-page__content {
  padding-left: 30%;
  padding-right: 30%;
  -webkit-transform-origin: 100% 0;
  transform-origin: 100% 0;
}
.skw-page__half--right .skw-page__content {
  padding-left: 30%;
  padding-right: 30%;
  -webkit-transform-origin: 0 100%;
  transform-origin: 0 100%;
}
.skw-page.inactive .skw-page__content {
  opacity: 0.5;
  -webkit-transform: skewX(18deg) scale(0.95);
  transform: skewX(18deg) scale(0.95);
}
.skw-page__heading {
  margin-bottom: 15px;
  text-transform: uppercase;
  font-size: 40px;
  text-align: center;
}
.skw-page__description {
  font-size: 30px;
  text-align: center;
}
.skw-page__link {
  color: #FFA0A0;
}
.skw-page-1 .skw-page__half--left .skw-page__content {
  background-image: url("image/VIP_image/vip_pic.jpg");
}
.skw-page-1 .skw-page__half--right .skw-page__content {
  background: #292929;
}
.skw-page-2 .skw-page__half--left .skw-page__content {
  background: #292929;
}
.skw-page-2 .skw-page__half--right .skw-page__content {
  background-image: url("image/VIP_image/vip_pic1.jpg");
}
.skw-page-3 .skw-page__half--left .skw-page__content {
  background-image: url("image/VIP_image/vip_pic2.jpg");
}
.skw-page-3 .skw-page__half--right .skw-page__content {
  background: #292929;
}
.skw-page-4 .skw-page__half--left .skw-page__content {
  background: #292929;
}
.skw-page-4 .skw-page__half--right .skw-page__content {
  background-image: url("image/VIP_image/vip_pic3.png");
}
.skw-page-5 .skw-page__half--left .skw-page__content {
  background-image: url("image/VIP_image/vip_pic4.png");
}
.skw-page-5 .skw-page__half--right .skw-page__content {
  background: #292929;
}
.profile__cover_div{
  position:relative;
  margin-top:10px;
}
.profile__cover{
  display:block;
  width:110px;
  height:110px;
  border-style:solid;
  border-color:#fff;
  border-width:4px;
  border-radius:200px;
}
.profile__name{
  font-size: 30px;
  font-weight: 400;
  line-height: 64px;
  color:white;
}
.display_not_vip{
  color: #b2bab3;
  font-weight: 400;
  text-decoration: none;
}
.display_not_vip_div,.save_money_link_div,.view_buy_history_link_div{
  text-align:center;
  margin-bottom: 10px;
}
.view_buy_history_link,.save_money_link{
  color: #b2bab3;
  text-align:center;
  text-decoration: none;
}
.save_money_link:hover,.view_buy_history_link:hover,.display_not_vip:hover{
  color: #3d85c6;
}
</style>  
</head>
<script>
$(document).ready(function() {
	var curPage = 1;
	var numOfPages = $(".skw-page").length;
	var animTime = 1000;
	var scrolling = false;
	var pgPrefix = ".skw-page-";
	function pagination() {
		scrolling = true;
		$(pgPrefix + curPage).removeClass("inactive").addClass("active");
		$(pgPrefix + (curPage - 1)).addClass("inactive");
		$(pgPrefix + (curPage + 1)).removeClass("active");
		setTimeout(function() {
			scrolling = false;
		}, animTime);
	};
	function navigateUp() {
		if (curPage === 1) return;
		curPage--;
		pagination();
	};
	function navigateDown() {
		if (curPage === numOfPages) return;
		curPage++;
		pagination();
	};
	$(document).on("mousewheel DOMMouseScroll", function(e) {
		if (scrolling) return;
		if (e.originalEvent.wheelDelta > 0 || e.originalEvent.detail < 0) {
			navigateUp();
		} else {
			navigateDown();
		}
	});
	$(document).on("keydown", function(e) {
		if (scrolling) return;
		if (e.which === 38) {
			navigateUp();
		} else if (e.which === 40) {
			navigateDown();
		}
	});
});
</script>
<body>
	<div class="skw-pages">
	  <div class="skw-page skw-page-1 active">
		<div class="skw-page__half skw-page__half--left">
		  <div class="skw-page__skewed">
			<div class="skw-page__content"></div>
		  </div>
		</div>
		<div class="skw-page__half skw-page__half--right">
		  <div class="skw-page__skewed">
			<div class="skw-page__content">
			  <h2 class="skw-page__heading">VIP Rights</h2>
			  <p class="skw-page__description">无 损 音 质</p> <sub style="color:#707070;">下滑翻页</sub>
			</div>
		  </div>
		</div>
	  </div>
	  <div class="skw-page skw-page-2">
		<div class="skw-page__half skw-page__half--left">
		  <div class="skw-page__skewed">
			<div class="skw-page__content">
			  <h2 class="skw-page__heading">VIP Rights</h2>
			  <p class="skw-page__description">免 费 下 载</p><sub style="color:#707070;">下滑翻页</sub>
			</div>
		  </div>
		</div>
		<div class="skw-page__half skw-page__half--right">
		  <div class="skw-page__skewed">
			<div class="skw-page__content"></div>
		  </div>
		</div>
	  </div>
	  <div class="skw-page skw-page-3">
		<div class="skw-page__half skw-page__half--left">
		  <div class="skw-page__skewed">
			<div class="skw-page__content"></div>
		  </div>
		</div>
		<div class="skw-page__half skw-page__half--right">
		  <div class="skw-page__skewed">
			<div class="skw-page__content">
			  <h2 class="skw-page__heading">VIP Rights</h2>
			  <p class="skw-page__description">专 属 电 台</p><sub style="color:#707070;">下滑翻页</sub>
			</div>
		  </div>
		</div>
	  </div>
	  <div class="skw-page skw-page-4">
		<div class="skw-page__half skw-page__half--left">
		  <div class="skw-page__skewed">
			<div class="skw-page__content">
			  <h2 class="skw-page__heading">VIP Rights</h2>
			  <p class="skw-page__description">会 员 曲 库</p><sub style="color:#707070;">下滑翻页</sub>
			</div>
		  </div>
		</div>
		<div class="skw-page__half skw-page__half--right">
		  <div class="skw-page__skewed">
			<div class="skw-page__content"></div>
		  </div>
		</div>
	  </div>
	  <div class="skw-page skw-page-5">
		<div class="skw-page__half skw-page__half--left">
		  <div class="skw-page__skewed">
			<div class="skw-page__content"></div>
		  </div>
		</div>
		<div class="skw-page__half skw-page__half--right">
		  <div class="skw-page__skewed">
			<div class="skw-page__content">
			  <h2 class="skw-page__heading">COME AND JOIN US!</h2>
			  <div class="profile__cover_div">
				<img src="https://thirdqq.qlogo.cn/g?b=sdk&amp;k=Nop4KmTnicXM0deVfoND1Xg&amp;s=140&amp;t=1521364225"
					 alt="LyXuAn" class="profile__cover" id="profileHead">
			  </div>
			  <div class="profile_name_div">
				<span class="profile__name">LyXuAn</span>
			  </div>
			  <div class="display_not_vip_div">
				<a href="request_vip.html" target="_blank" class="display_not_vip"><span class="">当前未开通VIP 立即开通></span></a>
			  </div>
			  <div class="view_buy_history_link_div">
				<a href="buy_history.html" target="_blank" class="view_buy_history_link"><span class="">查看我购买的单曲></span></a>
			  </div>
			  <div class="save_money_link_div">
				<a href="save_money.html" target="_blank" class="save_money_link"><span class="">账户充值></span></a>
			  </div>
			</div>
		  </div>
		</div>
	  </div>
	</div>
</body>
</html>
