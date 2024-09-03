/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mahasiswa;

/**
 *
 * @author akriz
 */
public class Nilai {
    
    String NPM;
    String nama;
    int nilaiAbsen;
    int nilaiTugas;
    int nilaiUTS;
    int nilaiUAS;
    
    
    
    void info(){
        System.out.println("NPM                 : " + NPM);
        System.out.println("Nama                : " + nama);
        System.out.println("Nilai Absen[10%]    : " + nilaiAbsen);
        System.out.println("Nilai Tugas[20%%]   : " + nilaiTugas);
        System.out.println("Nilai UTS[30%]      : " + nilaiUTS);
        System.out.println("Nilai UAS[40%]      : " + nilaiUAS);
        System.out.println("Nilai Akhir         : " + ((nilaiAbsen * 0.1)+(nilaiTugas * 0.2)+(nilaiUTS * 0.3)+(nilaiUAS * 0.4)));
    }
}
