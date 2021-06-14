package anonymousClass.UsingAbstractClass;

public class AnonymousShapeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//This shape object in another main class is treated as anonymous class
    
		Shape s=new Shape() {
			int height=30;
    	  @Override
    	  void perimeter() {
    		  System.out.println("Shape Perimeter");
    	  }
    	  @Override
    	  void area() {
    			System.out.println("Shape area = "+(length*height));
				System.out.println("length = "+length);
			}
		};
		
		s.area();
		s.perimeter();
		
		//Using interface creating anonymous class
		Vehicle v = new Vehicle() {

			int cost=3000000;
			@Override
			public void costofvehicle() {
				// TODO Auto-generated method stub
				System.out.println("cost of vehicle = "+cost);
				
			}

			@Override
			public void typeofvehicle() {
				// TODO Auto-generated method stub
				System.out.println("type of vehicle");
			}
			
		};
		
		v.costofvehicle();
		v.typeofvehicle();
	}
}
      
      



