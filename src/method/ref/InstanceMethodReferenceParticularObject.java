package method.ref;

interface EntityPrint<T> {
		public void print(T t);
}



public class InstanceMethodReferenceParticularObject {
			public static void main(String[] args) {
				
/*				EntityPrint<Customer> c=(Customer t) -> {
						 t.show();	
					}
*/
				
 		/*EntityPrint<Customer> c=(Customer t) -> t.show();	*/
				
		  EntityPrint<Customer> c=Customer::show;	

				
		/*
		 * EntityPrint<Customer> entityPrint=(Customer c)->{ c.show(); };
		 */
				
				//EntityPrint<Customer> entityPrint=(Customer c)->c.show();			
				//AddNum reference = Mathematics::summer;
				EntityPrint<Customer> entityPrint=Customer::show;	 //instance method of particular type
				
			}
}
