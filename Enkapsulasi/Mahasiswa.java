public class Mahasiswa {
    private String nama;
    private String nim;
    private String jurusan;
    private int umur;

    // Setter nama
    public void setNama(String nama) {
        if (nama == null || nama.trim().isEmpty()) {
            System.out.println("Nama tidak boleh kosong!");
        } else {
            this.nama = nama;
        }
    }

    // Setter nim
    public void setNim(String nim) {
        this.nim = nim;
    }

    // Setter jurusan
    public void setJurusan(String jurusan) {
        if (jurusan == null || jurusan.trim().isEmpty()) {
            System.out.println("Jurusan tidak boleh kosong!");
        } else {
            this.jurusan = jurusan;
        }
    }

    // Setter umur
    public void setUmur(int umur) {
        if (umur <= 0) {
            System.out.println("Umur tidak boleh negatif atau nol!");
        } else {
            this.umur = umur;
        }
    }

    // Getter nama
     public String getNama() {
        return nama;
    }

    // Getter nim
    public String getNim() {
        return nim;
    }

    // Getter jurusan
    public String getJurusan() {
        return jurusan;
    }

    // Getter umur
    public int getUmur() {
        return umur;
    }

    // Info
    public void tampilkanInfo() {
        System.out.println("===DATA MAHASISWA===");
        System.out.println("Nama     : " + (nama != null ? nama : "Belum diisi"));
        System.out.println("NIM      : " + (nim != null ? nim : "Belum diisi"));
        System.out.println("Jurusan  : " + (jurusan != null ? jurusan : "Belum diisi"));
        System.out.println("Umur     : " + (umur > 0 ? umur : "Belum diisi / Tidak valid"));
        System.out.println("------------------------------------");
    }
}
