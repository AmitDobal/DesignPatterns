package design.prototype;

public class MainClient {
	public static void main(String[] args) throws CloneNotSupportedException {
		NetworkConnection connection = new NetworkConnection();
		connection.setIp("192.168.1.1");
		connection.loadData();
		System.out.println(connection);

		NetworkConnection connection2 = (NetworkConnection) connection.clone();
		
		System.out.println(connection2);

	}
}
