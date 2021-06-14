package LambdaExpressionsExample;

public class MultiMainUserDefinedFI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//using abstract method
       Multiplication m =()-> {
    	   System.out.println("Multiplication of 2 numbers: "+(8*9));
       };
       
       m.mul(); //calling the interface method
	}

}
