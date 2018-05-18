package basics;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "       Your Transaction Completed. TR number is 43543543";
		System.out.println(str.trim());
		
		String str1 = "Madhu";
		
		for(int i=str1.length()-1;i>=0;i--)
		{
			System.out.println(str1.charAt(i));
		}

	}

}
