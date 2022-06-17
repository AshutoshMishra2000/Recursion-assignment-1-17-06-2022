public class digitSum {
    static int res=0;
    //cannot make calculation at class level
    // int a=100;
    // a=a+200;
    static int countzero(int n){
        if(n==0){
            return 0;
        }
     
       res+=n%10;
        countzero(n/10);
       return res;

    }
    
    public static void main(String[] args) {
        System.out.println(countzero(867));
      //  System.out.println(res);
    }
}
