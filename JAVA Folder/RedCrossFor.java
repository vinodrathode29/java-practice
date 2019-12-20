import java.util.Scanner;
class RedCrossFor
{
	public static void main(String...arg) {
		System.out.println("How many numbers you want to add?");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); {
			int[] arr = new int[n];
			int total = 0;
			for(int i=0; i<arr.length; i++){
				arr[i] = sc.nextInt();
				total = total + arr[i];
				}
        System.out.println(total);          
		}
	}
}