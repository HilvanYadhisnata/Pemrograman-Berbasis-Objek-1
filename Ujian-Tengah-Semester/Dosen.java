public class Dosen extends User {
    private String nidn;
    private String mataKuliahAjar;

    // Constructor
    public Dosen(String nama, String email, String alamat, String noHp,
                 String nidn, String mataKuliahAjar) {

        super(nama, email, alamat, noHp);
        setNidn(nidn);
        setMataKuliahAjar(mataKuliahAjar);
    }

    // Getter NIDN
    public String getNidn() {
        return nidn;
    }

    // Setter NIDN
    public void setNidn(String nidn) {
        if (nidn != null && nidn.matches("^D\\d{5,}$")) {
            this.nidn = nidn;
        } else {
            System.out.println("Error: NIDN tidak valid! Harus diawali 'D' dan diikuti minimal 5 digit angka. Contoh: D98765");
        }
    }

    // Getter Mata Kuliah Ajar
    public String getMataKuliahAjar() {
        return mataKuliahAjar;
    }

    // Setter Mata Kuliah Ajar
    public void setMataKuliahAjar(String mataKuliahAjar) {
        if (mataKuliahAjar != null && !mataKuliahAjar.trim().isEmpty()) {
            this.mataKuliahAjar = mataKuliahAjar;
        } else {
            System.out.println("Error: Mata kuliah ajar tidak boleh kosong!");
        }
    }

    // Method mengajar
    public void mengajar(String namaMatkul) {
        System.out.println(getNama() + " mengajar mata kuliah: " + namaMatkul);
    }

    // Tampilkan Info
    @Override
    public void tampilkanInfo() {
        System.out.println("\n=== INFORMASI DOSEN ===");
        super.tampilkanInfo();
        System.out.printf("%-15s : %s%n", "NIDN", getNidn());
        System.out.printf("%-15s : %s%n", "Matkul Ajar", getMataKuliahAjar());
    }

}
