package DataDiri;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.Date;

public class DataDiri {
    public static void main(String[] args){
        System.out.println("Data diri");
        String nama = "Muhammad Aqil Yuanza";
        String nim = "2024573010101";
        String alamat ="Lhokseumawe";
        LocalDate Tgllahir = LocalDate.of(2006,9,10);
        String Prodi = "Teknik Informatika";
        String Jurusan = "Teknologi Informasi dan Komputer ";
        int semester= 3;
        String Hobi = "Olahraga";
        System.out.println("Nama : " + nama);
        System.out.println("Nim :" + nim);
        System.out.println("Alamat :" + alamat);
        System.out.println("Tanggal Lahir :" + Tgllahir);
        System.out.println("Prodi :" + Prodi);
        System.out.println("Jurusan :" + Jurusan);
        System.out.println("Semester :" + semester);
        System.out.println("Hoby :" + Hobi);

    }
}

