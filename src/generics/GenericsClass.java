package generics;

public class GenericsClass<T> {
	private T store;

	public GenericsClass(T t) {
		this.store=t;
	}
	public T showData() {
		System.out.println(store.toString());
		return store;
	}
}
