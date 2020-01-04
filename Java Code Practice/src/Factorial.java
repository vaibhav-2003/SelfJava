import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int a=s.nextInt();
	int number=1;
	for(int i=1;i<=a;i++)
	{
		number=number*i;
	}
	
	System.out.println("Factorial of "+ a + "  is "+ number);

	}
}
