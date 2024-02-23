public class Test {
	public static void main(String[] args) {
	
		Patient Bob = new Patient(2031656,"Bob Bobby", 20, "Male", "03/18/1990", "Sore Throat");
		Patient Barb = new Patient(8974635,"Barb Bobby", 21,"Male", "11/18/1999", "Sore Throat");
		Patient Billy = new Patient(4355097,"Billy Billy", 22,"Male", "11/17/2003", "Sore Throat");
		Patient Bart = new Patient(9084579,"Bart Bobby", 23,"Male", "12/16/1999", "Sore Throat");
		Patient Barry = new Patient(9076336,"Barry Bobby", 24,"Male", "12/14/1997", "Sore Throat");
		
		Patient Mary = new Patient(6667657,"Mary Bobby", 25,"Male", "11/10/2013", "Sore Throat");
		Patient Moe = new Patient(2543536,"Moe Bobby", 26,"Male", "04/11/2032", "Sore Throat");
		Patient Mitch = new Patient(2698656,"Mitch Billy", 21,"Male", "05/22/2441", "Sore Throat");
		Patient Marrie = new Patient(2960656,"Marrie Bobby", 13,"Male", "08/31/2413", "Sore Throat");
		Patient Michael = new Patient(0642456,"Michael Bobby", 14,"Male", "01/13/2113", "Sore Throat");
		
		Patient Charlie = new Patient(7546956,"Charlie", 28, "Male", "05/21/2103", "Sore Throat");
		Patient Chuck = new Patient(2845856,"Chuck Bobby", 29, "Male", "05/11/2044", "Sore Throat");
		Patient Chicken = new Patient(3224566,"Chicken Billy", 30, "Male", "06/21/5003", "Sore Throat");
		Patient Cherry = new Patient(3774656,"Cherry Bobby", 24, "Male", "03/12/5403", "Sore Throat");
		Patient Chuckle = new Patient(7356736,"Chuckle Bobby", 40, "Male", "02/23/3303", "Sore Throat");
			
		
		
		
			
		Patient[] patientsInMadison = new Patient[5];
			
		Patient[] patientsInJanesville = new Patient[5];
		
		Patient[] patientsInMilton = new Patient[5];
	
	
		HospitalRoom[] madisonHospitalRooms = new HospitalRoom[20];
		HospitalRoom[] janesvilleHospitalRooms = new HospitalRoom[15];
		HospitalRoom[] miltonHospitalRooms = new HospitalRoom[10];
			
			
		Hospital madisonHospital = new Hospital("Madison Hopsital", madisonHospitalRooms, 200, "1234 Street", 3);
		Hospital janesvilleHospital = new Hospital("Janesville Hopsital", janesvilleHospitalRooms, 100, "12345 Street", 2);
		Hospital miltonHospital = new Hospital("Milton Hopsital", miltonHospitalRooms, 50, "400 Street", 1);
			
		
		
		
		
		
	}
}
