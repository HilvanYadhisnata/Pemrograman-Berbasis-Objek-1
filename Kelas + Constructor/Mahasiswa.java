public class Mahasiswa {
    private String nama;
    private String nim;
    private String jurusan;

    // Constructor
    public Mahasiswa (String nama, String nim, String jurusan) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;

    }

    public void tampilkanInfo() {
        System.out.println("Nama : " + this.nama);
        System.out.println("NIM : " + this.nim);
        System.out.println("Jurusan : " + this.jurusan);
    }
}
