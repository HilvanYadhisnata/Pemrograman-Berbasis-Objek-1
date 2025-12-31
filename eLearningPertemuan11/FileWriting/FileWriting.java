package eLearningPertemuan11.FileWriting;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriting {
   public static void main(String[] args) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("log.txt", true));

            writer.write("Log entry baru\n" + new java.util.Date().toString() + "\n");
            writer.close(); 
            System.out.println("Berhasil menulis ke file log.txt");
        }

        catch (IOException e) {
            System.out.println("Error menulis ke file: " + e.getMessage());
    }
}

}
