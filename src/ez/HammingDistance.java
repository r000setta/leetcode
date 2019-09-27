package ez;

/**
 *461.汉明距离
 */
public class HammingDistance {
    public int solution(int x,int y){
        return Integer.bitCount(x^y);
    }
}