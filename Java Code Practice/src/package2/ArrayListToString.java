package package2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class ArrayListToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> a = new ArrayList<String>();
		
		a.add("Ram");
		a.add("Hi");
		a.add("Ram");
		a.add("Hello"); 
		
		System.out.println("ArrayList is " + a);   
		
		String [] str = GetStringArray(a);
		
		System.out.println("String Array[] " + Arrays.toString(str));
		
		List<String> list = Arrays.asList(str);
		 
	    Set<String> set = new HashSet<String>();
	     // iterate through List
	    for(String s : list) 
	    {
	     // add element to Set/HashSet
	    boolean flagForDuplicate = set.add(s);
	 
	            if(!flagForDuplicate)
	            {
	               System.out.println(s + " is duplicate element");
	            }
	        }
	    
	    // add converted List (Arrays -> List)
        Set<String> stri = new HashSet<String>(list);
	    System.out.println("Element-Name\tFrequency");
        System.out.println("============\t==========");
        // Iterate using enhanced for-each loop
            for (String count : stri)
        {
            System.out.println(count + "\t\t" + Collections.frequency(list, count));
        }
		}
	
	public static String[] GetStringArray(ArrayList<String> arr)
	{
		String[] str = new String[arr.size()];
		for(int i=0;i<arr.size();i++)
		{
			str[i] = arr.get(i);
		}
		return str;
	}

}
