package method.ref;

public class Customer{
	String name="Jack";
	String email="jack@gmail.com";
	public Customer(){
	}
	public Customer(String name, String email) {
		this.name = name;
		this.email = email;
	}
	
	public void show(){
		System.out.println(this.toString());
	}
	
	@Override
	public String toString() {
		return "Customer [name=" + name + ", email=" + email + "]";
	}
}