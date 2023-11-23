package OutputStreamWriter_InputStreamReader;

import java.io.*;


//byte streamı karakter stream olarak değiştirme 
public class OutputStreamWriter {

	public static void main(String[] args) {
		
		File file= new File("test.txt");
		FileOutputStream fileOutputStream=null;
		
		try {
			fileOutputStream= new FileOutputStream(file);
			java.io.OutputStreamWriter outputStreamWriter=new java.io.OutputStreamWriter(fileOutputStream);
			
			String text="helloworld";
			
			outputStreamWriter.write(text);
			outputStreamWriter.close();
			
			
		} catch (Exception e) {
			e.getMessage();
			
		}finally {
			if(fileOutputStream != null) {
				try {
					fileOutputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		
		}
		
		
		
		
		
		
	}
}
