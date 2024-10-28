// Java program to print the prime numbers from 1 to 20.

class Print_Prime_Numbers
{
	public static void main(String[] args)
	 {
		
		int num=1;
		int count=0;

		// condition for the range

		while(num<21)
		{
			// condition to check prime or not.

		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				count++;
				break;

			}
		}
			if(count==0)
			{
				// Printing statement 
				
				System.out.println(num);
			}
			num++;
			if(count==1)
			{
				count=0;
			}
		}
	}

}

