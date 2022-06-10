public class Trie {
    static final int ALPHABET_SIZE = 26;

    static class TrieNode
    {
        TrieNode[] children = new TrieNode[ALPHABET_SIZE];
        boolean endOfWord;

        TrieNode(){
            endOfWord = false;
            for (int i = 0; i < ALPHABET_SIZE; i++) {
                children[i] = null;
            }
        }
    };

    static TrieNode root;

    static void insert(String key)
    {
        int level;
        int length = key.length();
        int index;

        TrieNode traverse = root;

        for (level = 0; level < length; level++)
        {
            index = key.charAt(level) - 'a';
            if (traverse.children[index] == null) {
                traverse.children[index] = new TrieNode();
            }

            traverse = traverse.children[index];
        }

        traverse.endOfWord = true;
    }

    static boolean search(String key)
    {
        int level;
        int length = key.length();
        int index;
        TrieNode traverse = root;

        for (level = 0; level < length; level++)
        {
            index = key.charAt(level) - 'a';

            if (traverse.children[index] == null){
                return false;
            }

            traverse = traverse.children[index];
        }

        return (traverse != null && traverse.endOfWord);
    }

    public static void main(String args[])
    {
        String[] keys = {"bank", "book", "bar", "bring", "film", "filter", "simple", "silt", "silver"};

        String[] output = {"Not present in trie", "Present in trie"};

        root = new TrieNode();

        int i;
        for (i = 0; i < keys.length ; i++)
            insert(keys[i]);

        // Search for different keys 
        if(search("bank"))
            System.out.println("bank: " + output[1]);
        else System.out.println("bank: " + output[0]);

        if(search("simple"))
            System.out.println("simple: " + output[1]);
        else System.out.println("simple:  " + output[0]);

        if(search("cat"))
            System.out.println("cat: " + output[1]);
        else System.out.println("cat: " + output[0]);

        if(search("dog"))
            System.out.println("dog: " + output[1]);
        else System.out.println("dog: " + output[0]);
    }
} 