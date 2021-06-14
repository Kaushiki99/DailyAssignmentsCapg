package optionalClassInJava8;

public class WithoutOptionalClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String[] str=new String[10];
    //extracting substring from a string
    String substr=str[9].substring(2,5);
    System.out.println(substr); 
    //this method without optional class throws null pointer exception
	}

}
