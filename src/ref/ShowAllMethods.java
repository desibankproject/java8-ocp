package ref;

import java.lang.reflect.Method;

public class ShowAllMethods {

  public static void main(String[] args) {
    Class aClass = String.class;
    // Get the methods
    Method[] methods = aClass.getDeclaredMethods();
    // Loop through the methods and print out their names
    for (Method method : methods) {
      System.out.println(method.getName());
    }
  }
}