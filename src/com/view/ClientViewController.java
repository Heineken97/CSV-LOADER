package com.view;


import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import com.MainApp;
import com.model.Estudiante;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class ClientViewController {
	@FXML
	private TableView<Estudiante> tablaEstudiantes;
	
	@FXML
	private TableColumn<Estudiante,Integer> idColumn;
	
	@FXML
	private TableColumn<Estudiante,String> fullNameColumn;
	
	@FXML
	private TableColumn<Estudiante,String> emailColumn;
	
	@FXML
	private TableColumn<Estudiante,Integer> phoneColumn;
	
	@FXML
	private TableColumn<Estudiante,String> nicknameColumn;
	
	@FXML
	private TableColumn<Estudiante,String> tipoEstudianteColumn;
	
	@FXML
	private TableColumn<Estudiante,Integer> examPromColumn;
	
	@FXML
	private TableColumn<Estudiante,Integer> quizPromColumn;
	
	@FXML
	private TableColumn<Estudiante,Integer> tareaPromColumn;
	
	@FXML
	private TableColumn<Estudiante,Integer> proyecto1Column;
	
	@FXML
	private TableColumn<Estudiante,Integer> proyecto2Column;
	
	@FXML
	private TableColumn<Estudiante,Integer> proyecto3Column;
	
	@FXML
	private TableColumn<Estudiante,Integer> projectPromColumn;
	
	@FXML
	private TableColumn<Estudiante,Integer> extraPromColumn;
	
	@FXML
	private TableColumn<Estudiante,Integer> finalNoteColumn;
	
	
	@FXML
	private Label id;
	
	@FXML
	private Label fullname;
	
	@FXML
	private Label email;
	
	@FXML
	private Label phone;
	
	@FXML
	private Label nickname;
	
	@FXML
	private Label typeStudent;
	
	@FXML
	private Label examProm;
	
	@FXML
	private Label quizProm;
	
	@FXML
	private Label tareaProm;
	
	@FXML
	private Label proyecto1;
	
	@FXML
	private Label proyecto2;
	
	@FXML
	private Label proyecto3;
	
	@FXML
	private Label projectProm;
	
	@FXML
	private Label extraProm;
	
	@FXML
	private Label finalNote;
	
	@FXML
	private AnchorPane anchorpane;
	
	private MainApp mainApp;
	
	
	public ClientViewController() {
		
	}
	@FXML
	private void initialize() {
		idColumn.setCellValueFactory(cellData ->cellData.getValue().getId().asObject());
		fullNameColumn.setCellValueFactory(cellData->cellData.getValue().getFullname());
		emailColumn.setCellValueFactory(cellData->cellData.getValue().getEmail());
		phoneColumn.setCellValueFactory(cellData ->cellData.getValue().getPhone().asObject());
		nicknameColumn.setCellValueFactory(cellData->cellData.getValue().getNickname());
		tipoEstudianteColumn.setCellValueFactory(cellData->cellData.getValue().getTypeStudent());
		examPromColumn.setCellValueFactory(cellData ->cellData.getValue().getExamProm().asObject());
		quizPromColumn.setCellValueFactory(cellData ->cellData.getValue().getQuizProm().asObject());
		tareaPromColumn.setCellValueFactory(cellData ->cellData.getValue().getTareaProm().asObject());
		proyecto1Column.setCellValueFactory(cellData ->cellData.getValue().getProyecto1().asObject());
		proyecto2Column.setCellValueFactory(cellData ->cellData.getValue().getProyecto2().asObject());
		proyecto3Column.setCellValueFactory(cellData ->cellData.getValue().getProyecto3().asObject());
		projectPromColumn.setCellValueFactory(cellData ->cellData.getValue().getProjectProm().asObject());
		extraPromColumn.setCellValueFactory(cellData ->cellData.getValue().getExtraProm().asObject());
		finalNoteColumn.setCellValueFactory(cellData ->cellData.getValue().getFinalNote().asObject());
	
	}
	@FXML
	public void buttonOnAction(ActionEvent event) throws IOException {
		FileChooser fileChooser=new FileChooser();
		Stage stage= (Stage) anchorpane.getScene().getWindow();
		File file =fileChooser.showOpenDialog(stage);
		fileChooser.setTitle("CSV File");
		fileChooser.getExtensionFilters().addAll(
				new FileChooser.ExtensionFilter("CSV", "*.csv"));						
		if(file!=null) {
			Desktop desktop=Desktop.getDesktop();
			desktop.open(file);
		}
	
	}
	
	public void setMainApp(MainApp mainApp) {
		this.mainApp=mainApp;
		
		tablaEstudiantes.setItems(mainApp.getStudentData());
	}
}
