package basics;

public class Circle {
	
	static int radius;
	static float pi =3.14F;
	
	public Circle()
	{
		this.radius = 3;
	}
	public Circle(int r)
	{
		this.radius = r;
	}
	
	public static float Area()
	{
		return pi*radius*radius;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//TestStatic.Sum();
		System.out.println(args[0]);

	}

}
