package controller;

import java.sql.SQLException;

public class ConsultaDAOFactory {
    public static ConsultaDAO getConsultaDAO() throws SQLException {
        return new ConsultaDAOImpl();
    }
}
