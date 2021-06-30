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
public class LihatKaryawanController {
    LihatKaryawanModel lihatKaryawanModel;
    LihatKaryawanView lihatKaryawanView;

    public LihatKaryawanController(LihatKaryawanView lihatKaryawanView, LihatKaryawanModel lihatKaryawanModel, MenuView menuView) {
        this.lihatKaryawanModel = lihatKaryawanModel;
        this.lihatKaryawanView = lihatKaryawanView;
        
        if (lihatKaryawanModel.getBanyakData()!=0) {
            String dataKaryawan[][] = lihatKaryawanModel.readData();
            lihatKaryawanView.tabel.setModel((new JTable(dataKaryawan, this.lihatKaryawanView.namaKolom)).getModel());
        }
        else {
            JOptionPane.showMessageDialog(null, "Belum ada data");
        }
        
        lihatKaryawanView.btnKembali.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                lihatKaryawanView.dispose();
                menuView.setVisible();
            }
        });
        
        lihatKaryawanView.tabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mousePressed(e);
                int baris = lihatKaryawanView.tabel.getSelectedRow();
//                int kolom = lihatVieww.tabel.getSelectedColumn(); // ga kepake sekarang

                String namaTerpilih = lihatKaryawanView.tabel.getValueAt(baris, 1).toString();
                String idTerpilih = lihatKaryawanView.tabel.getValueAt(baris, 0).toString();

//                System.out.println(idTerpilih);

                lihatKaryawanView.setHide();
                
                DetailKaryawanView detailKaryawanView = new DetailKaryawanView(namaTerpilih);
                DetailKaryawanModel detailKaryawanModel = new DetailKaryawanModel(idTerpilih);
                DetailKaryawanController detailKaryawanController = new DetailKaryawanController(detailKaryawanView, detailKaryawanModel, lihatKaryawanView);

            }
        }
        );
    }
}
