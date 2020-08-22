package package2;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class min {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		java.util.List<Integer> l=new java.util.ArrayList<>();
        l.add(5);
        l.add(1);
        l.add(4);
       // int i=l.size();
        //System.out.println(i);
       
        System.out.println(minnum(l));
        
	}

        public static Integer minnum(List<Integer> l)
        {
        List<Integer> sortedlist=new ArrayList<>(l);
        Collections.sort(sortedlist);
        return sortedlist.get(0);
        }
        
        
}
	


