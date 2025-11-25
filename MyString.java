public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        String ans = "";

        for (int i = 0; i < str.length(); i++)
        {
            char currentChar = str.charAt(i);
            

            if ('A' <= currentChar && currentChar <= 'Z')
                { 
                    ans += (char) (currentChar + 32);
                } 
            else
                {
                    ans += currentChar;
                } 
        }
        return ans;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
        if (str1 == null || str2 ==null) return false;
        
        int bigger = str1.length();
        int smaller = str2.length();

        if (smaller == 0) return true;
        if (bigger < smaller) return false;

        boolean contains = false;
        int lastIndex = bigger - smaller  + 1;

        for (int i = 0; i < lastIndex && !contains; i++)
        {
            if (str2.charAt(0) == str1.charAt(i))
            {
                contains = true;

                for (int j = 0; j < str2.length() && contains; j++)
                {
                    contains =  (str2.charAt(j) == str1.charAt(j + i));
                }
            }
        }
        return contains;
    }
}
