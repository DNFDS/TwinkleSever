<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%> 
<%@ page contentType="text/html;charset=utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8"> 
<title>搜索音乐</title>
<link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/PersonalMessage.css" rel="stylesheet">
<link href="css/main.css" rel="stylesheet">
<link href="css/search.css" rel="stylesheet">
<link href="css/search_song.css" rel="stylesheet">
<script src="JS/jquery-3.3.1.min.js"></script>
<script src="JS/bootstrap.min.js"></script>
<script src="JS/search_js.js"></script>
<script src="JS/main_js.js"></script>	
<script>
</script>
</head>
<body id="body">
	<div class="container-fluid">
	<!-- 页头 -->
	<div class="row" style="height: 60px;min-height: 60px;background: #333333;"></div>
	<!-- 搜索框 -->
	<div class="mod_search" style="background-image:url(image/Search_image/search_bg.jpg);" role="search">
        <div class="mod_search_input" id="search_group">
            <input  class="search_input__input" id="search_input" onClick="search_click_keydown()" oninput="search_click_keydown()" aria-label="请输入搜索内容" value="" placeholder="搜索关键字" type="text">
            <button class="search_input__btn"><img src="image/search.png"  alt="search"  class="search_btn"><span class="icon_txt">搜索</span></button>
        </div>
		<div class="mod_search_tips">
			热门搜索：
			<a href="javascript:;" class="search_tips__item js_smartbox_search" data-name="流浪">流浪</a>
			<a href="javascript:;" class="search_tips__item js_smartbox_search" data-name="去年夏天">去年夏天</a>
			<a href="javascript:;" class="search_tips__item js_smartbox_search" data-name="周杰伦">周杰伦</a>
			<a href="javascript:;" class="search_tips__item js_smartbox_search" data-name="年少有为">年少有为</a>
			<a href="javascript:;" class="search_tips__item js_smartbox_search" data-name="不染">不染</a>
		</div>
		<div class="js_smartbox">
			<div class="mod_search_other" id="search_other" style="">
				<div class="search_history">
					<dl class="search_history__list">
						<dt class="search_history__tit">搜索历史<a href="javascript:;" class="search_history__clear js_smartbox_delete_all"><i class="icon_history_clear"></i><span class="icon_txt">清空</span></a></dt>
						<dd class="search_history__item">
							<a href="javascript:;" class="search_history__link js_smartbox_search js_left" data-name="1">1</a>
							<a href="javascript:;" class="search_history__delete js_smartbox_delete" data-name="1" title="删除"><i class="search_history__icon_delete"></i><span class="icon_txt">删除</span></a>
						</dd>
						<dd class="search_history__item">
							<a href="javascript:;" class="search_history__link js_smartbox_search js_left" data-name="我难过">我难过</a>
							<a href="javascript:;" class="search_history__delete js_smartbox_delete" data-name="我难过" title="删除"><i class="search_history__icon_delete"></i><span class="icon_txt">删除</span></a>
						</dd>
						<dd class="search_history__item">
							<a href="javascript:;" class="search_history__link js_smartbox_search js_left" data-name="5564">5564</a>
							<a href="javascript:;" class="search_history__delete js_smartbox_delete" data-name="5564" title="删除"><i class="search_history__icon_delete"></i><span class="icon_txt">删除</span></a>
						</dd>
					</dl>
				</div>
			</div>
			<div class="mod_search_result" id="search_result" style="">
					<!--单曲区域_S-->
					<div class="search_result__sort">
						<h4 class="search_result__tit"><i class="search_result__icon_song"></i>单曲</h4>
						<ul class="search_result__list">
							<li>
								<a href="javascript:;" class="search_result__link js_smartbox_song" data-docid="212628854" data-id="212628854" data-mid="002WqezQ4dmIeT" data-name="123我爱你">
									<span class="search_result__name"><span class="search_result__keyword">1</span>23我爱你</span>-
									<span class="search_result__singer">新乐尘符</span>
								</a>
							</li>
							<li>
								<a href="javascript:;" class="search_result__link js_smartbox_song" data-docid="102300586" data-id="102300586" data-mid="000HWyhv4UJpLq" data-name="17岁">
									<span class="search_result__name"><span class="search_result__keyword">1</span>7岁</span>-
									<span class="search_result__singer">刘德华</span>
								</a>
							</li>
							<li>
								<a href="javascript:;" class="search_result__link js_smartbox_song" data-docid="102414455" data-id="102414455" data-mid="002mwwCs3vpyaH" data-name="《16个夏天》电视剧片尾曲">
									<span class="search_result__name">《<span class="search_result__keyword">1</span>6个夏天》电视剧片尾曲</span>-
									<span class="search_result__singer">以后别做朋友</span>
								</a>
							</li>
							<li>
								<a href="javascript:;" class="search_result__link js_smartbox_song" data-docid="214244141" data-id="214244141" data-mid="001duIhk2iQc7n" data-name="1도 없어">
									<span class="search_result__name"><span class="search_result__keyword">1</span>도 없어</span>-
									<span class="search_result__singer">Apink</span>
								</a>
							</li>

						</ul>
					</div>
					<!--歌手区域_S-->
					<div class="search_result__sort">
						<h4 class="search_result__tit"><i class="search_result__icon_singer"></i>歌手</h4>
						<ul class="search_result__list">
							<li>
								<a href="javascript:;" class="search_result__link js_smartbox_singer" data-docid="1560201" data-id="1560201" data-mid="004Lhsnb1ar9CW" data-name="10叔">
									<span class="search_result__name"><span class="search_result__keyword">1</span>0叔</span>
								</a>
							</li>
							<li>
								<a href="javascript:;" class="search_result__link js_smartbox_singer" data-docid="1567549" data-id="1567549" data-mid="001mBG2s1zZR0m" data-name="10点莉">
									<span class="search_result__name"><span class="search_result__keyword">1</span>0点莉</span>
								</a>
							</li>	
						</ul>
					</div>
					<!--专辑区域_S-->
					<div class="search_result__sort">
						<h4 class="search_result__tit"><i class="search_result__icon_album"></i>专辑</h4>
						<ul class="search_result__list">		
							<li>
								<a href="javascript:;" class="search_result__link js_smartbox_album" data-docid="3835228" data-id="3835228" data-mid="001qozdT3ejtYD" data-name="123我爱你">
									<span class="search_result__name"><span class="search_result__keyword">1</span>23我爱你</span>
									<span class="search_result__singer">新乐尘符</span>
								</a>
							</li>		
							<li>
								<a href="javascript:;" class="search_result__link js_smartbox_album" data-docid="4243104" data-id="4243104" data-mid="002wdavM3BDAQ3" data-name="1">
									<span class="search_result__name"><span class="search_result__keyword">1</span></span>
									<span class="search_result__singer">蔡徐坤</span>
								</a>
							</li>		
						</ul>
					</div>
					<!--MV区域_S-->
					<div class="search_result__sort">
						<h4 class="search_result__tit"><i class="search_result__icon_mv"></i>MV</h4>
						<ul class="search_result__list">	
							<li>
								<a href="javascript:;" class="search_result__link js_smartbox_mv" data-docid="1483175" data-id="1483175" data-mid="003PZP4j19gep4" data-name="1826+开始·想象TFBOYS五周年演唱会" data-vid="k00277lmuka">
									<span class="search_result__name"><span class="search_result__keyword">1</span>826+开始·想象TFBOYS五周年演唱会</span>-
									<span class="search_result__singer">TFBOYS</span>
								</a>
							</li>	
							<li>
								<a href="javascript:;" class="search_result__link js_smartbox_mv" data-docid="1476077" data-id="1476077" data-mid="0033VkWP22k93L" data-name="1도 없어" data-vid="x0026sjhu82">
									<span class="search_result__name"><span class="search_result__keyword">1</span>도 없어</span>-
									<span class="search_result__singer">Apink</span>
								</a>
							</li>	
						</ul>
					</div>
	 			</div>
		</div>
    </div>
	<!-- 主体 -->
	<div class="main main--profile" style="">
		<div class="mod_tab" role="nav">
			<a class="mod_tab__item mod_tab__current" href="javascript:;" data-tab="like_song" data-stat="y_new.profile.like.tab.song">歌曲 36</a>
			<a class="mod_tab__item" href="javascript:;" data-tab="like_playlist" data-stat="y_new.profile.like.tab.playlist">歌单 0</a>
			<a class="mod_tab__item" href="javascript:;" data-tab="like_album" data-stat="y_new.profile.like.tab.album">专辑 0</a>
			<a class="mod_tab__item" href="javascript:;" data-tab="like_mv" data-stat="y_new.profile.like.tab.mv">视频 0</a>
		</div>
		<div class="mod_songlist_toolbar">
			<a href="javascript:;" class="mod_btn_blue js_all_play"><i class="mod_btn_green__icon_play"></i><img src="image/Index_image/mod_play.png" alt="play" class="operate_btn">播放全部</a>
			<a href="javascript:;" class="mod_btn js_all_fav"><i class="mod_btn__icon_add"></i><img src="image/Index_image/mod_add.png" alt="add" class="operate_btn">添加到</a>
			<a href="javascript:;" class="mod_btn js_all_down"><i class="mod_btn__icon_down"></i><img src="image/Index_image/mod_download.png" alt="download" class="operate_btn">下载</a>
			<a href="javascript:;" class="mod_btn js_batch"><i class="mod_btn__icon_batch"></i><img src="image/Index_image/mod_multoperate.png" alt="operate" class="operate_btn">批量操作</a>
		</div>
		<div class="row" style="height: 10px;min-height: 10px;background: #FFFFFF;"></div>
	 	<div class="mod_songlist">
	    	<ul class="songlist__header">
				<li class="songlist__header_name">歌曲</li>
				<li class="songlist__header_album">专辑</li>
				<li class="songlist__header_author">歌手</li>
				<li class="songlist__header_time">时长</li>
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
		<div class="mod_page_nav js_pager">
			<strong class="current">1</strong>
			<a href="javascript:;" class="js_pageindex" data-index="2" hidefocus="">2</a>
			<a href="javascript:;" class="js_pageindex" data-index="3" hidefocus="">3</a>
			<a href="javascript:;" class="js_pageindex" data-index="4" hidefocus="">4</a>
			<strong class="more">...</strong><a href="javascript:;" class="js_pageindex" data-index="20" hidefocus="">20</a><a href="javascript:;" class="next js_pageindex" data-index="2" title="下一页" hidefocus=""><span>&gt;</span></a>
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

