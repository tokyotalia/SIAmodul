/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Mena
 */

public abstract class User {
    protected String nama;
    protected String alamat;
    protected String ttl;
    protected int telepon;

    public User(String nama, String alamat, String ttl, int telepon) {
        this.nama = nama;
        this.alamat = alamat;
        this.ttl = ttl;
        this.telepon = telepon;
    }
    
    public User () {
        
    }

    @Override
    public String toString() {
        return "User{" + "nama=" + nama + ", alamat=" + alamat + ", ttl=" + ttl + ", telepon=" + telepon + '}';
    }
    
}

