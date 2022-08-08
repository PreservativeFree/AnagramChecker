
import java.util.Scanner;

public class AnagramCheckerMain {
    public static void main (String[] args) {
        String wordOne, wordTwo;
        Scanner input = new Scanner(System.in);
        System.out.println("Word 1");
        wordOne = input.nextLine();
        System.out.println("Word 2");
        wordTwo = input.nextLine();

        if(isAnagram(wordOne, wordTwo))
            System.out.println("Anagram");
        else
            System.out.println("Not an Anagram");
    }
    static boolean isAnagram(String a, String b) {
        boolean anagram = false;
        String myA = a.toLowerCase();
        String myB = b.toLowerCase();
        char[] wordA = myA.toCharArray();
        char[] wordB = myB.toCharArray();
        char[] lcAlpha = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        int[][] twoAArray = new int[26][1];
        int[][] twoBArray = new int[26][1];
        for(int i = 0; i < lcAlpha.length; i++)
            for(int j = 0; j < wordA.length; j++)
                if(wordA[j] == lcAlpha[i])
                    twoAArray[i][0] += 1;

        for(int i = 0; i < lcAlpha.length; i++)
            for(int j = 0; j < wordB.length; j++)
                if(wordB[j] == lcAlpha[i])
                    twoBArray[i][0] += 1;

        //for(int i = 0; i < lcAlpha.length; i++) {
          //  System.out.println(twoAArray[i][0]);
        //}
        //for(int i = 0; i < lcAlpha.length; i++) {
          //  System.out.println(twoBArray[i][0]);
       // }
        for(int i = 0; i < lcAlpha.length; i++) {
            if(twoAArray[i][0] == twoBArray[i][0]) {
                anagram = true;
            } else {
                anagram = false;
                return anagram;
            }
        }
        return anagram;
    }
}
// line 26 char[] upAlpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();