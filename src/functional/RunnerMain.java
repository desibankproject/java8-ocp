package functional;

public class RunnerMain {

	public static void main(String[] args) {
		
		//Creating an instance of class which is implementing Runnable 
	/*	Runner<String> run=new Runner<String>() {
			@Override
			public int apply(String t) {
				return t.length();
			}
		};*/
		/*
		Runner<String> run=(String t) -> {
				return t.length();
			}; */
		
		//Runner<String> run=(String t) -> t.length();
		//this is method reference for arbitrary type
		Runner<String> run=String::length;
		
		int len=run.apply("Mr. Nagendra");
        System.out.println("Len is  = "+len);
	}

}
