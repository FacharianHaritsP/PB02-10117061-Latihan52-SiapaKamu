/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb02.pkg10117061.latihan52.siapakamu;

/**
 *Nama      : Fachrian Harits P
 *Kelas     : IF-2
 *NIM       : 10117061
 *Deskripsi : Program untuk mengetahui status seseorang
 * 
 */
public class PB0210117061Latihan52SiapaKamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        Dosen dsn = new Dosen();
        Mahasiswa mhs = new Mahasiswa();
        dsn.setNip("41227829930");
        mhs.setNim("10110269");
     
        System.out.println("NIP Dosen : " +dsn.getNip() );
        dsn.siapaKamu();
        dsn.mengajarApa();
      
       
        System.out.println("\nNIM Mahasiswa : " +mhs.getNim());
        mhs.siapaKamu();
        mhs.kelasApa();
        
    }
    
}
