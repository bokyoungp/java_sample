package ch08;

import java.text.MessageFormat;

public class MessageFormatDemo {

	public static void main(String[] args) {
		String msg = MessageFormat.format("{0}/{1}={2}", 10, 2, 5);
		System.out.println(msg);

		msg = MessageFormat.format("{2}/{1}={0}, {0}, {0}", new String[] { "2", "1", "2" });

		System.out.println(msg);
	}

}
