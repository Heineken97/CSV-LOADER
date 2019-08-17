package com.model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Estudiante {
	
	private final IntegerProperty  id;
	private final StringProperty  fullname;
	private final StringProperty  email;
	private final IntegerProperty phone;
	private final StringProperty  nickname;
	private final StringProperty  typeStudent;
	private final IntegerProperty examProm;
	private final IntegerProperty quizProm;
	private final IntegerProperty tareaProm;
	private final IntegerProperty proyecto1;
	private final IntegerProperty proyecto2;
	private final IntegerProperty proyecto3;
	
	private final IntegerProperty projectProm;
	private final IntegerProperty extraProm;
	private final IntegerProperty finalNote;
	
	public Estudiante(int ID, String FULLNAME, String EMAIL, int PHONE, String NICKNAME, String TYPESTUDENT, int EXAMPROM, 
						int QUIZPROM, int TAREAPROM, int PROYECTO1,int PROYECTO2, int PROYECTO3) {
		this.id=new SimpleIntegerProperty(ID);
		this.fullname=new SimpleStringProperty(FULLNAME);
		this.email=new SimpleStringProperty(EMAIL);
		this.phone=new SimpleIntegerProperty(PHONE);
		this.nickname=new SimpleStringProperty(NICKNAME);
		this.typeStudent=new SimpleStringProperty(TYPESTUDENT);
		this.examProm=new SimpleIntegerProperty(EXAMPROM);
		this.quizProm=new SimpleIntegerProperty(QUIZPROM);
		this.tareaProm=new SimpleIntegerProperty(TAREAPROM);
		this.proyecto1=new SimpleIntegerProperty(PROYECTO1);
		this.proyecto2=new SimpleIntegerProperty(PROYECTO2);
		this.proyecto3=new SimpleIntegerProperty(PROYECTO3);
		
		this.projectProm=new SimpleIntegerProperty(0);
		this.extraProm=new SimpleIntegerProperty(0);
		this.finalNote=new SimpleIntegerProperty(0);
		
	}
	
	public Estudiante() {
		this(0,null,null,0,null,null,0,0,0,0,0,0);
	}

	public IntegerProperty getId() {
		return id;
	}
	public void setId(int id) {
        this.id.set(id);
    }

	public StringProperty getFullname() {
		return fullname;
	}
	
	public void setFullName(String fullname) {
        this.fullname.set(fullname);
    }

	public StringProperty getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
        this.email.set(email);
    }

	public IntegerProperty getPhone() {
		return phone;
	}
	
	public void setPhone(int phone) {
        this.phone.set(phone);
    }

	public StringProperty getNickname() {
		return nickname;
	}
	
	public void setNickName(String nickname) {
        this.nickname.set(nickname);
    }

	public StringProperty getTypeStudent() {
		return typeStudent;
	}

	public void setTypeStudent(String typeStudent) {
        this.typeStudent.set(typeStudent);
    }
	
	public IntegerProperty getExamProm() {
		return examProm;
	}

	public void setExamProm(int examProm) {
        this.examProm.set(examProm);
    }
	
	public IntegerProperty getQuizProm() {
		return quizProm;
	}

	public void setQuizProm(int quizProm) {
        this.quizProm.set(quizProm);
    }
	public IntegerProperty getTareaProm() {
		return tareaProm;
	}
	
	public void setTareaProm(int tareaProm) {
        this.tareaProm.set(tareaProm);
    }
	public IntegerProperty getProyecto1() {
		return proyecto1;
	}
	public void setProyecto1(int proyecto1) {
        this.proyecto1.set(proyecto1);
    }
	public IntegerProperty getProyecto2() {
		return proyecto2;
	}

	public void setProyecto2(int proyecto2) {
        this.proyecto2.set(proyecto2);
	}
        
	public IntegerProperty getProyecto3() {
		return proyecto3;
	}

	public void setProyecto3(int proyecto3) {
        this.proyecto3.set(proyecto3);
	}
	public IntegerProperty getProjectProm() {
		return projectProm;
	}

	public void setProjectProm(int projectProm) {
        this.projectProm.set(projectProm);
	}
	public IntegerProperty getExtraProm() {
		return extraProm;
	}

	public void setExtraProm(int extraProm) {
        this.extraProm.set(extraProm);
	}
	public IntegerProperty getFinalNote() {
		return finalNote;
	}
	
	public void setFinalNote(int finalNote) {
        this.finalNote.set(finalNote);
	}


}
