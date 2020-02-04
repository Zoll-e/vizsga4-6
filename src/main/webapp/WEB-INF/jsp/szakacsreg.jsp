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
	<h2 align="center">Szakacsok</h2>

	        <table>
                <tr>
                    <th>ID</th>
                    <th>Szakacs neve</th>
                    <th>Cime</th>
                    <th>Email Cime</th>

                </tr>

                <c:if test = "${empty szakacsLista}">
                     <p>nincs adat<p>
                </c:if>

                <c:forEach var="szakacs" items="${szakacsLista}">
                     <tr>
                         <td>${szakacs.id}</td>
                         <td>${szakacs.neve}</td>
                         <td>${szakacs.cime}</td>
                         <td>${szakacs.email_cim}</td>


                         <td><a href="<c:url value='/updateSzakacs/${szakacs.id}' />">Modosit</a></td>

                         <td><a href="<c:url value = '/delSzakacs/${szakacs.id}'/>"> Torles</a></td>
                     </tr>
                </c:forEach>

                 <form:form method="post" modelAttribute="szakacs" action="${pageContext.request.contextPath}/addSzakacs">
                            <table>
                              <tr>
                               <th colspan="2">Uj szakacs felvitele</th>
                              </tr>
                              <tr>
                                    <form:hidden path="id" />
                                    <td><form:label path="neve">Szakacs neve:</form:label></td>
                                    <td><form:input path="neve" size="30" maxlength="30"></form:input></td>
                              </tr>
                              <tr>
                                   <td><form:label path="cime">Szakacs cime:</form:label></td>
                                   <td><form:input path="cime" size="30" maxlength="30"></form:input></td>
                              </tr>

                                <tr>
                                    <td><form:label path="email_cim">Szakacs email-cime:</form:label></td>
                                   <td><form:input path="email_cim" size="30" maxlength="30"></form:input></td>
                                                            </tr>


                              <tr>
                               <td colspan="2"><input type="submit"
                                class="blue-button" /></td>
                              </tr>

                             </table>
                            </form:form>







</body>
</html>
