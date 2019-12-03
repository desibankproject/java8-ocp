package j8.stream;

public class LocalInnerClass {
       int max=100;
       static int min=129;
       
       public void zee(int pop) {
    	      int kt; //blank final
    	      int o2u2=9090;
    	      kt=90;
    	      kt++;
    	      class Mocha {
    	    	  int x=190;
    	    	  int max=12282;
    	    	  public void owo() {
    	    		  System.out.println("max = "+max);
    	    		  System.out.println("min"+min);
    	    		  System.out.println("x"+x);
    	    		  System.out.println(LocalInnerClass.this.max);
    	    		  System.out.println("pop = "+pop);
    	    		  System.out.println("o2u2 = "+o2u2);
    	    		//  System.out.println("kt = "+kt);
    	    	  }
    	      }
    	      
    	      Mocha mocha=new Mocha();
    	      mocha.owo();
       }
       
	
	
}
