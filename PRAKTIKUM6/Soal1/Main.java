package Soal1;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) {
        TableView<Mahasiswa> tableView = new TableView<>();
        TableColumn<Mahasiswa, String> column1 =
                new TableColumn<>("NIM");
        column1.setCellValueFactory(
                new PropertyValueFactory<>("nim"));
        TableColumn<Mahasiswa, String> column2 =
                new TableColumn<>("Nama");
        column2.setCellValueFactory(
                new PropertyValueFactory<>("Nama"));
        tableView.getColumns().addAll(column1, column2);
        tableView.getItems().add(
                new Mahasiswa(1, "Meldi", "2210817220011"));
        tableView.getItems().add(
                new Mahasiswa(2, "Syahna", "2210817120007"));
        tableView.getItems().add(
                new Mahasiswa(3, "Ajeng", "2210817220001"));
        tableView.getItems().add(
                new Mahasiswa(4, "Azka", "2210817220009"));
        tableView.getItems().add(
                new Mahasiswa(5, "Dira", "2210817220024"));
        tableView.getItems().add(
                new Mahasiswa(6, "Eva", "2210817120004"));
        tableView.getItems().add(
                new Mahasiswa(7, "Wanda", "2210817220034"));
        tableView.getItems().add(
                new Mahasiswa(8, "Maulida", "2210817120011"));
        tableView.getItems().add(
                new Mahasiswa(9, "Melisa", "2210817220004"));
        tableView.getItems().add(
                new Mahasiswa(10, "Laini", "2210817120012"));
        VBox vbox = new VBox(tableView);
        Scene scene = new Scene(vbox);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

