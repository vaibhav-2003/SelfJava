package package2;

public class RemovingDuplicatesInAnArray {

	public static void main(String[] args) {
		
		int []x= {10,11,23,25,22,30,10,11,25,22};
		
		System.out.println("Original Array : " );
		for(int i=0;i<x.length;i++)
		{
			
			System.out.print(x[i] + "," );
		}
		
		System.out.println();
		System.out.println("Array after duplicate removals : " );
		int end =x.length;
		for(int i=0;i<end;i++)
		{
			for(int j=i+1;j<end;j++)
			{
				if(x[i]==x[j])
				{
					int shifleft =j;
					for(int k=j+1;k<end;k++,shifleft++)
					{
						x[shifleft]=x[k];
					}
					end--;
					j--;
					
				}
			}
			
		}
		
			int [] y=new int[end];
			for(int i=0;i<end;i++)
			{
				y[i]=x[i];
			}
			for(int i=0;i<end;i++)
			{
				System.out.print(y[i]+ ",");
			}
			
	}

}
