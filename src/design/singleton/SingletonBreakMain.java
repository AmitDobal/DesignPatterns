package design.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SingletonBreakMain {
	public static void main(String[] args) throws Exception {
		VehicleSingleton v1 = VehicleSingleton.getInstance();
		System.out.println("v1: " + v1.hashCode());

//		Constructor<VehicleSingleton> vehicleConstructor = VehicleSingleton.class.getDeclaredConstructor();
//		vehicleConstructor.setAccessible(true);
//		VehicleSingleton v2 = vehicleConstructor.newInstance();
//		System.out.println("v2: " + v2.hashCode());

		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("abc.ob"));
		oos.writeObject(v1);
		System.out.println("Serialization Done");

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("abc.ob"));
		
		VehicleSingleton v2 = (VehicleSingleton) ois.readObject();
		System.out.println("v2: " + v2.hashCode());
		

	}
}
