<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Página de cadastro de cliente</title>
	</head>
	<body>
		<h3>Informe os dados do cliente</h3>
		<p />
		<hr />
		<p />
		
		<form action="ControleCliente" method="post">
			Nome:  <input type="text" name="nome" size="80" maxlength="80" /><br /><br />
			E-mail: <input type="text" name="email" size="80" maxlength="80" /><br /><br />
			Tipo: <select name="tipo">
				  	<option value="PF">Pessoa Física</option>
				  	<option value="PJ">Pessoa Jurídica</option>
				  </select><br /><br />
			CPF/CNPJ: <input type="text" name="id" size="20" maxlength="20" /><br /><br />
			<input type="submit" value="Cadastrar" /><br /><br />
		</form>
		<a href="index.jsp">Clique aqui</a> para retornar à página inicial.			
	</body>
</html>