public class BruteForceSearch {

    public static int search(String text, String pattern)
    {
        int txt = text.length();
        int pat = pattern.length();

        for(int i = 0; i <= txt-pat; i++)
        {
            int j;
            for(j = 0; j < pat; j++)
            {
                if(text.charAt(i+j) != pattern.charAt(j))
                {
                    break;
                }
            }

            if(j == pat)
            {
                return i;
            }
        }
        return txt;
    }

    public static void main(String args[])
    {
        String text = "Have you ever heard the tragedy of Darth Plagueis the wise?";
        String pattern = "Plagueis";
        System.out.println(search(text, pattern));
    }
}
