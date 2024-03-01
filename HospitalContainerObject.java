import java.util.ArrayList;

public class HospitalContainerObject {

	static ArrayList<Hospital> hospitalContainer;
	
	public HospitalContainerObject(ArrayList<Hospital> hospitalContainer) {
		HospitalContainerObject.hospitalContainer = hospitalContainer;
	}
	
	public static ArrayList<Hospital> getHospitalContainer() {
		return hospitalContainer;
	}
	
	public static void setHospitalContainer(ArrayList<Hospital> hospitalContainer) {
		HospitalContainerObject.hospitalContainer = hospitalContainer;
	}
	
	public static void addHospital(Hospital hospital) {
		hospitalContainer.add(hospital);
	}
	
	public static void removeHospital(Hospital hospital) {
		hospitalContainer.remove(hospital);
	}
	
	public static void printHospitals() {
		for(int i = 0; i < hospitalContainer.size(); i++){
			System.out.println("  " + (i + 1) + ". " + hospitalContainer.get(i).getName());
		}
	}
	
}
