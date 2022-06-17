public class Sorted_Or_Not {
    
    static boolean isSorted(int arr[],int start ){
       if(start==arr.length-1||start==arr.length){
        return true;
       }
       if(arr[start]>arr[start+1]){
        return false;
       }

        return isSorted(arr, start+1);
      
    }public static void main(String[] args) {
        int arr[]={10,2,3,4,5};
       if(isSorted(arr,0)){
        System.out.println("Sorted");
       }
       else{
        System.out.println("Not Sorted");
       }
    }
}
