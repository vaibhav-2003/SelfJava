package package2;
import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
	
		int temp=0;
		int number;
	    int rev=0;
	    
		System.out.println("Enter a number : ");
		Scanner s=new Scanner(System.in);
		number=s.nextInt();
		int result=number;
		
		while(number>0)
		{
			temp=number%10;
			rev=rev+temp*temp*temp;
			number=number/10;
		}
		
		if(result==rev)
		{
			System.out.println("Given number is armstrong number ");
			System.out.println("Reverse number is " +rev);
		}
		else
		{
			System.out.println("Given number is not armstrong number");	
		}

	}

}