
//  Solid Patterns 

/*
class Patterns_Assignments
{
	// main method

	public static void main(String[] args) 
	{
		// Outer for loop ( for rows)

		 for (int i=1; i<=4; i++)
		 {
		 	// Inner for loop ( for columns)

		 	for(int j=1;j<=i; j++)
		 	{
		 		// Printing statement for (*)

		 		System.out.print("* ");
		 	}
		 	// printing statement for next line

		 	System.out.println();
		 }
	}
}
	*/


/*  1) Output : 

	Compile Time : Success 

	Runtime :  *
			   * *
			   * * *
			   * * * *       */



  /* class Patterns_Assignments
{
	// main method

	public static void main(String[] args) 
	{
		// Outer for loop ( for rows)

		 for (int i=1; i<=4; i++)
		 {
		 	// inner for loop for printing blank spaces)

		 	for(int j=1;j<=4-i; j++)
		 	{
		 		// Printing statement for (" ")

		 		System.out.print("  ");
		 	}

		 	// inner for loop for printing blank spaces)

		 	for(int k=1;k<=i; k++)
		 	{
		 		// Printing statement for ("* ")

		 		System.out.print("* ");
		 	}

		 	// printing statement for next line

		 	System.out.println();
		 }
	}
}
*/ 


/*  2) Output : 

	Compile Time : Success 

	Runtime :         *
				    * *
				  * * *
				* * * *      */


/*
 class Patterns_Assignments
{
	// main method

	public static void main(String[] args) 
	{
		// Outer for loop ( for rows)

		 for (int i=1; i<=4; i++)
		 {
		 	// Inner for loop ( for columns)

		 	for(int j=4;j>=i;j--)
		 	{
		 		// Printing statement for (*)

		 		System.out.print("* ");
		 	}
		 	// printing statement for next line

		 	System.out.println();
		 }
	}
}
*/

/*  3) Output : 

	Compile Time : Success 

	Runtime :   * * * * 
				* * * 
				* * 
				*      */
/*

class Patterns_Assignments
{
	// main method

	public static void main(String[] args) 
	{
		// Outer for loop ( for rows)

		 for (int i=1; i<=4; i++)
		 {
		 	// inner for loop for printing blank spaces)

		 	for(int j=1;j<i; j++)
		 	{
		 		// Printing statement for (" ")

		 		System.out.print("  ");
		 	}

		 	// inner for loop for printing stars )

		 	for(int k=4;k>=i; k--)
		 	{
		 		// Printing statement for ("* ")

		 		System.out.print("* ");
		 	}


		 	// printing statement for next line

		 	System.out.println();
		 }
	}
}
*/


/* 4) Output : 

	Compile Time : Success 

	Runtime :   * * * *
				  * * *
				    * *
				      *   */

/*

class Patterns_Assignments
{
	// main method

	public static void main(String[] args) 
	{
		// Outer for loop ( for rows)

		 for (int i=1; i<=4; i++)
		 {
		 	// inner for loop for printing blank spaces)

		 	for(int j=1;j<=4-i; j++)
		 	{
		 		// Printing statement for (" ")

		 		System.out.print(" ");
		 	}

		 	// inner for loop for printing blank spaces)

		 	for(int k=1;k<=i; k++)
		 	{
		 		// Printing statement for (" *")

		 		System.out.print(" *");
		 	}

		 	// printing statement for next line

		 	System.out.println();
		 }
	}
}
*/

/*  5) Output : 

	Compile Time : Success 

	Runtime :         *
				    * *
				  * * *
				* * * *      */

/*
	class Patterns_Assignments
{
	// main method

	public static void main(String[] args) 
	{
		// Outer for loop ( for rows)

		 for (int i=1; i<=4; i++)
		 {
		 	// inner for loop for printing blank spaces)

		 	for(int j=1;j<i; j++)
		 	{
		 		// Printing statement for (" ")

		 		System.out.print(" ");
		 	}

		 	// inner for loop for printing stars )

		 	for(int k=4;k>=i; k--)
		 	{
		 		// Printing statement for (" *")

		 		System.out.print(" *");
		 	}


		 	// printing statement for next line

		 	System.out.println();
		 }
	}
}
*/

/* 6) Output : 

	Compile Time : Success 

	Runtime :   * * * *
				 * * * 
				  * *
				   *      */

