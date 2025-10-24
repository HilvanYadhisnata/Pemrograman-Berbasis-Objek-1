public class Buku {

    // Atribut
    String isbn;
    String judul;
    String pengarang;
    Boolean statusDipinjam;

    // Constructor
    public Buku (String isbn, String judul, String pengarang) {
        this.isbn = isbn;
        this.judul = judul;
        this.pengarang = pengarang;
        this.statusDipinjam = false;

    }
}
