package design.prototype;

import java.util.ArrayList;
import java.util.List;

public class MainClient {
	public static void main(String[] args) throws CloneNotSupportedException {
		NetworkConnection connection = new NetworkConnection();
		List list = new ArrayList<>();
		list.add(1);
		list.add(2);
		
		connection.setIp("192.168.1.1");
		connection.loadData();
		connection.setDataList(list);
		
		list.add(3);
		NetworkConnection connection2 = (NetworkConnection) connection.clone();
		list.add(4);
		list.add(5);
		
		connection2.getDataList().add(99);
		
		System.out.println(connection);
		System.out.println(connection2);

	}
}
