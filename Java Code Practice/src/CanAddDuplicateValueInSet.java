import java.util.HashSet;
import java.util.Set;

public class CanAddDuplicateValueInSet {	
	
	public static void main(String[] args) {
		
		Set<String> s = new HashSet<String>();
		
		s.add("Red");
		s.add("Green");
		s.add("Blue");
		Boolean a=s.add("Blue"); /*Adding duplicate value here, 
		No compiler error and code works fine but doesn't add duplicate value */
		
		System.out.println(a);
		System.out.println("Colours available in set are:");
		for (String c : s){
			
			System.out.println(c);
		}	
	}
}
