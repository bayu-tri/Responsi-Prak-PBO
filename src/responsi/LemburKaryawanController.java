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
public class LemburKaryawanController {
    LemburKaryawanView lemburKaryawanView;
            
    public LemburKaryawanController(int jamLembur, String dataKaryawan[][], LemburKaryawanView lemburKaryawanView, DetailKaryawanView detailKaryawanView) {
        this.lemburKaryawanView = lemburKaryawanView;
        lemburKaryawanView.lNamaValue.setText(dataKaryawan[0][1]);
        lemburKaryawanView.lUsiaValue.setText(dataKaryawan[0][2]);
        lemburKaryawanView.lGajiValue.setText(dataKaryawan[0][3]);
        
        double Gaji = Double.parseDouble(dataKaryawan[0][3]);
        String TotalGaji = String.valueOf(Gaji + (jamLembur*25000));
        
        lemburKaryawanView.lTotalGajiValue.setText(TotalGaji);
        
        lemburKaryawanView.btnKembali.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                lemburKaryawanView.dispose();
                detailKaryawanView.setVisible();
            }
        });
    }
    
}
