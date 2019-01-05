<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%> 
<%@ page contentType="text/html;charset=utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
<title>专辑详情</title>
<link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/PersonalMessage.css" rel="stylesheet">
<link href="css/main.css" rel="stylesheet">
<script src="JS/jquery-3.3.1.min.js"></script>
<script src="JS/bootstrap.min.js"></script>	
<script src="JS/main_js.js"></script>	
<style>
.main, .section_inner {
    max-width: 900px;
    margin: 0 auto;
    position: relative;
}
.main {
	min-height: 1300px;
}
.mod_data {
    position: relative;
    height: 250px;
    padding-left: 305px;
    margin-top: 40px;
    margin-bottom: 35px;
}
.mod_data {
    padding-left: 340px;
}
.data__cover {
    position: absolute;
    left: 0;
    top: 0;
    width: 250px;
    height: 250px;
}
.data__photo {
    width: 100%;
    height: 100%;
    object-fit: cover;
}
.data__cover_mask {
    position: absolute;
    left: 0;
    top: 0;
    width: 300px;
    height: 266px;
    background: url(image/Index_image/album_cover.png) 0 0 no-repeat;
    pointer-events: none;
}
.data__cont {
    padding-top: 13px;
}
.data__name {
    overflow: hidden;
    height: 50px;
    line-height: 50px;
}
.data__name_txt {
    float: left;
    font-size: 31px;
    line-height: 50px;
    font-weight: 400;
    white-space: nowrap;
    overflow: hidden;
    text-overflow: ellipsis;
    max-width: 70%;
    margin-right: 10px;
}
.data__singer {
    white-space: nowrap;
}
.data__singer_txt {
    font-size: 16px;
    color: #333;
}
.data__info {
    width: 550px;
    overflow: hidden;
    padding-top: 8px;
}
.data_info__item {
    float: left;
    line-height: 27px;
    width: 200px;
    margin-right: 30px;
    white-space: nowrap;
    overflow: hidden;
    text-overflow: ellipsis;
    font-size: 14px;
}
.data_info__item--even {
    width: 300px;
    margin-right: 0;
}
.data__actions {
    position: absolute;
    bottom: 23px;
    font-size: 0;
}
.mod_btn, .mod_btn_green {
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
.mod_btn_green {
    border: 1px solid rgba(22,154,243,1.00);
    background-color: rgba(22,154,243,1.00);
    color: #fff;
}
.data__actions .mod_btn, .data__actions .mod_btn_green {
    min-width: 122px;
    text-align: center;
    padding: 0 18px;
    font-family: 微软雅黑;
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
    width: 70%;
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
    width: 40%;
    position: relative;
    white-space: normal;
}
.songlist__btn{
	float: left;
    width: 30%;
    position: relative;
    white-space: normal;
}
.songlist_btn{
	margin-left: 4px;
}	
.songlist__header_album, .songlist__header_author {
    float: right;
    padding-left: 20px;
    width: 30%;
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
.part__hd, .part_detail__hd {
    overflow: hidden;
    height: 60px;
}
.part__tit, .part_detail__tit {
    float: left;
    font-size: 24px;
    font-weight: 400;
    line-height: 58px;
    font-family: 微软雅黑;
}
.part__tit_desc {
    font-size: 14px;
    margin-left: 12px;
}
.c_tx_thin {
    color: #999;
}
.comment__input {
    position: relative;
    padding-bottom: 60px;
}
.comment__textarea {
    position: relative;
    overflow: hidden;
    height: 102px;
    border: solid 1px #ececec;
    background-color: #f5f5f5;
}
.comment__textarea_inner {
    margin: 10px 14px 0 14px;
}
.comment__textarea_default, .comment__textarea_input {
    width: 100%;
    border: none;
    height: 66px;
    resize: none;
    overflow: auto;
    outline: 0;
    background: 0 0;
}
.comment__tips {
    position: absolute;
    bottom: 3px;
    right: 14px;
    text-align: right;
}
.c_tx_current, .c_tx_highlight {
    color: rgba(22,154,243,1.00);
}
.comment__tool {
    position: absolute;
    bottom: 10px;
    right: -5px;
}
.comment__tool_btn {
    width: 80px;
    line-height: 27px;
    height: 27px;
    text-align: center;
    padding: 0;
}
.comment__tool a {
    margin-right: 5px;
}
.mod_songlist {
    padding-bottom: 60px;
}
.mod_all_comment {
    margin-bottom: 46px;
}
.comment_type__title {
    position: relative;
    height: 34px;
    line-height: 34px;
    padding-bottom: 10px;
    border-bottom-width: 1px;
    border-bottom-style: solid;
    border-color: #ededed;
}
.comment_type__title h2 {
    font-weight: 400;
    font-size: 16px;
    overflow: hidden;
    text-overflow: ellipsis;
    white-space: nowrap;
}
.comment__list {
    padding-bottom: 14px;
}
.comment__list_item {
    position: relative;
    padding: 15px 0 15px 56px;
    zoom: 1;
    border-bottom-width: 1px;
    border-bottom-style: solid;
    border-color: #ededed;
}
.comment__avatar {
    position: absolute;
    left: 0;
    top: 20px;
    width: 38px;
    height: 38px;
}
.comment__avatar img {
    display: block;
    width: 100%;
    height: 100%;
    border-radius: 999px;
}
.comment__title {
    font-weight: 400;
    margin-bottom: 6px;
    overflow: hidden;
    height: 20px;
    white-space: nowrap;
    text-overflow: ellipsis;
}
.comment__title a, .comment__title span {
    float: left;
}
.comment__text {
    overflow: hidden;
    word-break: break-all;
    word-wrap: break-word;
    line-height: 24px;
    text-align: justify;
}
.comment__opt {
    line-height: 24px;
    text-align: right;
    overflow: hidden;
}
.comment__date {
    float: left;
    line-height: 28px;
}
.comment__zan {
    vertical-align: -1px;
}
.comment__delete, .comment__good, .comment__link, .comment__report, .comment__zan {
    margin-right: 22px;
}
.icon_comment {
    background-image: url(image/Index_image/赞.png);
    background-repeat: no-repeat;
}
.icon_comment_like, .icon_comment_liked {
    display: inline-block;
    margin-right: 5px;
    width: 21px;
    height: 21px;
    overflow: hidden;
    vertical-align: -3px;
}
.icon_comment_like {
    background-position: -25px -25px;
}
.icon_comment_feedback {
    display: inline-block;
    width: 21px;
    height: 21px;
    background-position: -25px -60px;
    font-size: 0;
    vertical-align: -2px;
}
.comment__show_all {
    padding-top: 3px;
    text-align: center;
}
.comment__opt a:hover img{
	background:url(image/Index_image/zan_active.png) no-repeat 21px 21px;
}
.comment_repeat {

    padding-top: 16px;

}
.js_reply_container{
	visibility: hidden;
	max-height: 0;
}
.drop{
	visibility: visible;
	max-height: 180px;
}
body {
    background: url(image/Index_image/body_bg.jpg) 50% 60px repeat-x;
}
.data__actions a:hover{
	color: rgba(22,154,243,1.00);
}
</style>
<script>
function on_input(){
	var styleVal1 = document.getElementById('reply_text_blur').getAttribute("style");
	styleVal1=styleVal1.replace("display: block;","display: none;");
	document.getElementById("reply_text_blur").setAttribute("style",styleVal1);
	var styleVal2 = document.getElementById('reply_text').getAttribute("style");
	styleVal2=styleVal2.replace("display: none;","display: block;");
	document.getElementById("reply_text").setAttribute("style",styleVal2);
}
function out_input(){
	var styleVal1 = document.getElementById('reply_text').getAttribute("style");
	styleVal1=styleVal1.replace("display: block;","display: none;");
	document.getElementById("reply_text").setAttribute("style",styleVal1);
	var styleVal2 = document.getElementById('reply_text_blur').getAttribute("style");
	styleVal2=styleVal2.replace("display: none;","display: block;");
	document.getElementById("reply_text_blur").setAttribute("style",styleVal2);
}
function on_reply(){
	var styleVal1 = document.getElementById('replyed_text_blur').getAttribute("style");
	styleVal1=styleVal1.replace("display: block;","display: none;");
	document.getElementById("replyed_text_blur").setAttribute("style",styleVal1);
	var styleVal2 = document.getElementById('replyed_text').getAttribute("style");
	styleVal2=styleVal2.replace("display: none;","display: block;");
	document.getElementById("replyed_text").setAttribute("style",styleVal2);
}
function out_reply(){
	var styleVal1 = document.getElementById('replyed_text').getAttribute("style");
	styleVal1=styleVal1.replace("display: block;","display: none;");
	document.getElementById("replyed_text").setAttribute("style",styleVal1);
	var styleVal2 = document.getElementById('replyed_text_blur').getAttribute("style");
	styleVal2=styleVal2.replace("display: none;","display: block;");
	document.getElementById("replyed_text_blur").setAttribute("style",styleVal2);
}
document.onclick = function (event)  {     
	var e = event || window.event;
	var istrue="false";
	var isout="false";
	var elem = e.srcElement||e.target;  
	var styleVal1 = document.getElementById('replyed_text').getAttribute("style");
	var styleVal2 = document.getElementById('reply_text').getAttribute("style");
	if(styleVal1=="display: block;"){
		while(elem)  
		{   
			if(elem.id == "replyed_text"||elem.id == "replyed_text_blur")  
			{  
				istrue="true";
				break;
			}  
			elem = elem.parentNode;       
		}
		if(istrue!="true"){
			out_reply();
			isout="true";
		}
	}
	if(styleVal2=="display: block;"){
		while(elem)  
		{   
			if(elem.id == "reply_text"||elem.id == "reply_text_blur")  
			{  
					return;  
			}  
			elem = elem.parentNode;       
		}
		if(isout!="true")
			out_input();
	}
}
function open_reply(){
	var classVal = document.getElementById('reply_box').getAttribute("class");
	if(classVal =="js_reply_container")
	{
		classVal=classVal.concat(" drop");
		document.getElementById("reply_box").setAttribute("class",classVal);	
	}
}
function close_reply(){
	var classVal = document.getElementById('reply_box').getAttribute("class");
	if(classVal =="js_reply_container drop")
	{
		classVal=classVal.replace("js_reply_container drop","js_reply_container");
		document.getElementById("reply_box").setAttribute("class",classVal);
	}
}
</script>
</head>
<body>
	<div class="container-fluid">
	<!-- 页头 -->
	<div class="row" style="height: 60px;min-height: 60px;background: #333333;"></div>
	<!-- 主体 -->
	<div class="main">
		<div class="mod_data" itemscope="" itemtype="http://schema.org/MusicRecording">
            <span class="data__cover">
                <img id="albumImg" src="//y.gtimg.cn/music/photo_new/T002R300x300M000002HspDd0Z48SD.jpg?max_age=2592000" onerror="this.src='//y.gtimg.cn/mediastyle/global/img/album_300.png?max_age=31536000';this.onerror=null;" alt="Showboat" class="data__photo">
                <i class="data__cover_mask"></i>
            </span>
            <div class="data__cont">
                <div class="data__name">
                    <h1 class="data__name_txt" title="Showboat">Showboat</h1>
                </div>
                <div class="data__singer">
                    <i class="icon_singer sprite"></i><a href="//y.qq.com/n/yqq/singer/001l3qAV0e446K.html" class="js_singer data__singer_txt" itemprop="byArtist" data-id="1535498" data-stat="y_new.album.header.singername" data-mid="001l3qAV0e446K" title="Brian Newman">Brian Newman</a>
                </div>
                <ul class="data__info">
					<li class="data_info__item">流派：Jazz 爵士</li>
					<li class="data_info__item data_info__item--even">语种：英语</li>
					<li class="data_info__item">发行时间：2018-11-16</li>
					<li class="data_info__item data_info__item--even">唱片公司：<a href="//y.qq.com/portal/company_detail.html?id=35">环球唱片</a></li>
					<li class="data_info__item">类型：录音室专辑</li>	
                </ul>
                <div class="data__actions" role="toolbar">
                    <a href="//y.qq.com/portal/player.html" class="mod_btn_green js_all_play" data-stat="y_new.album.header.playall"><i class="mod_btn_green__icon_play"></i><img src="image/Index_image/mod_play.png" class="operate_btn" alt="play">播放全部</a>
                    <a href="javascript:;" class="mod_btn js_fav_album" data-stat="y_new.album.header.love" data-status="0"><i class="mod_btn__icon_like"></i><img src="image/Index_image/mod_like.png" class="operate_btn" alt="download">收藏</a>
		    		<a class="mod_btn js_into_comment" data-stat="y_new.album.gotocomment" href="#comment_box"><i class="mod_btn__icon_comment"></i><img src="image/Index_image/mod_download.png" class="operate_btn" alt="download">下载</a>
                    <a href="javascript:;" class="mod_btn js_more" data-mid="002HspDd0Z48SD" data-id="5127601" data-stat="y_new.album.header.more"><i class="mod_btn__icon_menu"></i><img src="image/Index_image/mod_add.png" class="operate_btn" alt="add">添加到</a>
                </div>
            </div>
        </div>
		<div class="detail_layout__main">
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
			<div class="mod_comment" id="comment_box">
				<div class="part__hd">
        			<h2 class="part__tit">评论<span class="c_tx_thin part__tit_desc js_all_comment_num">共7条评论</span></h2>
    			</div>
				<div class="mod_comment js_cmt_input">
					<div class="comment__input">
						<div class="comment__textarea js_comment__textarea  c_bg_normal">
							<div class="comment__textarea_inner">
								<div class="comment__textarea_default c_tx_thin js_reply_text_blur" name="" id="reply_text_blur" style="display: block;" onClick="on_input()" contenteditable="true">期待你的神评论……
								</div>
								<div class="js_reply_text comment__textarea_input c_tx_normal" name="" id="reply_text" style="display: none;" contenteditable="true"></div>
							</div>
							<div class="comment__tips js_comment_tips c_tx_thin" data-max="300">剩余<span class="c_tx_highlight">300</span>字</div>
						</div>
						<a class="comment__face js_cmt_face" href="javascript:;" data-type="reply"><i class="icon_comment icon_comment_face"></i></a>
						<div class="comment__tool"><a href="javascript:;" class="mod_btn_green comment__tool_btn js_send_reply">发表评论</a></div>
					</div>
				</div>
				<div class="mod_all_comment js_mod_all">
					<div class="comment_type__title c_b_normal">
	    				<h2>最新评论(7)</h2>
					</div>
    				<ul class="comment__list js_all_list">
						<li class="comment__list_item c_b_normal js_cmt_li" style="visibility: visible;">
    						<a href="javascript:;" class="comment__avatar js_nick" data-uin="1195278174">
								<img class="js_lazy_comment_pic" data-original="//y.gtimg.cn/music/photo_new/T001R300x300M000002RaR8P3WLVH5.jpg?max_age=2592000" alt="徐潮城" onerror="this.src='//y.gtimg.cn/mediastyle/global/img/person_300.png?max_age=2592000';this.onerror=null" title="徐潮城" style="display: block; visibility: visible;" src="//y.gtimg.cn/music/photo_new/T001R300x300M000002RaR8P3WLVH5.jpg?max_age=2592000">
   						 	</a>
							<h4 class="comment__title">
								<a href="javascript:;" class="c_tx_thin js_nick js_nick_only" data-uin="1195278174">徐潮城</a>
    						</h4>
							<p class="c_tx_normal comment__text js_hot_text">支持<br><br>支持<br><br>支持<img src="//y.gtimg.cn/mediastyle/global/emoji/img/e400825.png">
							</p>
							<div class="comment__opt js_comment_opt" data-commentid="album_5127601_1195278174_1542716434">
    							<span class="comment__date c_tx_thin">20:20</span>
								<a class="comment__zan js_cmt_praise " data-commentid="album_5127601_1195278174_1542716434" href="javascript:;"><i class="icon_comment icon_comment_like"></i><img src="image/Index_image/zan.png" class="icon_comment_like" alt="赞"><span class="js_praise_num">0</span></a>
								<a onClick="open_reply()" class="comment__feedback js_feedback icon_comment icon_comment_feedback" href="javascript:;" data-nick="徐潮城" data-uin="1195278174" data-cmtid="album_5127601_1195278174_1542716434"><img src="image/Index_image/reply.png" class="icon_comment_feedback" alt="回复">回复</a>
							</div>
							<div class="js_reply_container" id="reply_box">
								<div class="comment_repeat js_cmt_replyed" data-uin="2889902617" data-cmtid="album_2088269_2889902617_1531317202">
									<div class="comment__input">		
		    							<div class="comment__textarea js_comment__textarea c_bg_normal">
											<div class="comment__textarea_inner">
			    							<!--focus评论框的时候将.comment__textarea_default模块隐藏，同时显示.comment__textarea_input-->
			   									 <div class="comment__textarea_default c_tx_thin js_replyed_text_blur" name="" id="replyed_text_blur" style="display: block;" onClick="on_reply()" contenteditable="true">回复@Connor</div>
			    								 <div id="replyed_text" class="js_replyed_text comment__textarea_input c_tx_normal" style="display: none;" contenteditable="true"></div>
											</div>
											<div class="comment__tips c_tx_thin js_replyed_comment_tips" data-max="300">剩余<span class="c_tx_highlight">300</span>字</div>
		    							</div>
										<a class="comment__face js_cmt_face" href="javascript:;" data-type="replyed"><i class="icon_comment icon_comment_face"></i></a>
										<div class="comment__tool">
											<a class="comment__tool_btn mod_btn_green js_send_replyed" href="javascript:;">回复</a>
											<a onClick="close_reply()" class="mod_btn comment__tool_btn js_send_cancel" href="javascript:;">取消</a>
										</div>
									</div>
								</div>
							</div>
						 </li>
						<li class="comment__list_item c_b_normal js_cmt_li" style="visibility: visible;">
    						<a href="javascript:;" class="comment__avatar js_nick" data-uin="1195278174">
								<img class="js_lazy_comment_pic" data-original="//y.gtimg.cn/music/photo_new/T001R300x300M000002RaR8P3WLVH5.jpg?max_age=2592000" alt="徐潮城" onerror="this.src='//y.gtimg.cn/mediastyle/global/img/person_300.png?max_age=2592000';this.onerror=null" title="徐潮城" style="display: block; visibility: visible;" src="//y.gtimg.cn/music/photo_new/T001R300x300M000002RaR8P3WLVH5.jpg?max_age=2592000">
   						 	</a>
							<h4 class="comment__title">
								<a href="javascript:;" class="c_tx_thin js_nick js_nick_only" data-uin="1195278174">徐潮城</a>
    						</h4>
							<p class="c_tx_normal comment__text js_hot_text">支持<br><br>支持<br><br>支持<img src="//y.gtimg.cn/mediastyle/global/emoji/img/e400825.png">
							</p>
							<div class="comment__opt js_comment_opt" data-commentid="album_5127601_1195278174_1542716434">
    							<span class="comment__date c_tx_thin">20:20</span>
								<a class="comment__zan js_cmt_praise " data-commentid="album_5127601_1195278174_1542716434" href="javascript:;"><i class="icon_comment icon_comment_like"></i><img src="image/Index_image/zan.png" class="icon_comment_like" alt="赞"><span class="js_praise_num">0</span></a>
								<a class="comment__feedback js_feedback icon_comment icon_comment_feedback" href="javascript:;" data-nick="徐潮城" data-uin="1195278174" data-cmtid="album_5127601_1195278174_1542716434"><img src="image/Index_image/reply.png" class="icon_comment_feedback" alt="回复">回复</a>
							</div>
						 </li>
					</ul>
					<div class="comment__show_all"><span class="comment__show_all_link c_tx_thin">—— 以上为全部评论 ——</span></div>
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

