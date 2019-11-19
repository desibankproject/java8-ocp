package method.ref;



class SMathematics{
	public static int max(int x,int y) {
		int max=x;
		if(max<y) {
			max=y;
		}
		return max;
	}
}

interface Max {
	public int go(int p,int q);
}

class Jock implements Max {
	@Override
	public int go(int p, int q) {
		return SMathematics.max(p, q);
	}
}
public class StaticMethodAsMethodRef {
	
	public static void main(String[] args) {
		
		/*Max max=new Max() {
			@Override
			public int go(int p, int q) {
				return SMathematics.max(p, q);
			}
		};*/
		
		/*Max max=(int p, int q) ->SMathematics.max(p, q);*/
		/*Max max=(p,q) ->SMathematics.max(p, q);*/
		Max max=SMathematics::max;
		
		//Here Lamda expression contains only one statement and
		//this is another method invocation
		/*Max max=(int p, int q) ->SMathematics.max(p, q);*/
		//Max max=SMathematics::max;
		
		int result=max.go(10, 34);
		System.out.println(result);
		
		magic(new Max() {
			@Override
			public int go(int p, int q) {
				return SMathematics.max(p, q);
			}
		});
		
		magic((p,q) ->SMathematics.max(p, q));
		
		magic(SMathematics::max);
	}
	
	public static void magic(Max max) {
		 System.out.println(max.go(23,34));
	}

}
