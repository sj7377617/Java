package Statements;

public class ifElseifLadderStatement {
    public static void main(String[] args) {
        
        int marks = 70;

        if(marks >=60 && marks <= 70){
            System.out.println("A grade");
        }
        else if (marks >= 50 && marks <=60){
            System.out.println("B grade");
        }
        else if (marks >=40 && marks <=50){
            System.out.println("C grade");
        }
        else{
            System.out.println("fail");
        }
    }
}
