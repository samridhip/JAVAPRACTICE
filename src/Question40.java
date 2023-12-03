public class Question40 {
    public static void main(String[] args) {
        int amount = 0;
        for (int i = 0; i <= 4; i++) {
            for (int j= 0; j <= 4; j++)
                for (int k= 0; k <= 4; k++)
                    if (i != j && j != k && k != i) {
                        amount++;
                        System.out.println(i+"" +j+"" +k);
                    }
            System.out.println("the total number" + amount);
        }
    }
}
