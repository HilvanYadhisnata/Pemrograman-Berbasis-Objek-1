import java.util.Date;
import java.util.Arrays;

public class Mahasiswa {
    // 🔒 Semua atribut harus private
    private String nama;
    private String nim;
    private String jurusan;
    private int umur;
    private Date tglLahir;
    private String[] skills;

    // === Getter & Setter dengan validasi dan defensive copy ===

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        if (nama == null || nama.trim().isEmpty()) {
            System.out.println("⚠️ Nama tidak boleh kosong!");
        } else if (!nama.matches("[a-zA-Z\\s]+")) {
            System.out.println("⚠️ Nama hanya boleh berisi huruf dan spasi!");
        } else {
            this.nama = nama;
        }
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        if (nim == null || nim.trim().isEmpty()) {
            System.out.println("⚠️ NIM tidak boleh kosong!");
        } else {
            this.nim = nim;
        }
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        if (jurusan == null || jurusan.trim().isEmpty()) {
            System.out.println("⚠️ Jurusan tidak boleh kosong!");
        } else if (jurusan.trim().length() < 3) {
            System.out.println("⚠️ Jurusan minimal 3 karakter!");
        } else {
            this.jurusan = jurusan;
        }
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        if (umur <= 0) {
            System.out.println("⚠️ Umur harus lebih dari 0!");
        } else {
            this.umur = umur;
        }
    }

    public Date getTglLahir() {
        // Defensive copy: tidak mengembalikan referensi asli
        return (tglLahir != null) ? new Date(tglLahir.getTime()) : null;
    }

    public void setTglLahir(Date tglLahir) {
        if (tglLahir == null) {
            System.out.println("⚠️ Tanggal lahir tidak boleh null!");
        } else {
            // Defensive copy: simpan salinan agar tidak bisa diubah dari luar
            this.tglLahir = new Date(tglLahir.getTime());
        }
    }

    public String[] getSkills() {
        // Defensive copy array
        return (skills != null) ? Arrays.copyOf(skills, skills.length) : null;
    }

    public void setSkills(String[] skills) {
        if (skills == null) {
            this.skills = null;
        } else {
            this.skills = Arrays.copyOf(skills, skills.length);
        }
    }

    // === Method tampilkan data mahasiswa ===
    public void tampilkanData() {
        System.out.println("==== DATA MAHASISWA ====");
        System.out.println("Nama     : " + (nama != null ? nama : "Belum diisi"));
        System.out.println("NIM      : " + (nim != null ? nim : "Belum diisi"));
        System.out.println("Jurusan  : " + (jurusan != null ? jurusan : "Belum diisi"));
        System.out.println("Umur     : " + (umur > 0 ? umur : "Belum diisi / Tidak valid"));
        System.out.println("Tgl Lahir: " + (tglLahir != null ? tglLahir : "Belum diisi"));
        System.out.println("Skills   : " + (skills != null ? String.join(", ", skills) : "Belum diisi"));
        System.out.println("------------------------------------");
    }
}