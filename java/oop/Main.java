package java.oop;

public class Main {
    public static void main(String[] args) {
        // insert name of the class, Car, to create object
        // myCar1 and myCar2 will have same attributes listed n Car class 
        Car myCar1 = new Car();
        Car myCar2 = new Car();
        // Reuse the Car class to create a second Car object 

        System.out.println(myCar1.make);
        System.out.println(myCar1.model);
        System.out.println();
        System.out.println(myCar2.make);
        System.out.println(myCar2.model);
  
        
    }
}
