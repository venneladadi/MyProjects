package Programs_Solutions;

public class GcdLcm {

	public static void main(String[] args) {
	Gcd( 10, 20);
	LCM();

	}
	public static void Gcd(int i1,int i2)
	{
		int Gcd=0;
		if(i1>i2)
		{
			for(int i=1;i<=i1/2;i++)
			{
				if(i1%i==0 && i2%i==0)
				{
					Gcd=i;
				}
				
			}
			
			
		}
		if(i2>i1)
		{
			for(int i=1;i<=i2/2;i++)
			{
				if(i1%i==0 && i2%i==0)
				{
					Gcd=i;
				}
			}
			
		}System.out.println("the gcd of two numbers:"+Gcd);
		
		
		
	}
	public static void LCM()
	{
		int LCM=0;
		int i3 = 5;
		int i4 = 15;
		int max = (i3>i4)?i3:i4;
		for(int i=1;i<=max;i++)
		{
			int temp=0;
			temp=i3*i;
			for(int j=1;j<=max;j++)
			{
				if(i4*j==temp)
				{
					LCM=temp;
					break;
				}
			}
			if(LCM>0)
			{
				break;
			}
		}
		System.out.println(" LCM of the given number is "+LCM);
				
		
	}

}
