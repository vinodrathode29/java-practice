class Calculator {  
    public static int calculateTotal(int x, int y) {        
        return x + y;    
    }
}
class BankDetails extends Calculator {    
    public static void main(String args[]) {        
        System.out.println(calculateTotal(2, 3));    
    }
}