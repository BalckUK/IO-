package file;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileOutputStreamExample {
	public static void main(String[] args)throws Exception{
		String originalFileName = "C:\\Users\\haga5\\Desktop\\IO기반 입출력 및 네트워킹\\FileStream\\bin\\image/house1.jpg";
		String targetFileName = "C:/Temp1/house.jpg";
		
		FileInputStream fis = new FileInputStream(originalFileName);
		FileOutputStream fos = new FileOutputStream(targetFileName);
		
		int readByteNo;
		byte[] readBytes = new byte[100];
		while((readByteNo = fis.read(readBytes)) != -1) {
			fos.write(readBytes, 0, readByteNo);
		}
		
		fos.flush();
		fis.close();
		fos.close();
		System.out.println("복사 완료");
	}	
}
