import java.util.Scanner;
class CompareTwoIntegers{
	public static void main(String...arg)
	{
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter X:");
	int x= Integer.parseInt(sc.nextLine());
	
	System.out.println("Enter Y:");
	int y= Integer.parseInt(sc.nextLine());
	{
		if(x>y){
			System.out.println(x + " is greater than " + y);
		}
		else if(x<y){
			System.out.println(x + " is less than " + y);
		}
		else{
			System.out.println(x + " is equal to " + y);
		}
	}
	}
}