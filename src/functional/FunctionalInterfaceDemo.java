package functional;


//What is marker interface?????????? Serializable, Remote ,RandomAccess, Clonable,EventListener
interface Jameel<T> {
	public boolean test(T a,T b);	
}

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
    	//Here we are making an object of class which implements Jameel
    	//means it is anonymous class
    	int x=10;
    	//x=90;
    	
    	//Local anonymous inner class!!!
    	Jameel<String> jm=new Jameel<String>() {
    		 int x=100;
    		 //we cannot create static variable here
    		 static final int po=100; 
		     @Override
		    public boolean test(String a, String b) {
		    	 System.out.println("x = "+x);
		    	return false;
		    }
    	};
	}	
}
