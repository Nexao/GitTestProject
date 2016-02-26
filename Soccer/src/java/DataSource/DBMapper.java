/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataSource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Emil
 */
public class DBMapper {
    
    private static String driver = "com.mysql.jdbc.Driver";
    private static String url = "jdbc:mysql://localhost:3306/Soccer";
    private static String dbUser = "root";			
    private static String pwd = "brsb2012";
    
    public boolean createPlayer(String username, String pPosition, int pNumber, String teamId){
        boolean result = false;
        
        try {
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(url, dbUser, pwd);
            String sqlString = "insert into player(Player_name, Player_position, Player_number, Team_id) values (?,?,?,?)";
            PreparedStatement stmt = conn.prepareStatement(sqlString);
            stmt.setString(1, username);
            stmt.setString(2, pPosition);
            stmt.setInt(3, pNumber);
            stmt.setString(4, teamId);
            stmt.execute();
            stmt.close();
            conn.close();
            result = true;
        } catch (ClassNotFoundException | SQLException ex) {
          Logger.getLogger(DBFacade.class.getName()).log(Level.SEVERE, null, ex);
          result = false;
        }
        return result;        
    }
    
}
