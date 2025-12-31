package eLearningPertemuan11.StudyCase;

public class MainApp {
    public static void main(String[] args) {

        // Simpan data buku
        Perpustakaan.simpanBuku(
                new Buku("Fisika Dasar", "Andi", 2022, StatusBuku.TERSEDIA)
        );
        Perpustakaan.simpanBuku(
                new Buku("Struktur Data", "Budi", 2021, StatusBuku.DIPINJAM)
        );

        // Tampilkan semua buku
        System.out.println("=== DAFTAR BUKU ===");
        for (Buku b : Perpustakaan.bacaBuku()) {
            System.out.println(b);
        }

        // Cari buku
        System.out.println("\n=== HASIL PENCARIAN ===");
        Buku hasil = Perpustakaan.cariBuku("Java Dasar");
        if (hasil != null) {
            System.out.println(hasil);
        } else {
            System.out.println("Buku tidak ditemukan");
        }
    }
}
