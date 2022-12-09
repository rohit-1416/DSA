import java.util.Iterator;
import java.util.List;

public class WordBreakProblem {
        public static class Node{
            boolean eow;
            Node [] children = new Node [26] ;

            Node (){
                eow =false;
                for (int i = 0 ; i < children.length ; i++){
                    children[i] = null ;
                }
            }
        }
        public static Node root = new Node () ;
        static void insert(String word){
            Node curr = root ;
            for (int i =0 ; i < word.length(); i++){
                int index = word.charAt(i)-'a';
                if (curr.children[index] == null )
                    curr.children[index] = new Node() ;

                if (i == word.length()-1 )
                    curr.children[index].eow =true ;

                curr= curr.children[index] ;
            }
        }
        static boolean search (String word ){
            Node curr =root ;
            for (int i = 0 ; i < word.length() ; i++ ){
                int index = word.charAt(i)-'a';
                Node node = curr.children[index];
                if (node == null )
                    return false ;
                if (i == word.length()-1 && node.eow ==false )
                    return false ;

                curr =curr.children[index];
            }
            return true ;
        }

    public static boolean wordBreak(String s, String[] wordDict) {
//        Iterator<String> itr = wordDict.iterator();
//        while (itr.hasNext()){
//            insert(itr.next()) ;
//        }
        for( int i =0 ; i < wordDict.length; i++){
            insert(wordDict[i]);
        }
        int len = s.length() ;
        if (len == 0)
            return true ;
        for(int i = 1 ; i <= len ; i++ ){
            if( search(s.substring(0, i) ) &&
                    wordBreak(s.substring(i), wordDict )) {
                return true;
            }
        }

        return false;
    }
    public static boolean startsWith(String prefix) {
        Node curr = root;
        for(int i=0; i<prefix.length(); i++) {
            int idx = prefix.charAt(i)-'a';
            if(curr.children[idx] == null) {
                return false;
            }
            curr = curr.children[idx];
        }
        return true;
    }


    public static void main(String[] args) {
        String words[] = {"i","love","sam","samsung","sung"};


        for (String word : words) {
            insert(word);
            System.out.println("inserted " + word);
        }

        System.out.println("thee -> " + search("sam"));
        System.out.println("thor -> " + search("i"));

        System.out.println(startsWith("i"));
        System.out.println(startsWith("sam"));
        System.out.println("word break Problem ");
        System.out.println(wordBreak("ilovesamsung",words));
    }


}
