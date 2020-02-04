<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="<c:url value="/resources/style.css"/>" type="text/css" rel="stylesheet">
<title>Etterem</title>
</head>
<body>
	<h2 align="center">Etelek</h2>

	        <table>
                <tr>
                    <th>ID</th>
                    <th>Etel neve</th>
                    <th>Etel elkeszitesi ideje </th>

                </tr>

                <c:if test = "${empty etelLista}">
                     <p>nincs adat<p>
                </c:if>

                <c:forEach var="etel" items="${etelLista}">
                     <tr>
                         <td>${etel.id}</td>
                         <td>${etel.etelNeve}</td>
                         <td>${etel.elkeszitesiIdo}</td>

                         <td><a href="<c:url value='/updateEtel/${etel.id}' />">Modosit</a></td>

                         <td><a href="<c:url value = '/delEtel/${etel.id}'/>"> Torles</a></td>
                     </tr>
                </c:forEach>

                 <form:form method="post" modelAttribute="etel" action="${pageContext.request.contextPath}/addEtel">
                            <table>
                              <tr>
                               <th colspan="2">Uj etel felvitele</th>
                              </tr>
                              <tr>
                                    <form:hidden path="id" />
                                    <td><form:label path="etelNeve">Etel neve:</form:label></td>
                                    <td><form:input path="etelNeve" size="30" maxlength="30"></form:input></td>
                              </tr>
                              <tr>
                                   <td><form:label path="elkeszitesiIdo">Elkeszitesi ido:</form:label></td>
                                   <td><form:input path="elkeszitesiIdo" size="30" maxlength="30"></form:input></td>
                              </tr>

                              <tr>
                               <td colspan="2"><input type="submit"
                                class="blue-button" /></td>
                              </tr>

                             </table>
                            </form:form>







</body>
</html>
