<%-- 
    Document   : list
    Created on : 15-nov-2015, 4:06:22
    Author     : Heraldo
--%>


<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Catalogo de pregunta</title>
</head>
<body>
	<c:url var="action" value="/app/pregunta/create" />
	<form:form method="post" modelAttribute="pregunta" action="${action}">
		<form:input 	path="descripcion" type="text"	/>
		<form:hidden 	path="id" />
		<input 		type="submit" value="Guardar" /> 
	</form:form>
</body>
</html>