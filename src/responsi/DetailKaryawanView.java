/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsi;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Bayu Tri Nugroho
 */
public class DetailKaryawanView extends JFrame{
    JLabel lTitle = new JLabel("Menu Karyawan");
    JLabel lNama = new JLabel("Nama");
    JLabel lUsia = new JLabel("Usia");
    JLabel lGaji = new JLabel("Gaji");
    JLabel lLembur = new JLabel("Lembur (Jam)");
    
    JLabel lNamaValue = new JLabel("");
    JLabel lUsiaValue = new JLabel("");
    JLabel lGajiValue = new JLabel("");
    JTextField tfLembur = new JTextField();
    
    JButton btnEdit = new JButton("Edit");
    JButton btnHapus = new JButton("Hapus");
    JButton btnKembali = new JButton("Kembali");
    JButton btnTotalGaji = new JButton("Total Gaji");
    
    public DetailKaryawanView(String titleNama) {
        
        setTitle(titleNama);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setSize(380,420);
        
        add(lTitle);
        lTitle.setBounds(110, 20, 160, 20);
        
        add(lNama);
        lNama.setBounds(20, 60, 80, 20);
        add(lUsia);
        lUsia.setBounds(20, 100, 80, 20);
        add(lGaji);
        lGaji.setBounds(20, 140, 80, 20);
        add(lLembur);
        lLembur.setBounds(20, 180, 80, 20);
        
        add(lNamaValue);
        lNamaValue.setBounds(140, 60, 200, 20);
        add(lUsiaValue);
        lUsiaValue.setBounds(140, 100, 200, 20);
        add(lGajiValue);
        lGajiValue.setBounds(140, 140, 200, 20);
        add(tfLembur);
        tfLembur.setBounds(140, 180, 200, 20);
        
        add(btnEdit);
        btnEdit.setBounds(160, 300, 80, 24);
        add(btnHapus);
        btnHapus.setBounds(260, 300, 80, 24);
        
        add(btnTotalGaji);
        btnTotalGaji.setBounds(120, 230, 120, 24);
        
        add(btnKembali);
        btnKembali.setBounds(10, 340, 330, 24);
        
    }
    
    public String getLembur(){
        return tfLembur.getText();
    }
   
    public void setHide(){
        this.setVisible(false);
    }
    
    public void setVisible(){
        this.setVisible(true);
    }
}
