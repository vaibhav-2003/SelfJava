package package2;

public class Missingelementinanarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int totalnum = 7;
		int count=0;
		int[] numbers= new int[] {1,2,3,4,6,7};
		int temp = totalnum*((totalnum+1)/2);
		System.out.println(temp);
		for(int i:numbers)
		{
			count =count+i;
		}
		System.out.println("Missing number is " + (temp-count));
	}
}
