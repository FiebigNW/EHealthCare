package EHealthCarePackage;
import java.util.ArrayList;

public class Hospital {

	String name;
	static ArrayList<HospitalRoom> patientRooms;
	int staffCount;
	String location;
	int departments;
	
	
	public Hospital(String name, ArrayList<HospitalRoom> patientRooms, int staffCount, String location, int departments) {
		
		this.name = name;
		Hospital.patientRooms = patientRooms;
		this.staffCount = staffCount;
		this.location = location;
		this.departments = departments;
		
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setPatientsRooms(ArrayList<HospitalRoom> patientRooms) {
		Hospital.patientRooms = patientRooms;
	}
	public void setStaffCount(int staffCount) {
		this.staffCount = staffCount;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public void setDepartments(int departments) {
		this.departments = departments;
	}
	
	public String getName() {
		return name;
	}
	public ArrayList<HospitalRoom> getPatientRooms() {
		return patientRooms;
	}
	public int getStaffCount() {
		return staffCount;
	}
	public String getLocation() {
		return location;
	}
	public int getDepartments() {
		return departments;
	}
	
	public void addHospitalRoom(HospitalRoom rooms) {
		patientRooms.add(rooms);
	}
	
	public void removeHospitalRoom(HospitalRoom rooms) {
		patientRooms.remove(rooms);
	}
	
	public void printHospitalRooms() {
		for(int i = 0; i < patientRooms.size(); i++){
			System.out.println("  " + (i + 1) + ". " + patientRooms.get(i).getRoomNumber());
		}
	}
	
	
}