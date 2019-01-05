<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%> 
<%@ page contentType="text/html;charset=utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8"> 
<title>发现音乐</title>
<link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="http://cdn.bootcss.com/jquery/2.1.1/jquery.min.js"></script>
<script src="http://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script src="http://libs.baidu.com/jquery/1.11.3/jquery.min.js"></script>
<script src="JS/main_js.js"></script>
<style>
*{
	padding: 0;
	margin: 0;
}
.container-fluid{
	padding: 0;
	margin: 0;	
}
*{
	margin: 0;
	padding: 0;
}
body{
	
	font-family: 'Microsoft YaHei', sans-serif;
}
/*slide*/
.slide_title{
	height: 100px;
}
.slide_title h1{
	font-size: 35px;
	text-align: center;
	letter-spacing: 10px;
	padding-top: 60px;
	color:#DBDBDB;
}
.slde_img{
	height: 400px;
}
.slide_img_content{
	height: 300px;
}
.slide_img p{
	font-family: 'YouYuan';
	font-weight:8em;
	color:#DEDEDE;
	font-size: 1.2em;
	padding-top: 8px;
}
.slide_img by{font-family: 'Microsoft YaHei', sans-serif;
	font-size: 0.9em;
	font-weight:200;
	color: #A2A2A2;
	align: left;
}
.slide_img img{
	border: #BBBBBB solid 1px;
}
/*recommend*/
.recommend{
	background:#ECECEC;
	height: 580px;
}
.recommend h1{
	color: #3D3D3D;
}
.recommend p{
	color:#1C1C1C;
}
.recommend by{
	color: #FBFBFB;
}
/*album*/
.newAlbum{
	height: 550px;
	background: #D5D5D5;
}
.newAlbum h1{
	color: #1C1C1C;
}
.newAlbum p{
	color: #1C1C1C;
}
.newAlbum by{
	color: #767676;
}

/*newSong*/

