package gen;

public class PredaImpl implements Preda<String> {
	@Override
	public boolean test(String t) {
		return t.contains("a");
	}
	
	public static void main(String[] args) {
		Preda<String> preda=new PredaImpl();
		boolean b1=preda.test("Nagendra");
		boolean b2=preda.test("Reetu");
	}
}
