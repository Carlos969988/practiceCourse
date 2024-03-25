public class SentencesLoopLabelsSearch {
    public static void main(String[] args) {

        String phrase = "Peter peckPiper picked a peck of pickled peppers peck peck";
        String word = "peck";

        int maxWord = word.length();
        int maxPhrase = phrase.length() - maxWord;

        int amount = 0;
        char letter = 'e';
        search:
        for (int i = 0; i <= maxPhrase; ) {       // loops through each character of the for using 'i'
            int k = i;      // 'k' takes the original value of 'i' so as not to alter the 'i' of the initial for
            for (int j = 0; j < maxWord; j++) {     // loops through each word of the for using 'j'
                if (phrase.charAt(k++) != word.charAt(j)) {
                    i++;
                    continue search;
                }
            }
            amount++;
            i = i + maxWord;
        }
        System.out.println("Found  = " + amount + " times in the '" + word + "' word of the phrase");
    }
}
