package ch13;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileOutputDemo {

	public static void main(String[] args) throws IOException {
		// FileOutputStream 의 사용법
		// byte a,b,c ==> c:/temp/test1.txt 저장

		OutputStream os = new FileOutputStream("c:/temp/test1.txt");

		byte a = 10, b = 20, c = 30;

		os.write(a);
		os.write(b);
		os.write(c);

		os.flush();

		os.close();

	}

}
