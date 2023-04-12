public class Car {
  String color;
  int milesDriven;
  
  public Car(String carColor) {
    color = carColor;
    milesDriven = 0;
  }

  public void startEngine() {
    System.out.println("Starting the car!");
    System.out.println("Vroom!");
  }

  public void drive() {
    String message = "Miles driven: " + milesDriven;
    System.out.println(message);
  }

  public static void main(String[] args) {
    Car myFastCar = new Car("red");

    // Call a method on an object
    myFastCar.startEngine();
    System.out.println("That was one fast car!");

    myFastCar.drive();
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
     * 
     * -----
     * Scope
     * -----
     * 
     * The variable message, which is declared and initialized inside of drive, cannot be used inside of main()
     * It only exists within the scope of the drive() method
     * 
     * However, milesDriven, which is declared at the top of the class, can be used inside all methods in the class, since it is in the scope of the whole class
     */
  }
}