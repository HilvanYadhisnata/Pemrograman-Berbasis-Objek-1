package Pertemuan13;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.geometry.HPos;
import javafx.geometry.Insets;

/**
 * JavaFX App
 */
public class MainJavaFX extends Application {

    @Override
    public void start(Stage stage) {
      
    Label lblJudul = new Label("FORM PENDAFTARAN");
    lblJudul.setId("judul");

    TextField tfNama = new TextField();
    tfNama.setPromptText("Masukan Nama");

    PasswordField pfPassword = new PasswordField();
    pfPassword.setPromptText("Masukkan password");

    ComboBox<String> cbJurusan = new ComboBox<>();
    cbJurusan.getItems().addAll("TI", "SI", "MI");
    cbJurusan.setPromptText("Pilih jurusan");

    RadioButton rbL = new RadioButton("Laki-laki");
    RadioButton rbP = new RadioButton("Perempuan");

    ToggleGroup genderGroup = new ToggleGroup();
    rbL.setToggleGroup(genderGroup);
    rbP.setToggleGroup(genderGroup);

    CheckBox cbSetuju = new CheckBox("Saya setuju dengan syarat");

    Button btnSimpan = new Button("Simpan");

//Layout
GridPane grid = new GridPane();
grid.setHgap(10);
grid.setVgap(10);
grid.setPadding(new Insets(20));

//Masukan ke Gridpane
grid.add(lblJudul, 0, 0, 2, 1);
GridPane.setColumnSpan(lblJudul, 2);
GridPane.setHalignment(lblJudul, HPos.CENTER);

grid.add(new Label("Nama"), 0, 1);
grid.add(tfNama, 1, 1);

grid.add(new Label("Password"), 0, 2);
grid.add(pfPassword, 1, 2);

grid.add(new Label("Jurusan"), 0, 3);
grid.add(cbJurusan, 1, 3);

grid.add(new Label("Jenis Kelamin"), 0, 4);
HBox genderBox = new HBox(10, rbL, rbP);
grid.add(genderBox, 1, 4);

grid.add(cbSetuju, 1, 5);
grid.add(btnSimpan, 1, 6);
GridPane.setMargin(btnSimpan, new Insets(15, 0, 0, 0));


//event handling dan alert
btnSimpan.setOnAction(e -> {
    if (tfNama.getText().isEmpty()) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setContentText("Nama tidak boleh kosong");
        alert.show();
    } else {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("Data berhasil disimpan");
        alert.show();
    }
});


//scene dan stage

Scene scene = new Scene(grid, 400, 350);
scene.getStylesheets().add(
    getClass().getResource("style.css").toExternalForm()
);

stage.setTitle("Demo JavaFX Controls");
stage.setScene(scene);
stage.show();


    }

    public static void main(String[] args) {
        launch();
    }

}