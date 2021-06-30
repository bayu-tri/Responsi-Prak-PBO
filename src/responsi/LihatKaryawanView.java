/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsi;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Bayu Tri Nugroho
 */
public class LihatKaryawanView extends JFrame{
    
    JButton btnKembali = new JButton("Kembali");
    JTable tabel;
    DefaultTableModel dtm;
    JScrollPane scrollPane;
    Object namaKolom[] = {"ID", "Nama", "Usia", "Gaji"};

    public LihatKaryawanView() {
        dtm = new DefaultTableModel(namaKolom, 0);
        tabel = new JTable(dtm);
        scrollPane = new JScrollPane(tabel);
        
        setTitle("Data Karyawan");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setSize(600,380);
        
        add(scrollPane);
        scrollPane.setBounds(0, 0, 600, 260);
        
        add(btnKembali);
        btnKembali.setBounds(13, 300, 560, 24);
        
    }
    
    public void setHide(){
        this.setVisible(false);
    }
    
    public void setVisible(){
        this.setVisible(true);
    }
    
    
}
