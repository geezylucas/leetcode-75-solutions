/**
 * ReverseVowelsOfAString
 * Use two pointers technique
 */
public class ReverseVowelsOfAString {

    public static void main(String[] args) {
        String s = "IceCreAm";

        System.out.println(reverseVowels(s));
    }

    public static String reverseVowels(String s) {
        int i = 0;
        int j = s.length() - 1;

        char[] a = s.toCharArray();

        while (i < j) {
            while (i < j && !validateChar(a[i])) {
                i++;
            }

            while (i < j && !validateChar(a[j])) {
                j--;
            }

            char aux = a[i];
            a[i] = a[j];
            a[j] = aux;

            i++;
            j--;
        }

        return String.valueOf(a);
    }

    private static boolean validateChar(char c) {
        return 'a' == c || 'e' == c || 'i' == c || 'o' == c || 'u' == c || 'A' == c || 'E' == c || 'I' == c || 'O' == c
                || 'U' == c;
    }

}