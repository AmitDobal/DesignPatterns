package design.singleton;

public class MyThread extends Thread{
	@Override
	public void run() {
		System.out.println("Thread running");
		VehicleSingleton v3 = VehicleSingleton.getInstance();
		VehicleSingleton v4 = VehicleSingleton.getInstance();
		v3.setName("Ferarri");
		v4.setName("Maruti");
		
		System.out.println("v3: " + v3.hashCode());
		System.out.println("v4: " + v4.hashCode());
		System.out.println("Thread end");
		System.out.println();
	}
}
