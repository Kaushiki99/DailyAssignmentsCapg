//question 6.how to reverse a string without using string functions?

import java.util.*;
public class reverseString {

		// function to generate reverse of a string
			public static String getReverse(String s) {
				String rev="";
				for(int i=s.length()-1;i>=0;i--)
					rev+=s.charAt(i);
				
				return rev;
			}

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				Scanner sc=new Scanner(System.in); // object creation of Scanner class
				System.out.print("Enter the String : ");
				String input = sc.nextLine(); // input for the string
				System.out.println("Reverse String : "+getReverse(input));
				
				sc.close();
			}

	}
