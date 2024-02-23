
public class HospitalRoom {

	int roomNumber;
	Patient[] patients;
	
	
	public HospitalRoom(int roomNumber, Patient[] patients) {
		
		this.roomNumber = roomNumber;
		this.patients = patients;
		
	}
	
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	
	public void setPatients(Patient[] patients) {
		this.patients = patients;
	}
	
	
	public int getRoomNumber() {
		return roomNumber;
	}
	
	public Patient[] getPatients() {
		return patients;
	}
	
}
