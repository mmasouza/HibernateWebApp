<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Formulario de cadastro</title>
</head>
<body>

	<a href="listar">Listar pessoas</a>

	<h1>Formulario de cadastro</h1>

	<form action="register" method="post">
		<table cellpadding="3pt">
			<tr>
				<td>Nome:</td>
				<td><input type="text" name="userName" size="30" /></td>
			</tr>
			<tr>
				<td>Senha :</td>
				<td><input type="password" name="password1" size="30" /></td>
			</tr>

			<tr>
				<td>Confirme a Senha :</td>
				<td><input type="password" name="password2" size="30" /></td>
			</tr>
			<tr>
				<td>E-mail :</td>
				<td><input type="text" name="email" size="30" /></td>
			</tr>
			<tr>
				<td>Telefone :</td>
				<td><input type="text" name="phone" size="30" /></td>
			</tr>
			<tr>
				<td>Cidade :</td>
				<td><input type="text" name="city" size="30" /></td>
			</tr>
		</table>
		<p />

		<input type="submit" value="Cadastrar" />

	</form>

</body>
</html>