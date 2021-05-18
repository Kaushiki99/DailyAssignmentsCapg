
	// 2) Write a java program to remove all duplicates from a given string?
	import java.util.Scanner;

	public class RemoveDupli {
		
		// function to remove duplicate characters
		public static String removeDuplicates(String string) {
		    
		    char[] chr = string.toCharArray();
		    String newresult = "";

		    
		    for (char value : chr) {
		      // See if character is in the target
		      if (newresult.indexOf(value) == -1) {
		        newresult+= value; // Use StringBuilder as shown below
		      }
		    }
		    return newresult;
		  }

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter the string : ");
			String string = sc.next();
			
			System.out.println("After removing duplicates, new string = "+removeDuplicates(string));
			sc.close();

		}

	}

