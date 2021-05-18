//question 7.Find the non repeating character in a given string?

	import java.util.*;

	public class NonRepeatingChars {
		
		// function calculate frequency of a given character in a string
		public static int freqCount(char c,String s) {
			int count=0;
			char chr[]=s.toCharArray();
			for(char i : chr) {
				if(i==c) {
					count++;
				}
			}
			return count;
		}
		
		// function to find non repeating characters in a string
		public static String findNonRepeatingChars(String s) {
			char chr[]=s.toCharArray();
			String res="";
			for(char c : chr) {
				if(freqCount(c, s)==1)
				{
					res+=c;
				}
			}
			return res;
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in); // creation of Scanner class
			System.out.print("Enter the string : ");
			String string=sc.next();
			System.out.println("The non repeating characters are : "+findNonRepeatingChars(string));
			sc.close();
		}

	}