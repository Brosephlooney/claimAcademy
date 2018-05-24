//Joseph Looney
// Date: 5/22/2018 - 5/16/2018
// Assignment Loops 2 #1
//Claim Academy


public class Loop1 {

	public static void main(String[] args) {
		{
			for (int rows = 0; rows < 3; rows ++) 
			{
				for (int cols = 0; cols < 5; cols ++)
				{
					if (cols <5 || rows < 3) // two arguments
						System.out.print("* ");
					else
						System.out.print(" ");
				}
				System.out.println();
			}
		}
	}
}
