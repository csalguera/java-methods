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
//     // Subtract amountToWithdraw from the balance
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
  
  public void checkBalance() {
    System.out.println("Hello!");
    System.out.println("Your balance is " + balance);
  }

  public void deposit(int amountToDeposit) {
    balance += amountToDeposit;
    System.out.println("You just deposited " + amountToDeposit);
  }

  public int withdraw(int amountToWithdraw) {
    System.out.println("You just withdrew " + amountToWithdraw);
    balance -= amountToWithdraw;
    return amountToWithdraw;
  }

  public static void main(String[] args){
    SavingsAccount savings = new SavingsAccount(2000);
    
    //Check balance:
    savings.checkBalance();
    
    //Withdrawing:
    savings.withdraw(300);
    
    //Check balance:
    savings.checkBalance();
    
    //Deposit:
    savings.deposit(600);
    
    //Check balance:
    savings.checkBalance();
    
    //Deposit:
    savings.deposit(600);
    
    //Check balance:
    savings.checkBalance();
  }       
}