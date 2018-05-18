package basics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] str = {"Madhu","Java","Csharp"};
		List<String> list = new ArrayList<String>();
				
		for(String s:str)
		{
			list.add(s);

		}
		System.out.println(list);
		
		Iterator<String> it = list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
	}

}
