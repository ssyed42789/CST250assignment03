
package cst250assignment03;

/**
 *
 * @author ssyed
 */
public class CST250assignment03 {
    
   SavingsAccount savings = new SavingsAccount();
   CheckingAccount checking = new CheckingAccount();
   Account account;
   
   
    double balance = 100.35;
    double withdrawal = 90.0;
    double deposit = 20.0;


   public static void main (String[] args) {
   Account account = new Account(1122, 20000);


    } 
  // Extra Print Method
     public static void Print (double x){
     System.out.printf("The current balance is "+" $ "+"%4.2f"+"%n",x);
    }
  }



  class Account {
  private int id;
   double balance;
   private static double annualInterestRate;
   private java.util.Date dateCreated;

  public Account() {
    dateCreated = new java.util.Date();
  }
  public Account(int newId, double newBalance) {
     id = newId;
     balance = newBalance;
     dateCreated = new java.util.Date();
   }

  public int getId() {
    return this.id;
      }

   public double getBalance() {
    return balance;
    }

     public static double getAnnualInterestRate() {
      return annualInterestRate;
      }

    public void setId(int newId) {
     id = newId;
     }

    public void setBalance(double newBalance) {
     balance = newBalance;
     }

  public static void setAnnualInterestRate(double newAnnualInterestRate) {
    annualInterestRate = newAnnualInterestRate;
  }

 public double getMonthlyInterest() {
   return balance * (annualInterestRate / 1200);
 }

  public java.util.Date getDateCreated() {
   return dateCreated;
  }

   public void withdraw(double amount) {
    balance -= amount;
 }

    public void deposit(double amount) {
    balance += amount;
   }
    

  }
