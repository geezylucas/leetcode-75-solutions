/**
 * ReverseVowelsOfAString
 * Use two pointers technique
 */
public class ReverseVowelsOfAString {

    public String reverseVowels(String s) {
        char[] word = s.toCharArray();
        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            while (start < end && !isVowel(word[start])) {
                start++;
            }

            while (start < end && !isVowel(word[end])) {
                end--;
            }

            if (start < end) {
                swap(word, start, end);
                start++;
                end--;
            }
        }

        return new String(word);
    }

    public void swap(char[] word, int start, int end) {
        char temp = word[start];
        word[start] = word[end];
        word[end] = temp;
    }

    public boolean isVowel(char c) {
        switch (c) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                return true;
            default:
                return false;
        }
    }
}