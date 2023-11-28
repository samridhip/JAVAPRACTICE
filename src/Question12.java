import java.util.Scanner;

public class Question12 {
    public static void main(String[]args){
        Scanner in= new Scanner(System.in);
        System.out.println("enter the first number");
        int num1= in.nextInt();
        System.out.println("enter second number");
        int num2=in.nextInt();
        System.out.println("enter third number");
        int num3=in.nextInt();
        System.out.println(num1+num2+num3/3);
    }
}
