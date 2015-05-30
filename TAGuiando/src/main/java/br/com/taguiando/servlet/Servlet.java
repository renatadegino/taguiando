package br.com.taguiando.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.taguiando.entitys.Aluno;
import br.com.taguiando.DAO.*;

@WebServlet("/usucontroller.do")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Servlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		AlunoDAO alunoDAO = new AlunoDAO();
		List<Aluno> lista = alunoDAO.BuscarTodos();
		request.setAttribute("lista", lista);
		RequestDispatcher saida = request.getRequestDispatcher("/cadastroAluno.jsp");
		saida.forward(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Recebe dados da tela
		String nome = request.getParameter("nome");
		String email = request.getParameter("email");
		String matricula = request.getParameter("matricula");
		String senha = request.getParameter("senha");
		
		//Cria objeto Formulario e seta os valores vindo da tela
		Aluno form = new Aluno();
		form.setNome(nome);
		form.setEmail(email);
		form.setMatricula(matricula);
		form.setSenha(senha);
		
		//Pede para o FormularioDAO cadastrar no banco de dados
		AlunoDAO formDAO = new AlunoDAO();
		formDAO.Enviar(form);
		List<Aluno> lista = formDAO.BuscarTodos();
		request.setAttribute("lista", lista);
		RequestDispatcher saida = request.getRequestDispatcher("/cadastroAluno.jsp");
		saida.forward(request,response);
	}

}
