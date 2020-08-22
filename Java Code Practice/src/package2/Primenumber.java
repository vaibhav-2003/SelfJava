package package2;
import java.util.Scanner;

public class Primenumber {

	public static void main(String[] args) {
	
	    
		System.out.println("Enter a number : ");
		Scanner s=new Scanner(System.in);
		int number=s.nextInt();
		int temp=0;
		
		for(int i=2;i<number;i++)
		{
		
		if(number%i==0)
		{
			temp=temp+1;
		}
		}
		
		if(temp==0)
		{
			System.out.println("Given number is Prime number ");
			
		}
		else
		{
			System.out.println("Given number is not Prime number");	
		}

	}

}