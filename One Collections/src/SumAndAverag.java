import java.util.ArrayList;
import java.util.Scanner;

public class SumAndAverag {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		
	    ArrayList<Integer> list = new ArrayList<Integer>(num);
	    for(int i=0;i<num;i++)
	    {
	    list.add(sc.nextInt());
	   }
		        double sum = 0;
		        
		        for (int i : list) {
		            sum += i;
		        }
		        double average = sum / list.size();
		        System.out.printf( "%.0f \n",sum);
		        System.out.printf("%.2f",average);
		    }
		} 