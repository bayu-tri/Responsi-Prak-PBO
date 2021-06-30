/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsi;

import java.sql.*;


/**
 *
 * @author Bayu Tri Nugroho
 */
public class DBConnector{
    private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DATABASE_NAME = "karyawan";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    private static final String URL = "jdbc:mysql://localhost:3306/" + DATABASE_NAME;
    
    Connection koneksi;
    Statement statement;
    public DBConnector() {
        try{
            Class.forName(JDBC_DRIVER);
            koneksi = (Connection) DriverManager.getConnection(URL,USER,PASSWORD);
            System.out.println("Koneksi Berhasil");
        }catch(Exception ex){
            System.out.println("Koneksi gagal");
        }
    }
}
