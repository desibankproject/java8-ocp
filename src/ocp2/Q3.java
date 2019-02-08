package ocp2;

import java.util.ArrayList;
import java.util.List;

import ocap1.Book;

public class Q3 {
		public void showSize(List<?> list) {
			System.out.println(list.size());
		}
		public static void main(String[] args) {
			Q3 card = new Q3();
			/*List<?> list = new ArrayList<? extends Book>();
			card.showSize(list);*/
	}
}
