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
import model.CidModel;
import model.ConsultaModel;

/**
 *
 * @author Neto
 */
public class CidDAO {
    
    Connection conect;
    
    public CidDAO() throws SQLException {
        this.conect = ConnectionFactory.getConnection();
    }
    public List<CidModel> listarCid() throws SQLException{
		List<CidModel> listarCid = new ArrayList<>();
		
		String sql = "Select * from cid";
		CidModel cid = null ;
		
		try(PreparedStatement preparedStatement = conect.prepareStatement(sql)) {
			
			ResultSet result = preparedStatement.executeQuery();
			
			/*
			 * Dentro do while estou verificando se tem registro no banco de dados, enquanto tiver registro vai 
			 * adcionando um a um na lista e no final fora do while retorna todos os registro encontrados. 
			 */
			while(result.next()){
				cid = new CidModel();
				cid.setCod(result.getString("COD"));
				cid.setIdCid(result.getString("idCid"));
                                cid.setDescricao(result.getString("descricaoCid"));                      
				
				// Adcionando cada registro encontro, na lista .
				listarCid.add(cid);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listarCid;
	}
}
