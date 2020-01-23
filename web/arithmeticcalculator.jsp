<%-- 
    Document   : arithmeticcalculator
    Created on : Jan 23, 2020, 1:36:18 PM
    Author     : lpeters
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method="POST">
        First: <input type="text" name="one" value="${one}"/><br />
        Second: <input type="text" name="two" value="${two}"/><br />
        <input type="submit" name="add" value="+" />
        <input type="submit" name="sub" value="-" />
        <input type="submit" name="mul" value="*" />
        <input type="submit" name="mod" value="%" />
        </form><br />
        Result: ${res}<br />
        <a href="/Week02Lab_Calculators/age">Age Calculator</a>
    </body>
</html>
