//Joseph Looney
// Date: 5/22/2018 - 5/16/2018
// Assignment Loops 2 #3
//Claim Academy

public class Loop3 {

	public static void main(String[] args) {
		{
			for (int rows = 0; rows < 5; rows ++) 
			{
				for (int cols = 0; cols < 5; cols ++)
				{
					if (cols <5) // two arguments
						System.out.print(cols+1 + " ");
					else
						System.out.print(" ");
				}
				System.out.println();
			}
		}

	}

}
