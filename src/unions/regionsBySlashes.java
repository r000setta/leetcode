package unions;

/**
 * 959.由斜杠划分区域
 */
public class regionsBySlashes {
    public int solution(String[] grid){
        return 1;
    }

    public static void main(String[] args) {

    }
    class DSU{
        int[] parent;
        public DSU(int N){
            parent=new int[N];
            for (int i=0;i<N;i++){
                parent[i]=i;
            }
        }

        public int find(int x){
            while (parent[x]!=x){
                x=parent[x];
            }
            return x;
        }

        public void union(int x,int y){
            parent[find(x)]=find(y);
        }
    }
}
