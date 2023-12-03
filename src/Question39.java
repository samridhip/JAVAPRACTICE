public class Question39 {
    public static void main(String[]args){
        String input= "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";
        char[]ch= input.toCharArray();
        int letter=0;
        int space=0;
        int number=0;
        int others=0;
        for(int i = 0; i<= input.length(); i++)
            if (Character.isLetter(ch[i])) {
                letter++;
            } else if (!Character.isSpaceChar(ch[i])) {
                if (Character.isDigit(ch[i])) {
                    number++;
                } else {
                    others++;
                }
            } else {
                space++;
            }
        System.out.println("letters is" +letter);
        System.out.println("space is"+space);
        System.out.println("number is"+number);
        System.out.println("others is"+others);
    }
}
