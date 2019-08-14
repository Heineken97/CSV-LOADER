package com;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.csvreader.CsvReader;
import com.model.Estudiante;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MainApp extends Application {
	
	private Stage primaryStage;
	private BorderPane rootLayout;
	
	public List ReadCSV(String pathfile,String column) throws Exception{
		CsvReader csvReader=null;
		try {
			
			File file= new File(pathfile);
			FileReader freader= new FileReader(file);
			
			csvReader= new CsvReader(freader,column.charAt(0));
			
			String[] cabeceras=null;
			List registrosEstudiantes=new ArrayList();
			
			if(csvReader.readHeaders()) {
				cabeceras=csvReader.getHeaders();
			}
			
			while(csvReader.readRecord()) {
				String id =csvReader.get(cabeceras[0]);
				int ID=Integer.parseInt(id);
				
				String FULLNAME= csvReader.get(cabeceras[1]);
				
				String EMAIL= csvReader.get(cabeceras[2]);
				
				String phone= csvReader.get(cabeceras[3]);
				int PHONE=Integer.parseInt(phone);
				
				String NICKNAME= csvReader.get(cabeceras[4]);
				
				String TYPESTUDENT= csvReader.get(cabeceras[5]);
				
				String examProm= csvReader.get(cabeceras[6]);
				int EXAMPROM=Integer.parseInt(examProm);
				
				String quizProm= csvReader.get(cabeceras[7]);
				int QUIZPROM=Integer.parseInt(quizProm);
				
				String tareaProm= csvReader.get(cabeceras[8]);
				int TAREAPROM=Integer.parseInt(tareaProm);
				
				String proyecto1= csvReader.get(cabeceras[9]);
				int PROYECTO1=Integer.parseInt(proyecto1);
				
				String proyecto2= csvReader.get(cabeceras[10]);
				int PROYECTO2=Integer.parseInt(proyecto2);
				
				String proyecto3= csvReader.get(cabeceras[11]);
				int PROYECTO3=Integer.parseInt(proyecto3);
				
				int PROJECTPROM=(PROYECTO1+PROYECTO2+PROYECTO3)/3;
				
				int EXTRASPROM=(EXAMPROM+QUIZPROM+TAREAPROM)/3;
				
				int FINALNOTE= PROYECTO1+PROYECTO2+PROYECTO3;
				
				
				Estudiante estudiante = new Estudiante();
				estudiante.setId(ID);
				estudiante.setFullname(FULLNAME);
				estudiante.setEmail(EMAIL);
				estudiante.setPhone(PHONE);
				estudiante.setNickname(NICKNAME);
				estudiante.setTypeStudent(TYPESTUDENT);
				estudiante.setExamProm(EXAMPROM);
				estudiante.setQuizProm(QUIZPROM);
				estudiante.setTareaProm(TAREAPROM);
				estudiante.setProyecto1(PROYECTO1);
				estudiante.setProyecto2(PROYECTO2);
				estudiante.setProyecto3(PROYECTO3);
				estudiante.setProjectProm(PROJECTPROM);
				estudiante.setExtraProm(EXTRASPROM);
				estudiante.setFinalNote(FINALNOTE);
				
				
				registrosEstudiantes.add(estudiante);
			}
			
			
			return registrosEstudiantes;	
			
		}catch(Exception e) {
			throw e;
		}finally {
			if(csvReader!=null) {
				csvReader.close();
			}
		}
		
		
	}

	@Override
	public void start(Stage primaryStage) {
		this.primaryStage=primaryStage;
		this.primaryStage.setTitle("CSV Checker");
		
		initRootLayout();
		
		showPersonOverview();
		
	}
	
	public void initRootLayout() {
		try {
			
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("view/RootLayout.fxml"));
			rootLayout = (BorderPane) loader.load();
			
			Scene scene = new Scene(rootLayout);
			primaryStage.setScene(scene);
			primaryStage.show();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void showPersonOverview() {
		try {
			
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("view/ClientView.fxml"));
			AnchorPane personOverview =(AnchorPane) loader.load();
			
			rootLayout.setCenter(personOverview);
			}catch(IOException e){
				e.printStackTrace();
			}
	}
	
	public Stage getPrimaryStage() {
		return primaryStage;
	}

	public static void main(String[] args) {
		launch(args);
	}
}
