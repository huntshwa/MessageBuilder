public class MessageTester {
    public static void main(String[] args) {
        System.out.println("**** TESTING PART A ****");
        MessageBuilder builder = new MessageBuilder("The");
        String msg = builder.getMessage();
        int wordCount = builder.getNumWords();
        if (msg.equals("The book on the table")) {
            System.out.println("test 1 passes");
        } else {
            System.out.println("!!!!!! test 1 FAILS");
            System.out.println("--- message should be:  The book on the table");
            if (msg.equals("The book on the table ")) {
                System.out.println("---------- message is:  The book on the table ");
                System.out.println("---------- YOU HAVE AN EXTRA SPACE AT END    ^");
            } else {
                System.out.println("---------- message is:  " + msg);
            }
        }
        if (wordCount == 5) {
            System.out.println("test 2 passes");
        } else {
            System.out.println("!!!!!! test 2 FAILS");
            System.out.println("--- numWords should be:  5");
            System.out.println("---------- numWords is:  " + wordCount);
        }
        builder = new MessageBuilder("good");
        msg = builder.getMessage();
        wordCount = builder.getNumWords();
        if (msg.equals("good morning sunshine")) {
            System.out.println("test 3 passes");
        } else {
            System.out.println("!!!!!! test 3 FAILS");
            System.out.println("--- message should be:  good morning sunshine");
            if (msg.equals("good morning sunshine ")) {
                System.out.println("---------- message is:  good morning sunshine ");
                System.out.println("---------- YOU HAVE AN EXTRA SPACE AT END    ^");
            } else {
                System.out.println("---------- message is:  " + msg);
            }
        }
        if (wordCount == 3) {
            System.out.println("test 4 passes");
        } else {
            System.out.println("!!!!!! test 4 FAILS");
            System.out.println("--- numWords should be:  3");
            System.out.println("---------- numWords is:  " + wordCount);
        }
        builder = new MessageBuilder("a");
        msg = builder.getMessage();
        wordCount = builder.getNumWords();
        if (msg.equals("a b c d e f g h")) {
            System.out.println("test 5 passes");
        } else {
            System.out.println("!!!!!! test 5 FAILS");
            System.out.println("--- message should be:  a b c d e f g h");
            if (msg.equals("a b c d e f g h ")) {
                System.out.println("---------- message is:  a b c d e f g h ");
                System.out.println("------ YOU HAVE AN EXTRA SPACE AT END  ^");
            } else {
                System.out.println("---------- message is:  " + msg);
            }
        }
        if (wordCount == 8) {
            System.out.println("test 6 passes");
        } else {
            System.out.println("!!!!!! test 6 FAILS");
            System.out.println("--- numWords should be:  8");
            System.out.println("---------- numWords is:  " + wordCount);
        }
        builder = new MessageBuilder("nice");
        msg = builder.getMessage();
        wordCount = builder.getNumWords();
        if (msg.equals("nice job")) {
            System.out.println("test 7 passes");
        } else {
            System.out.println("!!!!!! test 7 FAILS");
            System.out.println("--- message should be:  nice job");
            if (msg.equals("nice job ")) {
                System.out.println("---------- message is:  nice job ");
                System.out.println("--- HAVE AN EXTRA SPACE AT END  ^");
            } else {
                System.out.println("---------- message is:  " + msg);
            }
        }
        if (wordCount == 2) {
            System.out.println("test 8 passes");
        } else {
            System.out.println("!!!!!! test 8 FAILS");
            System.out.println("--- numWords should be:  2");
            System.out.println("---------- numWords is:  " + wordCount);
        }
        builder = new MessageBuilder("yikes");
        msg = builder.getMessage();
        wordCount = builder.getNumWords();
        if (msg.equals("yikes")) {
            System.out.println("test 9 passes");
        } else {
            System.out.println("!!!!!! test 9 FAILS");
            System.out.println("--- message should be:  yikes");
            if (msg.equals("yikes ")) {
                System.out.println("---------- message is:  yikes ");
                System.out.println("---- AN EXTRA SPACE AT END   ^");
            } else {
                System.out.println("---------- message is:  " + msg);
            }
        }
        if (wordCount == 1) {
            System.out.println("test 10 passes");
        } else {
            System.out.println("!!!!!! test 10 FAILS");
            System.out.println("--- numWords should be:  1");
            System.out.println("---------- numWords is:  " + wordCount);
        }
        builder = new MessageBuilder("As");
        msg = builder.getMessage();
        wordCount = builder.getNumWords();
        if (msg.equals("As soon as possible")) {
            System.out.println("test 11 passes");
        } else {
            System.out.println("!!!!!! test 11 FAILS");
            System.out.println("--- message should be:  As soon as possible");
            if (msg.equals("As soon as possible ")) {
                System.out.println("---------- message is:  As soon as possible ");
                System.out.println("--------- YOU HAVE AN EXTRA SPACE AT END   ^");
            } else {
                System.out.println("---------- message is:  " + msg);
            }
        }
        if (wordCount == 4) {
            System.out.println("test 12 passes");
        } else {
            System.out.println("!!!!!! test 12 FAILS");
            System.out.println("--- numWords should be:  4");
            System.out.println("---------- numWords is:  " + wordCount);
        }
        System.out.println();
        System.out.println("**** TESTING PART B ****");
        builder = new MessageBuilder("The");
        String abbrev = builder.getAbbreviation();
        if (abbrev.equals("Tbott")) {
            System.out.println("test 13a passes");
        } else {
            System.out.println("!!!!!! test 13a FAILS");
            System.out.println("------ getAbbreviation() should return:  Tbott");
            System.out.println("--- getAbbreviation() actually returns:  " + abbrev);
        }
        if (builder.getMessage().equals("The book on the table")) {
            System.out.println("test 13b passes");
        } else {
            System.out.println("!!!!!! test 13b FAILS");
            System.out.println("------ getAbbreviation() modifies message which violates the postcondition!");
            System.out.println("------ getAbbreviation() should NOT modify message");
        }
        builder = new MessageBuilder("good");
        abbrev = builder.getAbbreviation();
        if (abbrev.equals("gms")) {
            System.out.println("test 14a passes");
        } else {
            System.out.println("!!!!!! test 14a FAILS");
            System.out.println("------ getAbbreviation() should return:  gms");
            System.out.println("--- getAbbreviation() actually returns:  " + abbrev);
        }
        if (builder.getMessage().equals("good morning sunshine")) {
            System.out.println("test 14b passes");
        } else {
            System.out.println("!!!!!! test 14b FAILS");
            System.out.println("------ getAbbreviation() modifies message which violates the postcondition!");
            System.out.println("------ getAbbreviation() should NOT modify message");
        }
        builder = new MessageBuilder("a");
        abbrev = builder.getAbbreviation();
        if (abbrev.equals("abcdefgh")) {
            System.out.println("test 15a passes");
        } else {
            System.out.println("!!!!!! test 15a FAILS");
            System.out.println("------ getAbbreviation() should return:  abcdefgh");
            System.out.println("--- getAbbreviation() actually returns:  " + abbrev);
        }
        if (builder.getMessage().equals("a b c d e f g h")) {
            System.out.println("test 15b passes");
        } else {
            System.out.println("!!!!!! test 15b FAILS");
            System.out.println("------ getAbbreviation() modifies message which violates the postcondition!");
            System.out.println("------ getAbbreviation() should NOT modify message");
        }
        builder = new MessageBuilder("nice");
        abbrev = builder.getAbbreviation();
        if (abbrev.equals("nj")) {
            System.out.println("test 16a passes");
        } else {
            System.out.println("!!!!!! test 16a FAILS");
            System.out.println("------ getAbbreviation() should return:  nj");
            System.out.println("--- getAbbreviation() actually returns:  " + abbrev);
        }
        if (builder.getMessage().equals("nice job")) {
            System.out.println("test 16b passes");
        } else {
            System.out.println("!!!!!! test 16b FAILS");
            System.out.println("------ getAbbreviation() modifies message which violates the postcondition!");
            System.out.println("------ getAbbreviation() should NOT modify message");
        }
        builder = new MessageBuilder("yikes");
        abbrev = builder.getAbbreviation();
        if (abbrev.equals("y")) {
            System.out.println("test 17a passes");
        } else {
            System.out.println("!!!!!! test 17a FAILS");
            System.out.println("------ getAbbreviation() should return:  y");
            System.out.println("--- getAbbreviation() actually returns:  " + abbrev);
        }
        if (builder.getMessage().equals("yikes")) {
            System.out.println("test 17b passes");
        } else {
            System.out.println("!!!!!! test 17b FAILS");
            System.out.println("------ getAbbreviation() modifies message which violates the postcondition!");
            System.out.println("------ getAbbreviation() should NOT modify message");
        }
        builder = new MessageBuilder("As");
        abbrev = builder.getAbbreviation();
        if (abbrev.equals("Asap")) {
            System.out.println("test 18a passes");
        } else {
            System.out.println("!!!!!! test 18a FAILS");
            System.out.println("------ getAbbreviation() should return:  Asap");
            System.out.println("--- getAbbreviation() actually returns:  " + abbrev);
        }
        if (builder.getMessage().equals("As soon as possible")) {
            System.out.println("test 18b passes");
        } else {
            System.out.println("!!!!!! test 18b FAILS");
            System.out.println("------ getAbbreviation() modifies message which violates the postcondition!");
            System.out.println("------ getAbbreviation() should NOT modify message");
        }
    }
}