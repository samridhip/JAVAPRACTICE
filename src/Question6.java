import java.util.Scanner;

public class Question6 {
    public static void main(String[]args){
        Scanner in= new Scanner(System.in);
        System.out.println("Input First number");
        int num1= in.nextInt();
        System.out.println("Input Second number");
        int num2= in.nextInt();
        System.out.println(num1+"+"+num2+"="+(num1+num2));
        System.out.println(num1+"-"+num2+"="+(num1-num2));
        System.out.println(num1+"x"+num2+"="+(num1*num2));
        System.out.println(num1+"/"+num2+"="+(num1/num2));
    }
}
