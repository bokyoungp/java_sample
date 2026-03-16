package ch13;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyFileDemo {

	public static void main(String[] args) {
		// c:/temp/test1.txt 를 읽어서 c:/temp/test2.txt 로 저장하는 예제
		String input = "c:\\temp\\test1.txt";
		String output = "c:\\temp\\test2.txt";

		try (InputStream fis = new FileInputStream(input); OutputStream fos = new FileOutputStream(output)) {
			int c;
			while ((c = fis.read()) != -1) {
				fos.write(c);
			}
			fos.flush();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// fis.read() ==> fos.write()
		// fos.flush()
		// fis.close() , fos.close();
	}

}
