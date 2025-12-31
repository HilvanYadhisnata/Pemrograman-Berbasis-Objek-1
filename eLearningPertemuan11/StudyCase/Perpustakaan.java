package eLearningPertemuan11.StudyCase;

import java.io.*;
import java.util.ArrayList;

public class Perpustakaan {
    private static final String FILE_BUKU = "buku.txt";

    public static void simpanBuku(Buku buku) {
        try (BufferedWriter writer =
                     new BufferedWriter(new FileWriter(FILE_BUKU, true))) {
            writer.write(buku.toFileString());
            writer.newLine();
        } catch (IOException e) {
            System.out.println("Gagal menyimpan buku");
        }
    }

    public static ArrayList<Buku> bacaBuku() {
        ArrayList<Buku> daftarBuku = new ArrayList<>();

        try (BufferedReader reader =
                     new BufferedReader(new FileReader(FILE_BUKU))) {

            String line;
            while ((line = reader.readLine()) != null) {
                daftarBuku.add(Buku.fromFileString(line));
            }

        } catch (IOException e) {
            System.out.println("File buku belum ada");
        }

        return daftarBuku;
    }

    public static Buku cariBuku(String judul) {
        for (Buku buku : bacaBuku()) {
            if (buku.getJudul().equalsIgnoreCase(judul)) {
                return buku;
            }
        }
        return null;
    }
}
