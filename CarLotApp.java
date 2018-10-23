package Lab11CarDetails2;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
public class CarLotApp {
	
	// making a static variable outside main means it can be
		// shared by all the methods
		private static List<Car> cars = new ArrayList<>();
		
		
		static Scanner scnr = new Scanner(System.in);
		
		public static void main(String[] args) {
			

			cars.add( new Car("Nikolai", "Model S", 2017, 54999.9) );
			cars.add( new UsedCar("Hyonda", "Prior", 2015, 14795.5, 35987.6) );
			cars.add( new Car("Chewie", "Vette", 2017, 44989.95) );
			cars.add( new UsedCar("GC", "Chirpus", 2013, 8500, 12345) );
			cars.add(new UsedCar("Honda", "Civic", 2016, 21999.9, 50000));
			cars.add(new UsedCar("Jeep", "Liberty", 2014, 19500.9, 45000));
			cars.add(new UsedCar("Toyota", "RAV4", 2015, 17000.9, 40000));
			cars.add(new UsedCar("Nissan", "Ultima", 2017, 23000, 35000));
			cars.add(new UsedCar("Ford", "Fusion", 2016, 19000, 30000));
			cars.add(new UsedCar("Chevrolet", "Silverado", 2012, 15000, 99000));
			
			
			boolean done = false;
			while (!done) {
				System.out.println("Select an option: (list, select, add, quit)");
				String option = scnr.nextLine();
				switch (option) {
				case "list":
					doListOption();
					break;
				case "select":
					doSelectOption();
					break;
				case "quit":
					done = true;
					break;
				default:
					System.out.println("Invalid choice...");
					break;
				}
			}
		}
		
		private static void doListOption() {
			for (int i = 0; i < cars.size(); i++) {
				System.out.println((i + 1) + ". " + cars.get(i) );
			}
			System.out.println();
		}
		
		private static void doSelectOption() {
			String userAnswer;
			do {
				for (int i = 0; i<cars.size(); i++){
					System.out.println((i+1)+"."+ cars.get(i));
				}
			
			System.out.println("Select a car");
			int make = scnr.nextInt();
			scnr.nextLine();
			System.out.println(cars.get(make-1));
			
			System.out.println("Do you want to look at another car?");
			userAnswer = scnr.next();
			
		} while (userAnswer.equalsIgnoreCase("yes")); {
			System.out.println("Thank you for shopping today");
		}
	
}
}
