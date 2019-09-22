package trie;

/**
 * 211.搜索与添加单词
 */
public class WordDictionary {
    class Node{
        private Node[] next;
        private boolean isEnd;
        public Node(){
            next=new Node[26];
            isEnd=false;
        }

        public boolean isEnd() {
            return isEnd;
        }
    }

    private Node root;
    public WordDictionary(){
        root=new Node();
    }

    public void addWord(String word){
        Node node=root;
        for (int i=0;i<word.length();i++){
            char cur=word.charAt(i);
            Node next=node.next[cur-'a'];
            if (next==null)
                node.next[cur-'a']=new Node();
            node=node.next[cur-'a'];
        }
        node.isEnd=true;
    }

    public boolean search(String word){
        return match(word,root,0);
    }

    private boolean match(String word,Node node,int start){
        if (start == word.length()) {
            return node.isEnd();
        }
        char alpha=word.charAt(start);
        if (alpha=='.'){
            for (int i=0;i<26;i++){
                if (node.next[i]!=null&&match(word,node.next[i],start+1))
                    return true;
            }
            return false;
        }else {
            if (node.next[alpha-'a']==null)
                return false;
        }
        return match(word,node.next[alpha-'a'],start+1);
    }
}