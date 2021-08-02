package file;

import java.io.FileReader;
import java.io.Reader;

public class test2 {
	public static void main(String[] args) throws Exception {
		Reader reader = new FileReader("C:/Temp/test.txt");
		int readCharNo;
		char[] cbuf = new char[2];
		String data= "";
		while((readCharNo = reader.read(cbuf)) != -1) {
			System.out.println(readCharNo);
			data += new String(cbuf, 0, readCharNo);
			System.out.println(data);
		}
		//System.out.println(data);
		reader.close();
		
	}
}
