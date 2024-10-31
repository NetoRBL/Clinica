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
import model.ConsultaModel;
import model.ConvenioModel;

/**
 *
 * @author Neto
 */
public class ConvenioDAO {
    Connection conect;
    
    public ConvenioDAO() throws SQLException {
        this.conect = ConnectionFactory.getConnection();
    }
    
    public void editarConvenio(ConvenioModel c) throws SQLException{
        Connection conexao = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try{
            stmt = conexao.prepareStatement("UPDATE convenio SET tipo_plano = ?, cliente = ?, telefone = ?, endereco = ?, sexo = ?, cpf = ?, rg = ?, tipo_servico = ? WHERE COD = ?");
            stmt.setString(1, c.getTipo_plano());
            stmt.setString(2, c.getCliente());
            stmt.setString(3, c.getTelefone());
            stmt.setString(4, c.getEndereco());
            stmt.setString(5, c.getSexo());
            stmt.setString(6, c.getCpf());
            stmt.setString(7, c.getRg());
            stmt.setString(8, c.getTipo_servico());
            stmt.setString(9, c.getCod());
            stmt.executeUpdate();
        }catch(Exception e1){
            System.out.println("Deu erro!");
        }finally{
            ConnectionFactory.closeConnection(conexao, stmt);
        }
    }
    
    public void cadastrarConvenio(ConvenioModel c) throws SQLException{
        Connection conexao = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try{
            stmt = conexao.prepareStatement("INSERT INTO convenio (tipo_plano, cliente, telefone, endereco, sexo, cpf, rg, tipo_servico) VALUES (?,?,?,?,?,?,?,?)");
            stmt.setString(1, c.getTipo_plano());
            stmt.setString(2, c.getCliente());
            stmt.setString(3, c.getTelefone());
            stmt.setString(4, c.getEndereco());
            stmt.setString(5, c.getSexo());
            stmt.setString(6, c.getCpf());
            stmt.setString(7, c.getRg());
            stmt.setString(8, c.getTipo_servico());
            stmt.executeUpdate();
        }catch(Exception e1){
            System.out.println("Deu erro!");
        }finally{
            ConnectionFactory.closeConnection(conexao, stmt);
        }
    }
    
    public void apagarConvenio(ConvenioModel c) throws SQLException{
        Connection conexao = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try{
            stmt = conexao.prepareStatement("DELETE FROM convenio WHERE COD = ?");
            stmt.setString(1, c.getCod());
            stmt.executeUpdate();
        }catch(Exception e1){
            System.out.println("Deu erro!");
        }finally{
            ConnectionFactory.closeConnection(conexao, stmt);
        }
    }
    
    public List<ConvenioModel> listarUltimoConvenio() throws SQLException{
		List<ConvenioModel> listarConvenio = new ArrayList<>();
		
		String sql = "Select * from convenio ORDER BY COD DESC LIMIT 1";
		ConvenioModel conv = null ;
		
		try(PreparedStatement preparedStatement = conect.prepareStatement(sql)) {
			
			ResultSet result = preparedStatement.executeQuery();
			
			/*
			 * Dentro do while estou verificando se tem registro no banco de dados, enquanto tiver registro vai 
			 * adcionando um a um na lista e no final fora do while retorna todos os registro encontrados. 
			 */
			while(result.next()){
				conv = new ConvenioModel();
				conv.setCod(result.getString("COD"));
				conv.setTipo_servico(result.getString("tipo_servico"));
                                conv.setTipo_plano(result.getString("tipo_plano"));
                                conv.setCliente(result.getString("cliente"));
                                conv.setTelefone(result.getString("telefone"));
                                conv.setEndereco(result.getString("endereco"));
                                conv.setSexo(result.getString("sexo"));
                                conv.setCpf(result.getString("cpf"));
                                conv.setRg(result.getString("rg"));
				// Adcionando cada registro encontro, na lista .
				listarConvenio.add(conv);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listarConvenio;
	}
    
    public List<ConvenioModel> listarConvenios() throws SQLException{
		List<ConvenioModel> listarConvenio = new ArrayList<>();
		
		String sql = "Select * from convenio";
		ConvenioModel conv = null ;
		
		try(PreparedStatement preparedStatement = conect.prepareStatement(sql)) {
			
			ResultSet result = preparedStatement.executeQuery();
			
			/*
			 * Dentro do while estou verificando se tem registro no banco de dados, enquanto tiver registro vai 
			 * adcionando um a um na lista e no final fora do while retorna todos os registro encontrados. 
			 */
			while(result.next()){
				conv = new ConvenioModel();
				conv.setCod(result.getString("COD"));
				conv.setTipo_servico(result.getString("tipo_servico"));
                                conv.setTipo_plano(result.getString("tipo_plano"));
                                conv.setCliente(result.getString("cliente"));
                                conv.setTelefone(result.getString("telefone"));
                                conv.setEndereco(result.getString("endereco"));
                                conv.setSexo(result.getString("sexo"));
                                conv.setCpf(result.getString("cpf"));
                                conv.setRg(result.getString("rg"));
				
				// Adcionando cada registro encontro, na lista .
				listarConvenio.add(conv);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listarConvenio;
	}
}
