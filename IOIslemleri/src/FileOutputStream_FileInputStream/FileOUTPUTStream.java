package FileOutputStream_FileInputStream;

import java.io.File;
import java.io.FileOutputStream;

public class FileOUTPUTStream {
	
	public static void main(String [] args) {
	File file=new File("hello.txt"); // kaynak belirlendi.
    FileOutputStream fileOutputStream=null;
    try {
		
    	fileOutputStream=new FileOutputStream(file);
    	fileOutputStream.write("merhaba".getBytes());
    	
	} catch (Exception e) {
		e.getMessage();
	}finally {
		if(fileOutputStream != null) {
			try {
			fileOutputStream.close();
		}catch (Exception e){
			e.getMessage();
		}
	}
   
	}
  
}
}