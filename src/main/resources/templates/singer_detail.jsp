<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%> 
<%@ page contentType="text/html;charset=utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
<title>歌手详情</title>
<link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/PersonalMessage.css" rel="stylesheet">
<link href="css/main.css" rel="stylesheet">
<script src="JS/jquery-3.3.1.min.js"></script>
<script src="JS/bootstrap.min.js"></script>	
<script src="JS/main_js.js"></script>	
<style>
.main, .section_inner {
    max-width: 1200px;
    margin: 0 auto;
    position: relative;
}
.mod_data {
    position: relative;
    height: 250px;
    padding-left: 555px;
    margin-top: 40px;
    margin-bottom: 35px;
}
.data__cover {

    position: absolute;
    left: 250px;
    top: 0;
    width: 250px;
    height: 250px;

}
.data__photo {

    width: 100%;
    height: 100%;
    object-fit: cover;
	border-radius: 999px;
}
.data__cont {

    padding-top: 31px;

}
.data__name {

    overflow: hidden;
	height: 50px;
    line-height: 50px;

}
.data__name_txt {

    float: left;
    font-size: 38px;
    font-weight: 400;
	line-height: 50px;
    white-space: nowrap;
    overflow: hidden;
    text-overflow: ellipsis;
    max-width: 90%;
    margin-right: 10px;

}
.data__desc {

    font-size: 14px;
    height: 50px;
    line-height: 50px;
    margin-bottom: 4px;

}
.data__desc_txt {

    float: left;
    max-width: 80%;
    white-space: nowrap;
    overflow: hidden;
    text-overflow: ellipsis;
    margin-right: 2px;

}
.mod_data_statistic {

    height: 23px;
    line-height: 23px;
    overflow: hidden;
    font-size: 0;

}
.data_statistic__item {

    display: inline-block;
    *display: inline;
    *zoom: 1;
    border-right: solid 1px #c9c9c9;
    text-align: center;
    padding-right: 20px;
    margin-right: 20px;
    font-size: 18px;

}
.data_statistic__item--last {

    border-right: 0 none;

}
.data_statistic__number {

    font-size: 25px;
    font-weight: 400;
    margin-left: 10px;

}
.data__actions {

    position: absolute;
    bottom: 30px;
    font-size: 0;

}
.mod_btn_blue2 {

    border-radius: 2px;
    font-size: 14px;
    margin-right: 6px;
    padding: 0 23px;
    height: 38px;
    line-height: 38px;
    display: inline-block;
    white-space: nowrap;
    box-sizing: border-box;
    overflow: hidden;

}
.mod_btn_blue2 {
    border: 1px solid rgba(22,154,243,1.00);
    background-color: rgba(22,154,243,1.00);
    color: #fff;
}
.data__actions .mod_btn, .data__actions .mod_btn_blue2 {

    min-width: 122px;
    text-align: center;

}
.mod_btn_blue__icon_play {

    width: 13px;
    height: 16px;
    background-position: -80px -220px;
    vertical-align: -3px;

}
.mod_part, .mod_part_detail {

    position: relative;
    margin-bottom: 30px;

}
.part__hd, .part_detail__hd {

    overflow: hidden;
    height: 60px;

}
.part__tit, .part_detail__tit {

    float: left;
    font-size: 24px;
    font-weight: 400;
    line-height: 58px;

}
.part__more {

    position: absolute;
    top: 20px;
    right: 0;
    font-size: 14px;

}
.icon_part_arrow {
	background-image: url(image/Index_image/arrow.png);
    display: inline-block;
    width: 10px;
    height: 14px;
    margin-left: 6px;
    vertical-align: -1px;

}
.detail_layout__main {
    width: 100%;
    padding-bottom: 20px;
}
.songlist__header, .songlist__list1,.songlist__list2 {
    position: relative;
    padding-left: 45px;
    padding-right: 100px;
}
.songlist__header{
    height: 50px;
    line-height: 50px;
    background-color: #fbfbfd;;
    color: #999;
}
.songlist__list1 {
    height: 50px;
    line-height: 50px;
    background-color:rgba(255,255,255,1.00);
    color: #727272;
}
.songlist__list2 {
   	height: 50px;
    line-height: 50px;
    background-color: #fbfbfd;;
    color: #727272;
}
.songlist__header_name {
    float: left;
    width: 50%;
    position: relative;
    white-space: normal;
}
.songlist__number {
    position: absolute;
    top: 0;
    left: 15px;
    color: #999;
    width: 36px;
}
.songlist__name{
	float: left;
    width: 30%;
    position: relative;
    white-space: normal;
}
.songlist__btn{
	float: left;
    width: 20%;
    position: relative;
    white-space: normal;
}
.songlist_btn{
	margin-left: 4px;
}	
.songlist__header_album, .songlist__header_author {
    float: right;
    padding-left: 20px;
    width: 50%;
    box-sizing: border-box;
}
.songlist__header_time {
    position: absolute;
    top: 0;
    right: 38px;
    width: 50px;
}
.songlist__header_other {
    position: absolute;
    top: 0;
    right: 0;
    width: 38px;
    overflow: inherit;
}
.mod_playlist .playlist__item_box {
    position: relative;
    margin-right: 20px;
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
body {
    background: url(image/Index_image/body_bg.jpg) 50% 60px repeat-x;
}
.data__actions a:hover,.part__hd a:hover{
	color: rgba(0,124,249,1.00);
}
</style>
</head>
<body>
	<div class="container-fluid">
	<!-- 页头 -->
	<div class="row" style="height: 60px;min-height: 60px;background: #333333;"></div>
	<!-- 主体 -->
	<div class="main">
		<div class="mod_data">
            <span class="data__cover">
                <a class="js_goto_tab js_none_index" data-stat="y_new.singer.thistab.singer_pic" data-tab="index" href="//y.qq.com/n/yqq/singer/004Qq6qC03P6Pb.html" style="display:none;"><img src="//y.gtimg.cn/music/photo_new/T001R300x300M000004Qq6qC03P6Pb.jpg?max_age=2592000" onerror="this.src='//y.gtimg.cn/mediastyle/global/img/singer_300.png?max_age=31536000';this.onerror=null;" alt="Bodybangers" class="data__photo"></a>
				<img src="//y.gtimg.cn/music/photo_new/T001R300x300M000004Qq6qC03P6Pb.jpg?max_age=2592000" onerror="this.src='//y.gtimg.cn/mediastyle/global/img/singer_300.png?max_age=31536000';this.onerror=null;" alt="Bodybangers" class="data__photo js_index">
            </span>
            <div class="data__cont">
            <div class="data__name">
            	<h1 class="data__name_txt js_none_index" style="display:none;"><a class="js_goto_tab" data-stat="y_new.singer.thistab.singer_name" title="Bodybangers" data-tab="index" href="//y.qq.com/n/yqq/singer/004Qq6qC03P6Pb.html">Bodybangers</a></h1>
		    	<h1 class="data__name_txt js_index" title="Bodybangers"> Bodybangers</h1>
            </div>
            <div class="data__desc" id="singer_desc">
	           <div class="data__desc_txt" id="short_desc">简介：德国乐队 </div>
            </div>
            <ul class="mod_data_statistic">		               				
                <li class="data_statistic__item">
                    <a href="//y.qq.com/n/yqq/singer/004Qq6qC03P6Pb.html#tab=album&amp;" class="js_goto_tab" data-stat="y_new.singer.header.album_tab" data-tab="album"><span class="data_statistic__tit">单曲</span><strong class="data_statistic__number">18</strong></a>
                </li>
                <li class="data_statistic__item data_statistic__item--last">
                    <a href="//y.qq.com/n/yqq/singer/004Qq6qC03P6Pb.html#tab=mv&amp;" class="js_goto_tab" data-stat="y_new.singer.header.mv_tab" data-tab="mv"><span class="data_statistic__tit">专辑</span><strong class="data_statistic__number">38</strong></a>
                </li>		
            </ul>
            <div class="data__actions" role="toolbar">			
                <a href="//y.qq.com/portal/player.html" class="mod_btn_blue2 js_singer_radio"><i class="mod_btn_blue__icon_play"></i><img src="image/Index_image/mod_play.png" class="operate_btn" alt="play">播放歌手热门歌曲</a>
                <a href="javascript:;" class="mod_btn js_follow"><i class="mod_btn__icon_more" data-status="0"></i><img src="image/Index_image/more.png" class="operate_btn" alt="more">关注 2376</a>		    
            </div>
            </div>
        </div>
        <div class="js_tab">
        	<div class="mod_part">
        		<div class="part__hd">
                	<h2 class="part__tit">热门歌曲</h2>
                	<a href="//y.qq.com/n/yqq/singer/004Qq6qC03P6Pb.html#tab=song&amp;" class="part__more js_goto_tab" data-stat="y_new.singer.index.song_all" data-tab="song">全部<i class="icon_part_arrow sprite"></i></a>		
            	</div>
            	<div class="mod_songlist">
			    	<ul class="songlist__header">
						<li class="songlist__header_name">歌曲</li>
						<li class="songlist__header_author">歌手</li>
						<li class="songlist__header_time">时长</li>
					</ul>
					<ul class="songlist__list1 submeau_1">
						<li class="songlist__number">1</li>
					  	<li class="songlist__name">Tales of the Electric Romeo</li>
						<li class="songlist__btn" id="oa_1">
							<span><a href="#"><img src="image/Index_image/play.png" alt="play" height="40px" width="40px" class="songlist_btn"/></a></span>
							<span><a href="#"><img src="image/Index_image/like.png" alt="like" height="40px" width="40px" class="songlist_btn"/></a></span>
							<span><a href="#"><img src="image/Index_image/add.png" alt="add" height="40px" width="40px" class="songlist_btn"/></a></span>
							<span><a href="#"><img src="image/Index_image/download.png" alt="download" height="40px" width="40px" class="songlist_btn"/></a></span>
						</li>
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
						<li class="songlist__header_author">Immediate Music</li>
						<li class="songlist__header_time">04:00</li>
					</ul>
					<ul class="songlist__list2 submeau_2">
						<li class="songlist__number">2</li>
					  	<li class="songlist__name">Tales of the Electric Romeo</li>
						<li class="songlist__btn" id="oa_2">
							<span><a href="#"><img src="image/Index_image/play.png" alt="play" height="40px" width="40px" class="songlist_btn"/></a></span>
							<span><a href="#"><img src="image/Index_image/like.png" alt="like" height="40px" width="40px" class="songlist_btn"/></a></span>
							<span><a href="#"><img src="image/Index_image/add.png" alt="add" height="40px" width="40px" class="songlist_btn"/></a></span>
							<span><a href="#"><img src="image/Index_image/download.png" alt="download" height="40px" width="40px" class="songlist_btn"/></a></span>
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
						<li class="songlist__header_author">Immediate Music</li>
						<li class="songlist__header_time">04:00</li>
					</ul>
	  			 </div>
        	</div>
        	<div class="mod_part">
        		<div class="part__hd">
                	<h2 class="part__tit">专辑</h2>
                	<a href="//y.qq.com/n/yqq/singer/004Qq6qC03P6Pb.html#tab=song&amp;" class="part__more js_goto_tab" data-stat="y_new.singer.index.song_all" data-tab="song">全部<i class="icon_part_arrow sprite"></i></a>		
            	</div>
            	<div class="mod_playlist" style="display: ;">
					<ul class="playlist__list">
						<li class="playlist__item" data-disstid="2887580659" onmouseover="this.className=(this.className+' playlist__item--hover')" onmouseout="this.className=this.className.replace(/ playlist__item--hover/, '')">
							<div class="playlist__item_box">
							<div class="he_border2"><img src="//p.qpic.cn/music_cover/HictYs5zfjNDmZ6NgVbHYiapgPODicIKJiaJibj7vkYiaDZH7WH2Eb4icMg3A/300?n=1" onerror="this.src='//y.gtimg.cn/mediastyle/global/img/cover_playlist.png?max_age=31536000';this.onerror=null;" alt="1—3岁儿童歌曲集，那些带你认识世界的儿歌" class="playlist__pic">
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
							<div class="he_border2"><img src="//p.qpic.cn/music_cover/HictYs5zfjNDmZ6NgVbHYiapgPODicIKJiaJibj7vkYiaDZH7WH2Eb4icMg3A/300?n=1" onerror="this.src='//y.gtimg.cn/mediastyle/global/img/cover_playlist.png?max_age=31536000';this.onerror=null;" alt="1—3岁儿童歌曲集，那些带你认识世界的儿歌" class="playlist__pic">
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
							<div class="he_border2"><img src="//p.qpic.cn/music_cover/HictYs5zfjNDmZ6NgVbHYiapgPODicIKJiaJibj7vkYiaDZH7WH2Eb4icMg3A/300?n=1" onerror="this.src='//y.gtimg.cn/mediastyle/global/img/cover_playlist.png?max_age=31536000';this.onerror=null;" alt="1—3岁儿童歌曲集，那些带你认识世界的儿歌" class="playlist__pic">
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
							<div class="he_border2"><img src="//p.qpic.cn/music_cover/HictYs5zfjNDmZ6NgVbHYiapgPODicIKJiaJibj7vkYiaDZH7WH2Eb4icMg3A/300?n=1" onerror="this.src='//y.gtimg.cn/mediastyle/global/img/cover_playlist.png?max_age=31536000';this.onerror=null;" alt="1—3岁儿童歌曲集，那些带你认识世界的儿歌" class="playlist__pic">
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
							<div class="he_border2"><img src="//p.qpic.cn/music_cover/HictYs5zfjNDmZ6NgVbHYiapgPODicIKJiaJibj7vkYiaDZH7WH2Eb4icMg3A/300?n=1" onerror="this.src='//y.gtimg.cn/mediastyle/global/img/cover_playlist.png?max_age=31536000';this.onerror=null;" alt="1—3岁儿童歌曲集，那些带你认识世界的儿歌" class="playlist__pic">
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
							<div class="he_border2"><img src="//p.qpic.cn/music_cover/HictYs5zfjNDmZ6NgVbHYiapgPODicIKJiaJibj7vkYiaDZH7WH2Eb4icMg3A/300?n=1" onerror="this.src='//y.gtimg.cn/mediastyle/global/img/cover_playlist.png?max_age=31536000';this.onerror=null;" alt="1—3岁儿童歌曲集，那些带你认识世界的儿歌" class="playlist__pic">
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


