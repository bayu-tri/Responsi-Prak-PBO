/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsi;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Bayu Tri Nugroho
 */
public class MenuController {
    MenuView menuView;
    
    public MenuController(MenuView menuView) {
        this.menuView = menuView;
        
        menuView.btnTambahKaryawan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
//                System.out.println("tambah clicked");
                TambahKaryawanView tambahKaryawanView = new TambahKaryawanView();
                menuView.setHide();
                TambahKaryawanModel tambahKaryawanModel = new TambahKaryawanModel();
                TambahKaryawanController tambahKaryawanController = new TambahKaryawanController(tambahKaryawanView, tambahKaryawanModel, menuView);
            }
        });
         
        menuView.btnLihatKaryawan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                System.out.println("lihat clicked");
                
                LihatKaryawanView lihatKaryawanView = new LihatKaryawanView();
                menuView.setHide();
                LihatKaryawanModel lihatKaryawanModel = new LihatKaryawanModel();
                LihatKaryawanController lihatKaryawanController = new LihatKaryawanController(lihatKaryawanView, lihatKaryawanModel, menuView);
            }
        });
         
    }
    
}
