package nums;

/**
 * 7.整数反转
 */
public class ConvertInteger {
    static public int reverse(int x){
        boolean flag=x<0?true:false;
        x=Math.abs(x);
        StringBuilder num=new StringBuilder();
        if (flag){
            num.append('-');
        }
        while (x!=0){
            int res=x%10;
            num.append(String.valueOf(res));
            x/=10;
        }
        String res=num.toString();
        try {
            return Integer.parseInt(res);
        }catch (Exception e){
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(reverse(-123));
    }
}
