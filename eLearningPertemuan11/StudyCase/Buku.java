package eLearningPertemuan11.StudyCase;

public class Buku {
    private String judul;
    private String pengarang;
    private int tahun;
    private StatusBuku status;

    public Buku(String judul, String pengarang, int tahun, StatusBuku status) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahun = tahun;
        this.status = status;
    }

    public String getJudul() {
        return judul;
    }

    public String toFileString() {
        return judul + "," + pengarang + "," + tahun + "," + status;
    }

    public static Buku fromFileString(String line) {
        String[] data = line.split(",");
        return new Buku(
                data[0],
                data[1],
                Integer.parseInt(data[2]),
                StatusBuku.valueOf(data[3])
        );
    }

    @Override
    public String toString() {
        return "Judul: " + judul +
               ", Pengarang: " + pengarang +
               ", Tahun: " + tahun +
               ", Status: " + status;
    }
}
