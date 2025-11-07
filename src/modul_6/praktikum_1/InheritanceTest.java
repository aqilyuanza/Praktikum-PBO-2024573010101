package modul_6.praktikum_1;

public class InheritanceTest {
    public static void main(String[] args) {
        Student student = new Student("Aqil", 19, "2024573010101");

        //memanggil method dari superclass
        student.displayInfo();

        //memanggil method dari subclass
        student.study();

        //memanggil overridden method
        student.greet();

        //polymorphism: student sebagai person
        Person person = new Student("Fazi", 19, "2024573010068");
        person.greet(); // memanggil method yang di-override

    }
}
