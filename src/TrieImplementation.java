import javax.swing.tree.TreeNode;

public class TrieImplementation {
    static class TrieNode {
        TrieNode children[];
        boolean endOfWord;

        TrieNode() {
            children = new TrieNode[26];
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
            endOfWord = false;
        }
    }
    static  TrieNode root =  new TrieNode();

    public static void insert(String word){
        TrieNode curr = root ;
        for (int i =0 ; i < word.length(); i++){   // O(l)
            int index = word.charAt(i) - 'a' ;

            if (curr.children[index] == null)
                curr.children[index] = new TrieNode() ;

            if (i == word.length()-1)
                curr.children[index].endOfWord =true ;

                curr = curr.children[index];
            }
    }
    public static boolean search (String word ){
        TrieNode curr = root ;
        for (int i = 0 ; i < word.length(); i++){  // O(l) ; l = key.length
            int index = word.charAt(i) -'a';

            TrieNode node = curr.children[index];

            if (node == null)
                return false ;
            if ( i== word.length()-1 && node.endOfWord == false)
                return false ;

            curr = curr.children[index] ;
        }
        return true ;
    }
    public static void main(String[] args) {
        String words [] = {"the", "their" ,"a", "there","any"};
        for (int i =0 ; i < words.length; i++){
            insert(words[i]);
        }
        System.out.println(search("their"));
        System.out.println(search("thor"));
        System.out.println(search("an"));
    }
}
