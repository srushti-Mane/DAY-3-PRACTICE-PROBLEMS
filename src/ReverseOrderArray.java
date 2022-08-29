public class ReverseOrderArray {
    public static void main(String args[])
    {

        int arr[] = {10, 30, 88, 89, 99, 9, 29};

        int n=arr.length;
        for(int i=n-1; i>=0; i--)
            System.out.print(arr[i]+" ");
    }
}
