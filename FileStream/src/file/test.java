package file;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.Reader;

public class test {
	public static void main(String[] args) throws Exception {
		
		//바이트 기반으로 읽음
		InputStream in = new FileInputStream("C:/Temp/test.txt");
		int bytes1;
		while ((bytes1 = in.read()) != -1) {
			System.out.print((char) bytes1);
		}
		System.out.println();
		System.out.println();
		
		
		Reader in1 = new FileReader("C:/Temp/test.txt");
		//File file = new File("C:/Temp/test.txt");
		char[] cbuf = new char[2];
		int bytes;
		int count = 0;
		while ((bytes = in1.read(cbuf)) != -1) {
			count += 1;
			System.out.println((char)bytes);
		}
		System.out.println(count);
		System.out.println();
		System.out.println();
		
		//문자 기반으로 읽음
		Reader in12 = new FileReader("C:/Temp/test.txt");
		int bytes2;
		while ((bytes2 = in12.read()) != -1) {
			System.out.print((char) bytes2);
		}

	}
}
