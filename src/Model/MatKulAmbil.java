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
public class MatKulAmbil {
    MataKuliah mataKuliah;
    List<Presensi> presensi;
    int n1;
    int n2;
    int n3;

    public MatKulAmbil(MataKuliah mataKuliah, List<Presensi> presensi, int n1, int n2, int n3) {
        this.mataKuliah = mataKuliah;
        this.presensi = presensi;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    public MatKulAmbil() {
    }

    public MataKuliah getMataKuliah() {
        return mataKuliah;
    }

    public void setMataKuliah(MataKuliah mataKuliah) {
        this.mataKuliah = mataKuliah;
    }

    public List<Presensi> getPresensi() {
        return presensi;
    }

    public void setPresensi(List<Presensi> presensi) {
        this.presensi = presensi;
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public int getN3() {
        return n3;
    }

    public void setN3(int n3) {
        this.n3 = n3;
    }

    @Override
    public String toString() {
        return "MatKulAmbil{" + "mataKuliah=" + mataKuliah + ", presensi=" + presensi + ", n1=" + n1 + ", n2=" + n2 + ", n3=" + n3 + '}';
    }
    
    
}
