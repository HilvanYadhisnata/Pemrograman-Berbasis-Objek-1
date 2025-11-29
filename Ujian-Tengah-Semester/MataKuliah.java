public class MataKuliah {
    private String kodeMatkul;
    private String namaMatkul;
    private int sks;

    // Constructor
    public MataKuliah(String kodeMatkul, String namaMatkul, int sks) {
        setKodeMatkul(kodeMatkul);
        setNamaMatkul(namaMatkul);
        setSks(sks);
    }

    // Getter kodeMatkul
    public String getKodeMatkul() {
        return kodeMatkul;
    }

    // Setter kodeMatkul
    public void setKodeMatkul(String kodeMatkul) {
        if (kodeMatkul != null && kodeMatkul.matches("^MK\\d{3,}$")) {
            this.kodeMatkul = kodeMatkul;
        } else {
            System.out.println("Error: Kode mata kuliah tidak valid! Harus 'MK' diikuti minimal 3 digit angka, contoh: MK001");
        }
    }

    // Getter namaMatkul
    public String getNamaMatkul() {
        return namaMatkul;
    }

    // Setter namaMatkul
    public void setNamaMatkul(String namaMatkul) {
        if (namaMatkul != null && !namaMatkul.trim().isEmpty()) {
            this.namaMatkul = namaMatkul;
        } else {
            System.out.println("Error: Nama mata kuliah tidak boleh kosong!");
        }
    }

    // Getter sks
    public int getSks() {
        return sks;
    }

    // Setter sks
    public void setSks(int sks) {
        if (sks >= 1 && sks <= 4) {
            this.sks = sks;
        } else {
            System.out.println("Error: SKS harus bernilai antara 1 sampai 4!");
        }
    }

    // Method tampilkan info
    public void tampilkanInfoMatkul() {
        System.out.println("\n=== INFORMASI MATA KULIAH ===");
        System.out.printf("%-15s : %s%n", "Kode Matkul", getKodeMatkul());
        System.out.printf("%-15s : %s%n", "Nama Matkul", getNamaMatkul());
        System.out.printf("%-15s : %d%n", "SKS", getSks());
    }

}
