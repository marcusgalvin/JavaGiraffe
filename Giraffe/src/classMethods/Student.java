package classMethods;

public class Student {
	
	String name;
	String major;
	double gpa;
	
	public Student(String name, String major, double gpa)
	{
		this.name = name;
		this.major = major;
		this.gpa = gpa;
	}
	
	//class method
	
	public boolean isOnHonorRoll()
	{
		if (this.gpa >= 3.5)
		{
			return true;
		}
		return false;
	}

}
