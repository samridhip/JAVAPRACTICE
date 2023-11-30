import java.util.Scanner;

public class Question37 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        char[] letter= sc.nextLine().toCharArray();
        System.out.println("Reverse string");
        for(int i=letter.length-1;i>=0;i--){
            System.out.println(letter[i]);
        }
    }
}
