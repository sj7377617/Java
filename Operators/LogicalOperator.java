package Operators;

public class LogicalOperator {
    public static void main(String[] args) {
        
        int a = 10;
        int b = 20;
        int c = 30;

        System.out.println("Logical AND:"+ (a < b && b < c));
        System.out.println("Logical OR:"+ (a > b || b > c));
    }
}
