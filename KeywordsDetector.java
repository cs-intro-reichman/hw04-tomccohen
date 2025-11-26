public class KeywordsDetector {
    public static void main(String[] args) {
        String[] sentences = {
            "Our product will transform the market",
            "Programming is both painful and engaging",
            "This has nothing to do with machine learning",
            "We need to leverage our core competencies",
            "Let's talk about data and algorithms",
            "Chatbots are great but must be used carefully",
            "This blockchain-based solution will disrupt the industry",
            "The team showed great Synergy in the last project",
            "Use simple words without hype and fluff",
            "Our new technology presents a significant paradigm shift",
            "Effective presentations must be clear, concise, and humble"
        };
        // Some keywords that typically signal bullshit contents in business presentations 
        String[] keywords = {"synergy", "disrupt", "leverage", "Paradigm", "transform"};
        detectAndPrint(sentences, keywords);
    }

    // Iterates through all the sentences.
    // If a sentence contains one or more of the kewords, prints it.
    public static void detectAndPrint(String[] sentences, String[] keywords) {

        for (int i = 0; i < sentences.length; i++) // loop of the sentences
        {
            String currentSentnce = sentences[i];
            String tempS = currentSentnce.toLowerCase();

            for (int j = 0; j < keywords.length; j++) // loop of the words
            {
                boolean contains = false;
                String currentWord = keywords[j];
                String tempW = currentWord.toLowerCase();
                int lastIndex = currentSentnce.length() - currentWord.length() + 1;

                for (int k = 0; k < lastIndex && !contains; k++) // loop of every char of the word in the sentncese
                {
                    if (tempW.charAt(0) == tempS.charAt(k))
                        {
                            contains = true;
                            for (int l = 0; l <  currentWord.length() && contains; l ++)
                            {
                                contains = tempW.charAt(l) == tempS.charAt(l + k);
                            }
                        }
         
                }
                if (contains) System.out.println(currentSentnce);
            }     
            
        }
    }
}
