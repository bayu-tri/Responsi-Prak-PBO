/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsi;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Bayu Tri Nugroho
 */
public class MenuView extends JFrame{
//    Label
    JLabel lTitle = new JLabel("Main Menu");
    
//    Button
    JButton btnTambahKaryawan = new JButton("Tambah Karyawan");
    JButton btnLihatKaryawan = new JButton("Lihat Karyawan");
    
    public MenuView() {
        setTitle("Aplikasi Karyawan");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setSize(200,200);
        
        add(lTitle);
        lTitle.setBounds(60, 20, 90, 20);
        
        add(btnTambahKaryawan);
        btnTambahKaryawan.setBounds(15, 60, 160, 30);
        
        add(btnLihatKaryawan);
        btnLihatKaryawan.setBounds(15, 100, 160, 30);
    }
    
    public void setHide(){
        this.setVisible(false);
    }
    
    public void setVisible(){
        this.setVisible(true);
    }
}
