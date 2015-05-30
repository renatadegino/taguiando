<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ page import ="java.util.List"%>
<%@ page import ="br.com.taguiando.entitys.Aluno"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Contato</title>
</head>
<body>
<table border="1">
	<tr bgcolor="#EAEAEA">
		<th>Nome</th>
		<th>Email</th>
		<th>Matricula</th>
		<th>Senha</th>
	</tr>
<%
List<Aluno> lista = (List<Aluno>) request.getAttribute("lista");
for(Aluno form: lista){
%>
<tr>
		<td><%=form.getNome()%></td>
		<td><%=form.getEmail()%></td>
		<td><%=form.getMatricula()%></td>
		<td><%=form.getSenha()%></td>
		
</tr>

<%
}
%>
</table>

</body>
</html>