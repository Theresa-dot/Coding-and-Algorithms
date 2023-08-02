import java.util.*;

public class Main {
    
    static String pal(String s) {
      
        int[] charCount = new int[26];

        for (char c : s.toCharArray()) {
            if (Character.isAlphabetic(c)) {
                charCount[c - 'a']++;
            }
        }

        int oddCount = 0;
        char middleChar = '\0';
        StringBuilder leftHalf = new StringBuilder();

        for (int i = 0; i < 26; i++) {
            if (charCount[i] % 2 == 1) {
                oddCount++;
                middleChar = (char) (i + 'a');
            }
            for (int j = 0; j < charCount[i] / 2; j++) {
                leftHalf.append((char) (i + 'a'));
            }
        }

        if (oddCount > 1) {
            return "Not a palindrome";
        }

        return leftHalf.toString() + middleChar + leftHalf.reverse().toString();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.toLowerCase();
        String result = pal(s);

        System.out.println(result);
    }
}