<%--
  Created by IntelliJ IDEA.
  User: chuck.metzger
  Date: 3/27/2016
  Time: 3:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Goals Report</title>
</head>
<body>
    <table>
        <tr>
            <th>Minutes</th>
            <th>Excercise Minutes</th>
            <th>Activity</th>
        </tr>
        <c:forEach items="${goalReports}" var="goalReport">
            <tr>
                <td>${goalReport.goalMinutes}</td>
                <td>${goalReport.exerciseMinutes}</td>
                <td>${goalReport.exerciseActivity}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
