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
import model.MedicoModel;
import model.PacienteModel;
import model.SecretariaModel;

/**
 *
 * @author Neto
 */
public interface ConsultaDAO {
    void editarConsulta(ConsultaModel c) throws SQLException;
    void cadastrarConsulta(ConsultaModel c) throws SQLException;
    void apagarConsulta(ConsultaModel c) throws SQLException;
    List<ConsultaModel> listarUltimaConsulta() throws SQLException;
    List<ConsultaModel> listarConsultas() throws SQLException;
}
// public class ConsultaDAO {
//     Connection conect;
    
//     public ConsultaDAO() throws SQLException {
//         this.conect = ConnectionFactory.getConnection();
//     }
    
//     public void editarConsulta(ConsultaModel c) throws SQLException{
//         Connection conexao = ConnectionFactory.getConnection();
//         PreparedStatement stmt = null;
//         try{
//             stmt = conexao.prepareStatement("UPDATE consulta SET medico = ?, data = ?, paciente = ?, hora = ? WHERE COD = ?");
//             stmt.setString(1, c.getMedico());
//             stmt.setString(2, c.getData());
//             stmt.setString(3, c.getPaciente());
//             stmt.setString(4, c.getHora());
//             stmt.setString(5, c.getCod());
//             stmt.executeUpdate();
//         }catch(Exception e1){
//             System.out.println("Deu erro!");
//         }finally{
//             ConnectionFactory.closeConnection(conexao, stmt);
//         }
//     }
    
//     public void cadastrarConsulta(ConsultaModel c) throws SQLException{
//         Connection conexao = ConnectionFactory.getConnection();
//         PreparedStatement stmt = null;
//         try{
//             stmt = conexao.prepareStatement("INSERT INTO consulta (medico, data, paciente, hora) VALUES (?,?,?,?)");
//             stmt.setString(1, c.getMedico());
//             stmt.setString(2, c.getData());
//             stmt.setString(3, c.getPaciente());
//             stmt.setString(4, c.getHora());
//             stmt.executeUpdate();
//         }catch(Exception e1){
//             System.out.println("Deu erro!");
//         }finally{
//             ConnectionFactory.closeConnection(conexao, stmt);
//         }
//     }
    
//     public void apagarConsulta(ConsultaModel c) throws SQLException{
//         Connection conexao = ConnectionFactory.getConnection();
//         PreparedStatement stmt = null;
//         try{
//             stmt = conexao.prepareStatement("DELETE FROM consulta WHERE COD = ?");
//             stmt.setString(1, c.getCod());
//             stmt.executeUpdate();
//         }catch(Exception e1){
//             System.out.println("Deu erro!");
//         }finally{
//             ConnectionFactory.closeConnection(conexao, stmt);
//         }
//     }
    
//     public List<ConsultaModel> listarUltimaConsulta() throws SQLException{
// 		List<ConsultaModel> listarConsultas = new ArrayList<>();
		
// 		String sql = "Select * from consulta ORDER BY COD DESC LIMIT 1";
// 		ConsultaModel cons = null ;
		
// 		try(PreparedStatement preparedStatement = conect.prepareStatement(sql)) {
			
// 			ResultSet result = preparedStatement.executeQuery();
			
// 			/*
// 			 * Dentro do while estou verificando se tem registro no banco de dados, enquanto tiver registro vai 
// 			 * adcionando um a um na lista e no final fora do while retorna todos os registro encontrados. 
// 			 */
// 			while(result.next()){
// 				cons = new ConsultaModel();
// 				cons.setCod(result.getString("COD"));
//                                 cons.setMedico(result.getString("medico"));
//                                 cons.setPaciente(result.getString("paciente"));
// 				cons.setData(result.getString("data"));
//                                 cons.setHora(result.getString("hora"));
// 				// Adcionando cada registro encontro, na lista .
// 				listarConsultas.add(cons);
// 			}
			
// 		} catch (SQLException e) {
// 			// TODO Auto-generated catch block
// 			e.printStackTrace();
// 		}
// 		return listarConsultas;
// 	}
    
//     public List<ConsultaModel> listarConsultas() throws SQLException{
// 		List<ConsultaModel> listarConsultas = new ArrayList<>();
		
// 		String sql = "Select * from consulta";
// 		ConsultaModel cons = null ;
		
// 		try(PreparedStatement preparedStatement = conect.prepareStatement(sql)) {
			
// 			ResultSet result = preparedStatement.executeQuery();
			
// 			/*
// 			 * Dentro do while estou verificando se tem registro no banco de dados, enquanto tiver registro vai 
// 			 * adcionando um a um na lista e no final fora do while retorna todos os registro encontrados. 
// 			 */
// 			while(result.next()){
// 				cons = new ConsultaModel();
// 				cons.setCod(result.getString("COD"));
// 				cons.setMedico(result.getString("medico"));
//                                 cons.setPaciente(result.getString("paciente"));
//                                 cons.setData(result.getString("data"));
//                                 cons.setHora(result.getString("hora"));                       
				
// 				// Adcionando cada registro encontro, na lista .
// 				listarConsultas.add(cons);
// 			}
			
// 		} catch (SQLException e) {
// 			// TODO Auto-generated catch block
// 			e.printStackTrace();
// 		}
// 		return listarConsultas;
// 	}
// }
