package ocp4;

import java.util.function.*;

 class Magician {
   public void magic(BinaryOperator<Long> lambda) {
       lambda.apply(3L, 7L);

  }
}
public class Q70 {
	public static void main(String[] args) {
		Magician magician=new Magician();
		magician.magic((b,w) -> (long)w.intValue());
		//magician.magic((c,m) -> {long c=4; return c+m;});
		//magician.magic((Long d, Integer r) -> (Long)r+d);
	}
}
