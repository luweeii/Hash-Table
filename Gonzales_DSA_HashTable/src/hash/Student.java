package hash;

public class Student {
	String name;
	String id;
	String major;

	public Student (String name, String id, String major) {
		this.name = name;
		this.id = id;
		this.major = major;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getMajor() {
		return major;
	}

	@Override
	public String toString() {
		return "Student: " + name + " | ID: " + id + " | Major: " + major + ")";
	}
}
