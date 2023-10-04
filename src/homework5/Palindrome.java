package homework5;

public class Palindrome {
    public static void main(String[] args) {
        int value = 0;
        String word = "PYLYP";
        char[] string = word.toCharArray();

        for (int i = 0; i < string.length; i++) {
            if (string[i] != string[string.length - i - 1]) {
                value = 1;
                break;
            }
        }
        if (value == 0) {
            System.out.println(word + " is palindrome");
        } else
        {
            System.out.println(word + " is not palindrome");
        }
    }
}
