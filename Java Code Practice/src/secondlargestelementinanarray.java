import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class secondlargestelementinanarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] i=new Integer[]{5,7,1,9,13,15,24};
		
		for(Integer s:i)
		{
		System.out.print(s+",");
		}
		
		List<Integer> li=Arrays.asList(i);
		
		Collections.sort(li);
		System.out.println();
		System.out.println(li+",");
		Integer[] t=new Integer[li.size()];
		li.toArray(t);
		for(Integer u:t)
		{
		System.out.print(u+",");
		}
		System.out.println();
		System.out.println(t[t.length-2]);
		
		
		
		

	}

}
