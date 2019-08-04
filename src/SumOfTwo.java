public class SumOfTwo {
    public static void main(String[] args) {
//        int[] a=new int[]{2,1,11,7,15};
//        System.out.println(twoSum(a,9));
    }

    static public int[] twoSum(int[] nums,int target){
        int[] a=new int[2];
        for(int i=0;i<nums.length;i++){
            for (int j=i+1;j<nums.length;j++){
                if (nums[i]+nums[j]==target){
                    a[0]=i;
                    a[1]=j;
                    break;
                }
            }
        }
        return a;
    }
}
