import java.util.Scanner;
class NewDayOfWeek
{
	public static void main(String...arg)
	{
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the day number");
	int x= Integer.parseInt(sc.nextLine());
	
	String a[]=new String[8];
	a[0]="";
	a[1]="Sun";
	a[2]="Mon";
	a[3]="Tue";
	a[4]="Wed";
	a[5]="Thu";
	a[6]="Fri";
	a[7]="Sat";
	
	int index= x%7;
	
	System.out.println("Day of the week is " +a[index]);
	}
}