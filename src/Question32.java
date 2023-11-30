import java.util.Scanner;

public class Question32 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter the first name:");
        int numb1 = a.nextInt();
        System.out.println("Enter the second name:");
        int numb2 = a.nextInt();
        if (numb1 <= numb2)
            System.out.printf("%d <= %d\n", numb1, numb2);
            if (numb1 > numb2)
                System.out.printf("%d > %d\n", numb1, numb2);

            if (numb1 != numb2)
                System.out.printf("%d != %d\n", numb1, numb2);

        }
    }

