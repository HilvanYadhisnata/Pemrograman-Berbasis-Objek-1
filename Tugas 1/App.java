// Class Utama
public class App {
    public static void main(String[] args) {
        System.out.println("===== SISTEM PERPUSTAKAAN =====");
        System.out.println("===============================");
        
        // Objek Perpustakaan
        Perpustakaan perpus = new Perpustakaan("Perpustakaan Majalaya");

        System.out.println("Menambahkan Buku Ke Koleksi : ");
        perpus.tambahBuku(new Buku("010-010", "Laskar Pelangi", "Andrea Hirata"));
        perpus.tambahBuku(new Buku("010-011", "Bumi Manusia", "Pramoedya Ananta Toer"));

        System.out.println("--------------------------------");
        System.out.println("PROSES PEMINJAMAN : ");
        perpus.pinjamBuku("A-001", "010-010");

        System.out.println("--------------------------------");
        perpus.tampilkanKoleksiBuku();
        
        System.out.println("--------------------------------");
        perpus.tampilkanLogPeminjaman();
    }
}