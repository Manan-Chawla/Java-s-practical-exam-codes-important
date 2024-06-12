public class j01 {
    public static void main(String[]args)
    {
        System.out.println("Hello world");
        // Question 1 : Highest number from array
        int arr[]={12,134,12,34,54};
        int largest=arr[0];

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>largest)
            {
                largest=arr[i];
            }
        }
        System.out.println("The largest value is : "+largest);
    }
}
