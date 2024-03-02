package EHealthCarePackage;

public class Patient {

	int id;
	String name;
	int age;
	String gender;
	String dateOfBirth;
	String notes;
	
	public Patient(int id, String name, int age, String gender, String dateOfBirth, String notes) {
			
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.notes = notes;	
		
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void steAge(int age) {
		this.age = age;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setDOB(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getGender() {
		return gender;
	}
	public String getDOB() {
		return dateOfBirth;
	}
	public String getNotes() {
		return notes;
	}
	public void printPatientsInfo(){
		System.out.println("Name: " + name + " Id: " + id + " Age: " + age + " Gender: " + gender + " DOB: " + dateOfBirth + " Notes: " + notes);
	}
	
}