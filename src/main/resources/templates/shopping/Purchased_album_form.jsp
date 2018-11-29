<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%> 
<%@ page contentType="text/html;charset=utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
<title>个人主页</title>
<link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link href="css/PersonalMessage.css" rel="stylesheet">
<link href="css/main.css" rel="stylesheet">
<script src="JS/jquery-3.3.1.min.js"></script>
<script src="JS/bootstrap.min.js"></script>
<script src="JS/main_js.js"></script>	
<style>
body {
    background-color: #fafafa;
}
.style_switch {
    position: absolute;
    top: 30px;
    right: 0;
    width: 80px;
    height: 38px;
    border-radius: 2px;
    border: 1px solid #c9c9c9;
}
.style_switch__item {
    float: left;
    width: 50%;
    height: 38px;
    position: relative;
}
.style_switch__item_right {
    float: left;
    width: 50%;
    height: 36px;
    position: relative;
}
.style_switch__item--select {
    background-color: rgba(22,154,243,1.00);
}
.style_switch__item_img {
    margin-left: 12px;
	margin-top: 10px;
}	
.mod_playlist .playlist__item_box {
    position: relative;
    margin-right: 20px;
}
.mod_playlist{
	padding-top: 50px;
}
.mod_playlist .playlist__list {
    margin-right: -20px;
}
.mod_playlist .playlist__item {
    display: inline-block;
    width: 19.5%;
    padding-bottom: 44px;
    overflow: hidden;
    font-size: 14px;
    vertical-align: top;
}
.mod_playlist .he_border2 {
    position: relative;
    display: block;
    overflow: hidden;
    padding-top: 100%;
    margin-bottom: 15px;
}
.mod_playlist .playlist__pic {
    position: absolute;
    top: 0;
    left: 0;
    width: 100%;
}
.mod_playlist .playlist__title {
    overflow: hidden;
}
.mod_playlist .playlist__title_txt {
    float: left;
    max-width: 100%;
    font-weight: 400;
    overflow: hidden;
    text-overflow: ellipsis;
    line-height: 22px;
    max-height: 44px;
}
.mod_playlist .playlist__author, .mod_playlist .playlist__author a, .mod_playlist .playlist__other {
    color: #999;
    white-space: nowrap;
    overflow: hidden;
    text-overflow: ellipsis;
    height: 22px;
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
			<a class="mod_tab__item" href="like_song.jsp" id="focus_tab" data-tab="focus" data-stat="y_new.profile.tab.focus">我喜欢</a>
			<span class=" mod_tab__current" >我的已购</span>
			<a class="mod_tab__item" href="follow_singer.jsp" id="focus_tab" data-tab="focus" data-stat="y_new.profile.tab.focus">关注</a>
			<a class="mod_tab__item" href="Fans.html" id="fans_tab" data-tab="fans" data-stat="y_new.profile.tab.fans">粉丝</a>
			<a class="mod_tab__item" href="javascript:;" id="uploadmv_tab" data-tab="uploadmv" data-stat="y_new.profile.tab.uploadmv">我上传的视频</a>
		</div>
		<div class="mod_tab" role="nav">
			<a class="mod_tab__item mod_tab__current" href="javascript:;" data-tab="like_song" data-stat="y_new.profile.like.tab.song">专辑 36</a>
			<a class="mod_tab__item" href="Purchased_song.jsp" data-tab="like_playlist" data-stat="y_new.profile.like.tab.playlist">单曲 0</a>
		</div>
		<div class="style_switch" aria-label="排列方式">
			<a href="javascript:;" class="style_switch__item style_switch__item--select" title="上图下文" data-type="mod_playlist" data-tab="like_playlist" data-stat="y_new.profile.like.playlist.pic_mod"><img src="image/Index_image/表格active.png" alt="play" height="17px" width="17px" class="style_switch__item_img"/></a>
			<a href="Purchased_album_list.jsp" class="style_switch__item_right " title="列表" data-type="mod_playlist_text" data-tab="like_playlist" data-stat="y_new.profile.like.playlist.list_mod"><img src="image/Index_image/列表.png" alt="play" height="17px" width="17px" class="style_switch__item_img"/></a>
		    </div>
	 	<div class="mod_playlist" style="display: ;">
			<ul class="playlist__list">
				<li class="playlist__item" data-disstid="2887580659" onmouseover="this.className=(this.className+' playlist__item--hover')" onmouseout="this.className=this.className.replace(/ playlist__item--hover/, '')">
					<div class="playlist__item_box">
					<div class="he_border2"><img src="//p.qpic.cn/music_cover/HictYs5zfjNDmZ6NgVbHYiapgPODicIKJiaJibj7vkYiaDZH7WH2Eb4icMg3A/300?n=1" onerror="this.src='//y.gtimg.cn/mediastyle/global/img/cover_playlist.png?max_age=31536000';this.onerror=null;" alt="1—3岁儿童歌曲集，那些带你认识世界的儿歌" class="playlist__pic"/>
					<div class="he_border2_caption">
					<p class="he_border2_caption_p">查看歌单</p>
					<a class="he_border2_caption_a" href="#"></a>
					</div>
					</div>
					<h4 class="playlist__title"><span class="playlist__title_txt"><a href="https://y.qq.com/n/yqq/playlist/2887580659.html" class="js_playlist" data-disstid="2887580659" title="1—3岁儿童歌曲集，那些带你认识世界的儿歌">1—3岁儿童歌曲集，那些带你认识世界的儿歌</a></span></h4>
					<div class="playlist__author">
						<a title="几米" class="js_user" href="//y.qq.com/portal/profile.html?uin=oi-l7w4l7wcl7z**" data-uin="oi-l7w4l7wcl7z**">几米</a>
					</div>
					</div>
				 </li>
				<li class="playlist__item" data-disstid="2887580659" onmouseover="this.className=(this.className+' playlist__item--hover')" onmouseout="this.className=this.className.replace(/ playlist__item--hover/, '')">
					<div class="playlist__item_box">
					<div class="he_border2"><img src="//p.qpic.cn/music_cover/HictYs5zfjNDmZ6NgVbHYiapgPODicIKJiaJibj7vkYiaDZH7WH2Eb4icMg3A/300?n=1" onerror="this.src='//y.gtimg.cn/mediastyle/global/img/cover_playlist.png?max_age=31536000';this.onerror=null;" alt="1—3岁儿童歌曲集，那些带你认识世界的儿歌" class="playlist__pic"/>
					<div class="he_border2_caption">
					<p class="he_border2_caption_p">查看歌单</p>
					<a class="he_border2_caption_a" href="#"></a>
					</div>
					</div>
					<h4 class="playlist__title"><span class="playlist__title_txt"><a href="https://y.qq.com/n/yqq/playlist/2887580659.html" class="js_playlist" data-disstid="2887580659" title="1—3岁儿童歌曲集，那些带你认识世界的儿歌">1—3岁儿童歌曲集，那些带你认识世界的儿歌</a></span></h4>
					<div class="playlist__author">
						<a title="几米" class="js_user" href="//y.qq.com/portal/profile.html?uin=oi-l7w4l7wcl7z**" data-uin="oi-l7w4l7wcl7z**">几米</a>
					</div>
					</div>
				 </li>
				<li class="playlist__item" data-disstid="2887580659" onmouseover="this.className=(this.className+' playlist__item--hover')" onmouseout="this.className=this.className.replace(/ playlist__item--hover/, '')">
					<div class="playlist__item_box">
					<div class="he_border2"><img src="//p.qpic.cn/music_cover/HictYs5zfjNDmZ6NgVbHYiapgPODicIKJiaJibj7vkYiaDZH7WH2Eb4icMg3A/300?n=1" onerror="this.src='//y.gtimg.cn/mediastyle/global/img/cover_playlist.png?max_age=31536000';this.onerror=null;" alt="1—3岁儿童歌曲集，那些带你认识世界的儿歌" class="playlist__pic"/>
					<div class="he_border2_caption">
					<p class="he_border2_caption_p">查看歌单</p>
					<a class="he_border2_caption_a" href="#"></a>
					</div>
					</div>
					<h4 class="playlist__title"><span class="playlist__title_txt"><a href="https://y.qq.com/n/yqq/playlist/2887580659.html" class="js_playlist" data-disstid="2887580659" title="1—3岁儿童歌曲集，那些带你认识世界的儿歌">1—3岁儿童歌曲集，那些带你认识世界的儿歌</a></span></h4>
					<div class="playlist__author">
						<a title="几米" class="js_user" href="//y.qq.com/portal/profile.html?uin=oi-l7w4l7wcl7z**" data-uin="oi-l7w4l7wcl7z**">几米</a>
					</div>
					</div>
				 </li>
				<li class="playlist__item" data-disstid="2887580659" onmouseover="this.className=(this.className+' playlist__item--hover')" onmouseout="this.className=this.className.replace(/ playlist__item--hover/, '')">
					<div class="playlist__item_box">
					<div class="he_border2"><img src="//p.qpic.cn/music_cover/HictYs5zfjNDmZ6NgVbHYiapgPODicIKJiaJibj7vkYiaDZH7WH2Eb4icMg3A/300?n=1" onerror="this.src='//y.gtimg.cn/mediastyle/global/img/cover_playlist.png?max_age=31536000';this.onerror=null;" alt="1—3岁儿童歌曲集，那些带你认识世界的儿歌" class="playlist__pic"/>
					<div class="he_border2_caption">
					<p class="he_border2_caption_p">查看歌单</p>
					<a class="he_border2_caption_a" href="#"></a>
					</div>
					</div>
					<h4 class="playlist__title"><span class="playlist__title_txt"><a href="https://y.qq.com/n/yqq/playlist/2887580659.html" class="js_playlist" data-disstid="2887580659" title="1—3岁儿童歌曲集，那些带你认识世界的儿歌">1—3岁儿童歌曲集，那些带你认识世界的儿歌</a></span></h4>
					<div class="playlist__author">
						<a title="几米" class="js_user" href="//y.qq.com/portal/profile.html?uin=oi-l7w4l7wcl7z**" data-uin="oi-l7w4l7wcl7z**">几米</a>
					</div>
					</div>
				 </li>
				<li class="playlist__item" data-disstid="2887580659" onmouseover="this.className=(this.className+' playlist__item--hover')" onmouseout="this.className=this.className.replace(/ playlist__item--hover/, '')">
					<div class="playlist__item_box">
					<div class="he_border2"><img src="//p.qpic.cn/music_cover/HictYs5zfjNDmZ6NgVbHYiapgPODicIKJiaJibj7vkYiaDZH7WH2Eb4icMg3A/300?n=1" onerror="this.src='//y.gtimg.cn/mediastyle/global/img/cover_playlist.png?max_age=31536000';this.onerror=null;" alt="1—3岁儿童歌曲集，那些带你认识世界的儿歌" class="playlist__pic"/>
					<div class="he_border2_caption">
					<p class="he_border2_caption_p">查看歌单</p>
					<a class="he_border2_caption_a" href="#"></a>
					</div>
					</div>
					<h4 class="playlist__title"><span class="playlist__title_txt"><a href="https://y.qq.com/n/yqq/playlist/2887580659.html" class="js_playlist" data-disstid="2887580659" title="1—3岁儿童歌曲集，那些带你认识世界的儿歌">1—3岁儿童歌曲集，那些带你认识世界的儿歌</a></span></h4>
					<div class="playlist__author">
						<a title="几米" class="js_user" href="//y.qq.com/portal/profile.html?uin=oi-l7w4l7wcl7z**" data-uin="oi-l7w4l7wcl7z**">几米</a>
					</div>
					</div>
				 </li>
				<li class="playlist__item" data-disstid="2887580659" onmouseover="this.className=(this.className+' playlist__item--hover')" onmouseout="this.className=this.className.replace(/ playlist__item--hover/, '')">
					<div class="playlist__item_box">
					<div class="he_border2"><img src="//p.qpic.cn/music_cover/HictYs5zfjNDmZ6NgVbHYiapgPODicIKJiaJibj7vkYiaDZH7WH2Eb4icMg3A/300?n=1" onerror="this.src='//y.gtimg.cn/mediastyle/global/img/cover_playlist.png?max_age=31536000';this.onerror=null;" alt="1—3岁儿童歌曲集，那些带你认识世界的儿歌" class="playlist__pic"/>
					<div class="he_border2_caption">
					<p class="he_border2_caption_p">查看歌单</p>
					<a class="he_border2_caption_a" href="#"></a>
					</div>
					</div>
					<h4 class="playlist__title"><span class="playlist__title_txt"><a href="https://y.qq.com/n/yqq/playlist/2887580659.html" class="js_playlist" data-disstid="2887580659" title="1—3岁儿童歌曲集，那些带你认识世界的儿歌">1—3岁儿童歌曲集，那些带你认识世界的儿歌</a></span></h4>
					<div class="playlist__author">
						<a title="几米" class="js_user" href="//y.qq.com/portal/profile.html?uin=oi-l7w4l7wcl7z**" data-uin="oi-l7w4l7wcl7z**">几米</a>
					</div>
					</div>
				 </li>
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
