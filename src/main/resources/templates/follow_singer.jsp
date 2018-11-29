<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%> 
<%@ page contentType="text/html;charset=utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>个人主页</title>
<link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/PersonalMessage.css" rel="stylesheet">
<link href="css/main.css" rel="stylesheet">
<script src="JS/jquery-3.3.1.min.js"></script>
<script src="JS/bootstrap.min.js"></script>
<script src="JS/main_js.js"></script>
<style>
body {
    background-color: #fafafa;
}
.btn_focus_fan {
    position: absolute;
    right: 0;
    top: 15px;
    margin-right: 0;
	width: 150px;
}
.operate_btn{
	height: 16px;
	position: relative;
	bottom:1px;
	right: 3px;
}
.mod_singer_list{
	padding-top: 50px;
	padding-bottom: 40px;
	overflow: hidden;
	text-align: center;
}
.singer_list__list {
	margin-right: -20px;
    overflow: hidden;
    margin-bottom: -24px;
}
.singer_list__item {
    float: left;
    width: 20%;
    margin-bottom: 20px;
    overflow: hidden;
}
.singer_list__item_box {
    position: relative;
    margin-right: 20px;
    background-color: #fbfbfd;
    min-height: 195px;
    padding: 25px 0;
    overflow: hidden;
}
.singer_list__cover {
    margin-left: auto;
    margin-right: auto;
}
.singer_list__cover, .singer_list__pic {
    display: block;
    width: 140px;
    height: 140px;
    border-radius: 126px;
}
.singer_list__title {
    font-size: 16px;
    font-weight: 400;
    overflow: hidden;
    text-overflow: ellipsis;
    white-space: nowrap;
    margin: 20px 30px 4px;
}
.singer_list__info {
    overflow: hidden;
    text-overflow: ellipsis;
    white-space: nowrap;
    line-height: 22px;
    height: 22px;
}
.singer_list__info, .singer_list__info a {
    color: #999;
}
.singer_list__focus {
    display: block;
}
.singer_list__btn_focus {
    width: 120px;
    padding: 0;
    margin-right: 0;
}
.mod_singer_list--fans .singer_list__btn_focus {
    display: block;
    margin: 9px auto 0;
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
				<span class="profile__name">flowrain</span><a href="https://y.qq.com/portal/vipportal/index.html" rel="noopener nofollow" target="_blank"><img src="//y.gtimg.cn/music/icon/v1/mac/svip_g@2x.png?max_age=2592000" alt="profile_cover" class="lv_icon"></a>
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
			<a class="mod_tab__item" href="like_song.jsp" id="like_tab" data-tab="buy" data-stat="y_new.profile.tab.digital_album">我喜欢</a>
			<a class="mod_tab__item" href="Purchased_album_form.jsp" id="buy_tab" data-tab="buy" data-stat="y_new.profile.tab.digital_album">我的已购</a>
			<span class=" mod_tab__current" >关注</span>
			<a class="mod_tab__item" href="Fans.html" id="fans_tab" data-tab="fans" data-stat="y_new.profile.tab.fans">粉丝</a>
			<a class="mod_tab__item" href="javascript:;" id="uploadmv_tab" data-tab="uploadmv" data-stat="y_new.profile.tab.uploadmv">我上传的视频</a>
		</div>
		<div class="mod_tab" role="nav">
			<span class="mod_tab__item mod_tab__current">歌手</span>
			<a class="mod_tab__item" href="follow_user.jsp" data-tab="like_playlist" data-stat="y_new.profile.like.tab.playlist">用户</a>
		</div>
		<div class="profile_cont">
			<a href="javascript:;" class="mod_btn btn_focus_fan js_focus_friends" style="display: block;"><img src="image/Index_image/add_more.png" alt="add_more" class="operate_btn">关注更多歌手</a>
			<div class="js_sub" id="focus_singer_box" style="display: block;">
				<div class="mod_singer_list mod_singer_list--fans">
					<ul class="singer_list__list"> 
						<li class="singer_list__item">
							<div class="singer_list__item_box">
								<a href="https://y.qq.com/n/yqq/singer/001Y2Gbc2Xt1hU.html" class="singer_list__cover js_singer" hidefocus="true" data-mid="001Y2Gbc2Xt1hU" data-id="4712">
									<img class="singer_list__pic" src="//y.gtimg.cn/music/photo_new/T001R150x150M000001Y2Gbc2Xt1hU.jpg?max_age=2592000" onerror="this.src='//y.gtimg.cn/mediastyle/global/img/singer_300.png?max_age=31536000';this.error=null;" alt="Michael Jackson">
								</a>
								<h3 class="singer_list__title"><a href="https://y.qq.com/n/yqq/singer/001Y2Gbc2Xt1hU.html" data-mid="001Y2Gbc2Xt1hU" data-id="4712" class="js_singer" title="Michael Jackson">Michael Jackson</a></h3>
								<p class="singer_list__info">204万人关注</p>
								<div class="singer_list__focus">
									<a href="javascript:;" class="mod_btn singer_list__btn_focus js_follow_singer" data-follow="1" data-mid="001Y2Gbc2Xt1hU" data-id="4712"><span class="btn_focus__cont">已关注</span></a>
								</div>
							</div>
						</li>
						<li class="singer_list__item">
							<div class="singer_list__item_box">
								<a href="https://y.qq.com/n/yqq/singer/001Y2Gbc2Xt1hU.html" class="singer_list__cover js_singer" hidefocus="true" data-mid="001Y2Gbc2Xt1hU" data-id="4712">
									<img class="singer_list__pic" src="//y.gtimg.cn/music/photo_new/T001R150x150M000001Y2Gbc2Xt1hU.jpg?max_age=2592000" onerror="this.src='//y.gtimg.cn/mediastyle/global/img/singer_300.png?max_age=31536000';this.error=null;" alt="Michael Jackson">
								</a>
								<h3 class="singer_list__title"><a href="https://y.qq.com/n/yqq/singer/001Y2Gbc2Xt1hU.html" data-mid="001Y2Gbc2Xt1hU" data-id="4712" class="js_singer" title="Michael Jackson">Michael Jackson</a></h3>
								<p class="singer_list__info">204万人关注</p>
								<div class="singer_list__focus">
									<a href="javascript:;" class="mod_btn singer_list__btn_focus js_follow_singer" data-follow="1" data-mid="001Y2Gbc2Xt1hU" data-id="4712"><span class="btn_focus__cont">已关注</span></a>
								</div>
							</div>
						</li>
						<li class="singer_list__item">
							<div class="singer_list__item_box">
								<a href="https://y.qq.com/n/yqq/singer/001Y2Gbc2Xt1hU.html" class="singer_list__cover js_singer" hidefocus="true" data-mid="001Y2Gbc2Xt1hU" data-id="4712">
									<img class="singer_list__pic" src="//y.gtimg.cn/music/photo_new/T001R150x150M000001Y2Gbc2Xt1hU.jpg?max_age=2592000" onerror="this.src='//y.gtimg.cn/mediastyle/global/img/singer_300.png?max_age=31536000';this.error=null;" alt="Michael Jackson">
								</a>
								<h3 class="singer_list__title"><a href="https://y.qq.com/n/yqq/singer/001Y2Gbc2Xt1hU.html" data-mid="001Y2Gbc2Xt1hU" data-id="4712" class="js_singer" title="Michael Jackson">Michael Jackson</a></h3>
								<p class="singer_list__info">204万人关注</p>
								<div class="singer_list__focus">
									<a href="javascript:;" class="mod_btn singer_list__btn_focus js_follow_singer" data-follow="1" data-mid="001Y2Gbc2Xt1hU" data-id="4712"><span class="btn_focus__cont">已关注</span></a>
								</div>
							</div>
						</li>
						<li class="singer_list__item">
							<div class="singer_list__item_box">
								<a href="https://y.qq.com/n/yqq/singer/001Y2Gbc2Xt1hU.html" class="singer_list__cover js_singer" hidefocus="true" data-mid="001Y2Gbc2Xt1hU" data-id="4712">
									<img class="singer_list__pic" src="//y.gtimg.cn/music/photo_new/T001R150x150M000001Y2Gbc2Xt1hU.jpg?max_age=2592000" onerror="this.src='//y.gtimg.cn/mediastyle/global/img/singer_300.png?max_age=31536000';this.error=null;" alt="Michael Jackson">
								</a>
								<h3 class="singer_list__title"><a href="https://y.qq.com/n/yqq/singer/001Y2Gbc2Xt1hU.html" data-mid="001Y2Gbc2Xt1hU" data-id="4712" class="js_singer" title="Michael Jackson">Michael Jackson</a></h3>
								<p class="singer_list__info">204万人关注</p>
								<div class="singer_list__focus">
									<a href="javascript:;" class="mod_btn singer_list__btn_focus js_follow_singer" data-follow="1" data-mid="001Y2Gbc2Xt1hU" data-id="4712"><span class="btn_focus__cont">已关注</span></a>
								</div>
							</div>
						</li>
						<li class="singer_list__item">
							<div class="singer_list__item_box">
								<a href="https://y.qq.com/n/yqq/singer/001Y2Gbc2Xt1hU.html" class="singer_list__cover js_singer" hidefocus="true" data-mid="001Y2Gbc2Xt1hU" data-id="4712">
									<img class="singer_list__pic" src="//y.gtimg.cn/music/photo_new/T001R150x150M000001Y2Gbc2Xt1hU.jpg?max_age=2592000" onerror="this.src='//y.gtimg.cn/mediastyle/global/img/singer_300.png?max_age=31536000';this.error=null;" alt="Michael Jackson">
								</a>
								<h3 class="singer_list__title"><a href="https://y.qq.com/n/yqq/singer/001Y2Gbc2Xt1hU.html" data-mid="001Y2Gbc2Xt1hU" data-id="4712" class="js_singer" title="Michael Jackson">Michael Jackson</a></h3>
								<p class="singer_list__info">204万人关注</p>
								<div class="singer_list__focus">
									<a href="javascript:;" class="mod_btn singer_list__btn_focus js_follow_singer" data-follow="1" data-mid="001Y2Gbc2Xt1hU" data-id="4712"><span class="btn_focus__cont">已关注</span></a>
								</div>
							</div>
						</li>
						<li class="singer_list__item">
							<div class="singer_list__item_box">
								<a href="https://y.qq.com/n/yqq/singer/001Y2Gbc2Xt1hU.html" class="singer_list__cover js_singer" hidefocus="true" data-mid="001Y2Gbc2Xt1hU" data-id="4712">
									<img class="singer_list__pic" src="//y.gtimg.cn/music/photo_new/T001R150x150M000001Y2Gbc2Xt1hU.jpg?max_age=2592000" onerror="this.src='//y.gtimg.cn/mediastyle/global/img/singer_300.png?max_age=31536000';this.error=null;" alt="Michael Jackson">
								</a>
								<h3 class="singer_list__title"><a href="https://y.qq.com/n/yqq/singer/001Y2Gbc2Xt1hU.html" data-mid="001Y2Gbc2Xt1hU" data-id="4712" class="js_singer" title="Michael Jackson">Michael Jackson</a></h3>
								<p class="singer_list__info">204万人关注</p>
								<div class="singer_list__focus">
									<a href="javascript:;" class="mod_btn singer_list__btn_focus js_follow_singer" data-follow="1" data-mid="001Y2Gbc2Xt1hU" data-id="4712"><span class="btn_focus__cont">已关注</span></a>
								</div>
							</div>
						</li>
					</ul>
				</div>
			</div>
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
