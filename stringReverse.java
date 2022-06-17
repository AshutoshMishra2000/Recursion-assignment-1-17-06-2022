public class stringReverse {
    static String res="";
    public static String reverse(String str){
if(str.length()==0){
    return "";
   
}
//both lines are correct
return str.charAt(str.length()-1)+reverse(str.substring(0, str.length()-1));
//return String.valueOf(str.charAt(str.length()-1)).toString()+reverse(str.substring(0, str.length()-1));


    }
    public static void main(String[] args) {
      System.out.println(reverse(("ashutosh")));  
    }
}
