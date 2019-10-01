package unions;

/**
 * 684.冗余连接
 */
public class findRedundantConnection {

    //寻找p元素的根节点
    private int find(int p,int[] parent){
        while (p!=parent[p])
            p=parent[p];
        return p;
    }

    //合并两个元素
    private void union(int p,int q,int res[],int[] parent){
        int pRoot=find(p,parent);
        int qRoot=find(q,parent);
        if (pRoot==qRoot){
            res[0]=p+1;
            res[1]=q+1;
        }
        parent[pRoot]=qRoot;
    }

    public int[] solution(int[][] edges){
        int size=edges.length;
        int[] parent=new int[size];
        for (int i=0;i<parent.length;i++){
            parent[i]=i;
        }
        int[] res=new int[2];
        for (int i=0;i<edges.length;i++){
            union(edges[i][0]-1,edges[i][1]-1,res,parent);
        }
        return res;
    }
}
