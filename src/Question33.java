import java.util.Scanner;

public class Question33 {
    public static void main(String[] args) {
        int digit,sum=0;

    Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first number");
    int numb1 = sc.nextInt();
        while(numb1>0) {
            digit = numb1% 10;
            sum = sum + digit;
            numb1 = numb1 / 10;
        }
            System.out.println("sum of the digits" + sum);
    }
}


