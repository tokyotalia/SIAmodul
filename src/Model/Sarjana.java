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
public class Sarjana extends Mahasiswa {
    List<MatKulAmbil> listMataKuliah;

    public Sarjana(int nim, String jurusan, String nama, String alamat, String ttl, int telepon, List listMataKuliah) {
        super(nim, jurusan, nama, alamat, ttl, telepon);
        this.listMataKuliah = listMataKuliah;
    }

    public Sarjana() {
    }

    public List<MatKulAmbil> getListMataKuliah() {
        return listMataKuliah;
    }

    public void setListMataKuliah(List<MatKulAmbil> listMataKuliah) {
        this.listMataKuliah = listMataKuliah;
    }

    public int getNim() {
        return nim;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTtl() {
        return ttl;
    }

    public void setTtl(String ttl) {
        this.ttl = ttl;
    }

    public int getTelepon() {
        return telepon;
    }

    public void setTelepon(int telepon) {
        this.telepon = telepon;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nSarjana{" + "listMataKuliah=" + listMataKuliah + '}';
    }
    
}
