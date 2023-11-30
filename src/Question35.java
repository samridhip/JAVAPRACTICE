import java.util.Scanner;

public class Question35 {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the length of side");
        double length= sc.nextDouble();
        System.out.println("Enter the side of polygon");
        double side=sc.nextDouble();
        System.out.println((side*length*length)/(4*Math.tan(Math.PI/side)));

    }
}
