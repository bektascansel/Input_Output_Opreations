package FileOutputStream_FileInputStream;

import java.io.File;
import java.io.FileInputStream;

public class FileINPUTStream {

	public static void main(String[] args) {
		
		File file= new File("hello.txt");
		FileInputStream fileInputStream=null;
		try {
			fileInputStream=new FileInputStream(file);
			int c=0;
			while((c=fileInputStream.read())!=-1) {
				System.out.print((char)c);
			}
		} catch (Exception e) {
			e.getMessage();
		}finally {
			try {
				if(fileInputStream!=null) {
					fileInputStream.close();
				}
				
			}catch(Exception e){
				e.getMessage();
			}
			
		}
		
	}
	
}
