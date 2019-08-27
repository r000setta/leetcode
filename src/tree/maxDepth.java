package tree;

/**
 * N叉树最大深度
 */
public class maxDepth {
    public int solution(Node root){
        if (root==null)
            return 0;
        int max=0;
        for (Node node:root.children){
            int depth=solution(node);
            max=Math.max(max,depth);
        }
        return max+1;
    }
}
