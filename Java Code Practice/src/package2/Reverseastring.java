package package2;
public class Reverseastring {

	public static void main(String[] args) {
				
		String s1="java";
		String s2="";
		int count=0;
		for(int i=s1.length()-1;i>=0;i--)
		{
			s2=s2+s1.charAt(i);
					
		}
		
		System.out.println(s2);
		for(int i=0;i<s1.length();i++)
		{
			s2=s2+s1.charAt(i);
			count=count+1;	
		}
		System.out.println(count);
		
	}
}
