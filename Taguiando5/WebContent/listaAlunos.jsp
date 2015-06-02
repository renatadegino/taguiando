<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="pt">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lista de Alunos</title>
</head>
<body>
	<div align="center">
		<P>Lista de Alunos</P>
		<table border="1">
			<tr>
				<td>Matricula</td>
				<td>Nome</td>
				<td>Email</td>
				<td>Senha</td>
			</tr>
			<c:forEach var="aluno" items="${listaAluno}">
				<tr>
					<td>${aluno.matricula}</td>
					<td>${aluno.nome}</td>
					<td>${aluno.email}</td>	
					<td>${aluno.senha}</td>
					<td><a href="AlunoServlet?acao=Excluir&matricula=${aluno.matricula}">Excluir</a></td>
				</tr>
			</c:forEach>
		</table>
		
	</div>
	<a href="index.html">Voltar</a>
	
</body>
</html>