import java.util.Scanner;
public class ProfitPercentage {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of dozens of toys purchased :");
		int dozenCount = sc.nextInt();
		
		System.out.println("Enter the price per dozen  :");
		int pricePerDozen = sc.nextInt();
		
		System.out.println("Enter the selling price of 1 toy :");
		int sellPrice = sc.nextInt();
		
		Show s = new Show();
		float profit = s.calculateProfit(dozenCount,pricePerDozen,sellPrice);

		System.out.println("percentage::"+profit);

	}
	
class Show{
public float calculateProfit(int dozenCount, int pricePerDozen,  int sellPrice)
{

                float cp = pricePerDozen/12;
                float profit = sellPrice - cp ;
                float percentage = (profit/cp)*100;
                return percentage;
                
 }
}


}
