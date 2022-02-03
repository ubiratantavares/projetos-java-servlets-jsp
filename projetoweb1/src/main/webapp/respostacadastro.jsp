<%@page import="model.Cliente"%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Página de resposta do cadastro</title>
	</head>
	<body>
		<h3>Visualizando os dados do cliente</h3>
		<p />
		<hr />
		<p />
		<%
			Cliente c = (Cliente) request.getAttribute("cliente");
			out.print("<br />Nome: " + c.getNome());
			out.print("<br />E-mail: " + c.getEmail());
			out.print("<br />Tipo: " + c.getTipo());
			out.print("<br />CPF/CNPJ: " + c.getId());		
		%>
		<br />
		<p />
		<hr />
		<p />
		${mensagem}.<br />
		<br />
		<p />
		<hr />
		<p />
		
		<a href="cadastro.jsp">Clique aqui</a> para cadastrar novo cliente.<br />
		<a href="index.jsp">Clique aqui</a> para retornar à página inicial.				
	</body>
</html>