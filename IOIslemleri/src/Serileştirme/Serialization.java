package Serileştirme;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Serialization {
	
	// NESNE OKUMA KISMI
	public static void oku() {
		File file= new File("ogrenci.txt");
		if(file.exists()) {
			FileInputStream fileInputStream=null;
			ObjectInputStream objectInputStream=null;
			
			try {
				fileInputStream= new FileInputStream(file);
				objectInputStream=new ObjectInputStream(fileInputStream);
				Ogrenci ogrenci=(Ogrenci)objectInputStream.readObject();
				System.out.println(ogrenci);
				
			} catch (Exception e) {
				e.getMessage();
			}finally {
				if(fileInputStream!=null) {
					try {
						fileInputStream.close();
					} catch (IOException e) {
					
						e.printStackTrace();
					}
				}
				if(objectInputStream!=null) {
					try {
						objectInputStream.close();
					} catch (IOException e) {
					
						e.printStackTrace();
					}
				}
			
			}
		}else {
			System.out.println("file not exist");
		}
		
	}

	public static void main(String[] args) {
		
		// NESNE YAZMA KISMI 
		/*
		Ogrenci ogrenci=new Ogrenci();
		ogrenci.setNumara(365);
		ogrenci.setName("john");
		ogrenci.setSurname("will");
		ogrenci.setLesson("maths");
		
		System.out.println(ogrenci);
		
		
		File file= new File("ogrenci.txt");
		FileOutputStream fileOutputStream=null;
		ObjectOutputStream objectOutputStream=null;
		
		try {
			fileOutputStream= new FileOutputStream(file);
			objectOutputStream=new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(ogrenci);
			
			
		} catch (Exception e) {
			e.getMessage();
		}finally {
			if(fileOutputStream!=null) {
				try {
					fileOutputStream.close();
				} catch (IOException e) {
				
					e.printStackTrace();
				}
			}
			if(objectOutputStream!=null) {
				try {
					objectOutputStream.close();
				} catch (IOException e) {
				
					e.printStackTrace();
				}
			}
		}
		*/
		
		
		oku();
		
		
	}
}
