/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Mena
 */
public class Doktor extends Mahasiswa {
    String judulPenelitianDisertasi;
    float nilaiSidang1;
    float nilaiSidang2;
    float nilaiSidang3;    

    public Doktor(String judulPenelitianDisertasi, float nilaiSidang1, float nilaiSidang2, float nilaiSidang3, int nim, String jurusan, String nama, String alamat, String ttl, int telepon) {
        super(nim, jurusan, nama, alamat, ttl, telepon);
        this.judulPenelitianDisertasi = judulPenelitianDisertasi;
        this.nilaiSidang1 = nilaiSidang1;
        this.nilaiSidang2 = nilaiSidang2;
        this.nilaiSidang3 = nilaiSidang3;
    }
    
    public Doktor() {
    }

    public String getJudulPenelitianDisertasi() {
        return judulPenelitianDisertasi;
    }

    public void setJudulPenelitianDisertasi(String judulPenelitianDisertasi) {
        this.judulPenelitianDisertasi = judulPenelitianDisertasi;
    }

    public float getNilaiSidang1() {
        return nilaiSidang1;
    }

    public void setNilaiSidang1(float nilaiSidang1) {
        this.nilaiSidang1 = nilaiSidang1;
    }

    public float getNilaiSidang2() {
        return nilaiSidang2;
    }

    public void setNilaiSidang2(float nilaiSidang2) {
        this.nilaiSidang2 = nilaiSidang2;
    }

    public float getNilaiSidang3() {
        return nilaiSidang3;
    }

    public void setNilaiSidang3(float nilaiSidang3) {
        this.nilaiSidang3 = nilaiSidang3;
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
        return super.toString() + "\nDoktor{" + "judulPenelitianDisertasi=" + judulPenelitianDisertasi + ", nilaiSidang1=" + nilaiSidang1 + ", nilaiSidang2=" + nilaiSidang2 + ", nilaiSidang3=" + nilaiSidang3 + '}';
    }
    
    
}
