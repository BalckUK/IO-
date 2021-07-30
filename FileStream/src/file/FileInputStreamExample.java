package file;

import java.io.FileInputStream;

public class FileInputStreamExample {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("C:/Users/haga5/Desktop/IO기반 입출력 및 네트워킹/FileStream");
		int data;
		while((data = fis.read()) != -1) {
			System.out.write(data);
		}
		System.out.flush();
		fis.close();
	}
}
