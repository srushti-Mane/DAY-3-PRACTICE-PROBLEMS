public class EvenPositinArray {
    public static void main(String[] args){
        int [] arr=new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        System.out.println("elements of array present on even position : ");
      for(int s=1; s < arr.length; s=s+2){
          System.out.println(arr[s]);
      }
    }
}
