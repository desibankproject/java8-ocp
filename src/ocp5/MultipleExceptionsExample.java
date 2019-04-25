package ocp5;

import java.io.Closeable;

public class MultipleExceptionsExample {
	   static class IOManip implements Closeable{
	       @Override
	       public void close() {
	           throw new RuntimeException("from IOManip.close");
	       }
	   }
	   public static void main(String[] args) {
	       try(IOManip ioManip = new IOManip()){
	           throw new RuntimeException("from try!");
	       }catch (Exception e) {
	    	   throw new RuntimeException("from catch!");
	       }finally {
	    	   throw new RuntimeException("from finally!");
	       }
	   }
	}