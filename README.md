## Java Methods

## Introduction

```
public class SavingsAccount {
  
  int balance;
  
  public SavingsAccount(int initialBalance){
    balance = initialBalance;
  }
  
  public static void main(String[] args){
    SavingsAccount savings = new SavingsAccount(2000);
    
    //Check balance:
    System.out.println("Hello!");
    System.out.println("Your balance is "+savings.balance);
    
    //Withdrawing:
    int afterWithdraw = savings.balance - 300;
    savings.balance = afterWithdraw;
    System.out.println("You just withdrew "+300);
    
    //Check balance:
    System.out.println("Hello!");
    System.out.println("Your balance is "+savings.balance);
    
    //Deposit:
    int afterDeposit = savings.balance + 600;
    savings.balance = afterDeposit;
    System.out.println("You just deposited "+600);
    
    //Check balance:
    System.out.println("Hello!");
    System.out.println("Your balance is "+savings.balance);
    
    //Deposit:
    int afterDeposit2 = savings.balance + 600;
    savings.balance = afterDeposit2;
    System.out.println("You just deposited "+600);
    
    //Check balance:
    System.out.println("Hello!");
    System.out.println("Your balance is "+savings.balance);
    
  }       
}
```

We have made a SavingsAccount class without using any methods beyond main() and the constructor, SavingsAccount().

Run the code to see some account behavior happen.

Look at the main method! It’s so long! There is so much repeated code! Can you imagine how messy it would look if you needed to make 10 deposits?

Throughout this lesson, we will learn how to make methods that would make checking the balance, depositing, and withdrawing all behavior that would take only one line of code.

## Defining Methods

```
public class Store {
  // instance fields
  String productType;
  
  // constructor method
  public Store(String product) {
    productType = product;
  }
  
  // advertise method
  
  // main method
  public static void main(String[] args) {
    
  }
}
```

In between the constructor and the main() method, add a method called advertise() to the Store class. It should be accessible by other classes, and should have no output.

You can leave the body of the method empty.

## Calling Methods

```
public class Store {
  // instance fields
  String productType;
  
  // constructor method
  public Store(String product) {
    productType = product;
  }
  
  // advertise method
  public void advertise() {
		System.out.println("Selling " + productType + "!");
    System.out.println("Come spend some money!");
  }
  
  // main method
  public static void main(String[] args) {
    Store lemonadeStand = new Store("Lemonade");
    
  }
}
```

Last exercise, we defined a new method, `advertise()`, but we didn’t actually see it run.

We now have a Store class with `advertise()` defined.

Call the `advertise()` method on the `lemonadeStand` object in the `main()` method and see what the output is!

Now, call the advertise() method on the lemonadeStand object two more times. It should be called in the main() method three times total.

## Scope

```
public class Store {
  // instance fields
  String productType;
  
  // constructor method
  public Store(String product) {
    productType = product;
  }
  
  // advertise method
  public void advertise() {
    String message = "Selling " + productType + "!";
		System.out.println(message);
  }
  
  // main method
  public static void main(String[] args) {
    String cookie = "Cookies";
    Store cookieShop = new Store(cookie);
    
    cookieShop.advertise();
  }
}
```

Inside of the advertise() method, change the productType variable to the cookie variable, which is declared in the main() method. This should also result in the printout:

```
Selling cookies!
```

Right?

No! We got an error! The cookie variable cannot be accessed inside of the advertise method. The scope is wrong! Change it back to productType:

```
String message = "Selling " + productType + "!";
```

Inside of the main() method, print the String message, which is declared in the advertise() method. This should print:

```
Selling Cookies!
```

Right?

Foiled again! The message variable only exists inside the scope of the advertise() method!

Delete the faulty print statement from the main() method.

## Adding Parameters

```
public class Store {
  // instance fields
  String productType;
  
  // constructor method
  public Store(String product) {
    productType = product;
  }
  
  // advertise method
  public void advertise() {
    String message = "Selling " + productType + "!";
		System.out.println(message);
  }
  
  // main method
  public static void main(String[] args) {
    Store lemonadeStand = new Store("Lemonade");
    
  }
}
```

Add a method to the Store class called greetCustomer(). It should be accessible by other classes, and return no output. For now, have it take no parameters and leave the body of the method empty.

Modify the greetCustomer() method so that it accepts a String parameter called customer.

Inside of the greetCustomer() method, add a print statement to print:

```
"Welcome to the store, " + customer + "!"
```

Inside the main() method, call the greetCustomer() method on the lemonadeStand object. Pass in a String argument of your choice!

## Reassigning Instance Fields

```
public class Store {
  // instance fields
  String productType;
  double price;
  
  // constructor method
  public Store(String product, double initialPrice) {
    productType = product;
    price = initialPrice;
  }
  
  // increase price method
  public void increasePrice(double priceToAdd){
    
  }
  
  // main method
  public static void main(String[] args) {
    Store lemonadeStand = new Store("Lemonade", 3.75);
    
  }
}
```

We have added a `price` instance field to the Store class.

However, to combat inflation costs, we’ve found ourselves increasing the price of our product over and over. We’ve added an empty `increasePrice()` method to the Store class. It takes a `double` parameter `priceToAdd`.

