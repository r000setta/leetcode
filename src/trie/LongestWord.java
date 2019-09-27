package trie;

/**
 * 720.词典最长单词
 */
public class LongestWord {
    class Node{
        private Node[] next;
        private boolean isEnd;
        public Node(){
            next=new Node[26];
            isEnd=false;
        }
        public boolean containsKey(char ch) {
            return next[ch - 'a'] != null;
        }

        public Node get(char ch) {
            return next[ch - 'a'];
        }

        public void put(char ch, Node node) {
            next[ch - 'a'] = node;
        }

        public void setEnd() {
            isEnd = true;
        }

        public boolean isEnd() {
            return isEnd;
        }
    }

    class Trie{
        Node root=new Node();

        public void insert(String word){
            Node node=root;
            for (int i=0;i<word.length();i++){
                char c=word.charAt(i);
                if (node.get(c)==null)
                    node.put(c,new Node());
                node=node.get(c);
            }
            node.setEnd();
        }

        public boolean isBuild(String word){
            Node node=root;
            for (int i=0;i<word.length();i++){
                char c=word.charAt(i);
                if (!node.get(c).isEnd)
                    return false;
                node=node.get(c);
            }
            return true;
        }
    }

    public String solution(String[] words){
        int longlen=0;
        String longWord="";
        Trie trie=new Trie();
        for (String word:words){
            trie.insert(word);
        }
        for (String word:words){
            if (trie.isBuild(word)&&word.length()>longlen){
                longWord=word;
                longlen=word.length();
            }else if(trie.isBuild(word)&&word.length()==longlen){
                for (int i=0;i<longlen;i++){
                    if (word.charAt(i)-longWord.charAt(i)<0){
                        longWord=word;
                        longlen=word.length();
                    }else if (word.charAt(i)-longWord.charAt(i)>0)
                        break;
                }
            }
        }
        return longWord;
    }
}