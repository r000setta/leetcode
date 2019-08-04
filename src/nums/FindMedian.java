package nums;

import java.util.ArrayList;
import java.util.List;

public class FindMedian {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        if(m>n){
            int[] temp=nums1;nums1=nums2;nums2=temp;
            int tmp=m;m=n;n=tmp;
        }
        int iMin=0,iMax=0,halfLen=(m+n+1)/2;
        return 0;
    }

    public static void main(String[] args) {
        int[] a1=new int[]{};
        int[] a2=new int[]{3,4};
        System.out.println(findMedianSortedArrays(a1,a2));
    }
}
