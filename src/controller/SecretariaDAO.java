/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import connection.ConnectionFactory;
import consultorio_medico.Secretaria;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.AdministradorModel;
import model.SecretariaModel;
import view.telaAdministrador;

/**
 *
 * @author Neto
 */
public class SecretariaDAO {
    
    Connection conect;

    public SecretariaDAO() throws SQLException {
        this.conect = ConnectionFactory.getConnection();
    }
    
    public List<SecretariaModel> logarSecretaria(SecretariaModel s) throws SQLException{
		List<SecretariaModel> logarSec = new ArrayList<>();
                
                Connection conexao = ConnectionFactory.getConnection();
                PreparedStatement stmt = null;
		
		SecretariaModel sec = null ;
                
                stmt = conexao.prepareStatement("Select * from secretaria Where Login = ? and Senha = ?");
                stmt.setString(1, s.getLogin());
                stmt.setString(2, s.getSenha());
                
                ResultSet result = stmt.executeQuery();
			
			/*
			 * Dentro do while estou verificando se tem registro no banco de dados, enquanto tiver registro vai 
			 * adcionando um a um na lista e no final fora do while retorna todos os registro encontrados. 
			 */
                while(result.next()){
                        sec = new SecretariaModel();
                        sec.setCod(result.getString("COD"));
                        sec.setLogin(result.getString("Login"));
                        sec.setSenha(result.getString("Senha"));
				
                        // Adcionando cada registro encontro, na lista .
                        logarSec.add(sec);
                }
		return logarSec;
	}
    
    public List<SecretariaModel> listarSecretarias() throws SQLException{
		List<SecretariaModel> listarSecretarias = new ArrayList<>();
		
		String sql = "Select * from secretaria";
		SecretariaModel sec = null ;
		
		try(PreparedStatement preparedStatement = conect.prepareStatement(sql)) {
			
			ResultSet result = preparedStatement.executeQuery();
			
			/*
			 * Dentro do while estou verificando se tem registro no banco de dados, enquanto tiver registro vai 
			 * adcionando um a um na lista e no final fora do while retorna todos os registro encontrados. 
			 */
			while(result.next()){
				sec = new SecretariaModel();
				sec.setCod(result.getString("COD"));
				sec.setNome(result.getString("Nome"));
                                sec.setRg(result.getString("RG"));
                                sec.setSexo(result.getString("Sexo"));
                                sec.setEndereco(result.getString("Endereco"));
                                sec.setCpf(result.getString("CPF"));
				sec.setLogin(result.getString("Login"));
				sec.setSenha(result.getString("Senha"));
				
				// Adcionando cada registro encontro, na lista .
				listarSecretarias.add(sec);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listarSecretarias;
	}
    
    public List<SecretariaModel> listarUltimaSecretarias() throws SQLException{
		List<SecretariaModel> listarSecretarias = new ArrayList<>();
		
		String sql = "Select * from secretaria ORDER BY COD DESC LIMIT 1";
		SecretariaModel sec = null ;
		
		try(PreparedStatement preparedStatement = conect.prepareStatement(sql)) {
			
			ResultSet result = preparedStatement.executeQuery();
			
			/*
			 * Dentro do while estou verificando se tem registro no banco de dados, enquanto tiver registro vai 
			 * adcionando um a um na lista e no final fora do while retorna todos os registro encontrados. 
			 */
			while(result.next()){
				sec = new SecretariaModel();
				sec.setCod(result.getString("COD"));
                                sec.setRg(result.getString("RG"));
				sec.setNome(result.getString("Nome"));
                                sec.setCpf(result.getString("CPF"));
                                sec.setEndereco(result.getString("Endereco"));
                                sec.setSexo(result.getString("Sexo"));
				// Adcionando cada registro encontro, na lista .
				listarSecretarias.add(sec);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listarSecretarias;
	}
    
    public void apagarSecretaria(SecretariaModel s) throws SQLException{
        Connection conexao = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try{
            stmt = conexao.prepareStatement("DELETE FROM secretaria WHERE COD = ?");
            stmt.setString(1, s.getCod());
            stmt.executeUpdate();
        }catch(Exception e1){
            System.out.println("Deu erro!");
        }finally{
            ConnectionFactory.closeConnection(conexao, stmt);
        }
    }
    
    public void editarSecretaria(SecretariaModel s) throws SQLException{
        Connection conexao = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try{
            stmt = conexao.prepareStatement("UPDATE secretaria SET Nome = ?, CPF = ?, RG = ?, Endereco = ?, Sexo = ? WHERE COD = ?");
            stmt.setString(1, s.getNome());
            stmt.setString(2, s.getCpf());
            stmt.setString(3, s.getRg());
            stmt.setString(4, s.getEndereco());
            stmt.setString(5, s.getSexo());
            stmt.setString(6, s.getCod());
            stmt.executeUpdate();
        }catch(Exception e1){
            System.out.println("Deu erro!");
        }finally{
            ConnectionFactory.closeConnection(conexao, stmt);
        }
    }
}
