import java.nio.charset.Charset;

public class Question41 {
    public static void main(String[]args){
        System.out.println("List of available characters sets in charset sets ");
        for(String str: Charset.availableCharsets().keySet()){
            System.out.println(str);
        }
    }
}
