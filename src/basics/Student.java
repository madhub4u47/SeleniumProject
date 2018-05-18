package basics;

public class Student {
	
	public String name;
	private int marks;
	public String college;
	
	public Student()
	{
		this.college = "JNTU College";
	}
		
	public Student(String str, int m)
	{
		this.name = str;
		this.marks = m;
	}
	
	public void display()
	{
		System.out.println("Student Name : "+name+ " "+"Marks : "+marks);
		System.out.println(college);
	}
	
	public String CalculateGrade()
	{
		if(marks>400)
		{
			return "A";
		}
		else if(marks>500)
		{
			return "B";
		}
		
		return "Please Enter Correct Marks";
	}

}
