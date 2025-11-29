public class User {
    private String nama;
    private String email;
    private String alamat;
    private String noHp;
    
    // Constructor
    public User(String nama, String email, String alamat, String noHp) {
        setNama(nama);
        setEmail(email);
        setAlamat(alamat);
        setNoHp(noHp);
    }

    // Getter nama
    public String getNama() {
        return nama;
    }

    // Setter nama
    public void setNama(String nama) {
        if (nama != null && !nama.trim().isEmpty()) {
            this.nama = nama;
        } else {
            System.out.println("Nama tidak boleh kosong!");
        }
    }

    // Getter email
    public String getEmail() {
        return email;
    }

    // Setter email
    public void setEmail(String email) {
        if (email != null && email.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,6}$")) {
            this.email = email;
        } else {
            System.out.println("Email tidak valid!");
        }
    }

    // Getter alamat
    public String getAlamat() {
        return alamat;
    }

    // Setter alamat
    public void setAlamat(String alamat) {
        if (alamat != null && !alamat.trim().isEmpty()) {
            this.alamat = alamat;
        } else {
            System.out.println("Alamat tidak boleh kosong!");
        }
    }

    // Getter noHp
    public String getNoHp() {
        return noHp;
    }

    // Setter noHp
    public void setNoHp(String noHp) {
        if (noHp != null && noHp.matches("^08\\d{8,}$")) {
            this.noHp = noHp;
        } else {
            System.out.println("Nomor HP tidak valid! Harus mulai 08 dan minimal 10 digit!");
        }
    }

    public void tampilkanInfo() {
        System.out.printf("%-15s : %s%n", "Nama", getNama());
        System.out.printf("%-15s : %s%n", "Email", getEmail());
        System.out.printf("%-15s : %s%n", "Alamat", getAlamat());
        System.out.printf("%-15s : %s%n", "No HP", getNoHp());
    }


}
