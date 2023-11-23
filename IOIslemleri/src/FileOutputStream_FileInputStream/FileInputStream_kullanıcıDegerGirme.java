package FileOutputStream_FileInputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class FileInputStream_kullanıcıDegerGirme {
	
	public static void main(String[] args) {
		
		Scanner scanner =new Scanner(System.in);
		File file=new File("tested.txt");
	
		
		if(!file.exists()) {
			try {
				boolean created=file.createNewFile();
				if(created==true) {
					System.out.println("File created");
				}else {
					System.out.println("File not created");
				}
				
			} catch (Exception e) {
				e.getMessage();
			}
		}
		
		//kullanıcı tarafından girilen degerleri dosyaya yazma işlemi yapılır
		//dosyaya byte stream ile yazma işlemi için ınputStream nesnesi oluşturulur.
		
		FileOutputStream fileOutputStream=null;
		try {
			
			fileOutputStream=new FileOutputStream(file);
			String line=null;
			line=scanner.nextLine();	
		    while(!((line=scanner.nextLine()).equals("quit"))) {
		    
			fileOutputStream.write(line.getBytes());
			
		
			
		    }
		} catch (IOException e) {
			
			e.printStackTrace();
		}finally {
			if(fileOutputStream!= null) {
				try {
					fileOutputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		
		
	}

}
