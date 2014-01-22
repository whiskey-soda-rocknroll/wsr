<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="s" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<c:set var="root" value="/rms-info" scope="request"/>
<c:set var="img" value="${root}/static/images" scope="request"/>
<c:set var="css" value="${root}/static/css" scope="request"/>
<c:set var="js" value="${root}/static/jscript" scope="request"/>

<!DOCTYPE html>
<html>
	<head>
	    <meta charset="UTF-8">
	    <title><s:insertAttribute name="title" ignore="true"/></title>
	</head>
	<body>
	    <header class="wrap header">
	        <s:insertAttribute name="header"/>
	    </header>
	    <div class="wrap action">
	    </div>
	    <section class="wrap main">	    	
	        <section class="wrap-in">
	            <nav class="sidebar">
	            	<s:insertAttribute name="navigation"/>
	            </nav>		
	            <section class="mainside">
	            	<s:insertAttribute name="content"/>
	            </section>
	        </section>
	    </section>
	    <div class="push"></div>		
		<footer class="wrap footer">
		    <s:insertAttribute name="footer"/>
		</footer>
	</body>
</html>