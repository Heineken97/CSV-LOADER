/**
 * @author Heineken97 - Joseph Jimenez
 */
package application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSVLoader {
    public static ObservableList<Student> loadCSV(String filePath) {
        ObservableList<Student> students = FXCollections.observableArrayList();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                Student student = new Student(values[0], Double.parseDouble(values[1]));
                students.add(student);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return students;
    }
}
