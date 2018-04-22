/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class Conexion {
    private String USERNAME = "root";
    private String PASSWORD = "PracticalSolutions";
    private String HOST = "localhost";
    private String PORT = "3306";
    private String DATABASE= "loginjsp";
    private String CLASSNAME = "com.mysql.jdbc.Driver";
    private String URL = "jdbc:mysql://"+HOST+":"+PORT+"/"+DATABASE;
    private Connection con;
     
    public Conexion (){
        try {
            Class.forName(CLASSNAME);
            con = DriverManager.getConnection(URL,USERNAME,PASSWORD);
        } catch (ClassNotFoundException ex) {
            System.err.println("ERROR:" + ex);
        } catch (SQLException e)
        {
            System.err.println("ERROR:" + e );
        }

    }
    
    public Connection getConexion()
    {
        return con;
    }

    
    public static void main(String[] args) {
        Conexion con = new Conexion();
        System.out.println("Controlador.Conexion.main()");

}

}