public class QuickSort 
{

public static void quickSort(int[] array, int low, int high)
{
    if(low >= high) return;

     int pivot = array[high];
     int leftPointer = low;
     int rightPointer = high;
     while(leftPointer  < rightPointer)
    {
            while(array[leftPointer] <= pivot && leftPointer < rightPointer)
            {
                leftPointer++;

            }   
            
            while(array[rightPointer] >= pivot && leftPointer < rightPointer)
            {
                rightPointer--;
            }

            swap(array, leftPointer, rightPointer);

     }
     swap(array, leftPointer, high);
     
     quickSort(array, low, leftPointer-1); //quicksorts left partition
     quickSort(array, leftPointer+1, high);

     
}
private static void swap(int[] array, int index1, int index2)
{
    int temp =  array[index1];
    array[index1] = array[index2];
    array[index2] = temp;

}



}
