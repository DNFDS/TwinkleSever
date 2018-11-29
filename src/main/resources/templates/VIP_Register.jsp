<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%> 
<%@ page contentType="text/html;charset=utf-8"%> 
<!DOCTYPE html>
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>开通会员</title>
<link href="css/VIP&Recharge.css" rel="stylesheet">
<style>
body{
	background-image:url(image/VIP_image/bg.jpg);	
}
.basic_title{
	margin-top: 50px;
	color: white;
}
</style>
</head>
<body>
	<center>
		<div class="generalInfo">
			<span class="span"> WELCOME </span>
			<img src="image/VIP_image/shiny_music.png" alt="shiny_music" height="120" width="120">
			<div class="basic_title">
				<span class="vip_title">VIP 会员: ¥<em>15</em></span>
			</div>
			<br>
			<div class="buy_vip_div">
				<input type="submit" value="立即开通" id="btn">
			</div>
			<div class="save_money_link_div">
				<span class="current_balance">当前余额：¥</span>
				<span class="current_balance">20 |</span>
				<a href="save_money.html" target="_blank" class="save_money_link">
					<span class="save_money_link_span">账户充值</span>
				</a>
			</div>
		</div>
	</center>
</body>
</html>