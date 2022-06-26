/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Mena
 */
public class MataKuliah {
    protected int kode;
    protected int sks;
    protected String nama;

    public MataKuliah() {
    }

    public MataKuliah(int kode, int sks, String nama) {
        this.kode = kode;
        this.sks = sks;
        this.nama = nama;
    }

    @Override
    public String toString() {
        return "MataKuliah{" + "kode=" + kode + ", sks=" + sks + ", nama=" + nama + '}';
    }
    
}
