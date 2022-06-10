public class KMPSearch {

    void KMPsearch(String pattern, String text)
    {
        int txt = text.length();
        int pat = pattern.length();

        int lps[] = new int [pat];
        int j = 0;

        computeLPSArray(pattern, pat, lps);

        int i = 0;

        while(i < txt)
        {
            if(pattern.charAt(j) == text.charAt(i))
            {
                j++;
                i++;
            }

            if(j == pat)
            {
                System.out.println("Pattern at: " + (i - j));

                j = lps[j -1];
            }

            else if(i < txt && pattern.charAt(j) != text.charAt(i))
            {
                if(j != 0)
                {
                    j = lps[j - 1];
                }

                else
                {
                    i = i  + 1;
                }
            }
        }
    }

    void computeLPSArray(String pattern, int pat, int lps[])
    {
        int length = 0;
        int i = 1;
        lps[0] = 0;

        while(i < pat)
        {
            if(pattern.charAt(i) == pattern.charAt(length))
            {
                length++;
                lps[i] = length;
                i++;
            }

            else
            {
                if(length != 0)
                {
                    length = lps[length - 1];
                }

                else
                {
                    lps[i] = length;
                    i++;
                }
            }
        }
    }

    public static void main(String[] args) {
        String txt = "1234BEN89";
        String pat = "BEN";

        new KMPSearch().KMPsearch(pat, txt);
    }
}
