import java.util.Scanner;

public class GenC {
       public static void main(String[] args) {
              Scanner s = new Scanner(System.in);
              Trainee g = new Trainee();
              
              System.out.println("Enter the number of GenCs");
              int gen = Integer.parseInt(s.nextLine());
              
              String[] arr= new String[gen];
       
              for(int i=0; i<arr.length; i++){
                     arr[i] = s.toString();
                     System.out.println("Enter the Employee Id");
                     int empId = Integer.parseInt(s.nextLine()); 
                      g.setEmpId(empId);
                     System.out.println("Enter the name"); 
                      String name = s.nextLine();
                     g.setName(name);
       }
                     g.display(); 
}
}
