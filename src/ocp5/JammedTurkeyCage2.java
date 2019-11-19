package ocp5;

class Dutch implements AutoCloseable {
	@Override
	public void close() throws IllegalStateException {
		throw new IllegalStateException("Dutch door does not close");
	}
}

public class JammedTurkeyCage2 implements AutoCloseable {
	public void close() throws IllegalStateException {
		throw new IllegalStateException("Cage door does not close");
	}

	public static void main(String[] args) {
		try (JammedTurkeyCage2 t = new JammedTurkeyCage2();Dutch dutch=new Dutch();) {
			throw new IllegalStateException("turkeys ran off");
		} catch (IllegalStateException e) {
			System.out.println("caught: " + e.getMessage());
			for (Throwable t : e.getSuppressed())
				System.out.println(t.getMessage());
		}
	}
}