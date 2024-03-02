package EHealthCarePackage;

import java.util.ArrayList;

public class Test implements MenuMethods {
	
	
	
	public static void main(String[] args) {
		createHospital();
		MenuMethods.runMenu();
	}
	
	public static void createHospital() {
		Patient Bob = new Patient(2031656,"Bob Bobby", 20, "Male", "03/18/1990", "Sore Throat");
		Patient Barb = new Patient(8974635,"Barb Bobby", 21,"Male", "11/18/1999", "Sore Throat");
		Patient Billy = new Patient(4355097,"Billy Billy", 22,"Male", "11/17/2003", "Sore Throat");
		Patient Bart = new Patient(9084579,"Bart Bobby", 23,"Male", "12/16/1999", "Sore Throat");
		Patient Barry = new Patient(9076336,"Barry Bobby", 24,"Male", "12/14/1997", "Sore Throat");
		
		Patient Mary = new Patient(6667657,"Mary Bobby", 25,"Female", "11/10/2013", "Sore Throat");
		Patient Moe = new Patient(2543536,"Moe Bobby", 26,"Male", "04/11/2032", "Sore Throat");
		Patient Mitch = new Patient(2698656,"Mitch Billy", 21,"Male", "05/22/2441", "Sore Throat");
		Patient Marrie = new Patient(2960656,"Marrie Bobby", 13,"Female", "08/31/2413", "Sore Throat");
		Patient Michael = new Patient(0642456,"Michael Bobby", 14,"Male", "01/13/2113", "Sore Throat");
		
		Patient Charlie = new Patient(7546956,"Charlie", 28, "Male", "05/21/2103", "Sore Throat");
		Patient Chuck = new Patient(2845856,"Chuck Bobby", 29, "Male", "05/11/2044", "Sore Throat");
		Patient Chicken = new Patient(3224566,"Chicken Billy", 30, "Male", "06/21/5003", "Sore Throat");
		Patient Cherry = new Patient(3774656,"Cherry Bobby", 24, "Female", "03/12/5403", "Sore Throat");
		Patient Chuckle = new Patient(7356736,"Chuckle Bobby", 40, "Male", "02/23/3303", "Sore Throat");
			
		
			
		ArrayList<Patient> patientsInMadison = new ArrayList<Patient>();
			patientsInMadison.add(Bob);
			patientsInMadison.add(Barb);
			patientsInMadison.add(Billy);
			patientsInMadison.add(Bart);
			patientsInMadison.add(Barry);
		ArrayList<Patient> patientsInJanesville = new ArrayList<Patient>();
			patientsInJanesville.add(Mary);
			patientsInJanesville.add(Moe);
			patientsInJanesville.add(Mitch);
			patientsInJanesville.add(Marrie);
			patientsInJanesville.add(Michael);
		ArrayList<Patient> patientsInMilton = new ArrayList<Patient>();
			patientsInMilton.add(Charlie);
			patientsInMilton.add(Chuck);
			patientsInMilton.add(Chicken);
			patientsInMilton.add(Cherry);
			patientsInMilton.add(Chuckle);
			
	
		HospitalRoom Room203 = new HospitalRoom(203, 5, patientsInMadison);
		HospitalRoom Room210 = new HospitalRoom(210, 5, patientsInJanesville);
		HospitalRoom Room215 = new HospitalRoom(215, 5, patientsInMilton);
		
		
		ArrayList<HospitalRoom> madisonHospitalRooms = new ArrayList<HospitalRoom>();
			madisonHospitalRooms.add(Room203);
		ArrayList<HospitalRoom> janesvilleHospitalRooms = new ArrayList<HospitalRoom>();
			janesvilleHospitalRooms.add(Room210);
		ArrayList<HospitalRoom> miltonHospitalRooms = new ArrayList<HospitalRoom>();
			miltonHospitalRooms.add(Room215);
		
			
		Hospital madisonHospital = new Hospital("Madison Hopsital", madisonHospitalRooms, 200, "1234 Street", 3);
		Hospital janesvilleHospital = new Hospital("Janesville Hopsital", janesvilleHospitalRooms, 100, "12345 Street", 2);
		Hospital miltonHospital = new Hospital("Milton Hopsital", miltonHospitalRooms, 50, "400 Street", 1);
		
		ArrayList<Hospital> listOfHospitals = new ArrayList<Hospital>();
		
		HospitalContainerObject container = new HospitalContainerObject(listOfHospitals);
			container.addHospital(miltonHospital);
			container.addHospital(madisonHospital);
			container.addHospital(janesvilleHospital);
		}	

	
	
}