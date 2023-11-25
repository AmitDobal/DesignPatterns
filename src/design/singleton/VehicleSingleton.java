package design.singleton;

import java.util.Objects;

public class VehicleSingleton {
	private String color;
	private String model;
	private String name;
	private int wheel;
	private static int count = 1;
	private static VehicleSingleton vehicleSingleton;// = new VehicleSingleton();

	private VehicleSingleton() {

	}

	public static VehicleSingleton getInstance() {

		if (vehicleSingleton == null) {
			synchronized (VehicleSingleton.class) {
				if (vehicleSingleton == null) {
					System.out.println("Inside constructor of Vehicle singleton and object creation count: " + count++);
					vehicleSingleton = new VehicleSingleton();
				}
			}
		}
		return vehicleSingleton;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWheel() {
		return wheel;
	}

	public void setWheel(int wheel) {
		this.wheel = wheel;
	}

	@Override
	public String toString() {
		return "Vehicle [color=" + color + ", model=" + model + ", name=" + name + ", wheel=" + wheel + "]";
	}

//	@Override
//	public int hashCode() {
//		return Objects.hash(color, model, name, wheel);
//	}

//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Vehicle other = (Vehicle) obj;
//		return Objects.equals(color, other.color) && Objects.equals(model, other.model)
//				&& Objects.equals(name, other.name) && wheel == other.wheel;
//	}

}
