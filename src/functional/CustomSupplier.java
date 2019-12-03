package functional;

@FunctionalInterface
public interface CustomSupplier<T> {
    /**
     * Gets a result.
     *
     * @return a result
     */
    T get(String name,int age,String address);
}
