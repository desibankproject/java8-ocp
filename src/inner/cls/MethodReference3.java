package inner.cls;

public class MethodReference3 {
	 public static void main(String[] args) {
	 /*FunctionCar carpack=(Customer customer,String sal) -> {
		customer.print(sal);
	 };*/
	/*FunctionCar carpack=(Customer customer,String sal) ->customer.print(sal);*/
	 FunctionCar<Customer> carpack=Customer::print;	
	 carpack.show(new Customer("Nagendra","nagen@gmail.com"),"Mr.");
	}
}
@FunctionalInterface
interface FunctionCar<T> {
	public void show(T customer,String salutation);
}

