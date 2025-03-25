/**
 * Using two-pointer technique for the solution
 */
public class MergeStringsAlternately {

    public String mergeAlternately(String word1, String word2) {
        int i = 0;
        int j = 0;

        StringBuilder newWord = new StringBuilder();
        while (i < word1.length() && j < word2.length()) {
            newWord.append(word1.charAt(i));
            newWord.append(word2.charAt(j));

            i++;
            j++;
        }

        while (i < word1.length()) {
            newWord.append(word1.charAt(i));
            i++;
        }

        while (j < word2.length()) {
            newWord.append(word2.charAt(j));
            j++;
        }

        return newWord.toString();
    }
}
