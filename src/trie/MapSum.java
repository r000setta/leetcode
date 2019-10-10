package trie;

/**
 * 677.键值映射
 */
public class MapSum {
    class Node{
        private Node[] next;
        private boolean isEnd;
        private int val;
        private boolean isEmpty;
        private Node(int num){
            next=new Node[26];
            isEnd=false;
            isEmpty=true;
            val=num;
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
        private Node root;

        public Trie(){
            root=new Node(0);
        }

        public void insert(String word,int val){
            Node node=root;
            for (int i=0;i<word.length();i++){
                char c=word.charAt(i);
                if (!node.containsKey(c)){
                    node.put(c,new Node(val));
                    node.isEmpty=false;
                }
                node=node.get(c);
            }
            node.setEnd();
        }

        public int sum(String prefix){
            Node node=root;
            for (int i=0;i<prefix.length();i++){
                char c=prefix.charAt(i);
                if (!node.containsKey(c))
                    return 0;
                node=node.get(c);
            }
            return sum(node);
        }

        public int sum(Node node){
            if (node.isEmpty)
                return node.val;
            int sum=node.val;
            for (int i=0;i<26;i++){
                if (node.next[i]!=null)
                    sum+=sum(node.next[i]);
            }
            return sum;
        }
    }

    private Trie trie;

    public MapSum(){
        trie=new Trie();
    }

    public void insert(String key,int val){
        trie.insert(key,val);
    }

    public int sum(String prefix){
        return trie.sum(prefix);
    }
}
