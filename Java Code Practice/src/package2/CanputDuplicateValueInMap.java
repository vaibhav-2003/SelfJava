package package2;
import java.util.HashMap;
import java.util.Map;


public class CanputDuplicateValueInMap {	
	
	public static void main(String[] args) {
		
		Map<String,String> s = new HashMap<String,String>();
		
		s.put("String","Red");
		s.put("String","Green");
		s.put("String","Blue");
		
		/*System.out.println("Colours available in set are:");
		Node[] shapesArray = s.toArray();
		for (Node node : shapesArray )
		for (String c : s){
			
			System.out.println(c);
		}	
	}*/
}
}