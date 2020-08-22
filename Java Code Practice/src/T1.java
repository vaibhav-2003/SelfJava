import java.util.Scanner;

public class T1 {
		 public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			while (input.hasNextLine()) {
			
				int digit= input.nextInt();
				System.out.println(getLessNumber(digit,3));
			}
		 }
	public	static int getLessNumber(int number,int digit)	{
	    char c =Integer.toString(digit).charAt(0);
	    for (int i= number;i>=0; --i){
	        if(Integer.toString(i).indexOf(c)==-1){
	            return i;
	        }
	    }
	    return-1;
	}

		
	
}
