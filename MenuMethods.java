import java.util.Scanner;

public interface MenuMethods {

	static Scanner scan = new Scanner(System.in);
	
	public static void printMenu() {
		System.out.println("Menu:");
		System.out.println("  1. Change");
		System.out.println("  2. View Only");
		System.out.println("  3. Quit");
	}
	
	public static void runMenu() {
		
		printMenu();
		String input = scan.nextLine();
		
		if(input.equals("1")) {
			runChangeMenu();
		} else if(input.equals("2")) {
			runViewMenu();
		} else if(input.equals("3")) {
			return;
		} else {
			System.out.println("Invalid Input");
			runMenu();
		}
			
}
	
	public static void printChangeMenu() {
		System.out.println("Menu:");
		System.out.println("  1. Add/Remove Hospitals");
		System.out.println("  2. Edit Hospital Information");
		System.out.println("  3. Add/Remove Patient");
		System.out.println("  4. Change Patient Information");
		System.out.println("  5. Back");
		System.out.println("  6. Quit");
	}

	public static void runChangeMenu() {
		
		printChangeMenu();
		String input = scan.nextLine();
		
		if(input.equals("1")) {
			
		} else if(input.equals("2")) {
			
		} else if(input.equals("3")) {
			
		} else if(input.equals("4")) {
			
		} else if(input.equals("4")) {
			
		} else if(input.equals("5")) {
			runMenu();
		} else if(input.equals("6")) {
			return;
		} else {
			System.out.println("Invalid Input");
			runMenu();
		}
		
		
	}
	
	public static void runViewMenu() {
		
		printViewMenu();
		String input = scan.nextLine();
		
		if(input.equals("1")) {
			viewHospitals();
			System.out.println("");
			runViewMenu();
		} else if(input.equals("2")) {
			viewHospitalRooms();
			System.out.println("");
			runViewMenu();
		} else if(input.equals("3")) {
			
		} else if(input.equals("4")) {
			runMenu();
		} else if(input.equals("5")) {
			return;
		} else {
			System.out.println("Invalid Input");
			runMenu();
		}
	}
	
	public static void printViewMenu() {
		System.out.println("Menu:");
		System.out.println("  1. View Hospitals");
		System.out.println("  2. View Hopistal Rooms");
		System.out.println("  3. View Patient");
		System.out.println("  4. Back");
		System.out.println("  5. Quit");
	}
	
	public static void viewHospitals() {
		HospitalContainerObject.printHospitals();
	}
	
	public static void viewHospitalRooms() {
		for(int i = 0; i < HospitalContainerObject.getHospitalContainer().size(); i++) {
			HospitalContainerObject.getHospitalContainer().get(i).printHospitalRooms();
		}
	}
	
}
