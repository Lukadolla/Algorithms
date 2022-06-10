public class RunLengthEncoding {

    public static String RLE(String input)
    {
        int size = input.length();
        String output = "";

        for(int i = 0; i < size; i++)
        {
            int count = 1;

            while(i < size - 1 && (input.charAt(i) == input.charAt(i + 1)))  //while the next letter is the same as previous, increment count
            {
                count++;
                i++;
            }

            output += input.charAt(i) + "" + count; //add letter and corresponding count to output string
        }

        return output; //return output string
    }

    public static void main(String[] args) {
        String input = "aaaabbbbb";
        System.out.println(RLE(input));
    }
}
