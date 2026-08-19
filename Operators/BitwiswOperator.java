package Operators;

public class BitwiswOperator {
    public static void main(String[] args) {
        
        int a = 10;
        int b = 20;
        int c = 30;

        //bitwise AND & bitwise OR

        System.out.println("Bitwise AND:"+ (a > b & b > c));
        System.out.println("Bitwise OR:"+ (a < b | b < c));
    }
}
