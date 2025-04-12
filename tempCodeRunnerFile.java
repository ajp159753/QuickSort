public class Main {
    public static void main(String[] args)
    {
    int[] arr = {8,2,4,7,1,3,9,6,5};
    
    QuickSort.quickSort(arr, 0, arr.length - 1);
    
    printArray(arr);




}

public static void printArray(int[] arr)
{
    for(int i = 0; i < arr.length; i++)
    {
        System.out.print(arr[i] + " ");
    }
    System.out.print("\n");
}

}

