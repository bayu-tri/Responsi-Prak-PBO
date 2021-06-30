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
public class UpdateKaryawanModel {
    DBConnector connector = new DBConnector();
    
    public void updateData(String Nama, int Usia, double Gaji, int ID){
        try {
                String query = "UPDATE karyawan SET nama = '"+Nama+"', usia = "+Usia+", gaji = "+Gaji+" WHERE id = "+ID;

                connector.statement = (Statement) connector.koneksi.createStatement();
                connector.statement.executeUpdate(query); //execute query insert to data_Daerah
                
                System.out.println("Berhasil ditambahkan");
                JOptionPane.showMessageDialog(null, "Data Karyawan Berhasil diubah");
        } catch (Exception sql) {
            System.out.println(sql.getMessage());   
            JOptionPane.showMessageDialog(null, sql.getMessage());
        }
    }
    
}
