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
public class Karyawan extends Staff {
    int salary;
    List <PresensiStaff> presensiStaff;

    public Karyawan(int salary, List<PresensiStaff> presensiStaff, String nama, String alamat, String ttl, int telepon, int nik) {
        super(nama, alamat, ttl, telepon, nik);
        this.salary = salary;
        this.presensiStaff = presensiStaff;
    }

    public Karyawan() {
    }

    @Override
    public String toString() {
        return super.toString() + "\nKaryawan{" + "salary=" + salary + ", presensiStaff=" + presensiStaff + '}';
    }
    
}
