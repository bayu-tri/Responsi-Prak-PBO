/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsi;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane; 


/**
 *
 * @author Bayu Tri Nugroho
 */
public class TambahKaryawanController {
    TambahKaryawanView tambahKaryawanView;
    TambahKaryawanModel tambahKaryawanModel;
    
    public TambahKaryawanController(TambahKaryawanView tambahKaryawanView, TambahKaryawanModel tambahKaryawanModel, MenuView menuView) {
        this.tambahKaryawanView = tambahKaryawanView;
        this.tambahKaryawanModel = tambahKaryawanModel;
        
        tambahKaryawanView.btnTambah.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String Nama = tambahKaryawanView.getNama();
                try{
                    int Usia = Integer.parseInt(tambahKaryawanView.getUsia());
                    double Gaji = Double.parseDouble(tambahKaryawanView.getGaji());
                    
                    if(Usia < 0 || Gaji < 0){
                        JOptionPane.showMessageDialog(null, "Usia dan Gaji harus positif");
                    }
                    else
                    {
                        tambahKaryawanModel.insertData(Nama, Usia, Gaji);
                    }
                    
                }
                catch (Exception e){
                    JOptionPane.showMessageDialog(null, "Usia dan Gaji harus bilangan");
                }
                
            }
        });
        
        tambahKaryawanView.btnReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try{
                    tambahKaryawanView.resetData();
                }
                catch (Exception e){
                    JOptionPane.showMessageDialog(null, "Gagal Reset Data");
                }
                
            }
        });
        
        tambahKaryawanView.btnKembali.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                tambahKaryawanView.dispose();
                menuView.setVisible();
            }
        });
    }
    
}
