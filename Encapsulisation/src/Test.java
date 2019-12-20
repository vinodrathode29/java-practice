import java.util.Scanner;

public class Test {

     public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
        
        System.out.println("1. Rectangle");
        System.out.println("2.  Square");
        System.out.println("3. Circle");
        System.out.print("Area of Area Calculator --- Choose your shape");
        
        int ch = Integer.parseInt(sc.nextLine());
        Shape shape=null;
        
          if(ch==1) {
             System.out.print("Enter length and breadth: ");
              int length = sc.nextInt();
           
              int breadth = sc.nextInt();
              shape=new Rectangle(length,breadth);
          }
          else if(ch==2) {
            
                System.out.print("Enter the side: ");
                int side = sc.nextInt();
                shape=new Square(side);
          }
          else if (ch==3) {
             System.out.print("Enter radius: ");
             int radius = sc.nextInt();
             shape=new Circle(radius);
          }
          System.out.printf("Area of %s is:%.2f",shape.getShapeName(),shape.calculateArea());       
     }       
}

