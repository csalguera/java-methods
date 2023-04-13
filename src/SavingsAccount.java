// public class SavingsAccount {
//   double balance;
  
//   public SavingsAccount(double startingBalance){
//     balance = startingBalance;
//   }
  
//   public void deposit(double amountToDeposit) {
//     // Add amountToDeposit to the balance
//     double updatedBalance = balance + amountToDeposit;
//     balance = updatedBalance;
//   }

//   public void withdraw(double amountToWithdraw) {
//     // Subtract ammountToWithdraw from the balance
//   }

//   public static void main(String[] args){
//     SavingsAccount myAccount = new SavingsAccount(2000);
//     System.out.println(myAccount.balance);
//     myAccount.deposit(100);
//     System.out.println(myAccount.balance);
    
//     /*
//      * ---------------------------
//      * Reassigning Instance Fields
//      * ---------------------------
//      * 
//      * The code above first prints 2000, which is the intial balance of the myAccount object
//      * after calling the deposit() method with 100 as its argument, 100 is added to the balance
//      * yielding 2100
//      */
//   }       
// }

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