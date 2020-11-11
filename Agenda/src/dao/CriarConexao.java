package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Cleber
 */
public class CriarConexao {

    public static Connection getConexao() throws SQLException{
    
        try{
            Class.forName("org.postgresql.Driver");
            System.out.println("Conectando ao Banco");
            return DriverManager.getConnection("jdbc:postgresql://localhost:5433/AgendaBD", "postgres", "123456");
        }catch(ClassNotFoundException ex){
            throw new SQLException(ex.getMessage());
        }
    
    }

}
