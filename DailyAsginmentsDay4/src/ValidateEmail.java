   import java.util.Scanner;
	import java.util.regex.Pattern;

	public class ValidateEmail {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter name");
	String name=sc.next();
	System.out.println(Pattern.matches("^[A-Za-z]{7,}[@$!%*#?&]{1,}$", name));

	System.out.println("Enter email");
	String email=sc.next();
	System.out.println(Pattern.matches("^[a-zA-Z0-9+_.-]+@(.+)$", email));

	System.out.println("Enter pwd");
	String pwd=sc.next();
	System.out.println(Pattern.matches("^[a-zA-Z0-9._+-//*@]{8,16}", pwd));

	System.out.println("Enter mobileno.");
	String mobileno=sc.next();
	System.out.println(Pattern.matches("[789]{1}[0-9]{9}",mobileno ));

	System.out.println("Enter city");
	String city=sc.next();
	System.out.println(Pattern.matches("^[a-zA-Z]{2,50}", city));


	sc.close();
	}

	}

