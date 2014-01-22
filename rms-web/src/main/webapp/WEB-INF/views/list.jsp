<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix='fn' uri='http://java.sun.com/jsp/jstl/functions' %>

<html>
<head>
    <title>Pages List</title>
</head>
<body>
<h4>You can see pages list below:</h4>
    <c:if test="${fn:length(pages) eq 0}">
        <div><p>---</p></div>
    </c:if>

    <c:if test="${fn:length(pages) ne 0}">
        <table border="1" cellpadding="2" cellspacing="0">
            <c:forEach var="page" items="${pages}" varStatus="current">
                <tr>
                    <td><strong><c:out value="${current.count}"/></strong></td>
                    <td><small><c:out value="${page.key.id}"/></small></td>
                    <td><small><c:out value="${page.key.name}"/></small></td>
                    <td><small><c:out value="${page.key.desc}"/></small></td>
                    <td><small><c:out value="${page.key.dateChange}"/></small></td>
                    <td><small><c:out value="${page.value}"/></small></td>
                </tr>
            </c:forEach>
        </table>
    </c:if>
</body>
</html>
