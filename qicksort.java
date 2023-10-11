//wap to perform  quick sort using recursion
public class two
{
    public static void printarray(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void quickSort(int arr[],int si,int ei)
    {
        //base case
        if(si >= ei)
        {
            return;
        }
        int pidx=partition( arr, si, ei);//pivot at the last
        quickSort(arr, si, pidx-1);//smaller than the pivot
        quickSort(arr, pidx+1, ei);//larger than the pivot
    }
   public static int partition(int arr[],int si,int ei)
   {
     int pivot=arr[ei];
     int i=si-1;//for taking the small value into the left
     for(int j=si;j<ei;j++)
     {
        if(arr[j] <= pivot)
        {
            i++;
            //swap
            int temp=arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
        }
     }
     i++;
     //for taking the pivot into the right place
     int temp=arr[ei];
     arr[ei]=arr[i];//pivot=arr[i] -> it gives wrong because we have to change the value 
     arr[i]=temp;
     return i;

   }
        
    
    public static void main(String[]args)
    {
        int arr[]={6,3,8,2,9,5,-5};
         quickSort(arr, 0, arr.length-1);
        printarray(arr);
    }
}
