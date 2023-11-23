package OutputStreamWriter_InputStreamReader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class InputStreamReader {
  
	public static void main(String [] args) {
		
		File file=new File("test.txt");
		FileInputStream fileInputStream=null;
		
		try {
			fileInputStream = new FileInputStream(file);
			java.io.InputStreamReader ınputStreamReader= new java.io.InputStreamReader(fileInputStream);
			
			int c=0;
			while((c=ınputStreamReader.read())!=-1) {
				System.out.print((char)c);
			}
			
			ınputStreamReader.close();
			
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
		}
		
		
	}
	
	
}
