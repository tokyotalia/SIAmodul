/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Mena
 */
public class Presensi implements Status {
    String tanggal;
    int status;

    public Presensi(String tanggal, int status) {
        this.tanggal = tanggal;
        this.status = status;
    }

    public Presensi() {
    }

    @Override
    public String toString() {
        return "Presensi{" + "tanggal=" + tanggal + ", status=" + status + '}';
    }
    
}
