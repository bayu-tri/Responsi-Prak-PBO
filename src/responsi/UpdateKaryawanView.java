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
public class UpdateKaryawanView extends JFrame{
    JLabel lTitle = new JLabel("Update Karyawan");
    JLabel lNama = new JLabel("Nama");
    JLabel lUsia = new JLabel("Usia");
    JLabel lGaji = new JLabel("Gaji");
    
    JTextField tfNama = new JTextField();
    JTextField tfUsia = new JTextField();
    JTextField tfGaji = new JTextField();
    
    JButton btnSubmit = new JButton("Submit");
    JButton btnReset = new JButton("Reset");
    JButton btnKembali = new JButton("Kembali");
    
    public UpdateKaryawanView(String Nama) {
        
        setTitle(Nama);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setSize(320,300);
        
        add(lTitle);
        lTitle.setBounds(110, 20, 160, 20);
        
        add(lNama);
        lNama.setBounds(20, 60, 40, 20);
        add(lUsia);
        lUsia.setBounds(20, 100, 40, 20);
        add(lGaji);
        lGaji.setBounds(20, 140, 40, 20);
        
        add(tfNama);
        tfNama.setBounds(80, 60, 200, 20);
        add(tfUsia);
        tfUsia.setBounds(80, 100, 200, 20);
        add(tfGaji);
        tfGaji.setBounds(80, 140, 200, 20);
        
        add(btnSubmit);
        btnSubmit.setBounds(100, 180, 80, 24);
        add(btnReset);
        btnReset.setBounds(200, 180, 80, 24);
        
        add(btnKembali);
        btnKembali.setBounds(10, 220, 280, 24);
        
    }
    
    public String getNama(){
        return tfNama.getText();
    }
    public String getUsia(){
        return tfUsia.getText();
    }
    public String getGaji(){
        return tfGaji.getText();
    }
    
    public void resetData(){
        tfNama.setText("");
        tfUsia.setText("");
        tfGaji.setText("");
    }
    
    public void setHide(){
        this.setVisible(false);
    }
    
    public void setVisible(){
        this.setVisible(true);
    }
}
