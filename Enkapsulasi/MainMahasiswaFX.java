import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class MainMahasiswaFX extends Application {

    @Override
    public void start(Stage primaryStage) {
        // --- Elemen input ---
        Label lblNama = new Label("Nama:");
        TextField txtNama = new TextField();

        Label lblNim = new Label("NIM:");
        TextField txtNim = new TextField();

        Label lblJurusan = new Label("Jurusan:");
        TextField txtJurusan = new TextField();

        Label lblUmur = new Label("Umur:");
        TextField txtUmur = new TextField();

        Button btnSimpan = new Button("Simpan");
        TextArea areaOutput = new TextArea();
        areaOutput.setEditable(false);
        areaOutput.setPrefHeight(160);

        // --- Event saat klik tombol Simpan ---
        btnSimpan.setOnAction(e -> {
            try {
                // Ambil input
                String nama = txtNama.getText();
                String nim = txtNim.getText();
                String jurusan = txtJurusan.getText();
                int umur = Integer.parseInt(txtUmur.getText());

                // Buat objek Mahasiswa
                Mahasiswa m = new Mahasiswa();
                m.setNama(nama);
                m.setNim(nim);
                m.setJurusan(jurusan);
                m.setUmur(umur);

                // Validasi: jika ada field tidak valid, tampilkan alert
                if (m.getNama() == null || m.getNim() == null || m.getJurusan() == null || m.getUmur() <= 0) {
                    Alert alert = new Alert(Alert.AlertType.WARNING);
                    alert.setTitle("Validasi Gagal");
                    alert.setHeaderText("Data tidak valid!");
                    alert.setContentText("Periksa kembali data yang dimasukkan.");
                    alert.showAndWait();
                } else {
                    // Tampilkan hasil menggunakan getter
                    areaOutput.setText(
                        "=== Data Mahasiswa ===\n" +
                        "Nama     : " + m.getNama() + "\n" +
                        "NIM      : " + m.getNim() + "\n" +
                        "Jurusan  : " + m.getJurusan() + "\n" +
                        "Umur     : " + m.getUmur()
                    );
                }

            } catch (NumberFormatException ex) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error Input");
                alert.setHeaderText("Format Umur Salah");
                alert.setContentText("Masukkan angka yang valid untuk umur!");
                alert.showAndWait();
            }
        });

        // --- Layout utama ---
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(15));
        grid.setHgap(10);
        grid.setVgap(10);

        grid.add(lblNama, 0, 0); grid.add(txtNama, 1, 0);
        grid.add(lblNim, 0, 1); grid.add(txtNim, 1, 1);
        grid.add(lblJurusan, 0, 2); grid.add(txtJurusan, 1, 2);
        grid.add(lblUmur, 0, 3); grid.add(txtUmur, 1, 3);
        grid.add(btnSimpan, 1, 4);
        grid.add(areaOutput, 0, 5, 2, 1);

        Scene scene = new Scene(grid, 400, 350);
        primaryStage.setTitle("Form Data Mahasiswa");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
