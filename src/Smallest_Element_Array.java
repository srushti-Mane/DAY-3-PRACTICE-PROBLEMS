public class Smallest_Element_Array {
    public static void main(String args[])
    {
        int arr[] = {9,29,25,98};
        int min = arr[0];
        for(int s=0; s<arr.length; s++)
        {
            if(min > arr[s])
            {
                min = arr[s];
            }
        }
        System.out.print(min);
    }
}
