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
public class UpdateKaryawanController {
    UpdateKaryawanView updateKaryawanView;
    UpdateKaryawanModel updateKaryawanModel;
    
    public UpdateKaryawanController(String dataKaryawan[][], UpdateKaryawanView updateKaryawanView, UpdateKaryawanModel updateKaryawanModel, DetailKaryawanView detailKaryawanView) {
        this.updateKaryawanView = updateKaryawanView;
        this.updateKaryawanModel = updateKaryawanModel;
        
        updateKaryawanView.tfNama.setText(dataKaryawan[0][1]);
        updateKaryawanView.tfUsia.setText(dataKaryawan[0][2]);
        updateKaryawanView.tfGaji.setText(dataKaryawan[0][3]);
        
        updateKaryawanView.btnSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                boolean namaNumberic = false;
                String Nama = updateKaryawanView.getNama();
                try {
                    Double num = Double.parseDouble(Nama);
                    namaNumberic = true;
                } catch (NumberFormatException e) {
                    namaNumberic = false;
                }
                try{
                    int Usia = Integer.parseInt(updateKaryawanView.getUsia());
                    double Gaji = Double.parseDouble(updateKaryawanView.getGaji());
                    
                    if(Usia <= 0 || Gaji < 0 || namaNumberic == true ){
                        JOptionPane.showMessageDialog(null, "Nama Harus Huruf, Usia dan Gaji harus bilangan positif");
                    }
                    else
                    {
                        updateKaryawanModel.updateData(Nama, Usia, Gaji, Integer.parseInt(dataKaryawan[0][0]));
                    }
                    
                }
                catch (Exception e){
                    JOptionPane.showMessageDialog(null, "Usia dan Gaji harus bilangan dan semua field tidak boleh kosong");
                }
                
            }
        });
        
        updateKaryawanView.btnReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try{
                    updateKaryawanView.resetData();
                }
                catch (Exception e){
                    JOptionPane.showMessageDialog(null, "Gagal Reset Data");
                }
                
            }
        });
        
        updateKaryawanView.btnKembali.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                updateKaryawanView.dispose();
                detailKaryawanView.setVisible();
            }
        });
        
    }
    
}
