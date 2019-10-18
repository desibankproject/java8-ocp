package inner.cls;

import java.util.Collections;
import java.util.List;


public class MethodReference3 {
	 public static void main(String[] args) {
	 /*FunctionCar carpack=(Customer customer,String sal) -> {
		customer.print(sal);
	 };*/
		 FunctionCar<Customer> carpack=Customer::print;	
	/*FunctionCar carpack=(Customer customer,String sal) ->customer.print(sal);*/
	 carpack.show(new Customer("Nagendra","nagen@gmail.com"),"Mr.","yellow");
	}
}
@FunctionalInterface
interface FunctionCar<T> {
	public void show(T customer,String salutation,String c);
}

