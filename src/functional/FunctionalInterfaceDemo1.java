package functional;


//What is marker interface?????????? Serializable, Remote ,RandomAccess, Clonable,EventListener
interface Andy<T> {
	public boolean test(T a,T b);	
}

public class FunctionalInterfaceDemo1 {
    public static void main(String[] args) {
    	//Here we are making an object of class which implements Jameel
    	//means it is anonymous class
    /*	Andy<String> jm=(String a, String b) -> {
		    	return a.equals(b);
		    };*/
    	
    	/*Andy<String> jm=(String a, String b) -> a.equals(b);*/
    	Andy<String> jm=(t1,t2) -> t1.equals(t2);
    	boolean b1=jm.test("mock", "mock");
    	boolean b2=jm.test("mock", "jack");
    	System.out.println(" b1 = "+b1+" , b2 = "+b2);
	}	
}
