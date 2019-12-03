package gen;

import java.util.ArrayList;
import java.util.List;

public class WildCardDemo {

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
       // showRooms(audis);


        List<BMW> bmws=new ArrayList<>();
        bmws.add(new BMW());
        bmws.add(new BMW());
       // showRooms(bmws);

        List<FourWheeler> fourWheelers=new ArrayList<>();
        fourWheelers.add(new FourWheeler());
        fourWheelers.add(new Vehicle());
        fourWheelers.add(new Audi());
        fourWheelers.add(new BMW());
        //showRooms(fourWheelers);
    }

    
    public static void showRooms(List<?> list){ //? - wild card says hey! I can accept List of any type
    		list.add(null); //
            for(Object object:list){
                System.out.println(object);
            }
    }

}
