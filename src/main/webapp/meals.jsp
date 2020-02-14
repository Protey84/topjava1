<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
    <title>Meals</title>
</head>
<body>
<h3><a href="index.html">Home</a></h3>
<hr>
<table id="datatable">
    <thead>
    <tr>
        <th>Дата/Время</th>
        <th>Описание</th>
        <th>Калории</th>
    </tr>
    </thead>
    <c:forEach var="mealTo" items="${list}">
        <jsp:useBean id="mealTo" scope="page" type="ru.javawebinar.topjava.model.MealTo"/>
        <tr style="background-color:${mealTo.excess ? 'greenyellow' : 'red'}">
            <td><fmt:parseDate value="${ mealTo.dateTime }" pattern="yyyy-MM-dd'T'HH:mm" var="parsedDateTime"
                               type="both"/>
                <fmt:formatDate pattern="dd.MM.yyyy HH:mm" value="${ parsedDateTime }"/></td>
            <td><c:out value="${mealTo.getDescription()}"/></td>
            <td><c:out value="${mealTo.getCalories()}"/></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>