//Joseph Looney
//Date 5/15/2018
//Assignment 2 


public class charRemover {

	public static void main(String[] args) {
		
		System.out.println (removeCharInString ("My name is Joseph Looney", 'o'));
		
	}
	
	public static String removeCharInString (String string, char charToBeRemoved) {
		if (string== null)
			return "";
					
					StringBuilder strBuild = new StringBuilder ();
		
		for (int i = 0; i < string.length (); i++) {
			char chr = string.charAt (i);
			if (chr == charToBeRemoved)
				continue;
			strBuild.append(chr);
		}
		
		return strBuild.toString ();
		
	}

}
