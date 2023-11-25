package design.singleton;

public class SingletonMain {
	public static void main(String[] args) {
		System.out.println("---------------General Vehicle implementation-----------------");
		//General implementation
		Vehicle v1 = new Vehicle();
		Vehicle v2 = new Vehicle();


		v1.setName("Ferarri");
		v2.setName("Maruti");
		
		System.out.println(v1.hashCode());
		System.out.println(v2.hashCode());
		
		System.out.println(v1.equals(v2));
		
		System.out.println(v1.getName());
		System.out.println(v2.getName());
		
		System.out.println("---------------Vehicle Singleton implementation------------------");
		//Vehicle Singleton implementation
//		VehicleSingleton v3 = VehicleSingleton.getInstance();
//		VehicleSingleton v4 = VehicleSingleton.getInstance();
//		
//		
//		v3.setName("Ferarri");
//		v4.setName("Maruti");
//		
//		System.out.println(v3.hashCode());
//		System.out.println(v4.hashCode());
//		
//		System.out.println(v3.equals(v4));
//		
//		System.out.println(v3.getName());
//		System.out.println(v4.getName());
//		
		System.out.println("-------------Threads Started--------------------------");
		
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		MyThread t3 = new MyThread();
		MyThread t4 = new MyThread();
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		
	}
}
