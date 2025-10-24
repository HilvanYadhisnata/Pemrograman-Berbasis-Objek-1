import java.util.ArrayList;

public class Perpustakaan {

    // Atribut
    private String nama;
    private ArrayList<Buku> koleksiBuku;
    private ArrayList<String> daftarPeminjaman;

    // Constructor
    public Perpustakaan (String nama) {
        this.nama = nama;
        this.koleksiBuku = new ArrayList<>();
        this.daftarPeminjaman = new ArrayList<>();
    }

    // Method Tambah Buku
    public void tambahBuku(Buku buku) {
        koleksiBuku.add(buku);
        System.out.println("Buku \"" + buku.judul + "\" berhasil ditambahkan.");
    }

    // Method Cari Buku by ISBN
    public Buku cariBuku(String isbn) {
        for (Buku buku : koleksiBuku) {
            if (buku.isbn.equals(isbn)) {
                return buku;
            }
        }
        return null;
    }

    // Method meminjam buku
    public void pinjamBuku (String idAnggota, String isbn) {
        Buku buku = cariBuku(isbn);

        if (buku == null) {
            System.out.println("Buku tidak ditemukan.");
            return;
        }

        if (buku.statusDipinjam) {
            System.out.println("Buku " + buku.judul + " sedang dipinjam.");
            return;
        }

        buku.statusDipinjam = true;
        String logPeminjaman = idAnggota + " - " + buku.judul;
        daftarPeminjaman.add(logPeminjaman);
        System.out.println("Peminjaman Berhasil : " + logPeminjaman);
    }
    
    public void tampilkanKoleksiBuku() {
        System.out.println("KOLEKSI BUKU " + nama.toUpperCase());
        System.out.printf("ISBN ", "Judul", "Pengarang", "Status Dipinjam");

        for (Buku buku : koleksiBuku) {
            String status = buku.statusDipinjam ? "Dipinjam" : "Tersedia";
            System.out.printf(buku.isbn, buku.judul, buku.pengarang, status);
            System.out.println("");
        }
    }

    public void tampilkanLogPeminjaman() {
        System.out.println("LOG PEMINJAMAN");

        if (daftarPeminjaman.isEmpty()) {
            System.out.println("Belum ada peminjaman.");
        } else {
            int nomor = 1;
            for (String log : daftarPeminjaman) {
                System.out.println(nomor + ". " + log);
                nomor++;
            }
        }
        System.out.println();
    }
}