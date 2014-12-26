package training.w2.d4;

public class Student {

	private int id;
	
	private int age;
	
	private String firstName;
	
	private String lastName;
	
	private boolean male;
	
	public Student(int id, int age, String firstName, String lastName, boolean male) {
		this.id = id;
		this.age = age;
		this.firstName = firstName;
		this.lastName = lastName;
		this.male = male;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public boolean isMale() {
		return male;
	}

	public void setMale(boolean male) {
		this.male = male;
	}
	
	
}
