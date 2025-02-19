package controller;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import connection.ConnectionFactory;
import controller.ConsultaDAO;
import model.ConsultaModel;

public class ConsultaDAOImpl implements ConsultaDAO {
    private final Connection conect;

    public ConsultaDAOImpl() throws SQLException {
        this.conect = ConnectionFactory.getConnection();
    }

    @Override
    public void editarConsulta(ConsultaModel c) throws SQLException {
        String sql = "UPDATE consulta SET medico = ?, data = ?, paciente = ?, hora = ? WHERE COD = ?";
        try (PreparedStatement stmt = conect.prepareStatement(sql)) {
            stmt.setString(1, c.getMedico());
            stmt.setString(2, c.getData());
            stmt.setString(3, c.getPaciente());
            stmt.setString(4, c.getHora());
            stmt.setString(5, c.getCod());
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro ao editar consulta!");
        }
    }

    @Override
    public void cadastrarConsulta(ConsultaModel c) throws SQLException {
        String sql = "INSERT INTO consulta (medico, data, paciente, hora) VALUES (?,?,?,?)";
        try (PreparedStatement stmt = conect.prepareStatement(sql)) {
            stmt.setString(1, c.getMedico());
            stmt.setString(2, c.getData());
            stmt.setString(3, c.getPaciente());
            stmt.setString(4, c.getHora());
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar consulta!");
        }
    }

    @Override
    public void apagarConsulta(ConsultaModel c) throws SQLException {
        String sql = "DELETE FROM consulta WHERE COD = ?";
        try (PreparedStatement stmt = conect.prepareStatement(sql)) {
            stmt.setString(1, c.getCod());
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro ao apagar consulta!");
        }
    }

    @Override
    public List<ConsultaModel> listarUltimaConsulta() throws SQLException {
        List<ConsultaModel> listarConsultas = new ArrayList<>();
        String sql = "SELECT * FROM consulta ORDER BY COD DESC LIMIT 1";

        try (PreparedStatement stmt = conect.prepareStatement(sql);
             ResultSet result = stmt.executeQuery()) {
            while (result.next()) {
                ConsultaModel cons = new ConsultaModel();
                cons.setCod(result.getString("COD"));
                cons.setMedico(result.getString("medico"));
                cons.setPaciente(result.getString("paciente"));
                cons.setData(result.getString("data"));
                cons.setHora(result.getString("hora"));
                listarConsultas.add(cons);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listarConsultas;
    }

    @Override
    public List<ConsultaModel> listarConsultas() throws SQLException {
        List<ConsultaModel> listarConsultas = new ArrayList<>();
        String sql = "SELECT * FROM consulta";

        try (PreparedStatement stmt = conect.prepareStatement(sql);
             ResultSet result = stmt.executeQuery()) {
            while (result.next()) {
                ConsultaModel cons = new ConsultaModel();
                cons.setCod(result.getString("COD"));
                cons.setMedico(result.getString("medico"));
                cons.setPaciente(result.getString("paciente"));
                cons.setData(result.getString("data"));
                cons.setHora(result.getString("hora"));
                listarConsultas.add(cons);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listarConsultas;
    }
}
