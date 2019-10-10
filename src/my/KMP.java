package my;

public class KMP {
    private int[] getNext(String s){
        int[] res=new int[s.length()+2];
        res[0]=-1;
        int j=-1;
        for (int i=0;i<s.length();i++){
            if (j==-1||s.charAt(i)==s.charAt(j)){
                i++;
                j++;
                res[i]=j;
            }else {
                j=res[j];
            }
        }
        return res;
    }

    public int kmp(String s,String p){
        int[] next=getNext(s);
        int i=0;
        int j=0;
        while (i<s.length()&&j<p.length()){
            if (j==-1||s.charAt(i)==p.charAt(j)){
                ++i;
                j++;
            }else {
                j=next[j];
            }
        }
        if (j==p.length()){
            return i-j;
        }
        else
            return -1;
    }

    public static void main(String[] args) {
        KMP kmp=new KMP();
        System.out.println(kmp.kmp("ababababac","babac"));
    }
}