.newSong{
	height: 580px;
	background: #ECECEC;
}
.newSong li{
	border-color: #707070;
}
.newSong .carousel-indicators .active{
	background-color: #707070;
}
.newSong p{
	color: #2F2F2F;
}
.newSong by{
	color: #888888;
}
/*ranking*/
.ranking{
	height: 600px;
	background: #CBCBCB;
}
.ranking h1{
	font-size: 35px;
	text-align: center;
	letter-spacing: 10px;
	padding-top: 60px;
	color:#444444;
}
.ranking img{
	border: #5C5C5C solid 1px;
}	
/*插件*/
/*border2*/
.he_border2{background:#0d293c;width:240px;height:240px;padding:0;margin:0;border:1px solid #000;position:relative;box-sizing:border-box;-webkit-transition:all .4s ease-in-out;-moz-transition:all .4s ease-in-out;-o-transition:all .4s ease-in-out;-ms-transition:all .4s ease-in-out;transition:all .4s ease-in-out;overflow:hidden}
.he_border2 .he_border2_img{display:block;width:100%;padding:0;margin:0;position:relative;opacity:1;-webkit-transition:all .4s ease-in-out;-moz-transition:all .4s ease-in-out;-o-transition:all .4s ease-in-out;-ms-transition:all .4s ease-in-out;transition:all .4s ease-in-out;overflow:hidden}
.he_border2:hover .he_border2_img{position:absolute;-webkit-transform:scale(1.1);-moz-transform:scale(1.1);-o-transform:scale(1.1);-ms-transform:scale(1.1);transform:scale(1.1);opacity:.6}
.he_border2 .he_border2_caption{color:#fff;padding:0;margin:0;-moz-backface-visibility:hidden;-webkit-backface-visibility:hidden;backface-visibility:hidden;-webkit-transition:all .4s ease-in-out;-moz-transition:all .4s ease-in-out;-o-transition:all .4s ease-in-out;-ms-transition:all .4s ease-in-out;transition:all .4s ease-in-out;overflow:hidden}
.he_border2 .he_border2_caption::before,.he_border2 .he_border2_caption::after{position:absolute;content:'';opacity:0;-webkit-transition:opacity 0.4s,-webkit-transform .4s;-moz-transition:opacity 0.4s,-moz-transform .4s;-o-transition:opacity 0.4s,-o-transform .4s;transition:opacity 0.4s,transform .4s}
.he_border2 .he_border2_caption::before{top:14%;right:5%;bottom:14%;left:5%;border-top:1px solid #fff;border-bottom:1px solid #fff;-webkit-transform:scale(0,1);-moz-transform:scale(0,1);-o-transform:scale(0,1);transform:scale(0,1);-webkit-transform-origin:0 0;-moz-transform-origin:0 0;-o-transform-origin:0 0;transform-origin:0 0}
.he_border2 .he_border2_caption::after{top:8%;right:10%;bottom:8%;left:10%;border-right:1px solid #fff;border-left:1px solid #fff;-webkit-transform:scale(1,0);-moz-transform:scale(1,0);-o-transform:scale(1,0);transform:scale(1,0);-webkit-transform-origin:100% 0;-moz-transform-origin:100% 0;-o-transform-origin:100% 0;transform-origin:100% 0}
.he_border2:hover .he_border2_caption::before,.he_border2:hover .he_border2_caption::after{opacity:1;-webkit-transform:scale(1);-moz-transform:scale(1);-o-transform:scale(1);transform:scale(1)}
.he_border2 .he_border2_caption,.he_border2 .he_border2_caption > a{position:absolute;top:0;left:0;width:100%;height:100%;-webkit-transition:all .4s ease-in-out;-moz-transition:all .4s ease-in-out;-o-transition:all .4s ease-in-out;-ms-transition:all .4s ease-in-out;transition:all .4s ease-in-out;overflow:hidden; z-index:1000}
.he_border2 .he_border2_caption_h{font-size:1.3em;font-weight:700;text-align:center;width:80%;position:absolute;top:20%;left:10%;-webkit-transition:all .5s ease-in-out;-moz-transition:all .5s ease-in-out;-o-transition:all .5s ease-in-out;-ms-transition:all .5s ease-in-out;transition:all .5s ease-in-out;overflow:hidden;opacity:1}
.he_border2 .he_border2_caption_p{font-size:2em;text-align:center;width:80%;position:absolute;top:60%;left:10%;-webkit-transition:all .4s ease-in-out;-moz-transition:all .4s ease-in-out;-o-transition:all .4s ease-in-out;-ms-transition:all .4s ease-in-out;transition:all .4s ease-in-out;overflow:hidden;opacity:0;color: #F3F3F3;}
.he_border2:hover .he_border2_caption_p{top:45%;opacity:1}
/*slideAllDown*/
.he_slideAllDown{background:#fe7253;width:240px;height:240px;padding:0;margin:0;border:1px solid #000;position:relative;box-sizing:border-box;cursor:pointer;-webkit-transition:all .4s ease-in-out;-moz-transition:all .4s ease-in-out;-o-transition:all .4s ease-in-out;-ms-transition:all .4s ease-in-out;transition:all .4s ease-in-out;overflow:hidden}
.he_slideAllDown .he_slideAllDown_img{position:relative;display:block;width:100%;padding:0;margin:0;opacity:.9;-webkit-transition:all .4s ease-in-out;-moz-transition:all .4s ease-in-out;-o-transition:all .4s ease-in-out;-ms-transition:all .4s ease-in-out;transition:all .4s ease-in-out;overflow:hidden}
.he_slideAllDown:hover .he_slideAllDown_img{opacity:1;-webkit-transform:translate3d(0,100%,0);-moz-transform:translate3d(0,100%,0);-o-transform:translate3d(0,100%,0);-ms-transform:translate3d(0,100%,0);transform:translate3d(0,100%,0)}
.he_slideAllDown .he_slideAllDown_caption{color:#fff;-moz-backface-visibility:hidden;-webkit-backface-visibility:hidden;backface-visibility:hidden;-webkit-transition:all .4s ease-in-out;-moz-transition:all .4s ease-in-out;-o-transition:all .4s ease-in-out;-ms-transition:all .4s ease-in-out;transition:all .4s ease-in-out;overflow:hidden}
.he_slideAllDown .he_slideAllDown_caption,.he_slideAllDown .he_slideAllDown_caption > a{position:absolute;top:0;left:0;width:100%;height:100%;padding:0;margin:0;-webkit-transition:all .4s ease-in-out;-moz-transition:all .4s ease-in-out;-o-transition:all .4s ease-in-out;-ms-transition:all .4s ease-in-out;transition:all .4s ease-in-out;overflow:hidden}
.he_slideAllDown .he_slideAllDown_caption_h{font-size:1.3em;font-weight:700;text-align:center;width:80%;position:absolute;top:-50%;left:10%;-webkit-transition:all .5s ease-in-out;-moz-transition:all .5s ease-in-out;-o-transition:all .5s ease-in-out;-ms-transition:all .5s ease-in-out;transition:all .5s ease-in-out;overflow:hidden;opacity:0}
.he_slideAllDown:hover .he_slideAllDown_caption_h{color:#fff;top:25%;opacity:1}
.he_slideAllDown .he_slideAllDown_caption_p{font-size:1em;text-align:center;width:80%;position:absolute;top:-50%;left:10%;-webkit-transition:all .6s ease-in-out;-moz-transition:all .6s ease-in-out;-o-transition:all .6s ease-in-out;-ms-transition:all .6s ease-in-out;transition:all .6s ease-in-out;overflow:hidden;opacity:0}
.he_slideAllDown:hover .he_slideAllDown_caption_p{color:#fff;top:45%;opacity:1}
/*navbar*/
nav {
  z-index: 10;
	font-family: 'Youyuan', sans-serif;
  display: block;
  position: fixed;
  width: 500px;
  height: 500px;
  -webkit-user-select: none;
     -moz-user-select: none;
      -ms-user-select: none;
          user-select: none;
  -webkit-transform: translate3d(25px, -25px, 0);
          transform: translate3d(25px, -25px, 0);
  -webkit-transition: -webkit-transform 0.5s cubic-bezier(0.3, 1.4, 0.5, 0.9);
  transition: -webkit-transform 0.5s cubic-bezier(0.3, 1.4, 0.5, 0.9);
  transition: transform 0.5s cubic-bezier(0.3, 1.4, 0.5, 0.9);
  transition: transform 0.5s cubic-bezier(0.3, 1.4, 0.5, 0.9), -webkit-transform 0.5s cubic-bezier(0.3, 1.4, 0.5, 0.9);
}
nav a{
	text-decoration:none;
	color: #000000;
	font-family: 'Youyuan', sans-serif;
}
nav a:hover{
	text-decoration:none;
	font-family: 'Microsoft YaHei', sans-serif;
}
nav.open {
  -webkit-transform: translate3d(0, 0, 0);
          transform: translate3d(0, 0, 0);
}
nav.top-right {
  top: -140px;
  right: -140px;
}
.disc {
  position: absolute;
  display: inline-block;
  text-align: center;
  cursor: pointer;
  font: 25px Alegreya Sans, sans-serif;
  line-height: 40px;
  padding-top: 10px;
  border-radius: 250px;
  -webkit-transform: scale3d(0.5, 0.5, 0.5) rotate3d(0, 0, 1, 190deg);
          transform: scale3d(0.5, 0.5, 0.5) rotate3d(0, 0, 1, 190deg);
  pointer-events: none;
  opacity: 0;
  cursor: pointer;
  -webkit-transition: opacity 0.5s, -webkit-transform 0.5s cubic-bezier(0.3, 1.4, 0.5, 0.9);
  transition: opacity 0.5s, -webkit-transform 0.5s cubic-bezier(0.3, 1.4, 0.5, 0.9);
  transition: transform 0.5s cubic-bezier(0.3, 1.4, 0.5, 0.9), opacity 0.5s;
  transition: transform 0.5s cubic-bezier(0.3, 1.4, 0.5, 0.9), opacity 0.5s, -webkit-transform 0.5s cubic-bezier(0.3, 1.4, 0.5, 0.9);
}
.disc div {
  -webkit-transform: rotate(180deg);
          transform: rotate(180deg);
}
.disc_current1{
	color:tomato;
}
.disc_current2{
	color:#ff7a39;
}
.disc_current3{
	color:#ff912b;
}
.disc_current4{
	color:#ffa91c;
}
.open .disc {
  pointer-events: auto;
  opacity: 1;
}

.l1 {
  top: 0px;
  left: 0px;
  right: 0px;
  bottom: 0px;
  background: tomato;
  -webkit-transition-delay: 0s;
          transition-delay: 0s;
}
.open .l1 {
  -webkit-transition-delay: 0s;
          transition-delay: 0s;
  -webkit-transform: scale3d(1, 1, 1) rotate3d(0, 0, 1, 190deg);
          transform: scale3d(1, 1, 1) rotate3d(0, 0, 1, 190deg);
  opacity: 1;
}
.open .l1:hover {
  background: #1a0a07;
  color: tomato;
  -webkit-transition-delay: 0s;
          transition-delay: 0s;
}
.open .l1:active {
  background: #803224;
  color: tomato;
}
.open .l1.toggle {
  -webkit-transform: scale3d(0.9, 0.9, 0.9) rotate3d(0, 0, 1, 10deg);
          transform: scale3d(0.9, 0.9, 0.9) rotate3d(0, 0, 1, 10deg);
}

.l2 {
  top: 50px;
  left: 50px;
  right: 50px;
  bottom: 50px;
  background: #ff7a39;
  -webkit-transition-delay: 0.1s;
          transition-delay: 0.1s;
}
.open .l2 {
  -webkit-transition-delay: 0.1s;
          transition-delay: 0.1s;
  -webkit-transform: scale3d(1, 1, 1) rotate3d(0, 0, 1, 190deg);
          transform: scale3d(1, 1, 1) rotate3d(0, 0, 1, 190deg);
  opacity: 1;
}
.open .l2:hover {
  background: #1a0c06;
  color: #ff7a39;
  -webkit-transition-delay: 0s;
          transition-delay: 0s;
}
.open .l2:active {
  background: #803d1d;
  color: #ff7a39;
}
.open .l2.toggle {
  -webkit-transform: scale3d(0.9, 0.9, 0.9) rotate3d(0, 0, 1, 10deg);
          transform: scale3d(0.9, 0.9, 0.9) rotate3d(0, 0, 1, 10deg);
}

.l3 {
  top: 100px;
  left: 100px;
  right: 100px;
  bottom: 100px;
  background: #ff912b;
  -webkit-transition-delay: 0.2s;
          transition-delay: 0.2s;
}
.open .l3 {
  -webkit-transition-delay: 0.2s;
          transition-delay: 0.2s;
  -webkit-transform: scale3d(1, 1, 1) rotate3d(0, 0, 1, 190deg);
          transform: scale3d(1, 1, 1) rotate3d(0, 0, 1, 190deg);
  opacity: 1;
}
.open .l3:hover {
  background: #1a0f04;
  color: #ff912b;
  -webkit-transition-delay: 0s;
          transition-delay: 0s;
}
.open .l3:active {
  background: #804916;
  color: #ff912b;
}
.open .l3.toggle {
  -webkit-transform: scale3d(0.9, 0.9, 0.9) rotate3d(0, 0, 1, 10deg);
          transform: scale3d(0.9, 0.9, 0.9) rotate3d(0, 0, 1, 10deg);
}

.l4 {
  top: 150px;
  left: 150px;
  right: 150px;
  bottom: 150px;
  background: #ffa91c;
  -webkit-transition-delay: 0.3s;
          transition-delay: 0.3s;
}
.open .l4 {
  -webkit-transition-delay: 0.3s;
          transition-delay: 0.3s;
  -webkit-transform: scale3d(1, 1, 1) rotate3d(0, 0, 1, 190deg);
          transform: scale3d(1, 1, 1) rotate3d(0, 0, 1, 190deg);
  opacity: 1;
}
.open .l4:hover {
  background: #1a1103;
  color: #ffa91c;
  -webkit-transition-delay: 0s;
          transition-delay: 0s;
}
.open .l4:active {
  background: #80550e;
  color: #ffa91c;
}
.open .l4.toggle {
  -webkit-transform: scale3d(0.9, 0.9, 0.9) rotate3d(0, 0, 1, 10deg);
          transform: scale3d(0.9, 0.9, 0.9) rotate3d(0, 0, 1, 10deg);
}

.l5 {
  top: 200px;
  left: 200px;
  right: 200px;
  bottom: 200px;
  background: #ffc00e;
  -webkit-transition-delay: 0.4s;
          transition-delay: 0.4s;
}
.open .l5 {
  -webkit-transition-delay: 0.4s;
          transition-delay: 0.4s;
  -webkit-transform: scale3d(1, 1, 1) rotate3d(0, 0, 1, 190deg);
          transform: scale3d(1, 1, 1) rotate3d(0, 0, 1, 190deg);
  opacity: 1;
}
.open .l5:hover {
  background: #1a1301;
  color: #ffc00e;
  -webkit-transition-delay: 0s;
          transition-delay: 0s;
}
.open .l5:active {
  background: #806007;
  color: #ffc00e;
}
.open .l5.toggle {
  -webkit-transform: scale3d(0.9, 0.9, 0.9) rotate3d(0, 0, 1, 10deg);
          transform: scale3d(0.9, 0.9, 0.9) rotate3d(0, 0, 1, 10deg);
}

.toggle {
  line-height: 100px;
  padding: 0;
  width: 100px;
  background: gold;
  opacity: 1;
  -webkit-transform: none;
          transform: none;
  pointer-events: auto;
  -webkit-transition-delay: 0s;
          transition-delay: 0s;
}
.open .toggle {
  -webkit-transform: rotate3d(0, 0, 1, 0deg);
          transform: rotate3d(0, 0, 1, 0deg);
}
.toggle:hover {
  background: #1a1600;
  color: gold;
}
.toggle:active {
  background: #806c00;
  color: rgba(255, 215, 0, 0.5);
  -webkit-transform: scale(0.9);
          transform: scale(0.9);
  -webkit-transition-duration: 0s;
          transition-duration: 0s;
}
/*-- //footer --*/
.footer {
    background: #333;
	padding:4em 0;
}
.agileits_w3layouts_footer_grid {
    border-left: 1px solid #333;
    background: #333;
    text-align: center;
    padding: 20px 0;
}
.agileits_w3layouts_footer_grid h3{
	font-size:1.5em;
	color:#ffc168;
	text-transform:capitalize;
	margin-bottom:1em;
	font-weight:700;
}
.agileits_w3layouts_footer_grid ul li {
    display: inline-block;
    color: #fff;
	margin-bottom:.5em;
    text-transform: capitalize;
}
.agileits_w3layouts_footer_grid ul li span{
	font-weight:600;
}
.agileits_w3layouts_footer_grid p{
	color:#fff;
}
.agileits_w3layouts_footer_grid p i{
	display:block;
	font-style:normal;
	margin:.5em 0 0;
}
.w3_agileits_footer_grids{
	margin:5em 0 0;
}
.w3_agileits_footer_grid p{
	color:#fff;
	line-height:2em;
}
.w3_agileits_footer_grid h3{
	font-size: 1.5em;
    color: #ffc168;
    text-transform: capitalize;
    padding-left: 4em;
    position: relative;
}
.w3_agileits_footer_grid h3:before{
	content: '';
    background: #ffc168;
    height: 2px;
    width: 20%;
    position: absolute;
    left: 0%;
    top: 53%;
}
.w3_agileits_footer_grid h4{
	font-size: 1em;
    letter-spacing: 2px;
	color:#fff;
	margin:1.5em 0;
	text-transform:uppercase;
}
.w3_agileits_footer_grid ul li{
	display:block;
	color:#999;
}
.w3_agileits_footer_grid ul li span{
	font-weight:600;
	display:inline-block;
}
.w3_agileits_footer_grid ul li:first-child{
	margin-bottom:.5em;
}
.w3_agileits_footer_grid form {
    padding: 15px 15px 15px 25px;
    border: 1px solid #fff;
	margin: 2em 0 0;
}
.w3_agileits_footer_grid input[type="email"] {
    outline: none;
    border: none;
    color: #fff;
    font-size: 14px;
     width:73%;
    background: none;
    font-weight: bold;
}
.w3_agileits_footer_grid input[type="submit"] {
    outline: none;
    border: none;
    width: 25%;
    background: #3369e7;
    padding: 7px 6px;
    color: #fff;
    letter-spacing: 1px;
    font-weight: 600;
}
.w3_agileits_footer_grid input[type="submit"]:hover {
    background: #ffc168;
	}
.wthree_copy_right{
    padding-bottom: 1.5em;
    background: #333;
    text-align: center;
}
.wthree_copy_right p{
    color: #fff;
    line-height: 2em;
    letter-spacing: 2px;
    font-size: 13px;
}
.wthree_copy_right p a{
	color:#ffc168;
	text-decoration:noen;
}
.wthree_copy_right p a:hover{
	color:#fff;
}
/*-- //footer --*/
</style>	
</head>
<body>
	<div class="container-fluid">
	<!-- 页头 -->
	<div class="row" style="height: 60px;min-height: 60px;background: #333333;"></div>		
	<!--封面轮播-->
	<div class="row  cover">
		  <div class="col-md-12">
		    <div id="myCarousel" class="carousel slide">
		      <!-- 轮播（Carousel）指标 -->
		      <ol class="carousel-indicators">
		        <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
		        <li data-target="#myCarousel" data-slide-to="1"></li>
		        <li data-target="#myCarousel" data-slide-to="2"></li>
				  <li data-target="#myCarousel" data-slide-to="3"></li>
	          </ol>
		      <!-- 轮播（Carousel）项目 -->
		      <div class="carousel-inner">
		        <div class="item active"> <img src="image/cover1.jpg" alt="First slide"></div>
		        <div class="item"> <img src="image/cover2.jpg" alt="Second slide"></div>
				  <div class="item"> <img src="image/cover3.jpg" alt="Third slide"></div>
		        <div class="item"> <img src="image/cover4.jpg" alt="Forth slide"></div>
	          </div>
		      <!-- 轮播（Carousel）导航 -->
	          <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
        	  <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
              <span class="sr-only">Previous</span>
    		  </a>
              <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
              <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
              <span class="sr-only">Next</span>
              </a>
			 </div>
	      </div>
	  </div><!-- 轮播结束 -->
	<!-- 歌单推荐 -->
	  <div class="row  recommend"  >
	    <div class="slide_title">
			<h1>歌单推荐</h1>
		  </div> 
		  <div class="col-md-12">  
		    <div id="cover_slide" class="carousel slide"> 
		      <!-- 轮播（Carousel）指标 -->
		      <ol class="carousel-indicators">
		        <li data-target="#cover_slide" data-slide-to="0" class="active"></li>
		        <li data-target="#cover_slide" data-slide-to="1"></li>
		        <li data-target="#cover_slide" data-slide-to="2"></li>
	          </ol>
		      <!-- 轮播（Carousel）项目 -->
		      <div class="carousel-inner">
				  <!--p1-->
		        <div class="item active" style="height: 460px;"> 	
					<div class="slide_img">
						<div style="height: 70px;"></div> 
						<div class="row slide_img_content" style="text-align: center;">
						  <div class="col-md-1"> </div>
							<div class="col-md-2">
								<!--he_border2类是控制图片动态效果的类-->
							  <div class="box">
								  <div class="he_border2"> <img class="he_border2_img" src="image/rec_a1.jpg" alt="欧美：让这些好听的英文歌俘获你的耳朵" width="240px" height="240px"/>
								    <div class="he_border2_caption">
								      <p class="he_border2_caption_p">查看歌单</p>
								      <a class="he_border2_caption_a" href="#"></a> </div>
							      </div>
							  </div>
								<p align="left">欧美：让这些好听的英文歌俘获你的耳朵 <br>
									<by>by  岸浪情拍</by></p>								
							</div>
							<div class="col-md-2">
								<div class="he_border2"> <img class="he_border2_img" src="image/rec_a2.jpg" alt="糖果电音 | 恋爱浪潮 充满甜美气息的糖果歌" width="240px" height="240px"/>
								    <div class="he_border2_caption">
								      <p class="he_border2_caption_p">查看歌单</p>
								      <a class="he_border2_caption_a" href="#"></a> </div>
						      </div>
								<p align="left">糖果电音 | 恋爱浪潮 充满甜美气息的糖果歌 <br>
									<by>by  Jason3bear</by></p>
							</div>
							<div class="col-md-2">
								<div class="he_border2"> <img class="he_border2_img" src="image/rec_a3.jpg" alt="盯鞋散集 I 自赏孤芳，缱绻时光" width="240px" height="240px"/>
								    <div class="he_border2_caption">
								      <p class="he_border2_caption_p">查看歌单</p>
								      <a class="he_border2_caption_a" href="#"></a> </div>
						      </div>
								<p align="left">盯鞋散集 I 自赏孤芳，缱绻时光 <br>
									<by>by  ChrisZen</by></p>
							</div>
							<div class="col-md-2">
								<div class="he_border2"> <img class="he_border2_img" src="image/rec_a4.jpg" alt="Blackstar" width="240px" height="240px"/>
								    <div class="he_border2_caption">
								      <p class="he_border2_caption_p">查看歌单</p>
								      <a class="he_border2_caption_a" href="#"></a> </div>
						      </div>
								<p align="left">Blackstar<br>
									<by>by  David Bowie</by></p>
							</div>
							<div class="col-md-2">
								<div class="he_border2"> <img class="he_border2_img" src="image/rec_a5.jpg" alt="Gore" width="240px" height="240px"/>
								    <div class="he_border2_caption">
								      <p class="he_border2_caption_p">查看歌单</p>
								      <a class="he_border2_caption_a" href="#"></a> </div>
						      </div>
								<p align="left">Gore <br>
									<by>by  Deftones</by></p>
							</div>
							<div class="col-md-1">
							</div>
						</div>
					</div>
			    </div>
				  <!--p2-->
		        <div class="item" style="height: 460px;"> 
					<div class="slide_img">
						<div style="height: 70px;"></div> 
						<div class="row slide_img_content" style="text-align: center;">
						  <div class="col-md-1"> </div>
							<div class="col-md-2">
								<!--he_border2类是控制图片动态效果的类-->
							  <div class="box">
								  <div class="he_border2"> <img class="he_border2_img" src="image/rec_a1.jpg" alt="欧美：让这些好听的英文歌俘获你的耳朵" width="240px" height="240px"/>
								    <div class="he_border2_caption">
								      <p class="he_border2_caption_p">查看歌单</p>
								      <a class="he_border2_caption_a" href="#"></a> </div>
							      </div>
							  </div>
								<p align="left">欧美：让这些好听的英文歌俘获你的耳朵 <br>
									<by>by  岸浪情拍</by></p>								
							</div>
							<div class="col-md-2">
								
								<div class="he_border2"> <img class="he_border2_img" src="image/rec_a2.jpg" alt="糖果电音 | 恋爱浪潮 充满甜美气息的糖果歌" width="240px" height="240px"/>
								    <div class="he_border2_caption">
								      <p class="he_border2_caption_p">查看歌单</p>
								      <a class="he_border2_caption_a" href="#"></a> </div>
						      </div>
								<p align="left">糖果电音 | 恋爱浪潮 充满甜美气息的糖果歌 <br>
									<by>by  Jason3bear</by></p>
							</div>
							<div class="col-md-2">
								<div class="he_border2"> <img class="he_border2_img" src="image/rec_a3.jpg" alt="盯鞋散集 I 自赏孤芳，缱绻时光" width="240px" height="240px"/>
								    <div class="he_border2_caption">
								      <p class="he_border2_caption_p">查看歌单</p>
								      <a class="he_border2_caption_a" href="#"></a> </div>
						      </div>
								<p align="left">盯鞋散集 I 自赏孤芳，缱绻时光 <br>
									<by>by  ChrisZen</by></p>
							</div>
							<div class="col-md-2">
								<div class="he_border2"> <img class="he_border2_img" src="image/rec_a4.jpg" alt="Blackstar" width="240px" height="240px"/>
								    <div class="he_border2_caption">
								      <p class="he_border2_caption_p">查看歌单</p>
								      <a class="he_border2_caption_a" href="#"></a> </div>
						      </div>
								<p align="left">Blackstar<br>
									<by>by  David Bowie</by></p>
							</div>
							<div class="col-md-2">
								<div class="he_border2"> <img class="he_border2_img" src="image/rec_a5.jpg" alt="Gore" width="240px" height="240px"/>
								    <div class="he_border2_caption">
								      <p class="he_border2_caption_p">查看歌单</p>
								      <a class="he_border2_caption_a" href="#"></a> </div>
						      </div>
								<p align="left">Gore <br>
									<by>by  Deftones</by></p>
							</div>
							<div class="col-md-1">
							</div>
						</div>
					</div>
			    </div>
				 <!--p3-->
		        <div class="item" style="height: 460px;"> 
					<div class="slide_img">
						<div style="height: 70px;"></div> 
						<div class="row slide_img_content" style="text-align: center;">
						  <div class="col-md-1"> </div>
							<div class="col-md-2">
								<!--he_border2类是控制图片动态效果的类-->
							  <div class="box">
								  <div class="he_border2"> <img class="he_border2_img" src="image/rec_a1.jpg" alt="欧美：让这些好听的英文歌俘获你的耳朵" width="240px" height="240px"/>
								    <div class="he_border2_caption">
								      <p class="he_border2_caption_p">查看歌单</p>
								      <a class="he_border2_caption_a" href="#"></a> </div>
							      </div>
							  </div>
								<p align="left">欧美：让这些好听的英文歌俘获你的耳朵 <br>
									<by>by  岸浪情拍</by></p>								
							</div>
							<div class="col-md-2">
								<div class="he_border2"> <img class="he_border2_img" src="image/rec_a2.jpg" alt="糖果电音 | 恋爱浪潮 充满甜美气息的糖果歌" width="240px" height="240px"/>
								    <div class="he_border2_caption">
								      <p class="he_border2_caption_p">查看歌单</p>
								      <a class="he_border2_caption_a" href="#"></a> </div>
						      </div>
								<p align="left">糖果电音 | 恋爱浪潮 充满甜美气息的糖果歌 <br>
									<by>by  Jason3bear</by></p>
							</div>
							<div class="col-md-2">
								<div class="he_border2"> <img class="he_border2_img" src="image/rec_a3.jpg" alt="盯鞋散集 I 自赏孤芳，缱绻时光" width="240px" height="240px"/>
								    <div class="he_border2_caption">
								      <p class="he_border2_caption_p">查看歌单</p>
								      <a class="he_border2_caption_a" href="#"></a> </div>
						      </div>
								<p align="left">盯鞋散集 I 自赏孤芳，缱绻时光 <br>
									<by>by  ChrisZen</by></p>
							</div>
							<div class="col-md-2">
								<div class="he_border2"> <img class="he_border2_img" src="image/rec_a4.jpg" alt="Blackstar" width="240px" height="240px"/>
								    <div class="he_border2_caption">
								      <p class="he_border2_caption_p">查看歌单</p>
								      <a class="he_border2_caption_a" href="#"></a> </div>
						      </div>
								<p align="left">Blackstar<br>
									<by>by  David Bowie</by></p>
							</div>
							<div class="col-md-2">
								<div class="he_border2"> <img class="he_border2_img" src="image/rec_a5.jpg" alt="Gore" width="240px" height="240px"/>
								    <div class="he_border2_caption">
								      <p class="he_border2_caption_p">查看歌单</p>
								      <a class="he_border2_caption_a" href="#"></a> </div>
						      </div>
								<p align="left">Gore <br>
									<by>by  Deftones</by></p>
							</div>
							<div class="col-md-1">
							</div>
						</div>
					</div>
			    </div>
	          </div>
		      <!-- 轮播（Carousel）导航 -->
		    </div>
		</div>
	  </div><!-- 歌单推荐结束 -->
	<!--新碟上架-->
	  <div class="row newAlbum"  >
	    <div class="slide_title">
	      <h1>新碟上架</h1>
      </div>
      <div class="col-md-12">
	      <div id="cover_slide2" class="carousel slide">
	        <!-- 轮播（Carousel）指标 -->
	        <ol class="carousel-indicators">
	          <li data-target="#cover_slide" data-slide-to="0" class="active"></li>
	          <li data-target="#cover_slide" data-slide-to="1"></li>
	          <li data-target="#cover_slide" data-slide-to="2"></li>
            </ol>
	        <!-- 轮播（Carousel）项目 -->
	        <div class="carousel-inner">
	          <!--p1-->
	          <div class="item active" style="height: 460px;">
	            <div class="slide_img">
	              <div style="height: 70px;"></div>
	              <div class="row slide_img_content" style="text-align: center;">
	                <div class="col-md-1"> </div>
	                <div class="col-md-2">
	                  <!--he_border2类是控制图片动态效果的类-->
	                  <div class="box">
	                    <div class="he_border2"> <img class="he_border2_img" src="image/rec_a1.jpg" alt="欧美：让这些好听的英文歌俘获你的耳朵" width="240px" height="240px"/>
	                      <div class="he_border2_caption">
	                        <p class="he_border2_caption_p">查看歌单</p>
	                        <a class="he_border2_caption_a" href="#"></a></div>
                        </div>
                      </div>
	                  <p align="left">欧美：让这些好听的英文歌俘获你的耳朵 <br>
	                    <by>by  岸浪情拍</by>
                      </p>
                    </div>
	                <div class="col-md-2">
	                  <div class="he_border2"> <img class="he_border2_img" src="image/rec_a2.jpg" alt="糖果电音 | 恋爱浪潮 充满甜美气息的糖果歌" width="240px" height="240px"/>
	                    <div class="he_border2_caption">
	                      <p class="he_border2_caption_p">查看歌单</p>
	                      <a class="he_border2_caption_a" href="#"></a></div>
                      </div>
	                  <p align="left">糖果电音 | 恋爱浪潮 充满甜美气息的糖果歌 <br>
	                    <by>by  Jason3bear</by>
                      </p>
                    </div>
	                <div class="col-md-2">
	                  <div class="he_border2"> <img class="he_border2_img" src="image/rec_a3.jpg" alt="盯鞋散集 I 自赏孤芳，缱绻时光" width="240px" height="240px"/>
	                    <div class="he_border2_caption">
	                      <p class="he_border2_caption_p">查看歌单</p>
	                      <a class="he_border2_caption_a" href="#"></a></div>
                      </div>
	                  <p align="left">盯鞋散集 I 自赏孤芳，缱绻时光 <br>
	                    <by>by  ChrisZen</by>
                      </p>
                    </div>
	                <div class="col-md-2">
	                  <div class="he_border2"> <img class="he_border2_img" src="image/rec_a4.jpg" alt="Blackstar" width="240px" height="240px"/>
	                    <div class="he_border2_caption">
	                      <p class="he_border2_caption_p">查看歌单</p>
	                      <a class="he_border2_caption_a" href="#"></a></div>
                      </div>
	                  <p align="left">Blackstar<br>
	                    <by>by  David Bowie</by>
                      </p>
                    </div>
	                <div class="col-md-2">
	                  <div class="he_border2"> <img class="he_border2_img" src="image/rec_a5.jpg" alt="Gore" width="240px" height="240px"/>
	                    <div class="he_border2_caption">
	                      <p class="he_border2_caption_p">查看歌单</p>
	                      <a class="he_border2_caption_a" href="#"></a></div>
                      </div>
	                  <p align="left">Gore <br>
	                    <by>by  Deftones</by>
                      </p>
                    </div>
	                <div class="col-md-1"></div>
                  </div>
                </div>
              </div>
	          <!--p2-->
	          <div class="item" style="height: 460px;">
	            <div class="slide_img">
	              <div style="height: 70px;"></div>
	              <div class="row slide_img_content" style="text-align: center;">
	                <div class="col-md-1"> </div>
	                <div class="col-md-2">
	                  <!--he_border2类是控制图片动态效果的类-->
	                  <div class="box">
	                    <div class="he_border2"> <img class="he_border2_img" src="image/rec_a1.jpg" alt="欧美：让这些好听的英文歌俘获你的耳朵" width="240px" height="240px"/>
	                      <div class="he_border2_caption">
	                        <p class="he_border2_caption_p">查看歌单</p>
	                        <a class="he_border2_caption_a" href="#"></a></div>
                        </div>
                      </div>
	                  <p align="left">欧美：让这些好听的英文歌俘获你的耳朵 <br>
	                    <by>by  岸浪情拍</by>
                      </p>
                    </div>
	                <div class="col-md-2">
	                  <div class="he_border2"> <img class="he_border2_img" src="image/rec_a2.jpg" alt="糖果电音 | 恋爱浪潮 充满甜美气息的糖果歌" width="240px" height="240px"/>
	                    <div class="he_border2_caption">
	                      <p class="he_border2_caption_p">查看歌单</p>
	                      <a class="he_border2_caption_a" href="#"></a></div>
                      </div>
	                  <p align="left">糖果电音 | 恋爱浪潮 充满甜美气息的糖果歌 <br>
	                    <by>by  Jason3bear</by>
                      </p>
                    </div>
	                <div class="col-md-2">
	                  <div class="he_border2"> <img class="he_border2_img" src="image/rec_a3.jpg" alt="盯鞋散集 I 自赏孤芳，缱绻时光" width="240px" height="240px"/>
	                    <div class="he_border2_caption">
	                      <p class="he_border2_caption_p">查看歌单</p>
	                      <a class="he_border2_caption_a" href="#"></a></div>
                      </div>
	                  <p align="left">盯鞋散集 I 自赏孤芳，缱绻时光 <br>
	                    <by>by  ChrisZen</by>
                      </p>
                    </div>
	                <div class="col-md-2">
	                  <div class="he_border2"> <img class="he_border2_img" src="image/rec_a4.jpg" alt="Blackstar" width="240px" height="240px"/>
	                    <div class="he_border2_caption">
	                      <p class="he_border2_caption_p">查看歌单</p>
	                      <a class="he_border2_caption_a" href="#"></a></div>
                      </div>
	                  <p align="left">Blackstar<br>
	                    <by>by  David Bowie</by>
                      </p>
                    </div>
	                <div class="col-md-2">
	                  <div class="he_border2"> <img class="he_border2_img" src="image/rec_a5.jpg" alt="Gore" width="240px" height="240px"/>
	                    <div class="he_border2_caption">
	                      <p class="he_border2_caption_p">查看歌单</p>
	                      <a class="he_border2_caption_a" href="#"></a></div>
                      </div>
	                  <p align="left">Gore <br>
	                    <by>by  Deftones</by>
                      </p>
                    </div>
	                <div class="col-md-1"></div>
                  </div>
                </div>
              </div>
	          <!--p3-->
	          <div class="item" style="height: 460px;">
	            <div class="slide_img">
	              <div style="height: 70px;"></div>
	              <div class="row slide_img_content" style="text-align: center;">
	                <div class="col-md-1"> </div>
	                <div class="col-md-2">
	                  <!--he_border2类是控制图片动态效果的类-->
	                  <div class="box">
	                    <div class="he_border2"> <img class="he_border2_img" src="image/rec_a1.jpg" alt="欧美：让这些好听的英文歌俘获你的耳朵" width="240px" height="240px"/>
	                      <div class="he_border2_caption">
	                        <p class="he_border2_caption_p">查看歌单</p>
	                        <a class="he_border2_caption_a" href="#"></a></div>
                        </div>
                      </div>
	                  <p align="left">欧美：让这些好听的英文歌俘获你的耳朵 <br>
	                    <by>by  岸浪情拍</by>
                      </p>
                    </div>
	                <div class="col-md-2">
	                  <div class="he_border2"> <img class="he_border2_img" src="image/rec_a2.jpg" alt="糖果电音 | 恋爱浪潮 充满甜美气息的糖果歌" width="240px" height="240px"/>
	                    <div class="he_border2_caption">
	                      <p class="he_border2_caption_p">查看歌单</p>
	                      <a class="he_border2_caption_a" href="#"></a></div>
                      </div>
	                  <p align="left">糖果电音 | 恋爱浪潮 充满甜美气息的糖果歌 <br>
	                    <by>by  Jason3bear</by>
                      </p>
                    </div>
	                <div class="col-md-2">
	                  <div class="he_border2"> <img class="he_border2_img" src="image/rec_a3.jpg" alt="盯鞋散集 I 自赏孤芳，缱绻时光" width="240px" height="240px"/>
	                    <div class="he_border2_caption">
	                      <p class="he_border2_caption_p">查看歌单</p>
	                      <a class="he_border2_caption_a" href="#"></a></div>
                      </div>
	                  <p align="left">盯鞋散集 I 自赏孤芳，缱绻时光 <br>
	                    <by>by  ChrisZen</by>
                      </p>
                    </div>
	                <div class="col-md-2">
	                  <div class="he_border2"> <img class="he_border2_img" src="image/rec_a4.jpg" alt="Blackstar" width="240px" height="240px"/>
	                    <div class="he_border2_caption">
	                      <p class="he_border2_caption_p">查看歌单</p>
	                      <a class="he_border2_caption_a" href="#"></a></div>
                      </div>
	                  <p align="left">Blackstar<br>
	                    <by>by  David Bowie</by>
                      </p>
                    </div>
	                <div class="col-md-2">
	                  <div class="he_border2"> <img class="he_border2_img" src="image/rec_a5.jpg" alt="Gore" width="240px" height="240px"/>
	                    <div class="he_border2_caption">
	                      <p class="he_border2_caption_p">查看歌单</p>
	                      <a class="he_border2_caption_a" href="#"></a></div>
                      </div>
	                  <p align="left">Gore <br>
	                    <by>by  Deftones</by>
                      </p>
                    </div>
	                <div class="col-md-1"></div>
                  </div>
                </div>
              </div>
            </div>
	        <!-- 轮播（Carousel）导航 -->
          </div>
      </div>
	</div>
	<!--新曲首发-->
	  <div class="row newSong" >
	    <div class="slide_title">
	      <h1 style="color: #515151;">新曲首发</h1>
      </div>
	    <div class="col-md-12">
	      <div id="cover_slide3" class="carousel slide">
	        <!-- 轮播（Carousel）指标 -->
	        <ol class="carousel-indicators">
	          <li data-target="#cover_slide" data-slide-to="0" class="active"></li>
	          <li data-target="#cover_slide" data-slide-to="1"></li>
	          <li data-target="#cover_slide" data-slide-to="2"></li>
            </ol>
	        <!-- 轮播（Carousel）项目 -->
	        <div class="carousel-inner">
	          <!--p1-->
	          <div class="item active" style="height: 460px;">
	            <div class="slide_img">
	              <div style="height: 70px;"></div>
	              <div class="row slide_img_content" style="text-align: center;">
	                <div class="col-md-1"> </div>
	                <div class="col-md-2">
	                  <!--he_border2类是控制图片动态效果的类-->
	                  <div class="box">
	                    <div class="he_border2"> <img class="he_border2_img" src="image/rec_a1.jpg" alt="欧美：让这些好听的英文歌俘获你的耳朵" width="240px" height="240px"/>
	                      <div class="he_border2_caption">
	                        <p class="he_border2_caption_p">播放</p>
	                        <a class="he_border2_caption_a" href="#"></a></div>
                        </div>
                      </div>
	                  <p align="left">欧美：让这些好听的英文歌俘获你的耳朵 <br>
	                    <by>by  岸浪情拍</by>
                      </p>
                    </div>
	                <div class="col-md-2">
	                  <div class="he_border2"> <img class="he_border2_img" src="image/rec_a2.jpg" alt="糖果电音 | 恋爱浪潮 充满甜美气息的糖果歌" width="240px" height="240px"/>
	                    <div class="he_border2_caption">
	                      <p class="he_border2_caption_p">播放</p>
	                      <a class="he_border2_caption_a" href="#"></a></div>
                      </div>
	                  <p align="left">糖果电音 | 恋爱浪潮 充满甜美气息的糖果歌 <br>
	                    <by>by  Jason3bear</by>
                      </p>
                    </div>
	                <div class="col-md-2">
	                  <div class="he_border2"> <img class="he_border2_img" src="image/rec_a3.jpg" alt="盯鞋散集 I 自赏孤芳，缱绻时光" width="240px" height="240px"/>
	                    <div class="he_border2_caption">
	                      <p class="he_border2_caption_p">播放</p>
	                      <a class="he_border2_caption_a" href="#"></a></div>
                      </div>
	                  <p align="left">盯鞋散集 I 自赏孤芳，缱绻时光 <br>
	                    <by>by  ChrisZen</by>
                      </p>
                    </div>
	                <div class="col-md-2">
	                  <div class="he_border2"> <img class="he_border2_img" src="image/rec_a4.jpg" alt="Blackstar" width="240px" height="240px"/>
	                    <div class="he_border2_caption">
	                      <p class="he_border2_caption_p">播放</p>
	                      <a class="he_border2_caption_a" href="#"></a></div>
                      </div>
	                  <p align="left">Blackstar<br>
	                    <by>by  David Bowie</by>
                      </p>
                    </div>
	                <div class="col-md-2">
	                  <div class="he_border2"> <img class="he_border2_img" src="image/rec_a5.jpg" alt="Gore" width="240px" height="240px"/>
	                    <div class="he_border2_caption">
	                      <p class="he_border2_caption_p">播放</p>
	                      <a class="he_border2_caption_a" href="#"></a></div>
                      </div>
	                  <p align="left">Gore <br>
	                    <by>by  Deftones</by>
                      </p>
                    </div>
	                <div class="col-md-1"></div>
                  </div>
                </div>
              </div>
	          <!--p2-->
	          <div class="item" style="height: 460px;">
	            <div class="slide_img">
	              <div style="height: 70px;"></div>
	              <div class="row slide_img_content" style="text-align: center;">
	                <div class="col-md-1"> </div>
	                <div class="col-md-2">
	                  <!--he_border2类是控制图片动态效果的类-->
	                  <div class="box">
	                    <div class="he_border2"> <img class="he_border2_img" src="image/rec_a1.jpg" alt="欧美：让这些好听的英文歌俘获你的耳朵" width="240px" height="240px"/>
	                      <div class="he_border2_caption">
	                        <p class="he_border2_caption_p">查看歌单</p>
	                        <a class="he_border2_caption_a" href="#"></a></div>
                        </div>
                      </div>
	                  <p align="left">欧美：让这些好听的英文歌俘获你的耳朵 <br>
	                    <by>by  岸浪情拍</by>
                      </p>
                    </div>
	                <div class="col-md-2">
	                  <div class="he_border2"> <img class="he_border2_img" src="image/rec_a2.jpg" alt="糖果电音 | 恋爱浪潮 充满甜美气息的糖果歌" width="240px" height="240px"/>
	                    <div class="he_border2_caption">
	                      <p class="he_border2_caption_p">查看歌单</p>
	                      <a class="he_border2_caption_a" href="#"></a></div>
                      </div>
	                  <p align="left">糖果电音 | 恋爱浪潮 充满甜美气息的糖果歌 <br>
	                    <by>by  Jason3bear</by>
                      </p>
                    </div>
	                <div class="col-md-2">
	                  <div class="he_border2"> <img class="he_border2_img" src="image/rec_a3.jpg" alt="盯鞋散集 I 自赏孤芳，缱绻时光" width="240px" height="240px"/>
	                    <div class="he_border2_caption">
	                      <p class="he_border2_caption_p">查看歌单</p>
	                      <a class="he_border2_caption_a" href="#"></a></div>
                      </div>
	                  <p align="left">盯鞋散集 I 自赏孤芳，缱绻时光 <br>
	                    <by>by  ChrisZen</by>
                      </p>
                    </div>
	                <div class="col-md-2">
	                  <div class="he_border2"> <img class="he_border2_img" src="image/rec_a4.jpg" alt="Blackstar" width="240px" height="240px"/>
	                    <div class="he_border2_caption">
	                      <p class="he_border2_caption_p">查看歌单</p>
	                      <a class="he_border2_caption_a" href="#"></a></div>
                      </div>
	                  <p align="left">Blackstar<br>
	                    <by>by  David Bowie</by>
                      </p>
                    </div>
	                <div class="col-md-2">
	                  <div class="he_border2"> <img class="he_border2_img" src="image/rec_a5.jpg" alt="Gore" width="240px" height="240px"/>
	                    <div class="he_border2_caption">
	                      <p class="he_border2_caption_p">查看歌单</p>
	                      <a class="he_border2_caption_a" href="#"></a></div>
                      </div>
	                  <p align="left">Gore <br>
	                    <by>by  Deftones</by>
                      </p>
                    </div>
	                <div class="col-md-1"></div>
                  </div>
                </div>
              </div>
	          <!--p3-->
	          <div class="item" style="height: 460px;">
	            <div class="slide_img">
	              <div style="height: 70px;"></div>
	              <div class="row slide_img_content" style="text-align: center;">
	                <div class="col-md-1"> </div>
	                <div class="col-md-2">
	                  <!--he_border2类是控制图片动态效果的类-->
	                  <div class="box">
	                    <div class="he_border2"> <img class="he_border2_img" src="image/rec_a1.jpg" alt="欧美：让这些好听的英文歌俘获你的耳朵" width="240px" height="240px"/>
	                      <div class="he_border2_caption">
	                        <p class="he_border2_caption_p">查看歌单</p>
	                        <a class="he_border2_caption_a" href="#"></a></div>
                        </div>
                      </div>
	                  <p align="left">欧美：让这些好听的英文歌俘获你的耳朵 <br>
	                    <by>by  岸浪情拍</by>
                      </p>
                    </div>
	                <div class="col-md-2">
	                  <div class="he_border2"> <img class="he_border2_img" src="image/rec_a2.jpg" alt="糖果电音 | 恋爱浪潮 充满甜美气息的糖果歌" width="240px" height="240px"/>
	                    <div class="he_border2_caption">
	                      <p class="he_border2_caption_p">查看歌单</p>
	                      <a class="he_border2_caption_a" href="#"></a></div>
                      </div>
	                  <p align="left">糖果电音 | 恋爱浪潮 充满甜美气息的糖果歌 <br>
	                    <by>by  Jason3bear</by>
                      </p>
                    </div>
	                <div class="col-md-2">
	                  <div class="he_border2"> <img class="he_border2_img" src="image/rec_a3.jpg" alt="盯鞋散集 I 自赏孤芳，缱绻时光" width="240px" height="240px"/>
	                    <div class="he_border2_caption">
	                      <p class="he_border2_caption_p">查看歌单</p>
	                      <a class="he_border2_caption_a" href="#"></a></div>
                      </div>
	                  <p align="left">盯鞋散集 I 自赏孤芳，缱绻时光 <br>
	                    <by>by  ChrisZen</by>
                      </p>
                    </div>
	                <div class="col-md-2">
	                  <div class="he_border2"> <img class="he_border2_img" src="image/rec_a4.jpg" alt="Blackstar" width="240px" height="240px"/>
	                    <div class="he_border2_caption">
	                      <p class="he_border2_caption_p">查看歌单</p>
	                      <a class="he_border2_caption_a" href="#"></a></div>
                      </div>
	                  <p align="left">Blackstar<br>
	                    <by>by  David Bowie</by>
                      </p>
                    </div>
	                <div class="col-md-2">
	                  <div class="he_border2"> <img class="he_border2_img" src="image/rec_a5.jpg" alt="Gore" width="240px" height="240px"/>
	                    <div class="he_border2_caption">
	                      <p class="he_border2_caption_p">查看歌单</p>
	                      <a class="he_border2_caption_a" href="#"></a></div>
                      </div>
	                  <p align="left">Gore <br>
	                    <by>by  Deftones</by>
                      </p>
                    </div>
	                <div class="col-md-1"></div>
                  </div>
                </div>
              </div>
            </div>
	        <!-- 轮播（Carousel）导航 -->
          </div>
      </div>
	  </div>
	<!--排行榜-->
	  	<div class="row ranking">
			<h1>排行榜</h1>
			<div style="height: 70px;"></div>
			<div class="col-md-1"></div>	
			<div class="col-md-2">		
				<div class="box">
					<div class="he_slideAllDown" style="background-color: #ceaa00;">
						<img class="he_slideAllDown_img" src="image/chinaboard.jpg" height="240px" width="240px;" alt="chinabroad"/>
						<div class="he_slideAllDown_caption">
							<h3 class="he_slideAllDown_caption_h">热搜榜</h3>
							<p class="he_slideAllDown_caption_p">搜索次数最多的歌曲</p>
							<a class="he_slideAllDown_caption_a" href="#"></a>
						</div>
					</div>
				</div>
			</div>
			<div class="col-md-2">
				<div class="he_slideAllDown" style="background-color: #313131;">
						<img class="he_slideAllDown_img" src="image/billboard.jpg" height="240px" width="240px;" alt="billbroad"/>
						<div class="he_slideAllDown_caption">
							<h3 class="he_slideAllDown_caption_h">Billbroad</h3>
							<p class="he_slideAllDown_caption_p">美国公告牌排行榜</p>
							<a class="he_slideAllDown_caption_a" href="#"></a>
						</div>
			  </div>
			</div>
			<div class="col-md-2">
				<div class="he_slideAllDown" style="background-color: #32364c;">
						<img class="he_slideAllDown_img" src="image/oricon.jpg" height="240px" width="240px;" alt="Oricon"/>
						<div class="he_slideAllDown_caption">
							<h3 class="he_slideAllDown_caption_h">Oricon</h3>
							<p class="he_slideAllDown_caption_p">日本公信榜</p>
							<a class="he_slideAllDown_caption_a" href="#"></a>
						</div>
			  </div>
			</div>
			<div class="col-md-2">
				
				<div class="he_slideAllDown" style="background-color: #97426e;">
						<img class="he_slideAllDown_img" src="image/M-net.jpg" height="240px" width="240px;" alt="mnetbroad"/>
						<div class="he_slideAllDown_caption">
							<h3 class="he_slideAllDown_caption_h">M-net</h3>
							<p class="he_slideAllDown_caption_p">韩国M-net音乐榜</p>
							<a class="he_slideAllDown_caption_a" href="#"></a>
						</div>
			  </div>
			</div>
			<div class="col-md-2">
			  <div class="he_slideAllDown" style="background-color: #AAAAAA;">
						<img class="he_slideAllDown_img" src="image/UK chart.jpg" height="240px" width="240px;" alt="UK chart"/>
							<h3 class="he_slideAllDown_caption_h">M-net</h3>
							<p class="he_slideAllDown_caption_p">韩国M-net音乐榜</p>
							<a class="he_slideAllDown_caption_a" href="#"></a>
						</div>
		  </div>
	  </div>
	<div class="col-md-1"></div>
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
