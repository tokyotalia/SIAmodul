/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Mena
 */
public abstract class Staff extends User{
    protected int nik;

    public Staff(String nama, String alamat, String ttl, int telepon, int nik) {
        super(nama, alamat, ttl, telepon);
        this.nik = nik;
    }

    public Staff() {
    }

    @Override
    public String toString() {
        return super.toString() + "\nStaff{" + "nik=" + nik + '}';
    }
    
}
