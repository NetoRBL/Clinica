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
import model.SecretariaModel;

/**
 *
 * @author Neto
 */
public class AdministradorDAO {
    
    Connection conect;

    public AdministradorDAO() throws SQLException {
        this.conect = ConnectionFactory.getConnection();
    }
    
    public List<AdministradorModel> logarAdministrador(AdministradorModel a) throws SQLException{
		List<AdministradorModel> logarAdmin = new ArrayList<>();
                
                Connection conexao = ConnectionFactory.getConnection();
                PreparedStatement stmt = null;
		
		AdministradorModel adm = null ;
                
                stmt = conexao.prepareStatement("Select * from administrador Where Login = ? and Senha = ?");
                stmt.setString(1, a.getLogin());
                stmt.setString(2, a.getSenha());
                
                ResultSet result = stmt.executeQuery();
			
			/*
			 * Dentro do while estou verificando se tem registro no banco de dados, enquanto tiver registro vai 
			 * adcionando um a um na lista e no final fora do while retorna todos os registro encontrados. 
			 */
                while(result.next()){
                        adm = new AdministradorModel();
                        adm.setCod(result.getString("COD"));
                        adm.setLogin(result.getString("Login"));
                        adm.setSenha(result.getString("Senha"));
				
                        // Adcionando cada registro encontro, na lista .
                        logarAdmin.add(adm);
                }
		return logarAdmin;
	}
    
    public void cadastrarSecretarias(SecretariaModel s) throws SQLException{
        Connection conexao = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try{
            stmt = conexao.prepareStatement("INSERT INTO secretaria (Nome, Login, Senha, CPF, RG, Endereco, Sexo) VALUES (?,?,?,?,?,?,?)");
            stmt.setString(1, s.getNome());
            stmt.setString(2, s.getLogin());
            stmt.setString(3, s.getSenha());
            stmt.setString(4, s.getCpf());
            stmt.setString(5, s.getRg());
            stmt.setString(6, s.getEndereco());
            stmt.setString(7, s.getSexo());
            stmt.executeUpdate();
        }catch(Exception e1){
            System.out.println("Deu erro!");
        }finally{
            ConnectionFactory.closeConnection(conexao, stmt);
        }
    }
    
}
