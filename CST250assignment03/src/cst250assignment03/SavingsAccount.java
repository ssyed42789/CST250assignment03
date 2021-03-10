package cst250assignment03;


   
public class SavingsAccount
{
   //Data fields
   private double balance; //Account Balance
   private final double annualInterestRate; //Account annual interest rate
   private double monthlyInterestRate; 
   private double totalDeposits; 
   private double totalWithdraws; 
   private double totalInterest; 

    public SavingsAccount(double startBalance, double annual_Interest_Rate)
    {
        balance = startBalance;
        annualInterestRate = annual_Interest_Rate; 
    }

    SavingsAccount() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
 
   public void setAnnualInterestRate(double annual_Interest_Rate)
   {
       monthlyInterestRate = annualInterestRate / 12; 
   }

   public void setDeposit(double amount)
   {
       balance += amount; 
       totalDeposits += amount; 
   }

   public void setWithdraw(double amount)
   {
       balance -= amount; 
       totalWithdraws += amount; 
   }
 
   public void calculateMonthlyInterest()
   {
       totalInterest = totalInterest + balance * monthlyInterestRate; 
       balance = balance + balance * monthlyInterestRate; 
   }

   public double getBalance()
   {
       return balance; 
   }

   
   public double getAnnualInterestRate()
   {
       return annualInterestRate; 
   }


   public double getMonthlyInterestRate()
   {
       return monthlyInterestRate; 
   }

   public double getTotalDeposits()
   {
       return totalDeposits; 
   }

  
   public double getTotalWithdraws()
   {
       return totalWithdraws; 
   }


   public double getTotalnterest()
   {
       return totalInterest; 
   }

   
   public void displayData()
   {
       balance = Math.round(balance * 100.0) / 100.0; 
       totalInterest = Math.round(totalInterest * 100.0) / 100.0; 
       System.out.println(); 
       System.out.println("The ending balance is: $" + balance); 
       System.out.println("Total amount of deposits: $" + totalDeposits);
       System.out.println("Total amount of withdraws: $" + totalWithdraws);
       System.out.println("Total interest earned: $" + totalInterest);
   }

}
