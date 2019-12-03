package gen;

import java.util.ArrayList;
import java.util.List;

public class WildCardWithVehicle {
	
	 public static void main(String[] args) {
	       
	    	List<Vehicle> vehicles=new ArrayList<Vehicle>();
	        vehicles.add(new Vehicle());
	        vehicles.add(new Audi());
	        vehicles.add(new BMW());
	       // vehicles.add(new FourWheeler());
	        showRooms(vehicles);

	        List<Audi> audis=new ArrayList<>();
	        audis.add(new Audi());
	        audis.add(new Audi());
	        showRooms(audis);


	        List<BMW> bmws=new ArrayList<>();
	        bmws.add(new BMW());
	        bmws.add(new BMW());
	        showRooms(bmws);

	        List<FourWheeler> fourWheelers=new ArrayList<>();
	        fourWheelers.add(new FourWheeler());
	        fourWheelers.add(new Vehicle());
	        fourWheelers.add(new Audi());
	        fourWheelers.add(new BMW());
	       showRooms(fourWheelers);
	    }

	    //? super Vehicle ->>>says hey I can reference a List of either Vehicle type of it;s super Type
	    //This is caller lower bound
	    public static void showRooms(List<?> vehicles){ //List<Audi> audis;
	            vehicles.add(null); //
	            //vehicles.add(new Audi());
	            //vehicles.add(new BMW());
	            //vehicles.add(new Object());
	            //This is  readonly
	            for(Object object:vehicles){
	                System.out.println(object);
	            }
	    }
}
