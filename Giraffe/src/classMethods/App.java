package classMethods;


public class App
{
	public static void main(String [] args)
	{
		Student myStudent = new Student("Mike", "CS", 3.2);
		
		System.out.println(myStudent.isOnHonorRoll());
	}
}