/* 
	class Patterns_Assignments
{
	// main method

	public static void main(String[] args) 
	{
		//  For first half Outer for loop ( for rows)

		 for (int i=1; i<=4; i++)
		 {
		 	// inner for loop for printing blank spaces)

		 	for(int j=1;j<=4-i; j++)
		 	{
		 		// Printing statement for (" ")

		 		System.out.print("  ");
		 	}

		 	// inner for loop for printing blank spaces)

		 	for(int k=1;k<=i; k++)
		 	{
		 		// Printing statement for ("* ")

		 		System.out.print("* ");
		 	}

		 	// printing statement for next line

		 	System.out.println();
		 }

		 // For second half Outer for loop ( for rows)

		 	for (int i=1; i<=3; i++)
		 {
		 	// inner for loop for printing blank spaces)

		 	for(int j=0;j<i; j++)
		 	{
		 		// Printing statement for (" ")

		 		System.out.print("  ");
		 	}

		 	// inner for loop for printing blank spaces)

		 	for(int k=3;k>=i; k--)
		 	{
		 		// Printing statement for ("* ")

		 		System.out.print("* ");
		 	}

		 	// printing statement for next line

		 	System.out.println();
		 }
	}
}

*/


/*  7) Output : 

	Compile Time : Success 

	Runtime :         *
				    * *
				  * * *
				* * * * 
				  * * * 
				    * *
				      *    */
/*

class Patterns_Assignments
{
	// main method

	public static void main(String[] args) 
	{
		// For first half Outer for loop ( for rows)

		 for (int i=1; i<=4; i++)
		 {
		 	// Inner for loop ( for columns)

		 	for(int j=1;j<=i; j++)
		 	{
		 		// Printing statement for (*)

		 		System.out.print("* ");
		 	}
		 	// printing statement for next line

		 	System.out.println();
		 }

		 	// For second half Outer for loop ( for rows)

		 for (int i=1; i<=3; i++)
		 {
		 	// Inner for loop ( for space)

		 	for(int j=3;j>=i; j--)
		 	{
		 		// Printing statement for (*)

		 		System.out.print("* ");
		 	}
		 	
		 	// printing statement for next line

		 	System.out.println();
		 }
	}
}

*/


/*  8) Output : 

	Compile Time : Success 

	Runtime :         *
				    * * *
				  * * * * *
				* * * * * * *
				  * * * * *
				    * * *
				      *    */



	class Patterns_Assignments
{
	// main method

	public static void main(String[] args) 
	{
		//  For first half Outer for loop ( for rows)

		 for (int i=1; i<=4; i++)
		 {
		 	// inner for loop for printing blank spaces)

		 	for(int j=1;j<=4-i; j++)
		 	{
		 		// Printing statement for (" ")

		 		System.out.print("  ");
		 	}

		 	// inner for loop for printing blank spaces)

		 	for(int k=1;k<=i; k++)
		 	{
		 		// Printing statement for ("* ")

		 		System.out.print("* ");
		 	}

		 	// printing statement for next line

		 	System.out.println();
		 }

		 // For second half Outer for loop ( for rows)

		 	for (int i=1; i<=3; i++)
		 {
		 	// inner for loop for printing blank spaces)

		 	for(int j=0;j<i; j++)
		 	{
		 		// Printing statement for (" ")

		 		System.out.print("  ");
		 	}

		 	// inner for loop for printing blank spaces)

		 	for(int k=3;k>=i; k--)
		 	{
		 		// Printing statement for ("* ")

		 		System.out.print("* ");
		 	}

		 	// printing statement for next line

		 	System.out.println();
		 }

		 	// For first half Outer for loop ( for rows)

		 for (int i=1; i<=3; i++)
		 {
		 	// Inner for loop ( for columns)

		 	for(int j=2;j<=i; j++)
		 	{
		 		// Printing statement for (*)

		 		System.out.print("* ");
		 	}
		 	// printing statement for next line

		 	System.out.println();
		 }

		 	// For second half Outer for loop ( for rows)

		 for (int i=1; i<=3; i++)
		 {
		 	// Inner for loop ( for space)

		 	for(int j=2;j>=i; j--)
		 	{
		 		// Printing statement for (*)

		 		System.out.print("* ");
		 	}
		 	
		 	// printing statement for next line

		 	System.out.println();
		 }
		 }
	}


