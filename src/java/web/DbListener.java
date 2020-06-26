package web;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 *
 * @author prisc
 */
public class DbListener implements ServletContextListener{

    /**
     *
     */
    public static final String JDBCURL = "jdbc:sqlite:C:\\Users\\prisc\\login.db";
    
    public static String exceptionMessage = null;
    
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        String step = "Database creation";
        try{
            Class.forName("org.sqlite.JDBC");
            Connection con = DriverManager.getConnection(JDBCURL);
            Statement stmt = con.createStatement();
            
            step = "Table 'usuario' creation";
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS usuario("
                    + "usuario VARCHAR(100),"
                    + "senha VARCHAR(100),"
                    + ")");
          
            stmt.close();
            con.close();
        }catch(Exception ex){
            exceptionMessage = step + ": " + ex.getMessage();
        }
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        
    }
}
