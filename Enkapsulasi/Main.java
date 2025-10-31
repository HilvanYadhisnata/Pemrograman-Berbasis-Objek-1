import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

            // 🔹 Mahasiswa 1 (Valid)
            Date tgl1 = sdf.parse("2003-12-01");
            Mahasiswa m1 = new Mahasiswa();
            m1.setNama("Hilvan");
            m1.setNim("123456");
            m1.setJurusan("Teknik Informatika");
            m1.setUmur(21);
            m1.setTglLahir(tgl1);
            m1.setSkills(new String[]{"Java", "Python", "Networking"});

            // 🔹 Mahasiswa 2 (Beberapa data tidak valid)
            Date tgl2 = sdf.parse("2005-05-10");
            Mahasiswa m2 = new Mahasiswa();
            m2.setNama("Andi123"); // invalid
            m2.setNim("");         // invalid
            m2.setJurusan("IT");   // invalid (kurang dari 3 karakter)
            m2.setUmur(-2);        // invalid
            m2.setTglLahir(tgl2);
            m2.setSkills(new String[]{"Design", "HTML"});

            // 🔹 Tampilkan hasil
            System.out.println("\n>> HASIL DATA MAHASISWA <<");
            m1.tampilkanData();
            m2.tampilkanData();

        } catch (Exception e) {
            System.out.println("❌ Format tanggal salah!");
        }
    }
}
