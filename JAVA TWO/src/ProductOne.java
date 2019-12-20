import java.util.Scanner;
public class ProductOne {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Product pd = new Product();
		
		System.out.println("Enter the Product id ");
		long id= Integer.parseInt(sc.nextLine());
		pd.setId(id);
		
		System.out.println("Enter the product name ");
		pd.setProductName(sc.nextLine());
		
		System.out.println("Enter the Supplier name ");
		pd.setSupplierName(sc.nextLine());
		
		pd.display();
	
	
}}