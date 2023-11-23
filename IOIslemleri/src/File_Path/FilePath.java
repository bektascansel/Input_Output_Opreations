package File_Path;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

public class FilePath {

	public static void main(String[] args) {
		
		/*
		//File sınıfı metotları 
		
		File file = new File("C:\\Users\\CANSEL BEKTAS\\Desktop\\text.txt"); //Oluşturulan dosyanın path yolu verildi.
		//dosyanın durumları kontrol edilebilir.
		System.out.println(file.canRead());
		System.out.println(file.canWrite());
		System.out.println(file.exists());
		System.out.println(file.getAbsolutePath());//dosya yolunu verir
		System.out.println(file.getParent()); //dosyanın bulundupu bir üst dizin belirtilir
		System.out.println(file.length());
		System.out.println(new Date(file.lastModified()));
		*/
		
		
		
		
		/*
		//Program üzerinden file oluşturma 
		
		File file2 = new File("C:\\Users\\CANSEL BEKTAS\\Desktop\\deneme.txt");
		
		if(file2.exists()==false) {
	     try {
			file2.createNewFile();
			System.out.println("File created");
		} catch (IOException e) {
			e.printStackTrace();
		}
	     
	    }
		
		file2.delete();
		*/
		
		/*
		//Dosya gezgini oluşturma 
		
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter the Folder path: ");
		String filePath=scanner.nextLine();
		
		File file3=new File(filePath);
		String[] icerik=file3.list(); // eger kaynak bir klasor ise içeriğini döndürür.
		
		 for(int i=0;i<icerik.length;i++) {
			 System.out.println(icerik[i]);
		 }
		 */
		 
		 
		 //Karakter bazlı dosyaya veri yazma 
		 
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter the Folder path: ");
		String filePath=scanner.nextLine();
		
		File file3=new File(filePath);
	
		
		if(!file3.exists()) {
			try {
				boolean created=file3.createNewFile();
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
		//dosyaya karakter bazlı yazma işlemi için FileWriter nesnesi oluşturulur.
		FileWriter fileWriter=null;
		try {
			fileWriter=new FileWriter(file3);
			String line=null;
			do {
				System.out.println("Enter the text ");
				line=scanner.nextLine();
				fileWriter.write(line);
				fileWriter.write(System.lineSeparator());
				
			}while(!line.equals("quit"));
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}finally {
			if(fileWriter!= null) {
				try {
					fileWriter.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		
		
		
		
		
}
}
