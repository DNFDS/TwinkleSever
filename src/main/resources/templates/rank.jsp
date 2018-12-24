<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
<title>排行榜</title>
<link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/main.css" rel="stylesheet">
<script src="JS/jquery-3.3.1.min.js"></script>
<script src="JS/bootstrap.min.js"></script>
<script src="JS/main_js.js"></script>
<style>	
.container-fluid{
	background-color:#FDFDFD;
}
/*分页*/
.mod_page_nav {
	margin-top: 10px;
}
/*侧边栏*/
.left_menu{
	background-color: #fafafa;
	position: absolute;
	height:580px;
	width: 100%;
	float: right;
	border: #ebebeb solid 1px;
	margin-bottom: 50px;
}
.menu_text{
	margin: 0 5px 0 20px;
}
.title{
	font-size: 22px;
	color: #333333;
	padding-top: 20px;
	padding-bottom: 25px;
	border-bottom: #ebebeb solid 1px;
}
.left_menu ul{
	list-style: none; 
}
#menu a{
	text-decoration: none;	 
	list-style: none; 
	line-height: 50px;
}
#menu a:visited{color:#333333;}
#menu a:link{color: #333333;}
#menu a{color: #333333; display: block;}
#menu a:hover{color: #68dff0;}
#menu li{ 	
}
#menu p{
	padding-left: 30px;
}
/*排行榜*/
.ranking_board h3{
	font-size: 28px;
	padding-top: 24px;
	padding-bottom: 35px;
	color: #333333;	
}
.ranking_board h3 span{
	padding-left: 20px;
	font-size: 15px;
	color: #959595;
}
th{
	color: #999999;
	font-family: 'Microsoft YaHei', sans-serif;
	font-weight: 300;
}
tr{
	height: 60px;
}
tbody tr{
	height: 80px;
}
.song{
	width: 600px;
}
.seq {
	width: 90px;
}
td{
	font-weight: 300;
}
.odd td{
	background-color: #fbfbfd;
}
.ranking_top .num{
	color: #ff4822;	
}
.num{
	text-align: center;
	font-size: 1.4em;
	font-weight: 300;
}
.table th, .table td {
	vertical-align: middle!important;
}
.table td{
	border:none!important;
}
.table th{
	border-top: #dddddd solid 1px!important;
}
.table span{
	padding-left: 5px;
}
/*按钮弹窗*/
.oa_submeau{
	float: right;
	padding-top: 13px;
}
body {
    background: url(image/Index_image/body_bg.jpg) 50% 60px repeat-x;
}
</style>  
</head>
<body>
    <div class="container-fluid">
	<!-- 页头 -->
	<div class="row" style="height: 60px;min-height: 60px;background: #333333;"></div>
	<div class="row" style="height: 60px;min-height: 60px;background: #FDFDFD;"></div>
	<!--侧边栏-->
	<div class="col-md-3">
		<div class="row" style="height: 100%;">
			<div class="col-md-4"></div>
			<div class="col-md-6">
				<div class="left_menu">
					<div class="menu_text">
						<h1  class="title">音乐排行榜</h1>
						<ul id="menu">
							<li class="menu-list"> <a style="cursor:pointer" class="firsta" href="">热搜榜</a></li>
							<li class="menu-list"> <a style="cursor:pointer" class="firsta" href="">美国公告牌榜</a></li>
							<li class="menu-list"> <a style="cursor:pointer" class="firsta" href="">日本公信榜</a></li>
							<li class="menu-list"> <a style="cursor:pointer" class="firsta" href="">韩国M-net榜</a></li>
							<li class="menu-list"> <a style="cursor:pointer" class="firsta" href="">美国iTunes榜</a></li>
							<li class="menu-list"> <a style="cursor:pointer" class="firsta" href="">英国UK榜</a></li>
							<li class="menu-list"> <a style="cursor:pointer" class="firsta" href="">香港电台榜</a></li>
							<li class="menu-list"> <a style="cursor:pointer" class="firsta" href="">香港商务榜</a></li>
							<li class="menu-list"> <a style="cursor:pointer" class="firsta" href="">台湾Hito榜</a></li>
							<li class="menu-list"> <a style="cursor:pointer" class="firsta" href="">法国NRJ榜</a></li>
						</ul>
					</div>
				</div>
			</div>			
		</div>
	</div>
	<!--排行榜-->
	<div class="col-md-9 ranking_board">
		<div class="row">
			<div class="col-md-11" style="padding-right: 70px;">
				<h3> 美国公告牌榜 <span>第31周</span></h3>
				  <table class="table">
					<thead>
					  <tr class="even">
						<th class="seq">   </th>
						<th class="song"> 歌曲 </th>
						<th> 歌手 </th>
						<th> 时长 </th>
					  </tr>
					</thead>
					<tbody>
					  <tr class="table ranking_top odd submeau_1">
						<td class="num"> 1 </td>
						<td class=""> 
							<img src="image/Song_image/ranking1.jpg" alt="" width="70px" height="70px;"/><span>In My Feelings(Explicit) </span> 
							<div class="oa_submeau" id="oa_1">
								<span><a href="#"><img src="image/Index_image/play.png" alt="play" height="40px" width="40px" /></a></span>
								<span><a href="#"><img src="image/Index_image/like.png" alt="like" height="40px" width="40px" /></a></span>
								<span><a href="#"><img src="image/Index_image/add.png" alt="add" height="40px" width="40px" /></a></span>
								<span><a href="#"><img src="image/Index_image/download.png" alt="download" height="40px" width="40px" /></a></span>
							</div>
							<!--按钮悬停事件-->
							  <script type="text/javascript"> 
								  $("#oa_1").hide();
								  $(".submeau_1").hover(function () {
									  $("#oa_1 ").show();
								  }, function () {
									  $("#oa_1").hide();
								  })
								  $("#oa_1").hover(function () {
									  $("#oa_1").show();
								  }, function () {
									  $("#oa_1").hide();
								  })
							</script>
						</td>
						<td> Drake </td>
						<td> 03:37 </td>
					  </tr>
					  <tr class="table ranking_top even submeau_2" >
						<td class="num"> 2 </td>
						<td> <img src="image/Song_image/ranking1.jpg" alt="" width="70px" height="70px;"/><span>In My Feelings(Explicit) </span> 
						 <div class="oa_submeau" id="oa_2">
								<span><a href="#"><img src="image/Index_image/play.png" alt="play" height="40px" width="40px" /></a></span>
								<span><a href="#"><img src="image/Index_image/like.png" alt="like" height="40px" width="40px" /></a></span>
								<span><a href="#"><img src="image/Index_image/add.png" alt="add" height="40px" width="40px" /></a>
								</span>
								<span><a href="#"><img src="image/Index_image/download.png" alt="download" height="40px" width="40px" /></a></span>
							</div>
							  <script type="text/javascript"> 
								  $("#oa_2").hide();
								  $(".submeau_2").hover(function () {
									  $("#oa_2 ").show();
								  }, function () {
									  $("#oa_2").hide();
								  })
								  $("#oa_2").hover(function () {
									  $("#oa_2").show();
								  }, function () {
									  $("#oa_2").hide();
								  })
							</script>
						  </td>
						<td> Drake </td>
						<td> 03:37 </td>
					  </tr>
					  <tr class="table ranking_top top odd submeau_3">
						<td class="num"> 3 </td>
						<td> <img src="image/Song_image/ranking1.jpg" alt="" width="70px" height="70px;"/><span>In My Feelings(Explicit) </span> 
						   <div class="oa_submeau" id="oa_3">
								<span><a href="#"><img src="image/Index_image/play.png" alt="play" height="40px" width="40px" /></a></span>
								<span><a href="#"><img src="image/Index_image/like.png" alt="like" height="40px" width="40px" /></a></span>
								<span><a href="#"><img src="image/Index_image/add.png" alt="add" height="40px" width="40px" /></a>
								</span>
								<span><a href="#"><img src="image/Index_image/download.png" alt="download" height="40px" width="40px" /></a></span>
							</div>
							<!--按钮悬停事件-->
							  <script type="text/javascript"> 
								  $("#oa_3").hide();
								  $(".submeau_3").hover(function () {
									  $("#oa_3 ").show();
								  }, function () {
									  $("#oa_3").hide();
								  })
								  $("#oa_3").hover(function () {
									  $("#oa_3").show();
								  }, function () {
									  $("#oa_3").hide();
								  })    
							</script>					  
						  </td>
						<td> Drake </td>
						<td> 03:37 </td>
					  </tr>
					  <tr class="table even submeau_4">
						<td class="num"> 4 </td>
					   <td> <img src="image/Song_image/ranking1.jpg" alt="" width="70px" height="70px;"/><span>In My Feelings(Explicit) </span> 
						   <div class="oa_submeau" id="oa_4">
								<span><a href="#"><img src="image/Index_image/play.png" alt="play" height="40px" width="40px" /></a></span>
								<span><a href="#"><img src="image/Index_image/like.png" alt="like" height="40px" width="40px" /></a></span>
								<span><a href="#"><img src="image/Index_image/add.png" alt="add" height="40px" width="40px" /></a>
								</span>
								<span><a href="#"><img src="image/Index_image/download.png" alt="download" height="40px" width="40px" /></a></span>
							</div>
							<!--按钮悬停事件-->
							  <script type="text/javascript"> 
								  $("#oa_4").hide();
								  $(".submeau_4").hover(function () {
									  $("#oa_4 ").show();
								  }, function () {
									  $("#oa_4").hide();
								  })
								  $("#oa_4").hover(function () {
									  $("#oa_4").show();
								  }, function () {
									  $("#oa_4").hide();
								  })
							</script>
						  </td>
						<td> Drake </td>
						<td> 03:37 </td>
					  </tr>
						<tr class="table odd submeau_5" >
						<td class="num"> 5 </td>
						<td> <img src="image/Song_image/ranking1.jpg" alt="" width="70px" height="70px;"/><span>In My Feelings(Explicit) </span> 
							<div class="oa_submeau" id="oa_5">
								<span><a href="#"><img src="image/Index_image/play.png" alt="play" height="40px" width="40px" /></a></span>
								<span><a href="#"><img src="image/Index_image/like.png" alt="like" height="40px" width="40px" /></a></span>
								<span><a href="#"><img src="image/Index_image/add.png" alt="add" height="40px" width="40px" /></a>
								</span>
								<span><a href="#"><img src="image/Index_image/download.png" alt="download" height="40px" width="40px" /></a></span>
							</div>
							<!--按钮悬停事件-->
							  <script type="text/javascript"> 
								  $("#oa_5").hide();
								  $(".submeau_5").hover(function () {
									  $("#oa_5 ").show();
								  }, function () {
									  $("#oa_5").hide();
								  })
								  $("#oa_5").hover(function () {
									  $("#oa_5").show();
								  }, function () {
									  $("#oa_5").hide();
								  })
							</script>
							</td>
						<td> Drake </td>
						<td> 03:37 </td>
					  </tr>
					</tbody>
				</table>
				<div class="mod_page_nav js_pager">
				<strong class="current">1</strong>
				<a href="javascript:;" class="js_pageindex" data-index="2" hidefocus="">2</a>
				<a href="javascript:;" class="js_pageindex" data-index="3" hidefocus="">3</a>
				<a href="javascript:;" class="js_pageindex" data-index="4" hidefocus="">4</a>
				<a href="javascript:;" class="next js_pageindex" data-index="2" title="下一页" hidefocus=""><span>&gt;</span></a>
				</div>
				</div>
				<div class="col-md-1"></div>
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
	<a href="find_music.html" class="disc l1" onMouseOver="disc1_over()" onMouseOut="disc1_out()">
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
</body>
</html>