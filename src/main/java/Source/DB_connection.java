/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Source;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author desil
 */
public class DB_connection {
    private final String URL = "jdbc:derby://localhost:1527/BD;"
            + "user=ha;password=ha;";

    private Connection conn;
    private static DB_connection instance;

    private DB_connection() {
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            conn = DriverManager.getConnection(URL);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DB_connection.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DB_connection.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static DB_connection getSingleConnection() {
        try {
            if (instance == null) {
                instance = new DB_connection();
                return instance;
            } else if (instance.conn.isClosed()) {
                instance = new DB_connection();
            
            return instance;
        }else
        {
                return instance;
                }

    }
    catch(Exception ex)
    {
 
        System.out.println ("something went wrong");
        return null;
        }
        
    }
    
    
    public boolean ExecuteQuery( String query)
    {
        
        Statement st=null;
        try {
            st = conn.createStatement();
            int result=st.executeUpdate(query);
            boolean status=(result>0);
            return status;
        } catch (SQLException ex) {
            Logger.getLogger(DB_connection.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } 
    }
}