Inside of the `increasePrice()` method, create a variable called `newPrice`. Declare it to be a `double`, and set it equal to the `price` plus the `priceToAdd`.

Inside of increasePrice(), set the instance field price to be newPrice!

In the main() method, increase the price at the lemonade stand by 1.5. Then, print the lemonadeStand.price to see how it has changed!

## Returns

```
public class Store {
  // instance fields
  String productType;
  double price;
  
  // constructor method
  public Store(String product, double initialPrice) {
    productType = product;
    price = initialPrice;
  }
  
  // increase price method
  public void increasePrice(double priceToAdd){
    double newPrice = price + priceToAdd;
    price = newPrice;
  }
  
  // get price with tax method

  // main method
  public static void main(String[] args) {
    Store lemonadeStand = new Store("Lemonade", 3.75);

  }
}
```

We want to have a method that returns the price plus tax.

Define a method called getPriceWithTax() that is intended to return the price plus the tax. It should take in no parameters and return a double.

You can leave the body of the method empty for now. Note: the code will have an error until we return the correct type from the method, which we will do in the next step.

Inside the getPriceWithTax() method, create a double variable totalPrice that is equal to price + price * 0.08. 0.08 is the tax applied to the price.

Then, return totalPrice.

Inside of main(), set a double variable lemonadePrice to the value returned by lemonadeStand.getPriceWithTax().

Now, print out lemonadePrice.

## The toString() Method

```
public class Store {
  // instance fields
  String productType;
  double price;
  
  // constructor method
  public Store(String product, double initialPrice) {
    productType = product;
    price = initialPrice;
  }
  
  // increase price method
  public void increasePrice(double priceToAdd){
    double newPrice = price + priceToAdd;
    price = newPrice;
  }
  
  // get price with tax method
  public double getPriceWithTax(){
    double tax = 0.08;
    double totalPrice = price + price*tax;
    return totalPrice;
  }

  // main method
  public static void main(String[] args) {
    Store lemonadeStand = new Store("Lemonade", 3.75);
    Store cookieShop = new Store("Cookies", 5);

  }
}
```

In the main() method, print the Objects lemonadeStand and cookieShop. Are these printouts helpful in understanding these Objects?

Create a toString() method for the Store class. The method signature should say that it is public, and that it returns a String. It shouldn’t take in any parameters. For now, have it return the String "Store".

"Store" isn’t very helpful! What kind of Store is it?

Change the toString() to return a String that describes this Store object.

Your String should look like:

```
This store sells <productType> at a price of <price>.
```

where productType and price are the values in those instance fields. For example, if it was a hat store where hats cost 8, the String would say:

```
This store sells hats at a price of 8.
```

Look at the printouts again. Are they more helpful now?

## Review

```
public class SavingsAccount {
  
  int balance;
  
  public SavingsAccount(int initialBalance){
    balance = initialBalance;
  }
  
  public static void main(String[] args){
    SavingsAccount savings = new SavingsAccount(2000);
    
    //Check balance:
    System.out.println("Hello!");
    System.out.println("Your balance is "+savings.balance);
    
    //Withdrawing:
    int afterWithdraw = savings.balance - 300;
    savings.balance = afterWithdraw;
    System.out.println("You just withdrew "+300);
    
    //Check balance:
    System.out.println("Hello!");
    System.out.println("Your balance is "+savings.balance);
    
    //Deposit:
    int afterDeposit = savings.balance + 600;
    savings.balance = afterDeposit;
    System.out.println("You just deposited "+600);
    
    //Check balance:
    System.out.println("Hello!");
    System.out.println("Your balance is "+savings.balance);
    
    //Deposit:
    int afterDeposit2 = savings.balance + 600;
    savings.balance = afterDeposit2;
    System.out.println("You just deposited "+600);
    
    //Check balance:
    System.out.println("Hello!");
    System.out.println("Your balance is "+savings.balance);
    
  }       
}
```

Now that we’ve learned about behavior, we can apply behavior to our `SavingsAccount` class using methods!

We’ve added the functionality for each method inside `main()` now, but you will be rebuilding each above `main()`. Note that your methods can directly access the `balance` field.

First, write a method called `checkBalance()` that prints:

```
Hello!
Your balance is
```

with the balance of the account displayed.

It should take in no parameters and return nothing.

Now, write a method called deposit() that takes in an int parameter amountToDeposit and adds it to the balance. It should return nothing.

If you want, you can also have the method print:

```
You just deposited amountToDeposit
```

with the value of amountToDeposit displayed.

Now, write a method called withdraw() that takes in an int parameter amountToWithdraw and subtracts it from the balance. It should return the amountToWithdraw.

If you want, you can also have the method print:

```
You just withdrew amountToWithdraw
```

with the value of amountToWithdraw displayed.

Test out your methods by trying to replace some of the code in the main() method with the equivalent methods!

Make sure to use checkBalance(), deposit(), and withdraw() at least once each.

5.
Congratulations! You’ve made a basic SavingsAccount.

If you want, you can add more functionality to this! What other instance fields might you want to keep track of? What might a toString() look like for this class?