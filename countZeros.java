public class countZeros {
    static int res=0;
    static int countzero(int n){
        if(n==0){
            return 1;
        }
     
        if(n%10==0){
            res++;
        }
        countzero(n/10);
        return res;

    }
    public static void main(String[] args) {
        System.out.println(countzero(304));
    }
}
