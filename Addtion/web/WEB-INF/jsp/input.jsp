

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <spring:nestedPath path="addition">
            <form method="post">
                No1:
                <spring:bind path="no1">
                    <input type="number" name="${status.expression}" value="${status.value}" />
                </spring:bind>
                <br><br>
                No2:
                <spring:bind path="no2">
                    <input type="number" name="${status.expression}" value="${status.value}" />
                </spring:bind>
                <br><br>
                <input type="submit" name="submit" />
            </form>
        </spring:nestedPath>
    </body>
</html>
