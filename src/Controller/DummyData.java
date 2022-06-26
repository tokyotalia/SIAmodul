/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

/**
 *
 * @author Mena
 */
import java.util.List;
import Model.*;
import java.util.ArrayList;


public class DummyData {

//    private MataKuliah PBO = new MataKuliah(003, 3, "Program Berbasis Objek");
//    private MataKuliah stragol = new MataKuliah(005, 2, "Strategi Algoritmik");
//    private MataKuliah sisber = new MataKuliah(044, 2, "Sistem Berkas");
//    private MataKuliah webprog = new MataKuliah(077, 3, "Program Web");
        
    private List <Presensi> presensi1 = new ArrayList<>();
        
    private void Presensi1() {
        presensi1.add(new Presensi("03-Juni-2022", 1));
        presensi1.add(new Presensi("06-Juni-2022", 0));
        presensi1.add(new Presensi("09-Juni-2022", 1));
        presensi1.add(new Presensi("12-Juni-2022", 1));
        presensi1.add(new Presensi("15-Juni-2022", 0));
        presensi1.add(new Presensi("18-Juni-2022", 1));
        presensi1.add(new Presensi("21-Juni-2022", 1));
    }
        
    private List <Presensi> presensi2 = new ArrayList<>();
    
    private void Presensi2() {
        presensi2.add(new Presensi("03-Juni-2022", 0));
        presensi2.add(new Presensi("06-Juni-2022", 1));
        presensi2.add(new Presensi("09-Juni-2022", 1));
        presensi2.add(new Presensi("12-Juni-2022", 1));
        presensi2.add(new Presensi("15-Juni-2022", 1));
        presensi2.add(new Presensi("18-Juni-2022", 1));
        presensi2.add(new Presensi("21-Juni-2022", 1));
    }
    
    public DummyData() {
        InitializeDummyData();
    }
    
    private void InitializeDummyData () {
        
        MataKuliah PBO = new MataKuliah(003, 3, "Program Berbasis Objek");
        MataKuliah stragol = new MataKuliah(005, 2, "Strategi Algoritmik");
        MataKuliah sisber = new MataKuliah(044, 2, "Sistem Berkas");
        MataKuliah webprog = new MataKuliah(077, 3, "Program Web");
        
        Presensi1();
        Presensi2();
        
        List <MatKulAmbil> matkul1 = new ArrayList<>();
        matkul1.add(new MatKulAmbil(PBO, presensi1, 80, 70, 50));
        matkul1.add(new MatKulAmbil(PBO, presensi1, 80, 70, 50));
        matkul1.add(new MatKulAmbil(PBO, presensi1, 80, 70, 50));
        
        Sarjana user1 = new Sarjana(1121055, "Informatika", "Mena", "KFC", "Sampah", 0812345678, matkul1));
        
        
    }
    
}
