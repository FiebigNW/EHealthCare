package EHealthCarePackage;

import java.util.Scanner;

public interface MenuMethods {

	static Scanner scan = new Scanner(System.in);
	
	public static void printMenu() {
		System.out.println("Hospital Menu:");
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
			HospitalContainerObject.printHospitals();
			System.out.println("  "+ (HospitalContainerObject.getHospitalContainer().size() + 1) + ". Back");
			runViewHospitalMenu();
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
	
	public static void runViewHospitalMenu() {
		
		String input = scan.nextLine();
		int temp = Integer.parseInt(input);
		temp -= 1;
		
		if(temp < HospitalContainerObject.getHospitalContainer().size()) {	
			HospitalContainerObject.getHospitalContainer().get(temp).printHospitalRooms();	
			System.out.println("  "+ (HospitalContainerObject.getHospitalContainer().get(temp).getPatientRooms().size() + 1) + ". Back");
			runViewHospitalRoomsMenu(temp);
			
		} else if (temp == HospitalContainerObject.getHospitalContainer().size()) {
			runMenu();
		} else {
			System.out.println("Invalid Input");
			
			HospitalContainerObject.printHospitals();
			runViewHospitalMenu();
		}
		
	}
	
	public static void runViewHospitalRoomsMenu(int hospital) {
			
			String input = scan.nextLine();
			int temp = Integer.parseInt(input);
			temp -= 1;
			
			if(temp < HospitalContainerObject.getHospitalContainer().get(hospital).getPatientRooms().size()) {	
				HospitalContainerObject.getHospitalContainer().get(hospital).getPatientRooms().get(temp).printPatientsInRoom();
				System.out.println("  "+ (HospitalContainerObject.getHospitalContainer().get(hospital).getPatientRooms().get(temp).patients.size() + 1) + ". Back");
				runViewPatientInfoMenu(hospital, temp);
				
			} else if (temp == HospitalContainerObject.getHospitalContainer().get(hospital).getPatientRooms().size()) {
				HospitalContainerObject.printHospitals();
				System.out.println("  "+ (HospitalContainerObject.getHospitalContainer().size() + 1) + ". Back");
				runViewHospitalMenu();
				
			} else {
				System.out.println("Invalid Input");
				HospitalContainerObject.getHospitalContainer().get(hospital).printHospitalRooms();	
				System.out.println("  "+ (HospitalContainerObject.getHospitalContainer().get(hospital).getPatientRooms().size() + 1) + ". Back");
				runViewHospitalRoomsMenu(hospital);
		}
		
	}
	
	public static void runViewPatientInfoMenu(int hospital, int room) {

		String input = scan.nextLine();
		int temp = Integer.parseInt(input);
		
		if(temp < HospitalContainerObject.getHospitalContainer().get(hospital).getPatientRooms().get(room).getPatients().size()) {	
			HospitalContainerObject.getHospitalContainer().get(hospital).getPatientRooms().get(room).patients.get(temp).printPatientsInfo();
			System.out.println("1. Back");
			afterViewingPatientInfo(hospital, room);
		} else if (temp == HospitalContainerObject.getHospitalContainer().size()) {
			HospitalContainerObject.getHospitalContainer().get(hospital).printHospitalRooms();
			System.out.println("  "+ (HospitalContainerObject.getHospitalContainer().get(hospital) .getPatientRooms().size() + 1) + ". Back");
			runViewHospitalRoomsMenu(hospital);
		} else {
			System.out.println("Invalid Input");
			HospitalContainerObject.getHospitalContainer().get(hospital).getPatientRooms().get(temp).printPatientsInRoom();
			System.out.println("  "+ (HospitalContainerObject.getHospitalContainer().get(hospital).getPatientRooms().get(temp).patients.size() + 1) + ". Back");	
			runViewPatientInfoMenu(hospital, room);
		}
	}
	
	public static void afterViewingPatientInfo(int hospital, int room) {
		String input = scan.nextLine();
		if(input.equals("1")) {
			HospitalContainerObject.getHospitalContainer().get(hospital).getPatientRooms().get(room).printPatientsInRoom();
			System.out.println("  "+ (HospitalContainerObject.getHospitalContainer().get(hospital).getPatientRooms().get(room).patients.size() + 1) + ". Back");
			runViewPatientInfoMenu(hospital, room);
		} else {
			System.out.println("Invalid Input");
			afterViewingPatientInfo(hospital, room);
		}
	}

	
}