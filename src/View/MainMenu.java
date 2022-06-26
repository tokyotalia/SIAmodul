/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import javax.swing.JOptionPane;

/**
 *
 * @author Mena
 */
public class MainMenu {
    
    public MainMenu() {
        showMainMenu();
    }
    
    private void showMainMenu() {
        System.out.println("Try me 2!");
        
        Boolean menu = true;
        while(menu) {
            int chosen = Integer.parseInt(JOptionPane.showInputDialog(null, "Input Menu: \n1.Print User Data \n2.Print Nilai Akhir \n3.Print Rata-Rata Nilai Akhir\n4. Mahasiswa tidak lulus. \n5. Print MatKul Ambil\n6. Print Total Jam Dosen\n7. Print Gaji Staff\n8. Exit"));
            switch(chosen) {
                case 1:
                    new UserData();
                    break;
                case 2: 
                    new NilaiAkhir();
                    break;
                case 3: 
                    new RataNilaiAkhir();
                    break;
                case 4: 
                    new MahasiswaTidakLulus();
                    break;
                case 5: 
                    new MatKulAmbil();
                    break;
                case 6: 
                    new TotalWaktuDosen();
                    break;
                case 7: 
                    new GajiStaff();
                    break;
                case 8: 
                    menu = false;
                    break;
                }
            }
        }
    }
}
