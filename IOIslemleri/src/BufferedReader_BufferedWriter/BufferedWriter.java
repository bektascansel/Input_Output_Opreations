package BufferedReader_BufferedWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BufferedWriter {

	public static void main(String[] args) {
		
		File file= new File("hello.txt");
		FileWriter fileWriter=null;
		java.io.BufferedWriter bufferedWriter=null;
		 try {
			 
			 fileWriter=new FileWriter(file);
			 bufferedWriter=new java.io.BufferedWriter(fileWriter);
			 Scanner scanner=new Scanner(System.in);
			 String line=null;
			 while(!((line=scanner.nextLine()).equals("quit"))) {
				 bufferedWriter.write(line);
				 
			 }
			 
			 scanner.close();
			
		} catch (Exception e) {
			e.getMessage();
			
		}finally {
			if(fileWriter!=null) {
				try {
					fileWriter.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(bufferedWriter!=null) {
				try {
					bufferedWriter.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
}
