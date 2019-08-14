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
		
		this.projectProm=0;
		this.extraProm=0;
		this.finalNote=0;
		
	}
	
	public Estudiante() {
		this.id=0;
		this.fullname=null;
		this.email=null;
		this.phone=0;
		this.nickname=null;
		this.typeStudent=null;
		this.examProm=0;
		this.quizProm=0;
		this.tareaProm=0;
		this.proyecto1=0;
		this.proyecto2=0;
		this.proyecto3=0;
		
		this.projectProm=0;
		this.extraProm=0;
		this.finalNote=0;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the fullname
	 */
	public String getFullname() {
		return fullname;
	}

	/**
	 * @param fullname the fullname to set
	 */
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the phone
	 */
	public int getPhone() {
		return phone;
	}

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(int phone) {
		this.phone = phone;
	}

	/**
	 * @return the nickname
	 */
	public String getNickname() {
		return nickname;
	}

	/**
	 * @param nickname the nickname to set
	 */
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	/**
	 * @return the typeStudent
	 */
	public String getTypeStudent() {
		return typeStudent;
	}

	/**
	 * @param typeStudent the typeStudent to set
	 */
	public void setTypeStudent(String typeStudent) {
		this.typeStudent = typeStudent;
	}

	/**
	 * @return the examProm
	 */
	public int getExamProm() {
		return examProm;
	}

	/**
	 * @param examProm the examProm to set
	 */
	public void setExamProm(int examProm) {
		this.examProm = examProm;
	}

	/**
	 * @return the quizProm
	 */
	public int getQuizProm() {
		return quizProm;
	}

	/**
	 * @param quizProm the quizProm to set
	 */
	public void setQuizProm(int quizProm) {
		this.quizProm = quizProm;
	}

	/**
	 * @return the tareaProm
	 */
	public int getTareaProm() {
		return tareaProm;
	}

	/**
	 * @param tareaProm the tareaProm to set
	 */
	public void setTareaProm(int tareaProm) {
		this.tareaProm = tareaProm;
	}

	/**
	 * @return the proyecto1
	 */
	public int getProyecto1() {
		return proyecto1;
	}

	/**
	 * @param proyecto1 the proyecto1 to set
	 */
	public void setProyecto1(int proyecto1) {
		this.proyecto1 = proyecto1;
	}

	/**
	 * @return the proyecto2
	 */
	public int getProyecto2() {
		return proyecto2;
	}

	/**
	 * @param proyecto2 the proyecto2 to set
	 */
	public void setProyecto2(int proyecto2) {
		this.proyecto2 = proyecto2;
	}

	/**
	 * @return the proyecto3
	 */
	public int getProyecto3() {
		return proyecto3;
	}

	/**
	 * @param proyecto3 the proyecto3 to set
	 */
	public void setProyecto3(int proyecto3) {
		this.proyecto3 = proyecto3;
	}

	/**
	 * @return the projectProm
	 */
	public int getProjectProm() {
		return projectProm;
	}

	/**
	 * @param projectProm the projectProm to set
	 */
	public void setProjectProm(int projectProm) {
		this.projectProm = projectProm;
	}

	/**
	 * @return the extraProm
	 */
	public int getExtraProm() {
		return extraProm;
	}

	/**
	 * @param extraProm the extraProm to set
	 */
	public void setExtraProm(int extraProm) {
		this.extraProm = extraProm;
	}

	/**
	 * @return the finalNote
	 */
	public int getFinalNote() {
		return finalNote;
	}

	/**
	 * @param finalNote the finalNote to set
	 */
	public void setFinalNote(int finalNote) {
		this.finalNote = finalNote;
	}
	

	

}
