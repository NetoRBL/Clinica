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
import model.AdministradorModel;
import model.MedicoModel;
import model.PacienteModel;
import model.SecretariaModel;

/**
 *
 * @author Neto
 */
public class MedicoDAO {
    
    Connection conect;

    public MedicoDAO() throws SQLException {
        this.conect = ConnectionFactory.getConnection();
    }
    
    public List<MedicoModel> listarUltimoMedico() throws SQLException{
		List<MedicoModel> listarMedicos = new ArrayList<>();
		
		String sql = "Select * from medico ORDER BY COD DESC LIMIT 1";
		MedicoModel med = null ;
		
		try(PreparedStatement preparedStatement = conect.prepareStatement(sql)) {
			
			ResultSet result = preparedStatement.executeQuery();
			
			/*
			 * Dentro do while estou verificando se tem registro no banco de dados, enquanto tiver registro vai 
			 * adcionando um a um na lista e no final fora do while retorna todos os registro encontrados. 
			 */
			while(result.next()){
				med = new MedicoModel();
				med.setCod(result.getString("COD"));
                                med.setRg(result.getString("rg"));
                                med.setCrm(result.getString("crm"));
				med.setNome(result.getString("nome"));
                                med.setTelefone(result.getString("telefone"));
                                med.setCpf(result.getString("cpf"));
                                med.setEndereco(result.getString("endereco"));
                                med.setSexo(result.getString("sexo"));
				// Adcionando cada registro encontro, na lista .
				listarMedicos.add(med);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listarMedicos;
	}
    
    public void cadastrarMedicos(MedicoModel m) throws SQLException{
        Connection conexao = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try{
            stmt = conexao.prepareStatement("INSERT INTO medico (crm, nome, cpf, rg, telefone, endereco, sexo, login, senha) VALUES (?,?,?,?,?,?,?,?,?)");
            stmt.setString(1, m.getCrm());
            stmt.setString(2, m.getNome());
            stmt.setString(3, m.getCpf());
            stmt.setString(4, m.getRg());
            stmt.setString(5, m.getTelefone());
            stmt.setString(6, m.getEndereco());
            stmt.setString(7, m.getSexo());
            stmt.setString(8, m.getLogin());
            stmt.setString(9, m.getSenha());
            stmt.executeUpdate();
        }catch(Exception e1){
            System.out.println("Deu erro!");
        }finally{
            ConnectionFactory.closeConnection(conexao, stmt);
        }
    }
    
    public void apagarMedico(MedicoModel m) throws SQLException{
        Connection conexao = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try{
            stmt = conexao.prepareStatement("DELETE FROM medico WHERE COD = ?");
            stmt.setString(1, m.getCod());
            stmt.executeUpdate();
        }catch(Exception e1){
            System.out.println("Deu erro!");
        }finally{
            ConnectionFactory.closeConnection(conexao, stmt);
        }
    }
    
    public void editarMedico(MedicoModel m) throws SQLException{
        Connection conexao = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try{
            stmt = conexao.prepareStatement("UPDATE medico SET crm = ?, nome = ?, cpf = ?, rg = ?, telefone = ?, endereco = ?, sexo = ? WHERE COD = ?");
            stmt.setString(1, m.getCrm());
            stmt.setString(2, m.getNome());
            stmt.setString(3, m.getCpf());
            stmt.setString(4, m.getRg());
            stmt.setString(5, m.getTelefone());
            stmt.setString(6, m.getEndereco());
            stmt.setString(7, m.getSexo());
            stmt.setString(8, m.getCod());
            stmt.executeUpdate();
        }catch(Exception e1){
            System.out.println("Deu erro!");
        }finally{
            ConnectionFactory.closeConnection(conexao, stmt);
        }
    }
    
    
    public List<MedicoModel> logarMedico(MedicoModel m) throws SQLException{
		List<MedicoModel> logarMed = new ArrayList<>();
                
                Connection conexao = ConnectionFactory.getConnection();
                PreparedStatement stmt = null;
		
		MedicoModel med = null ;
                
                stmt = conexao.prepareStatement("Select * from medico Where login = ? and senha = ?");
                stmt.setString(1, m.getLogin());
                stmt.setString(2, m.getSenha());
                
                ResultSet result = stmt.executeQuery();
			
			/*
			 * Dentro do while estou verificando se tem registro no banco de dados, enquanto tiver registro vai 
			 * adcionando um a um na lista e no final fora do while retorna todos os registro encontrados. 
			 */
                while(result.next()){
                        med = new MedicoModel();
                        med.setCod(result.getString("COD"));
                        med.setLogin(result.getString("login"));
                        med.setSenha(result.getString("senha"));
				
                        // Adcionando cada registro encontro, na lista .
                        logarMed.add(med);
                }
		return logarMed;
	}
    
    
    public List<MedicoModel> listarMedicos() throws SQLException{
		List<MedicoModel> listarMedicos = new ArrayList<>();
		
		String sql = "Select * from medico";
		MedicoModel med = null ;
		
		try(PreparedStatement preparedStatement = conect.prepareStatement(sql)) {
			
			ResultSet result = preparedStatement.executeQuery();
			
			/*
			 * Dentro do while estou verificando se tem registro no banco de dados, enquanto tiver registro vai 
			 * adcionando um a um na lista e no final fora do while retorna todos os registro encontrados. 
			 */
			while(result.next()){
				med = new MedicoModel();
				med.setCod(result.getString("COD"));
				med.setCrm(result.getString("crm"));
                                med.setNome(result.getString("nome"));
                                med.setCpf(result.getString("cpf"));
                                med.setRg(result.getString("rg"));
                                med.setTelefone(result.getString("telefone"));
				med.setEndereco(result.getString("endereco"));
				med.setSexo(result.getString("sexo"));
                                med.setLogin(result.getString("login"));
                                med.setSenha(result.getString("senha"));
                                
				
				// Adcionando cada registro encontro, na lista .
				listarMedicos.add(med);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listarMedicos;
	}
    
     
}
