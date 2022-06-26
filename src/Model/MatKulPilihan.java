/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Mena
 */
public class MatKulPilihan extends MataKuliah {
    int minMahasiswa;

    public MatKulPilihan(int minMahasiswa) {
        this.minMahasiswa = minMahasiswa;
    }

    public MatKulPilihan() {
    }

    @Override
    public String toString() {
        return super.toString() + "\nMatKulPilihan{" + "minMahasiswa=" + minMahasiswa + '}';
    }
    
}
