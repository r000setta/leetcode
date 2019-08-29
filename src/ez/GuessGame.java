package ez;

/**
 * 374.猜数字大小
 */
public class GuessGame {

    public int solution(int n){
        int low=1;
        int high=n;
        while (low<=high){
            int mid=(high+low)/2;
            int res=guess(mid);
            if (res==0)
                return mid;
            else if (res<0)
                low=mid+1;
            else
                high=mid-1;
        }
        return -1;
    }

    private int guess(int n){
        return n;
    }
}
