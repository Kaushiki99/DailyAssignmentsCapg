package LambdaExpressionsExample;

import java.util.function.Predicate;

public class FuncInterfaceUserDefined {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Addition a =()-> {
	    	   System.out.println("Addition of 2 numbers: "+(8.0+9));
			return 0;
	       };
	       
	       a.add(); //calling the interface method
	       
	       
	       //For substraction functional interface
	       //Lambda with return type
	       
	       
			//Lambda expression for Predicate interface in java.util.function package
			
			Predicate<Integer> greater = age->(age>18);
			
			Predicate<Integer> lesser = age->(age<18);
			
			//calling Predicate Method
			System.out.println(greater.test(20));
			
			boolean checkAge=greater.or(lesser).test(25);
			
			System.out.println(checkAge);
			
			//calling a method with predicate as parameter
			predicateInMethod(14, age->(age>18));
			
		}//close of main method
		
		//Predicate in to method param
		
		static void predicateInMethod(int number,Predicate<Integer> age) {
			if(age.test(number)) {
				System.out.println("age = "+number);
			}
			else {
				System.out.println("age not satisfied = "+number);
			}
		};
}


