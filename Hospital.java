
public class Hospital {

	String name;
	HospitalRoom[] patientRooms;
	int staffCount;
	String location;
	int departments;
	
	
	public Hospital(String name, HospitalRoom[] patientRooms, int staffCount, String location, int departments) {
		
		this.name = name;
		this.patientRooms = patientRooms;
		this.staffCount = staffCount;
		this.location = location;
		this.departments = departments;
		
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setPatientsRooms(HospitalRoom[] patientRooms) {
		this.patientRooms = patientRooms;
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
	public HospitalRoom[] getPatientRooms() {
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
	
	
	
	
	
	
}
