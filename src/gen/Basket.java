package gen;

public class Basket {
    private int data;
    public Basket(int data){
    	this.data=data;
    }
    public int getData(){
    	return this.data;
    }
    public static void main(String[] args) {
    	Basket basket=new Basket(100);
    	System.out.println(basket.getData());
	}
}
