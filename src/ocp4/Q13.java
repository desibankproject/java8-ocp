package ocp4;
enum Direction { NORTH, SOUTH, EAST,WEST; };

public class Q13 {
         public static void main(String[] compass) {
        	 Direction t =Direction.valueOf("NORTH");
        	 System.out.println(t);
        	 t=Direction.SOUTH;
        	 System.out.println(t);
        	 System.out.println(Direction.valueOf("NORTH"));
         }
}
