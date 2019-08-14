package com.model;

public class Estudiante {
	
	private int id;
	private String fullname;
	private String email;
	private int phone;
	private String nickname;
	private String typeStudent;
	private int examProm;
	private int quizProm;
	private int tareaProm;
	private int proyecto1;
	private int proyecto2;
	private int proyecto3;
	
	private int projectProm;
	private int extraProm;
	private int finalNote;
	
	public Estudiante(int ID, String FULLNAME, String EMAIL, int PHONE, String NICKNAME, String TYPESTUDENT, int EXAMPROM, 
						int QUIZPROM, int TAREAPROM, int PROYECTO1,int PROYECTO2, int PROYECTO3) {
		this.id=ID;
		this.fullname=FULLNAME;
		this.email=EMAIL;
		this.phone=PHONE;
		this.nickname=NICKNAME;
		this.typeStudent=TYPESTUDENT;
		this.examProm=EXAMPROM;
		this.quizProm=QUIZPROM;
		this.tareaProm=TAREAPROM;
		this.proyecto1=PROYECTO1;
		this.proyecto2=PROYECTO2;
		this.proyecto3=PROYECTO3;
		
		this.projectProm=(proyecto1+proyecto2+proyecto3)/3;
		this.extraProm=(examProm+quizProm+tareaProm)/3;
		this.finalNote=0;
		
	}
	
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @return the fullname
	 */
	public String getFullname() {
		return fullname;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @return the phone
	 */
	public int getPhone() {
		return phone;
	}
	/**
	 * @return the nickname
	 */
	public String getNickname() {
		return nickname;
	}
	/**
	 * @return the typeStudent
	 */
	public String getTypeStudent() {
		return typeStudent;
	}
	/**
	 * @return the examProm
	 */
	public int getExamProm() {
		return examProm;
	}
	/**
	 * @return the quizProm
	 */
	public int getQuizProm() {
		return quizProm;
	}
	/**
	 * @return the tareaProm
	 */
	public int getTareaProm() {
		return tareaProm;
	}
	/**
	 * @return the proyecto1
	 */
	public int getProyecto1() {
		return proyecto1;
	}
	/**
	 * @return the proyecto2
	 */
	public int getProyecto2() {
		return proyecto2;
	}
	/**
	 * @return the proyecto3
	 */
	public int getProyecto3() {
		return proyecto3;
	}
	/**
	 * @return the projectProm
	 */
	public int getProjectProm() {
		return projectProm;
	}
	/**
	 * @return the extraProm
	 */
	public int getExtraProm() {
		return extraProm;
	}
	/**
	 * @return the finalNote
	 */
	public int getFinalNote() {
		return finalNote;
	}
	
	

}
