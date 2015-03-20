<%-- 
    Document   : AddDepart
    Created on : Mar 20, 2015, 11:08:40 AM
    Author     : JETS_ITI
--%>

<%@page import="Interfaces.DepartInt"%>
<%@page import="Impl.DepartImpl"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <jsp:useBean id="deptIntObj" type="DepartInt" class="DepartIpml"/>  
        <script>
            function checkName(){
                name=document.getElementsByName("name");
                if(name.value.trim=="") document.getElementsById("errorname").innerHTML="Please,Enter username"; 
                else {
                    <c:set var="Departlist" value="${deptIntObj.getDepartByName(name.value)}" />
                    <c:if test="${Departlist.size()>0}">
                       document.getElementsById("errorname").innerHTML="Please,User name exit"; 
                    </c:if>
                }
            }
        </script>
    </head>
    <body>
        <form methd="post" action="">
            <input type="text" name="name" onblur=""/><span id="errorname"></span>
            <textarea col="20" rows="5" name="description" onblur=""/>
            <input type="submit" value="Add" onclick=""/>
        </form> 
    </body>
</html>
