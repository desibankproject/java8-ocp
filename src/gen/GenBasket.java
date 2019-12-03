package gen;

public class GenBasket<T> {
    private T data;
    public GenBasket(T data){
    	this.data=data;
    }
    public T getData(){
    	return this.data;
    }
    public static void main(String[] args) {
    	GenBasket<Integer> basket=new GenBasket<Integer>(100);
    	System.out.println(basket.getData());
    	
    	GenBasket<String> sbasket=new GenBasket<String>("Nagendra");
    	System.out.println(sbasket.getData());
	}
}
