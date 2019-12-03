package q155;

public class Q47 {
	static double area;
	int b=2,h=3;
	public static void main(String[] args) {
		double p,b,h;  //line 1
		if(area==0) {
			b=3;
			h=4;
			p=0.5;
		}
		area=p*b*h;  //line2
		System.out.println("Area is "+area);
	}
}
