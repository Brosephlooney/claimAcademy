//Joseph Looney
// Date: 5/22/2018 - 5/16/2018
// Assignment Loops 2 #2
//Claim Academy

public class Loop2 {

	public static void main(String[] args) {
		{
			for (int rows = 0; rows < 4; rows ++) 
			{
				for (int cols = 0; cols < 4; cols ++)
				{
					if (cols <= rows) // two arguments
						System.out.print("* ");
					else
						System.out.print(" ");
				}
				System.out.println();
			}
		}
	}

}
