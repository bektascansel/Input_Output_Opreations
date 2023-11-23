package Serileştirme;

import java.io.Serializable;

public class Ogrenci implements Serializable{
	private int numara;
	private String name;
	private String surname;
	private String lesson;
	
	public Ogrenci() {
		
	}
	
	public Ogrenci(int numara, String name, String surname, String lesson) {
		this.numara = numara;
		this.name = name;
		this.surname = surname;
		this.lesson = lesson;
	}

	public int getNumara() {
		return numara;
	}
	public void setNumara(int numara) {
		this.numara = numara;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getLesson() {
		return lesson;
	}
	public void setLesson(String lesson) {
		this.lesson = lesson;
	}
	
	@Override
	public String toString() {
		return "Nu: "+numara+" name: "+name+" surname: "+surname+" lesson: "+lesson;
	}

}
