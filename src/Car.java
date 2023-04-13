public class Car {
  String color;
  int milesDriven;
  
  public Car(String carColor, int milesDriven) {
    color = carColor;
  }

  public void startEngine() {
    System.out.println("Starting the car!");
    System.out.println("Vroom!");
  }

  public void drive() {
    String message = "Miles driven: " + milesDriven;
    System.out.println(message);
  }

  public void startRadio(double stationNum, String stationName) {
    System.out.println("Turning on the radio to " + stationNum + ", " + stationName + "!");
    System.out.println("Enjoy!");
  }

  public void startRadio(double stationNum) {
    System.out.println("Turning on the radio to " + stationNum + "!");
  }

  public int numberOfTires() {
    int tires = 4;
    return tires;
  }

  public static void main(String[] args) {
    Car myFastCar = new Car("red", 0);
    /*
     * ---------------
     * Calling Methods
     * ---------------
     * 
     * let's take a closer look at the method call:
     * myFastCar.startEngine();
     * 
     * First, we reference our object myFastCar
     * Then, we use the dot operator to call the method startEngine()
     * Note that we must include parentheses to invoke the method
     * 
     * Running the above program will output:
     * Starting the car!
     * Vroom!
     * That was a fast car!
     * 
     * Code generally runs in a top-down order where code execution starts at the top of a program and ends at the bottom of a program
     * however methods are ignored by the compiler unless they are called/invoked
     * 
     * When a method is called/invoked, the compiles executes every statement contained within the method
     * Once all method instructions are executed, the top-down order of execution continues
     * 
     * This is why "Starting the car!" and "Vroom!" are outputted before "That was a fast car!"
     */

    // Call a method on an object
    myFastCar.startEngine();

    /*
     * -----
     * Scope
     * -----
     * 
     * The variable message, which is declared and initialized inside of drive, cannot be used inside of main()
     * It only exists within the scope of the drive() method
     * 
     * However, milesDriven, which is declared at the top of the class, can be used inside all methods in the class, since it is in the scope of the whole class
     */

    System.out.println("That was one fast car!");

    myFastCar.drive();

    /*
     * -----------------
     * Adding Parameters
     * -----------------
     * 
     * In the Car class, we defined a method startRadio() with the parameters: stationNum and stationName
     * stationNum is a double data type and stationName is a String data type
     * 
     * within the main() method, we call the startRadio() method on our myFastCar instance/object passing in 103.7 and "Meditation Station" as the arguments representing stationNum and stationName
     * 
     * Method overloading is when a Java program contains multiple methods with the same name
     * each method must have different parameters
     */

    // 1st startRadio() method
    myFastCar.startRadio(103.7, "Meditation Station");
    // Output:
    // Turning on the radio to 103.7, Meditation Station!
    // Enjoy!

    // 2nd startRadio() method
    myFastCar.startRadio(98.2);
    // Output:
    // Turning on the radio to 98.2!

    /*
     * -------
     * Returns
     * -------
     * 
     * The numberOfTires() method above returns the int value 4
     * Once the return statement is executed, the compiler exits the function
     * any code after the return statement in a fucntion is ignored
     * 
     * In previos exercises, we used the void keyword when creating new methods
     * In the numberOfTires() method we replaced void with int to signify that the return type is an int
     * void indicated that no value is returned
     * 
     * Non-void methods can be used as either a variable value or as part of an expression:
     */

    int numTires = myFastCar.numberOfTires();
    // if the int variable numTires is printed, we would see the value 4
    System.out.println(numTires);
    // Output: 4
  }

  /*
   * Returning an object works differently from returning a primitive value
   * When a primitive value is returned, a copy of the value is returned
   * When an object is returned, a reference to the object is returned rather than a copy
   */
}

// A second class is created
class CarLot {
  Car carInLot;

  public CarLot(Car givenCar) {
    carInLot = givenCar;
  }

  public Car returnACar() {
    // return Car object
    return carInLot;
  }

  public static void main(String[] args) {
    Car myCar = new Car("red", 70);
    System.out.println(myCar);
    CarLot myCarLot = new CarLot(myCar);
    System.out.println(myCarLot.returnACar());

    /*
     * The code outputs the same memory address because myCar and carInLot have the same reference value:
     * Car@Car@251a69d7
     * Car@Car@251a69d7
     */
  }
}