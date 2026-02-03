public class MessageBuilder {
    private String message;
    private int numWords;
    /**
     * Builds a message starting with the word specified by the
     * parameter and counts the number of words in the message,
     * as described in part (a)
     */
    public MessageBuilder(String startingWord) {
        String tempWord = startingWord;
        message = startingWord;
        numWords = 1;
        while(getNextWord(tempWord) != null) {
            tempWord = getNextWord(tempWord);
            message += " " + tempWord;

            numWords++;
        }
    }

    public String getMessage() {
        return message;
    }


    public int getNumWords() {
        return numWords;
    }

    /**
     * Returns a word to follow the word specified by the
     * parameter or null if there are no remaining words.
     * Precondition: s is a single word with no spaces.
     * Postcondition: Returns an individual word with no spaces.
     */
    public String getNextWord(String s) {
        String[] tests = {"The", "book", "on", "the", "table", null, "good", "morning", "sunshine", null, "a", "b", "c", "d", "e", "f", "g", "h", null, "nice", "job", null, "yikes", null, "As", "soon", "as", "possible", null};
        for (int i = 0; i < tests.length; i++) {
            if (tests[i] != null) {
                if (tests[i].equals(s)) {
                    return tests[i + 1];
                }
            }
        }
        return null;
    }
    /**
     * Returns an abbreviation for the instance variable message,
     * as described in part (b)
     * Preconditions: Each word in message is separated by a
     *
     *
     * Postcondition: message is unchanged.
     */
    public String getAbbreviation() {
        String tempMessage = message;
        String abbrev = tempMessage.substring(0, 1);

        while(tempMessage.contains(" ")) {
            tempMessage = tempMessage.substring(tempMessage.indexOf(" ") + 1);
            abbrev += tempMessage.substring(0, 1);
        }

        return abbrev;
    }
/* There may be instance variables, constructors, and methods
that are not shown. */
}
