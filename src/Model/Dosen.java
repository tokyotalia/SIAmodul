/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.List;

/**
 *
 * @author Mena
 */
public abstract class Dosen extends Staff{
    protected String departemen;
    protected List<MatKulAjar> listMataKuliah;

    public Dosen(String departemen, List<MatKulAjar> listMataKuliah, String nama, String alamat, String ttl, int telepon, int nik) {
        super(nama, alamat, ttl, telepon, nik);
        this.departemen = departemen;
        this.listMataKuliah = listMataKuliah;
    }

    public Dosen() {
    }
    

    @Override
    public String toString() {
        return super.toString() + "\nDosen{" + "departemen=" + departemen + ", listMataKuliah=" + listMataKuliah + '}';
    }
    

}
