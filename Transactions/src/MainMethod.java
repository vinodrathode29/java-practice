import java.util.Scanner;

public class MainMethod {

		  public static void main(String[] args) {
              Scanner sc = new Scanner(System.in);	
              
              Account acc= new Account();

              System.out.println("Enter the Account Number");
              int accountNumber = Integer.parseInt(sc.nextLine());
              
              System.out.println("Enter the Balance");
              int getBalance = Integer.parseInt(sc.nextLine());
              
              System.out.println("Enter 1 to deposit an amount, 2 to withdraw an amoount ");
              int choice = Integer.parseInt(sc.nextLine());
              
              
              switch(choice) {
              
              case 1:
            	  System.out.println("Enter the amount to deposit ");
            	  int amt =Integer.parseInt(sc.nextLine());
            	  getBalance=getBalance+amt;
            	  
            	  System.out.println("Your balance after the transaction is:" +getBalance);
            	  break;
            	  
              case 2:
            	  System.out.println("Enter the amount to withdraw ");
            	  int wdl =Integer.parseInt(sc.nextLine());
            	  if (wdl > getBalance) {
      				System.out.println("Insufficient Balance");
      			} else {
      				getBalance = getBalance - wdl;
      			}
            	  System.out.println("Your balance after the transaction is:" +getBalance);
            	  break; 
            	  
            	default:
            		System.out.println("Invalid input");
              }
	}

}
