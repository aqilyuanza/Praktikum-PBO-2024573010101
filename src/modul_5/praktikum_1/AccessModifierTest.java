package modul_5.praktikum_1;

public class AccessModifierTest {
    public static void main(String[] args) {
        Person person = new Person("Aqil Yuanza", 20);

        // Test akses public
        person.email = "aqilyuanza@email.com";   // OK - public
        System.out.println("Email: " + person.email);

        // Test akses default (dalam package yang sama)
        person.alamat = "Lhokseumawe";         // OK - dalam package yang sama
        System.out.println("Alamat: " + person.alamat);

        // Test akses protected (dalam package yang sama)
        person.telepon = "082294468806";   // OK - dalam package yang sama
        System.out.println("Telepon: " + person.telepon);

        // Test akses private - AKAN ERROR jika uncomment
        // person.nama = "Andi";           // ERROR - private
        // person.umur = 30;               // ERROR - private
        // person.metodePribadi();         // ERROR - private

        // Mengakses data private melalui public method
        person.tampilkanInfo();

        // Mengakses private method melalui public method
        person.panggilmetodePribadi();

        System.out.println("\nDEMOSTRASI ACCESS MODIFIER");
        System.out.println("√ Public    : Bisa diakses");
        System.out.println("√ Default   : Bisa diakses (dalam package sama)");
        System.out.println("√ Protected : Bisa diakses (dalam package sama)");
        System.out.println("X Private   : TIDAK bisa diakses langsung");
    }
}

