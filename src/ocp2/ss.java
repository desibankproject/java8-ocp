package ocp2;

public class ss {
	static class SneezeException extends Exception {
	}
	static class SniffleException extends SneezeException {
	}
	public static void main(String[] args) throws SneezeException {
		/*try {
			throw new SneezeException();
			//The exception ss.SniffleException is already caught 
			//by the alternative ss.SneezeException
		} catch (SneezeException | SniffleException e) {
			throw e;
		}*/
	}
}