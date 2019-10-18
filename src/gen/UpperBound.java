package gen;

import java.util.ArrayList;
import java.util.List;

public class UpperBound {

    public static void main(String[] args) {
        List<Vehicle> vehicles=new ArrayList<>();
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
       // showRooms(fourWheelers);
    }

    //? extends Vehicle ->>>says hey I can reference a List of either Vehicle type of it;s subclass Type
    //This is caller upper bound
    public static void showRooms(List<? extends Vehicle> vehicles){
            vehicles.add(null); //
            //This is readonly
            for(Vehicle vehicle:vehicles){
                vehicle.run();
            }
    }

}
