public class App {
  public static void main(String[] args) {
    /*
     * ------------
     * Introduction
     * ------------
     * 
     * In the last lesson, we learned objects have state and behavior
     * We give objects state via instance fields
     * 
     * We're going to create object behavior using methods
     * 
     * Methods are repeatable, modular blocks of code used to accomplish specific tasks
     * 
     * We can define our own methods that will take input and return the kind of output we want
     * 
     * Procedural abstractions is the knowledge of what a method does, its end result, without fully knowing how it accomplishes it
     */

    /*
     * ----------------
     * Defining Methods
     * ----------------
     * 
     * If we defined a checkBalance() method for the Savings Account, it would look like:
     */

    // public void checkBalance() {
    //   System.out.println("Hello!");
    //   System.out.println("Your balance is " + balance);
    // }

    /*
     * the first line, public void checkBalance(), is the method declaration
     * 
     * public means that other classes can access this method
     * void means that there is no specific output from the method
     * checkBalance() is the name of the method
     * 
     * Every method has its own unique method signature, which is comprised of the method's name and its parameter type
     * In this example the method signature is checkBalance()
     * 
     * The two print statements are insside the body of the method, defined by the curly braces {  }
     * 
     * Anything we do in our main method, we can do in other methods
     * 
     * checkBalance() is considered an non-static method because its static signature does not include the keyword static like the main method() does
     */

    /*
     * ---------------
     * Calling Methods
     * ---------------
     * 
     * When we add a non-static method to a class, it becomes available to use on an object of that class
     * In order to execute our method, we must call/invoke the method on the object we created
     * 
     * Let's add a non-static method to our Car class
     * Inside the main() method, we'll call startEngine() on the myFastCar object
     */

    /*
     * -----
     * Scope
     * -----
     * 
     * A method is a task that an object of a class performs
     * 
     * We mark the domain of this task using curly braces: { }
     * Everything within the curly braces is part of the task
     * This domain is called the scope of a method
     * 
     * We can't access variables that are declared inside a method in code that is outside the scope of that method
     * 
     * Looking at the Car class again:
     */

    /*
     * -----------------
     * Adding Parameters
     * -----------------
     * 
     * A method's scope prevents us from using variables outside of the method they are declared in
     * 
     * Similar to how we add parameters to constructors, we can customize all other methods to accept parameters
     */
  }
}