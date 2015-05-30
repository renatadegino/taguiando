package br.com.taguiando.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.taguiando.DAO.ConexaoMySQL;
import br.com.taguiando.entitys.Aluno;

public class AlunoDAO {
	private Connection con = ConexaoMySQL.getConnection();
	
	public void Enviar (Aluno form){
		String sql = "INSERT INTO CONTATO (nome, email, matricula, senha) values (?,?,?,?)";
		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setString(1, form.getNome());
			preparador.setString(2, form.getEmail());
			preparador.setString(3, form.getMatricula());
			preparador.setString(4, form.getSenha());
			preparador.execute();
			preparador.close();
			System.out.println("contato enviado com sucesso!");
		} catch (SQLException e) {
			e.printStackTrace();
		} 
	}
	
	public List<Aluno> BuscarTodos(){
		String sql = "SELECT *FROM CONTATO";
		List<Aluno> lista = new ArrayList<Aluno>();
		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			ResultSet resultado = preparador.executeQuery();
			while(resultado.next()){
				Aluno form = new Aluno();
				form.setNome(resultado.getString("nome"));
				form.setEmail(resultado.getString("email"));
				form.setMatricula(resultado.getString("matricula"));
				form.setSenha(resultado.getString("senha"));
				lista.add(form);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return lista;
	}
}
