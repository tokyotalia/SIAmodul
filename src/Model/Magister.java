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
public class Magister extends Sarjana {
    String judulPenelitianTesis;

    public Magister(int nim, String jurusan, String nama, String alamat, String ttl, int telepon, List listMataKuliah, String judulPenelitianTesis) {
        super(nim, jurusan, nama, alamat, ttl, telepon, listMataKuliah);
        this.judulPenelitianTesis = judulPenelitianTesis;
    }

    public Magister() {
    }

    public String getJudulPenelitianTesis() {
        return judulPenelitianTesis;
    }

    public void setJudulPenelitianTesis(String judulPenelitianTesis) {
        this.judulPenelitianTesis = judulPenelitianTesis;
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
        return super.toString() + "\nMagister{" + "judulPenelitianTesis=" + judulPenelitianTesis + '}';
    }
    
}
