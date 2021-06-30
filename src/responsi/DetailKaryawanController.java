/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsi;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author Bayu Tri Nugroho
 */
public class DetailKaryawanController {
    DetailKaryawanView detailKaryawanView;
    DetailKaryawanModel detailKaryawanModel;

    public DetailKaryawanController(DetailKaryawanView detailKaryawanView, DetailKaryawanModel detailKaryawanModel, LihatKaryawanView lihatKaryawanView) {
        this.detailKaryawanView = detailKaryawanView;
        this.detailKaryawanModel = detailKaryawanModel;
        
        try{
            String dataKaryawan[][] = detailKaryawanModel.readData();
            detailKaryawanView.lNamaValue.setText(dataKaryawan[0][1]);
            detailKaryawanView.lUsiaValue.setText(dataKaryawan[0][2]);
            detailKaryawanView.lGajiValue.setText(dataKaryawan[0][3]);
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Gagal Membaca Data");
        }
        
        detailKaryawanView.btnKembali.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                detailKaryawanView.dispose();
                lihatKaryawanView.setVisible();
            }
        });
        
        detailKaryawanView.btnTotalGaji.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                int jamLembur;
                String dataKaryawan[][] = detailKaryawanModel.readData();
                try{
                    String Lembur = detailKaryawanView.getLembur();
                    jamLembur = Integer.parseInt(Lembur);
                    if(jamLembur < 0){
                        JOptionPane.showMessageDialog(null, "Jam Lembur Harus Positif");
                    }else{
                        LemburKaryawanView lemburKaryawanView = new LemburKaryawanView(dataKaryawan[0][1]);
                        detailKaryawanView.setHide();
                        LemburKaryawanController lemburKaryawanController = new LemburKaryawanController(jamLembur, dataKaryawan, lemburKaryawanView, detailKaryawanView);
                    }
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null, "Jam lembur tidak boleh kosong atau berisi huruf");
                }
            }
        });
        
        detailKaryawanView.btnEdit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String dataKaryawan[][] = detailKaryawanModel.readData();
                UpdateKaryawanView updateKaryawanView = new UpdateKaryawanView(dataKaryawan[0][1]);
                UpdateKaryawanModel updateKaryawanModel = new UpdateKaryawanModel();
                detailKaryawanView.setHide();
                UpdateKaryawanController updateKaryawanController = new UpdateKaryawanController(dataKaryawan, updateKaryawanView, updateKaryawanModel, detailKaryawanView);
            }
        });
        
        detailKaryawanView.btnHapus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                int result = JOptionPane.showConfirmDialog(null, "Yakin Untuk Menghapus?", "WARNING",
                   JOptionPane.YES_NO_OPTION,
                   JOptionPane.QUESTION_MESSAGE);
                if(result == JOptionPane.YES_OPTION){
                   detailKaryawanModel.deleteData();
                }else if (result == JOptionPane.NO_OPTION){
                   
                }
            }
        });
        
    }
    
}
