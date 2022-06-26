/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Mena
 */
public class PresensiStaff extends Presensi implements Status {
    int jam;

    public PresensiStaff(int jam, String tanggal, int status) {
        super(tanggal, status);
        this.jam = jam;
    }

    public PresensiStaff() {
    }

    @Override
    public String toString() {
        return super.toString() + "\nPresensiStaff{" + "jam=" + jam + '}';
    }
    
    
}
