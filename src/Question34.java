import java.util.Scanner;

public class Question34 {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the length of the side");
        double side=sc.nextDouble();
        System.out.println("Area of a hexagon:" +(6 * (side * side))/(4 * Math.tan(Math.PI / 6)));

    }
}
