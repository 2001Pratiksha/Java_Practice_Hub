class Number_Program1
{
	public static void main(String[] args) {
	System.out.println(27563+" "+rotate(27563,2));
	}
	public static int rotate ( int num, int key)
	{
		String str =" "+ num;
		int length=str.length();
		String str1=" ";
		for (int i=1;i<=key;i++)
		{
			str=str+num;
		}
			for(int i=0;i<length;i++)
			{
				str1=str1+str.charAt(i+key);
			}
				return Integer.parseInt(str1);
			
		
	}
}




	
	

	
