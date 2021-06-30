/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsi;

/**
 *
 * @author Bayu Tri Nugroho
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        MenuView menuView = new MenuView();
        MenuController menuController = new MenuController(menuView);
    }
    
}
