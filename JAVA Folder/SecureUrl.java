import java.util.Scanner;
class SecureUrl
{
	public static void main(String...arg)
	{
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the String");
	String x= sc.nextLine();
	
	System.out.println("Enter the start string");
	String y= sc.nextLine();
	
	if(x.startsWith(y))
	{
		System.out.println(x+" starts with https");
	}
	else
	{
		System.out.println(x+"  does not starts with https ");
	}
	}
}