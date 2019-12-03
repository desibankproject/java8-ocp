package method.ref;

interface MySupplier<T> {
	public T get(String name,String email); 
}


public class ConstructorMethodReference {
		public static void main(String[] args) {
			
	/*		MySupplier<Customer> ccustomer=new MySupplier<Customer>() {
					public Customer get(String name,String email){
						  Customer customer=new Customer(name,email);
						  return customer;
					}	
			};*/
			
			/*MySupplier<Customer> ccustomer=(name,email) ->{
				  Customer customer=new Customer(name,email);
				  return customer;
			};*/
		/*	MySupplier<Customer> ccustomer=(name,email) ->{
				  return new Customer(name,email);
			};*/
			/*MySupplier<Customer> ccustomer=(name,email) -> new Customer(name,email);
			*/
			MySupplier<Customer> ccustomer= Customer::new;
			Customer customer=ccustomer.get("Nagendra", "nagen@synergisticit.com");
			System.out.println(customer);
		}
}
