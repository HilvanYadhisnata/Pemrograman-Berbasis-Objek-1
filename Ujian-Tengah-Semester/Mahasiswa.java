public class Mahasiswa extends User {
    private String nim;
    private String jurusan;
    private double ipk;

    // Constructor
    public Mahasiswa(String nama, String email, String alamat, String noHp,
                     String nim, String jurusan, double ipk) {

        super(nama, email, alamat, noHp);
        setNim(nim);
        setJurusan(jurusan);
        setIpk(ipk);
    }

    // Getter NIM
    public String getNim() {
        return nim;
    }

    // Setter NIM
    public void setNim(String nim) {
        if (nim != null && nim.matches("^M\\d{5,}$")) {
            this.nim = nim;
        } else {
            System.out.println("Error: NIM tidak valid! Harus diawali 'M' dan diikuti minimal 5 digit angka. Contoh: M12345");
        }
    }

    // Getter Jurusan
    public String getJurusan() {
        return jurusan;
    }

    // Setter Jurusan
    public void setJurusan(String jurusan) {
        if (jurusan != null && !jurusan.trim().isEmpty()) {
            this.jurusan = jurusan;
        } else {
            System.out.println("Error: Jurusan tidak boleh kosong!");
        }
    }

    // Getter IPK
    public double getIpk() {
        return ipk;
    }

    // Setter IPK
    public void setIpk(double ipk) {
        if (ipk >= 0.0 && ipk <= 4.0) {
            this.ipk = ipk;
        } else {
            System.out.println("Error: IPK harus berada dalam rentang 0.0 hingga 4.0!");
        }
    }

    // Method ambilMatkul
    public void ambilmatkul(String namaMatkul) {
        System.out.println(getNama() + " mengambil mata kuliah: " + namaMatkul);
    }

    // Tampilkan Info
    @Override
    public void tampilkanInfo() {
        System.out.println("\n=== INFORMASI MAHASISWA ===");
        super.tampilkanInfo();
        System.out.printf("%-15s : %s%n", "NIM", getNim());
        System.out.printf("%-15s : %s%n", "Jurusan", getJurusan());
        System.out.printf("%-15s : %s%n", "IPK", getIpk());
    }

}
