import java.util.function.Supplier;

class Customer{
	private String name;
	
	public Customer() {
		this("James");
	}
	public Customer(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

public class SupplierDemo {
	public static void main(String[] args) {
		
	/*	Supplier<Customer> c=new Supplier<Customer>() {
			@Override
			public Customer get() {
				// TODO Auto-generated method stub
				return null;
			}
		};
	*/
		/*Supplier<Customer> c=() -> {
				// TODO Auto-generated method stub
				return null;
			};*/
		
		/*Supplier<Customer> c=() ->new Customer();*/
		Supplier<Customer> c=Customer::new;
		//Callable<Customer> c=Customer::new;
		
	}
}
