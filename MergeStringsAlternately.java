public class MergeStringsAlternately {

    public String mergeAlternately(String word1, String word2) {
        int i = 0;
        StringBuilder newWord = new StringBuilder();
        while (i < word1.length() || i < word2.length()) {
            if (i < word1.length()) {
                newWord.append(word1.charAt(i));
            }
            if (i < word2.length()) {
                newWord.append(word2.charAt(i));
            }
            i++;
        }

        return newWord.toString();
    }
}
