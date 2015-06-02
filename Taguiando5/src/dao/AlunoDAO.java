package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import modelo.Aluno;


public class AlunoDAO {

    public static void insere(Aluno aluno) throws SQLException, ClassNotFoundException {

        // conectando
        Connection con = (Connection) new ConnectionFactory().getConnection();

        // cria um preparedStatement
        String sql = "insert into alu_aluno (alu_matricula,alu_nome,alu_senha, alu_email) values (?,?,?,?)";
        PreparedStatement stmt = (PreparedStatement) con.prepareStatement(sql);

        // preenche os valores
        stmt.setString(1, aluno.getMatricula());
        stmt.setString(2, aluno.getNome());
        stmt.setString(3, aluno.getSenha());
        stmt.setString(4, aluno.getEmail());
        
        // executa
        stmt.execute();
        stmt.close();

        System.out.println("Gravado!");

        con.close();
    }
}