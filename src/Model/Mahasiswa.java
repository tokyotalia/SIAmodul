/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Mena
 */
public abstract class Mahasiswa extends User {
    protected int nim;
    protected String jurusan;

    public Mahasiswa(int nim, String jurusan, String nama, String alamat, String ttl, int telepon) {
        super(nama, alamat, ttl, telepon);
        this.nim = nim;
        this.jurusan = jurusan;
    }    
    
    public Mahasiswa () {
        
    }
}
