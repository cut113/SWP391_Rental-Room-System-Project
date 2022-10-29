<%-- 
    Document   : login.jsp
    Created on : Jul 4, 2022, 10:35:00 PM
    Author     : ADMIN
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
     <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
     <title>Baka</title>
     <link rel="stylesheet" href="css/style.css"/>
   </head>
    <body>
        <div class="wrapper fadeInDown">
                <div id="formContent">
             <!-- Tabs Titles -->
            <h2 class="active"> Sign In</h2>
    

    <!-- Login Form -->
        <form action="LoginServlet" method="post">
            <c:set var="error" value="${requestScope.ERROR}"/>
            <input type="text" class="fadeIn second" name="Username" placeholder="Username">
            <input type="text"  class="fadeIn third" name="Password" placeholder="Password"><br>         
            <c:if test="${not empty error}">
                <font color="red" size="2" face="verdana">${error}</font><br><br>
            </c:if>
            <input type="submit" class="fadeIn fourth" value="Log In"> 
        </form>
                </div>
        </div>
    </body>       
</html>
