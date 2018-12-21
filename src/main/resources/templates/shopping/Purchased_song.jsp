<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>个人主页</title>
<link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link href="../css/bootstrap.min.css" rel="stylesheet">
<link href="../css/main.css" rel="stylesheet">
<link href="../css/PersonalMessage.css" rel="stylesheet">
<link href="../css/like_song.css" rel="stylesheet">
<script src="../JS/jquery-3.3.1.min.js"></script>
<script src="../JS/bootstrap.min.js"></script>
<script src="../JS/main_js.js"></script>
<style>
body {
    background-color: #fafafa;
}
.mod_songlist {
    padding-bottom:50px;
    min-height:400px;
}
</style>	
</head>
<body>
	<div class="container-fluid">
	<!-- 页头 -->
	<div class="row" style="height: 60px;min-height: 60px;background: #333333;"></div>
	<!-- 用户信息 -->
	<div class="mod_profile js_user_data" style="">
		<div class="section_inner">
			<div class="profile__cover_link">
				<img src="//thirdqq.qlogo.cn/g?b=sdk&amp;k=FDjMMNJZGGJc9MsnCMnHsw&amp;s=140&amp;t=1529503572" onerror="this.src='//y.gtimg.cn/mediastyle/global/img/person_300.png?max_age=31536000';this.onerror=null;" alt="flowrain" class="profile__cover" id="profileHead">
			</div>
			<h1 class="profile__tit">
				<span class="profile__name">flowrain</span><a href="https://y.qq.com/portal/vipportal/index.html" rel="noopener nofollow" target="_blank"><img src="//y.gtimg.cn/music/icon/v1/mac/svip_g@2x.png?max_age=2592000" alt="user_cover" class="lv_icon"></a>
			</h1>
			<ul class="mod_user_statistic">
				<li class="user_statistic__item">
					<a href="javascript:;" class="js_tab" data-tab="focus_singer" data-stat="y_new.profile.header.focus_click"><strong class="user_statistic__number js_num_follow">3</strong><span class="user_statistic__tit">关注</span></a>
				</li>
				<li class="user_statistic__item user_statistic__item--last">
					<a href="javascript:;" class="js_tab" data-tab="fans" data-stat="y_new.profile.header.fans_click"><strong class="user_statistic__number js_num_fans">2</strong><span class="user_statistic__tit">粉丝</span></a>
				</li>
			</ul>
  		</div>
	</div>
	<!-- 主体 -->
	<div class="main main--profile" style="">
		<div class="mod_tab profile_nav" role="nav" id="nav">
			<a class="mod_tab__item" href="like_song.jsp" id="focus_tab" data-tab="focus" data-stat="y_new.profile.tab.focus">我喜欢</a>
			<span class=" mod_tab__current" >我的已购</span>
			<a class="mod_tab__item" href="follow_singer.jsp" id="focus_tab" data-tab="focus" data-stat="y_new.profile.tab.focus">关注</a>
			<a class="mod_tab__item" href="Fans.html" id="fans_tab" data-tab="fans" data-stat="y_new.profile.tab.fans">粉丝</a>
			<a class="mod_tab__item" href="javascript:;" id="uploadmv_tab" data-tab="uploadmv" data-stat="y_new.profile.tab.uploadmv">我上传的视频</a>
		</div>
		<div class="mod_tab" role="nav">
			<a class="mod_tab__item" href="Purchased_album_form.jsp" data-tab="like_song" data-stat="y_new.profile.like.tab.song">专辑 36</a>
			<a class="mod_tab__item mod_tab__current" href="javascript:;" data-tab="like_playlist" data-stat="y_new.profile.like.tab.playlist">单曲 0</a>
		</div>
		<div class="mod_songlist_toolbar">
			<a href="javascript:;" class="mod_btn_blue js_all_play"><i class="mod_btn_green__icon_play"></i><img src="image/Index_image/mod_play.png" class="operate_btn" alt="play">播放全部</a>
			<a href="javascript:;" class="mod_btn js_all_fav"><i class="mod_btn__icon_add"></i><img src="image/Index_image/mod_add.png" class="operate_btn" alt="add">添加到</a>
			<a href="javascript:;" class="mod_btn js_all_down"><i class="mod_btn__icon_down"></i><img src="image/Index_image/mod_download.png" class="operate_btn" alt="download">下载</a>
			<a href="javascript:;" class="mod_btn js_batch"><i class="mod_btn__icon_batch"></i><img src="image/Index_image/mod_multoperate.png" class="operate_btn" alt="operate">批量操作</a>
		</div>
	 	<div class="mod_songlist">
	    	<ul class="songlist__header">
				<li class="songlist__header_name">歌曲</li>
				<li class="songlist__header_album">专辑</li>
				<li class="songlist__header_author">歌手</li>
				<li class="songlist__header_time">金额</li>
			</ul>
			<ul class="songlist__list1 submeau_1">
			  	<li class="songlist__name">Tales of the Electric Romeo</li>
				<div class="songlist__btn" id="oa_1">
					<span><a href="#"><img src="image/Index_image/play.png" alt="play" height="35px" width="35px" class="songlist_btn"/></a></span>
					<span><a href="#"><img src="image/Index_image/like.png" alt="like" height="35px" width="35px" class="songlist_btn"/></a></span>
					<span><a href="#"><img src="image/Index_image/add.png" alt="add" height="35px" width="35px" class="songlist_btn"/></a></span>
					<span><a href="#"><img src="image/Index_image/download.png" alt="download" height="35px" width="35px" class="songlist_btn"/></a></span>
				</div>
				<!--按钮悬停事件-->
			  	<script type="text/javascript"> 

				  $("#oa_1").hide();
				  $(".submeau_1").hover(function () {
					  $("#oa_1 ").show();
				  }, function () {
					  $("#oa_1").hide();
				  })
				  // 鼠标移动到list的div上的时候list div不会被隐藏
				  $("#oa_1").hover(function () {
					  $("#oa_1").show();
				  }, function () {
					  $("#oa_1").hide();
				  })
				</script>
				<li class="songlist__header_album">Trailerhead:Triumph</li>
				<li class="songlist__header_author">Immediate Music</li>
				<li class="songlist__header_time">04:00</li>
			</ul>
			<ul class="songlist__list2 submeau_2">
			  	<li class="songlist__name">Tales of the Electric Romeo</li>
				<li class="songlist__btn" id="oa_2">
					<span><a href="#"><img src="image/Index_image/play.png" alt="play" height="35px" width="35px" class="songlist_btn"/></a></span>
					<span><a href="#"><img src="image/Index_image/like.png" alt="like" height="35px" width="35px" class="songlist_btn"/></a></span>
					<span><a href="#"><img src="image/Index_image/add.png" alt="add" height="35px" width="35px" class="songlist_btn"/></a></span>
					<span><a href="#"><img src="image/Index_image/download.png" alt="download" height="35px" width="35px" class="songlist_btn"/></a></span>
				</li>
				<!--按钮悬停事件-->
			  	<script type="text/javascript"> 
				  $("#oa_2").hide();
				  $(".submeau_2").hover(function () {
					  $("#oa_2 ").show();
				  }, function () {
					  $("#oa_2").hide();
				  })
				  // 鼠标移动到list的div上的时候list div不会被隐藏
				  $("#oa_2").hover(function () {
					  $("#oa_2").show();
				  }, function () {
					  $("#oa_2").hide();
				  })
				</script>
				<li class="songlist__header_album">Trailerhead:Triumph</li>
				<li class="songlist__header_author">Immediate Music</li>
				<li class="songlist__header_time">04:00</li>
			</ul>
	  	 </div>
	</div>
	<!--footer-->
	<div class="footer">
		<div class="container">
			<div class="agileits_w3layouts_footer_grids">
				<div class="col-md-4 agileits_w3layouts_footer_grid">
					<h3>联系我们</h3>
					<ul>
						<li><span>官方电话 :</span> (+86) 62302 232</li><br>
						
					</ul>
				</div>
				<div class="col-md-4 agileits_w3layouts_footer_grid">
					<h3>地址</h3>
					<p>曹安路4800号, 嘉定区 <i>上海</i></p>
				</div>
				<div class="col-md-4 agileits_w3layouts_footer_grid">
					<h3>发送消息</h3>
					<ul>
						<li><span>Email :</span> <a style="color:#337ab7;" href="mailto:db_design@example.com">db_design@example.com</a></li>
						<li><span>咨询 :</span> <a style="color:#337ab7;" href="mailto:info@enquiry.com">info@enquiry.com</a></li>
					</ul>
				</div>
			</div>
		</div>
	</div>
	<div class="wthree_copy_right">
		<div class="container">
			<p>© 2018 Musicality. All rights reserved | Design by <a>SEdesign</a></p>
		</div>
	</div>
	<!--disk导航-->
	<nav class="top-right">
	<a href="find_music.jsp" class="disc l1" onMouseOver="disc1_over()" onMouseOut="disc1_out()">
	<div id="disc1" class="">发现音乐</div>
	</a>
	<a href="my_music.jsp" class="disc l2" onMouseOver="disc2_over()" onMouseOut="disc2_out()">
	<div id="disc2" class="">我的音乐</div>
	</a>
	<a href="like_song.jsp" class="disc l3" onMouseOver="disc3_over()" onMouseOut="disc3_out()">
	<div id="disc3" class="">个人主页</div>
	</a>
	<a href="VIP_index.jsp" class="disc l4" onMouseOver="disc4_over()" onMouseOut="disc4_out()">
	<div id="disc4" class="">成为会员</div>
	</a>
	<a class="disc l5 toggle">
	菜单
	</a>
	</nav>
	<script>
	toggle = document.querySelectorAll(".toggle")[0];
	nav = document.querySelectorAll("nav")[0];
	toggle_open_text = '菜单';
	toggle_close_text = '关闭';
	toggle.addEventListener('click', function() {
		nav.classList.toggle('open');	
	  if (nav.classList.contains('open')) {
		toggle.innerHTML = toggle_close_text;
	  } else {
		toggle.innerHTML = toggle_open_text;
	  }
	}, false);
	</script>
	</div>
</body>
</html>
