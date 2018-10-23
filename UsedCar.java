package Lab11CarDetails2;

import java.util.ArrayList;


public class UsedCar extends Car{
	double mileage = 0.0;
	
	

	public UsedCar(String make, String model, int i, double d, double e) {
			super(make, model, i, d);
			this.mileage = e;
		}



	@Override
	public String toString() {
		return "Used Car [make=" + make + ", model=" + model + ", year=" + year + ", price=" + price + " mileage=" + mileage + "]";
	}



	private static ArrayList<UsedCar>	usedCar = new ArrayList<>(6);

	public static ArrayList<UsedCar> getusedCar() {
		
		usedCar.add(new UsedCar("Honda", "Civic", 2016, 21999.9, 50000));
		usedCar.add(new UsedCar("Jeep", "Liberty", 2014, 19500.9, 45000));
		usedCar.add(new UsedCar("Toyota", "RAV4", 2015, 17000.9, 40000));
		usedCar.add(new UsedCar("Nissan", "Ultima", 2017, 23000, 35000));
		usedCar.add(new UsedCar("Ford", "Fusion", 2016, 19000, 30000));
		usedCar.add(new UsedCar("Chevrolet", "Silverado", 2012, 15000, 99000));
		return usedCar;
	}

}
