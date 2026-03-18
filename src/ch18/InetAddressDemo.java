package ch18;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class InetAddressDemo {

	public static void main(String[] args) {
		InetAddress addr1 = null, addr2 = null;

		String address = "www.hanbit.co.kr";

		try {
			addr1 = InetAddress.getByName(address);
			addr2 = InetAddress.getLocalHost();
			System.out.println(Arrays.toString(InetAddress.getAllByName(address)));
			System.out.println(addr1.getHostName() + ":" + addr1.getHostAddress());
			System.out.println(addr2.getHostAddress());
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			System.out.println("해당 호스트 이름으로 등록된 IP 주소가 없습니다.");
		}

	}

}
