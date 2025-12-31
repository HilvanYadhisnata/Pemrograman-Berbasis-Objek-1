package eLearningPertemuan11.FileReading;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReading {
    public static void main(String[] args) {

        BufferedReader reader = null;

        String namaTertinggi = "";
        int nilaiTertinggi = Integer.MIN_VALUE;

        try {
            FileReader fileReader = new FileReader("nilai.txt");
            reader = new BufferedReader(fileReader);

            System.out.println("==== DAFTAR NILAI ====");

            String baris;

            while ((baris = reader.readLine()) != null) {

                if (!baris.contains(",")) {
                    System.out.println("Format salah: " + baris);
                    continue;
                }

                String[] data = baris.split(",");

                String nama = data[0].trim();
                int nilai = Integer.parseInt(data[1].trim());

                System.out.println(nama + " : " + nilai);

                if (nilai > nilaiTertinggi) {
                    nilaiTertinggi = nilai;
                    namaTertinggi = nama;
                }
            }

            System.out.println("\n==== NILAI TERTINGGI ====");
            System.out.println(namaTertinggi + " : " + nilaiTertinggi);

        } catch (IOException e) {
            System.out.println("Terjadi kesalahan membaca file: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Nilai bukan angka!");
        } finally {
            try {
                if (reader != null) reader.close();
            } catch (IOException e) {
                System.out.println("Gagal menutup file");
            }
        }
    }
}
