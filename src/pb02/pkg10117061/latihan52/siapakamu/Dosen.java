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
public class Dosen extends Manusia{
 private String nip;
 private String matakuliah;

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getMatakuliah() {
        return matakuliah;
    }

    public void setMatakuliah(String matakuliah) {
        this.matakuliah = matakuliah;
    }
 
    public void mengajarApa(){
        System.out.println("Saya Rizki Adam Kurniawan umur 27 tahun "
                + "sedang menagajar mata kuliah PBO");
    }
    public void siapaKamu(){
        System.out.println("Saya Dosen");
    }
}
