import java.util.Scanner;
class DiscountCalculation{
	public static void main(String...arg)
	{ 
	Scanner sc= new Scanner(System.in);
	System.out.println("Price of item 1:");
	float priceOne= Float.parseFloat(sc.nextLine());
	
	System.out.println("Price of item 2:");
	float priceTwo= Float.parseFloat(sc.nextLine());
	
	System.out.println("Discounted Percentage :");
	int disPer=Integer.parseInt(sc.nextLine());
	
	float total= priceOne+priceTwo;
	float savAmount= (total/100)*disPer;
	float disAmount= total-savAmount;
	
	System.out.println("Total amount:$" +total);
	System.out.println("Discounted Amount:$" +disAmount);
	System.out.println("Saved amount:$" +savAmount);
	}
}
