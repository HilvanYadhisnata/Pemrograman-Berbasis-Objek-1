public class MainSystem {
    public static void main(String[] args) throws Exception {
        
        // Objek Mahasiswa
        Mahasiswa mhs1 = new Mahasiswa("Hilvan", "hilvanyad07@gmail.com", "Majalaya", 
                                        "08123456789", "M123456", "Informatika", 3.75);
        
        // Objek Dosen
        Dosen dosen1 = new Dosen("Dr. Andi", "andi@yahoo.com", "Bandung", "08987654321",
                                    "D97865", "");

        // Objek Mata Kuliah
        MataKuliah matkul1 = new MataKuliah("MK101", "Pemrograman Berbasis Objek", 3);
    
        // Tampilkan Informasi
        System.out.println(">> INFORMASI SISTEM AKADEMIK <<");
        mhs1.tampilkanInfo();
        dosen1.tampilkanInfo();
        matkul1.tampilkanInfoMatkul();

        // Interaksi Dosen dengan Mata Kuliah
        System.out.println("\n>> Dosen Mengajar Mata Kuliah <<");
        dosen1.mengajar(matkul1.getNamaMatkul());

        // Interaksi Mahasiswa dengan Mata Kuliah
        System.out.println("\n>> Mahasiswa Mengambil Mata Kuliah <<");
        mhs1.ambilmatkul(matkul1.getNamaMatkul());
    
    }
}