package q155;

import generics.Car;

class Bike{
	int x;
	Bike(){
		this(10);//lin1
	}
	Bike(int x){
		this.x=x;
	}
}
class Apache extends Bike{
	int y;
	Apache(){
		super();
		this(20); //line 2
	}
	Apache(int y){
		this.y=y;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.x+":"+this.y;
	}
}
public class Q134 {

}
