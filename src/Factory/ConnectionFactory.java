/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Henrick
 */
public class ConnectionFactory {
    
    public Connection getConnection() {
		 try {
			return DriverManager.getConnection("jdbc:mysql://localhost/bdfutstore","root","1234");
		 }         
		 catch(SQLException excecao) {
			throw new RuntimeException(excecao);
		 }
    
    }
}
