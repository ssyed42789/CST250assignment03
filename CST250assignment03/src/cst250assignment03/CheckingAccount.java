
package cst250assignment03;


public class CheckingAccount {
     

double overDraft = -1000;

    public void checking(double i) {

   
        double balance = 0.0;
        if (balance - i < overDraft){
                System.out.println("Failure: Can't overdraft more than            $1,000. A $25 +"
                        + "overdraft fee will be issued to your account. ");
             balance = balance - 25; }
        else
            balance = balance - i;
      }   
  }

    