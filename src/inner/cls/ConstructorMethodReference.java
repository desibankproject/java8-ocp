package inner.cls;

public class ConstructorMethodReference {
	
	public static void main(String[] args) {
		/*FunctionCustomer customerFactory=(name, email)->new Customer(name,email);*/
		FunctionCustomer customerFactory=Customer::new;
		Customer customer=customerFactory.createCustomer("Nagendra", "nagen@synergisticit.com");
		System.out.println(customer);
	}
	
}

@FunctionalInterface
interface FunctionCustomer {
	public Customer createCustomer(String name,String email);
	
}

class Customer {
	private String name;
	private String email;
	public void print(String salutation){
		System.out.println("name= "+name);
		System.out.println("email= "+email);
	}
	
	public void print(String salutation,String color){
		System.out.println("name= "+name);
		System.out.println("email= "+email);
		System.out.println("color = "+color);
	}
	
	public Customer(String name, String email) {
		this.name = name;
		this.email = email;
	}
	public Customer(){
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", email=" + email + "]";
	}
}
