public class Main {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa();
        m1.setNama("Hilvan");
        m1.setNim("123456");
        m1.setJurusan("Teknik Informatika");
        m1.setUmur(20);
        m1.tampilkanInfo();

        Mahasiswa m2 = new Mahasiswa();
        m2.setNama(""); // Nama kosong → akan muncul peringatan
        m2.setNim("654321");
        m2.setJurusan("Sistem Informasi");
        m2.setUmur(-5); // Umur negatif → akan muncul peringatan
        m2.tampilkanInfo();

        Mahasiswa m3 = new Mahasiswa();
        m3.setNama("Yadhis");
        m3.setNim("789012");
        m3.setJurusan(""); // Jurusan kosong → akan muncul peringatan
        m3.setUmur(0); // Umur nol → akan muncul peringatan
        m3.tampilkanInfo();
    }
}
