package Package1;

import java.util.TreeSet;

public class ExmapleTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		      TreeSet<String> treeset = new TreeSet<String>();
		      treeset.add("Good");
		      treeset.add("For");
		      treeset.add("Health");
		      //Add Duplicate Element
		      treeset.add("Good");
		      System.out.println("TreeSet : ");
		      for (String temp : treeset) {
		         System.out.println(temp);
		      }
		   }

	}


