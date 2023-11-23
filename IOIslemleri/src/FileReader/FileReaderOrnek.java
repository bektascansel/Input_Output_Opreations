package FileReader;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

//dosyadan karakter stream ile veri okuma
public class FileReaderOrnek {
      
	public static void main(String[] args) {
		
		File file= new File("test.txt");
		FileReader fileReader=null;
		
		try {
			
			fileReader=new FileReader(file);
			
			/*
			int c=0;
			while((c=fileReader.read())!= -1) {
				System.out.print((char)c);
			}*/
			
			
			//performans açısından daha iyi bir okuma yapmak için;
			
			char[] buffer= new char[(int)file.length()];
			fileReader.read(buffer);
			System.out.println(new String(buffer));
			
		} catch (Exception e) {
			e.getMessage();
		}finally {
			if(fileReader!= null) {
				try {
					fileReader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		
		
		
	}
}
