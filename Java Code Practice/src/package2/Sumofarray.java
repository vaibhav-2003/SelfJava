package package2;

public class Sumofarray {
	int i =0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sumofarray s=new Sumofarray();
        //int[] t=new int[]{1000000001,1000000002,1000000003,1000000004,1000000005};
		int t[] ={1000000001,1000000002,1000000003,1000000004,1000000005};
		//int t[]={1,2,3};
        
        long sum=0;
        for(int o:t)
        {
            sum=sum+o;
        }
        System.out.println(sum);
        System.out.println(s.i);
	}

}
