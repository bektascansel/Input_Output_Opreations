package BufferedReader_BufferedWriter;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReader {

	public static void main(String [] args) {
		
		File file= new File("hello.txt");
		FileReader fileReader=null;
		java.io.BufferedReader bufferedReader=null;
		
		
		try {
			
			fileReader= new FileReader(file);
			bufferedReader=new java.io.BufferedReader(fileReader);
			String line=null;
			
			
			while((line=bufferedReader.readLine())!= null) {
				System.out.println(line);
			}
			
			
			
			
		} catch (Exception e) {
			e.getMessage();
		}finally {
			if(fileReader!=null) {
				try {
					fileReader.close();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
			}
			if(bufferedReader!=null) {
				try {
					bufferedReader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}
		
		
		
	}
}
