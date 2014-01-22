<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@page pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="root" value="/rms-info" scope="request"/>
<c:set var="img" value="${root}/static/images" scope="request"/>
<c:set var="css" value="${root}/static/css" scope="request"/>
<c:set var="cssLibs" value="${root}/static/css/libs" scope="request"/>
<c:set var="cssPlugins" value="${root}/static/css/plugins" scope="request"/>
<c:set var="cssStyles" value="${root}/static/css/styles" scope="request"/>
<c:set var="js" value="${root}/static/jscript" scope="request"/>

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<!--<link rel="stylesheet" href="${css}/main.css">
	<link rel="stylesheet" href="${css}/reset.css">
	<link rel="stylesheet" href="${css}/tabs.css">
	<link rel="stylesheet" href="${css}/table_pages.css">-->
	<link rel="stylesheet" type="text/css" href="${cssLibs}/bootstrap.css">	
	<link rel="stylesheet" type="text/css" href="${cssPlugins}/font-awesome.min.css">
	<link rel="stylesheet" type="text/css" href="${cssStyles}/error.css">
	<title>Запиночка..</title>
</head>
<body>
	<div class="error-box">
		<div class="error-img pull-left">
			<img src="${img}/error.jpg">
		</div>
		<div class="pull-right" style="width:78%">
			<div class="error-title" >			
				<strong>Сервер запнулся в 500-й раз....</strong>
			</div>		
			<div class="error-text">
				<p class="text a"></p>
				<p id="ab"></p><i></i>
				<div class="button-box">
				<p class="text b">
				Оставайтесь с нами:
				</p>
				<a href="#" class="btn btn-info btn-large pull-left" onClick="location.reload()"><i class="icon-refresh icon-spin"></i> Обновить</a>
				<a href="#" class="btn btn-success btn-large pull-right " onClick="location.href='/rms-info'"><i class="icon-home"></i> На главную</a>
				</div>
			</div>
		</div>	
	</div>
	
<b>${exception.fullCode}&nbsp;${exception.message}</b>	
<script type="text/javascript" src="${js}/jquery-1.9.1.min.js"></script>
<script>
(function($){
	"use strict"
	$.fn.writeText = function(text, options){
		options = $.extend({
			delay: 130,
			next: function(){},
			step: 1
		}, options);
		var element = this,
			textLength = text.length,
			add = setInterval(function() {
				var textSimvol = text.substring(0, (options.step));
				element.text(element.text()+textSimvol).focus();
				text = text.slice(options.step);
			if (!text.length) clearInterval(add);   
			}, options.delay);
			
	setTimeout(function(){options.next()}, ((textLength * options.delay)/options.step ));	
	return this;	
	};	
})(jQuery);
$(document).load(function(){
	

});	
$(document).ready(function(e) {
	$(".error-box").fadeIn(1300);
	
	b = function(){	
		$("#ab").html($("#ab").html()+"<i></i>");
		setInterval(function(){			
			$("#ab i").empty().writeText("...");
			},2000);		 
		$(".button-box").fadeIn(1500);
	}
	a = function(){
		$("#ab").writeText("Произошла внутренняя ошибка на сервере сайта, в ближайшее время мы всё исправим",{next: b})
	}
	$(".text.a").writeText(" Внимание!!!",{next: a});
});
</script>
</body>
</html>