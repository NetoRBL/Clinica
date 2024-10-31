/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.MedicoModel;
import model.PacienteModel;
import model.SecretariaModel;

/**
 *
 * @author Neto
 */
public class PacienteDAO {
    Connection conect;

    public PacienteDAO() throws SQLException {
        this.conect = ConnectionFactory.getConnection();
    }
    
    public void editarPaciente(PacienteModel p) throws SQLException{
        Connection conexao = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try{
            stmt = conexao.prepareStatement("UPDATE paciente SET nome = ?, rg = ?, cpf = ?, sexo = ?, telefone = ?, endereco = ? WHERE COD = ?");
            stmt.setString(1, p.getNome());
            stmt.setString(2, p.getRg());
            stmt.setString(3, p.getCpf());
            stmt.setString(4, p.getSexo());
            stmt.setString(5, p.getTelefone());
            stmt.setString(6, p.getEndereco());
            stmt.setString(7, p.getCod());
            stmt.executeUpdate();
        }catch(Exception e1){
            System.out.println("Deu erro!");
        }finally{
            ConnectionFactory.closeConnection(conexao, stmt);
        }
    }
    
    public void cadastrarPacientes(PacienteModel p) throws SQLException{
        Connection conexao = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try{
            stmt = conexao.prepareStatement("INSERT INTO paciente (nome, rg, cpf, sexo, telefone, endereco) VALUES (?,?,?,?,?,?)");
            stmt.setString(1, p.getNome());
            stmt.setString(2, p.getRg());
            stmt.setString(3, p.getCpf());
            stmt.setString(4, p.getSexo());
            stmt.setString(5, p.getTelefone());
            stmt.setString(6, p.getEndereco());
            stmt.executeUpdate();
        }catch(Exception e1){
            System.out.println("Deu erro!");
        }finally{
            ConnectionFactory.closeConnection(conexao, stmt);
        }
    }
    
    public List<PacienteModel> listarUltimoPaciente() throws SQLException{
		List<PacienteModel> listarPacientes = new ArrayList<>();
		
		String sql = "Select * from paciente ORDER BY COD DESC LIMIT 1";
		PacienteModel pac = null ;
		
		try(PreparedStatement preparedStatement = conect.prepareStatement(sql)) {
			
			ResultSet result = preparedStatement.executeQuery();
			
			/*
			 * Dentro do while estou verificando se tem registro no banco de dados, enquanto tiver registro vai 
			 * adcionando um a um na lista e no final fora do while retorna todos os registro encontrados. 
			 */
			while(result.next()){
				pac = new PacienteModel();
				pac.setCod(result.getString("COD"));
                                pac.setRg(result.getString("rg"));
				pac.setNome(result.getString("nome"));
                                pac.setCpf(result.getString("cpf"));
                                pac.setEndereco(result.getString("endereco"));
                                pac.setSexo(result.getString("sexo"));
                                pac.setTelefone(result.getString("telefone"));
				// Adcionando cada registro encontro, na lista .
				listarPacientes.add(pac);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listarPacientes;
	}
    
    public List<PacienteModel> listarPacientes() throws SQLException{
		List<PacienteModel> listarPacientes = new ArrayList<>();
		
		String sql = "Select * from paciente";
		PacienteModel pac = null ;
		
		try(PreparedStatement preparedStatement = conect.prepareStatement(sql)) {
			
			ResultSet result = preparedStatement.executeQuery();
			
			/*
			 * Dentro do while estou verificando se tem registro no banco de dados, enquanto tiver registro vai 
			 * adcionando um a um na lista e no final fora do while retorna todos os registro encontrados. 
			 */
			while(result.next()){
				pac = new PacienteModel();
				pac.setCod(result.getString("COD"));
				pac.setSexo(result.getString("sexo"));
                                pac.setNome(result.getString("nome"));
                                pac.setCpf(result.getString("cpf"));
                                pac.setRg(result.getString("rg"));
                                pac.setTelefone(result.getString("telefone"));
				pac.setEndereco(result.getString("endereco"));
                                
				
				// Adcionando cada registro encontro, na lista .
				listarPacientes.add(pac);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listarPacientes;
	}
}
