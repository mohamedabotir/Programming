public class Main {
   static int sum(int arr[], int n)
    {
       if (n==1) return arr[0];
       else return sum(arr,n-1)+arr[n-1];

    }
    public static void  main(String args[])
    {
        int arr[]={12,3,4,2};
System.out.println(        sum(arr,4));

    }
}
