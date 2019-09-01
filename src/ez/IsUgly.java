package ez;

/**
 * 263.丑数
 */
public class IsUgly {
    public static boolean solution(int num){
        if (num>0){
            for (int i=2;i<num;i++){
                if (num%i==0){
                    if ((i!=2&&i!=3&&i!=5))
                        return false;
                }
            }
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(solution(14));
    }
}