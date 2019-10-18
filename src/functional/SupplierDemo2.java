package functional;

import java.time.LocalDate;
import java.util.function.Supplier;

public class SupplierDemo2 {

	public static void main(String[] args) {
		Supplier<?  super LocalDate> supplier=new Supplier<LocalDate>() {
			@Override
			public LocalDate get() {
				// TODO Auto-generated method stub
				return null;
			}
		};
	}
}
