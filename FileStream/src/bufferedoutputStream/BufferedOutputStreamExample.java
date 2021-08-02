package bufferedoutputStream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedOutputStreamExample {

	public static void main(String[] args) throws Exception {

		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;

		int data = -1;
		long start = 0;
		long end = 0;

		fis = new FileInputStream(
				"C:\\Users\\haga5\\Desktop\\IO기반 입출력 및 네트워킹\\FileStream\\src\\bufferedoutputStream\\house1.jpg");
		
		bis = new BufferedInputStream(fis);
		fos = new FileOutputStream("C:/Temp1/house1.jpg");
		start = System.currentTimeMillis();
		while((data = bis.read()) != -1) {
			fos.write(data);
		}
		fos.flush();
		end = System.currentTimeMillis();
		fos.close();
		bis.close();
		fis.close();
		
		System.out.println("사용하지 않았을 때 : "+ (end-start)+ "ms");
	}

}
