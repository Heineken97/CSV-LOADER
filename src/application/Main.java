/**
 * @author Heineken97 - Joseph Jimenez
 */
package application;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        TableView<Student> table = new TableView<>();
        table.setItems(loadCSV("src/database/students.csv"));

        TableColumn<Student, String> nameColumn = new TableColumn<>("Name");
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));

        TableColumn<Student, Double> gradeColumn = new TableColumn<>("Grade");
        gradeColumn.setCellValueFactory(new PropertyValueFactory<>("grade"));

        table.getColumns().add(nameColumn);
        table.getColumns().add(gradeColumn);

        Scene scene = new Scene(table, 600, 400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Grades of Students");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    /**
     * Cargar datos desde un archivo CSV y devolver una lista observable de estudiantes.
     * @param filePath Ruta del archivo CSV.
     * @return Lista observable de estudiantes.
     */
    public static ObservableList<Student> loadCSV(String filePath) {
        ObservableList<Student> students = FXCollections.observableArrayList();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(";");
                if (values.length == 2) {
                    try {
                        String name = values[0];
                        double grade = Double.parseDouble(values[1]);
                        students.add(new Student(name, grade));
                    } catch (NumberFormatException e) {
                        System.err.println("Error al convertir la nota: " + values[1]);
                    }
                } else {
                    System.err.println("Línea inválida: " + line);
                }
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
        return students;
    }
}
