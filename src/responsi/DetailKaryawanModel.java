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
public class DetailKaryawanModel {
    int idKaryawan;
    DBConnector connector = new DBConnector();
    
    public DetailKaryawanModel(String idKaryawan) {
        this.idKaryawan = Integer.parseInt(idKaryawan);
    }
    
    public String[][] readData(){
        try{
            int jmlData = 0;
            
            String data[][] = new String[1][4]; //baris, kolom nya ada 4
            
            connector.statement = connector.koneksi.createStatement();
            String query = "SELECT * FROM karyawan WHERE id="+this.idKaryawan; 
            ResultSet resultSet = connector.statement.executeQuery(query);
            while (resultSet.next()){
                data[jmlData][0] = resultSet.getString("id"); //harus sesuai nama kolom di mysql
                data[jmlData][1] = resultSet.getString("nama");                
                data[jmlData][2] = resultSet.getString("usia");
                data[jmlData][3] = resultSet.getString("gaji");
                
                jmlData++;
            }
            return data;
               
        }catch(SQLException e){
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
            return null;
        }
    }
    
    public void deleteData(){
        try{
            connector.statement = connector.koneksi.createStatement();
            String query = "DELETE FROM karyawan WHERE id="+this.idKaryawan; 
            connector.statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Data Karyawan Berhasil dihapus");
               
        }catch(SQLException e){
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
        }
    }

    
}
