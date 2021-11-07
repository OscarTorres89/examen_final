/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author ekt
 */
public class conexion {
    
    Connection cn;
    Statement st;
   
    
    public Connection conectar(){
try 
        {
        
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/examenfinalprogra2b_2","root","");
            System.out.println("conexion exitosa");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("No se pudo cargar el driver.");
        }  return cn;     
           
    }
    
Statement createStatement(){
    throw new UnsupportedOperationException("no se a podido conectar");
}
}
