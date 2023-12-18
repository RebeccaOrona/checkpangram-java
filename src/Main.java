import java.util.HashSet;
import java.util.Set;

public class Main {

    public static boolean isPangram(String str) {
        Set<Character> alphabetSet = new HashSet<>();
        for (char c : str.toLowerCase().toCharArray()) {
            if (Character.isLetter(c)) {
                alphabetSet.add(c);
            }
        }
        return alphabetSet.size() == 26;
    }
    public static boolean check(String sentence){
        return isPangram(sentence);
    }


    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        System.out.println("The quick brown fox jumps over the lazy dog.: "+check("The quick brown fox jumps over the lazy dog"));
        System.out.println("You shall not pass!: "+check("You shall not pass"));
    }
}