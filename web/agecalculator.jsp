<%-- 
    Document   : agecalculator
    Created on : Jan 23, 2020, 1:08:30 PM
    Author     : lpeters
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form method="POST">
        Enter your age: <input type="text" name="age" /><br />
        <input type="submit" value="Age next birthday"/><br />
        </form>
        ${msg}
        <a href="/Week02Lab_Calculators/arithmetic">Arithmetic Calculator</a>
    </body>
</html>
