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