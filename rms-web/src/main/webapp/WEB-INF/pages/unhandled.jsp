<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@page pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="root" value="/rms-info" scope="request"/>
<c:set var="img" value="${root}/static/images" scope="request"/>
<c:set var="css" value="${root}/static/css" scope="request"/>
<c:set var="js" value="${root}/static/jscript" scope="request"/>

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <title>Unhandled Internal Error</title>
    <link rel="stylesheet" href="${css}/main.css"/>
    <link rel="stylesheet" href="${css}/reset.css"/>
    <link rel="stylesheet" href="${css}/tabs.css"/>
    <link rel="stylesheet" href="${css}/table_pages.css"/>
    <script type="text/javascript" src="${js}/html5.js"></script>
    <script type="text/javascript" src="${js}/html5shiv.js"></script>
    <script type="text/javascript" src="${js}/jquery-1.9.1.min.js"></script>
</head>
<body>
	<div>
		Внутренняя ошибка сервера. Обратитесь к архитектору.
	</div>
</body>
</html>