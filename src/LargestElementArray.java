public class LargestElementArray {
    public static void main(String args[])
    {
        int arr[] = {9,29,89,99};
        int max = arr[0];
        for(int s=0; s<arr.length; s++)
        {
            if(max < arr[s])
            {
                max = arr[s];
            }
        }
        System.out.print(max);
    }
}
