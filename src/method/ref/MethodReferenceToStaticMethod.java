package method.ref;

@FunctionalInterface
interface AddNum {
	public int add(int x, int y);
}

class Mathematics {
	public static int summer(int num1, int num2) {
		return num1 + num2;
	}
}

public class MethodReferenceToStaticMethod {
		//AddNum addNum = (x, y) -> x + y;
	/*AddNum addNum = (x, y) -> Mathematics.summer(x, y);*/
	AddNum reference = Mathematics::summer;
	
}
