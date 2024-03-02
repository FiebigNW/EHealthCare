package EHealthCarePackage;

import java.util.ArrayList;

public class HospitalRoom {

	int roomNumber;
	int size;
	ArrayList<Patient> patients;
	
	
	public HospitalRoom(int roomNumber, int size, ArrayList<Patient> patients) {
		
		this.roomNumber = roomNumber;
		this.size = size;
		this.patients = patients;
		
	}
	
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	
	public void setRoomSize(int size) {
		this.size = size;
	}
	
	public void setPatients(ArrayList<Patient> patients) {
		this.patients = patients;
	}
	
	
	public int getRoomNumber() {
		return roomNumber;
	}
	
	public int getRoomSize() {
		return size;
	}
	
	public ArrayList<Patient> getPatients() {
		return patients;
	}
	
	public void addPatientToRoom(Patient patient) {
		if(patients.size() == size) {
			System.out.println("Max patients for this room.");
		} else {
			patients.add(patient);
		}
	}
	
	public void removePatientFromRoom(Patient patient) {
		patients.remove(patient);
	}
	
	public void printPatientsInRoom() {
		for(int i = 0; i < patients.size(); i++){
			System.out.println("  " + (i + 1) + ". " + patients.get(i).getName());
		}
	}
	
}