class Trie {

    /** Initialize your data structure here. */
    public Trie() {
      
        root= new TrieNode();
    }
    public class TrieNode
    {
        HashMap<Character,TrieNode> children= new HashMap<>();
        boolean isEndOfWord;
        TrieNode()
        {
            isEndOfWord=false;
        }
    }
    TrieNode root;
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        int level=0;
        int length=word.length();
        TrieNode curr= root;
        for(level =0;level<length;level++)
        {
            if(!curr.children.containsKey(word.charAt(level)))
            {
                TrieNode ne = new TrieNode();
                curr.children.put(word.charAt(level),ne);
            }
            curr=curr.children.get(word.charAt(level));
        }
        curr.isEndOfWord=true;
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        int level=0;
        int length= word.length();
        TrieNode curr= root;
        for(level=0;level<length;level++)
        {
            if(!curr.children.containsKey(word.charAt(level)))
            {
                return false;
            }
           curr= curr.children.get(word.charAt(level));
        }
        
        
        return (curr.isEndOfWord && curr!=null);
    
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        int level=0;
        int length= prefix.length();
        TrieNode curr= root;
        for(level=0;level<length;level++)
        {
            if(!curr.children.containsKey(prefix.charAt(level)))
            {
                return false;
            }
            curr=curr.children.get(prefix.charAt(level));
        }
        return (!curr.isEndOfWord || curr!=null);
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
