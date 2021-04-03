<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<title>Lista</title>
</head>
<body>
	<a href="register">List All Books</a>

	<div align="center">
		<table border="1" cellpadding="5">
			<caption>
				<h2>Lista de Pessoas</h2>
			</caption>
			<tr>
				<th>Código</th>
				<th>Nome</th>
				<th>Senha</th>
				<th>E-mail</th>
				<th>Telefone</th>
				<th>Cidade</th>
			</tr>

			<c:forEach var="pessoa" items="${listaPessoa}">
				<tr>
					<td><c:out value="${pessoa.id}" /></td>
					<td><c:out value="${pessoa.userName}" /></td>
					<td><c:out value="${pessoa.password}" /></td>
					<td><c:out value="${pessoa.email}" /></td>
					<td><c:out value="${pessoa.phone}" /></td>
					<td><c:out value="${pessoa.city}" /></td>
					<td>
						<a href="editar?id=<c:out value='${pessoa.id}' />">Editar</a> 	
																							&nbsp;&nbsp;&nbsp;&nbsp; 
						<a href="apagar?id=<c:out value='${pessoa.id}' />">Apagar</a></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>