//Joseph Looney
// Date: 5/22/2018 - 5/16/2018
// Assignment Loops 2 #4
//Claim Academy

public class Loop4 {

	public static void main(String[] args) {
		{
			for (int rows = 0; rows < 3; rows ++) 
			{
				for (int cols = 0; cols < 4; cols ++)
				{
					if (cols <5) // two arguments
						System.out.print(rows + 1 + " ");
					else
						System.out.print(" ");
				}
				System.out.println();
			}
		}

	}

}
