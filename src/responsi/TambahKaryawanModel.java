/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsi;

import java.sql.*;
import javax.swing.JOptionPane; 

/**
 *
 * @author Bayu Tri Nugroho
 */
public class TambahKaryawanModel {
    DBConnector connector = new DBConnector();
    
    public void insertData(String Nama, int usia, double gaji){
        int jmlData=0;
        try {
           String query = "SELECT * FROM karyawan WHERE nama='" + Nama+"'";
           connector.statement = (Statement) connector.koneksi.createStatement();
           ResultSet resultSet = connector.statement.executeQuery(query);
           
           while (resultSet.next()){ 
                jmlData++;
            }
            
            if (jmlData==0) {                
                query = "INSERT INTO karyawan VALUES(NULL,'"+Nama+"',"+usia+","+gaji+")";

                connector.statement = (Statement) connector.koneksi.createStatement();
                connector.statement.executeUpdate(query); //execute query insert to data_Daerah
                
                System.out.println("Berhasil ditambahkan");
                JOptionPane.showMessageDialog(null, "Data Karyawan Berhasil ditambahkan");
            }
            else {
                JOptionPane.showMessageDialog(null, "Data Karyawan sudah ada");
            }
        } catch (Exception sql) {
            System.out.println(sql.getMessage());   
            JOptionPane.showMessageDialog(null, sql.getMessage());
        }
    }
}
