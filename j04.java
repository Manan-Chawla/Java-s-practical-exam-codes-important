public class j04 {
    public static void main(String[]args)
    {
        // Question 4 : creation of 1d and 2d array
        int arr[]={100,200,300,400};
        for(int i=0;i<arr.length;i++)
        {
            System.out.println("elements ---> "+arr[i]);
        }
        System.out.println("==================================");
        int arrs[][]={
                {
                    100,200,300
                },
                {
                    400,500,600
                },
                {
                    700,800,900
                }
        };
        for(int i=0;i<arrs.length;i++)
        {
            for (int j=0;j<arrs.length;j++)
            {
                System.out.println("Elements ----> "+arrs[i][j]);
            }
        }
        System.out.println("Aakrti is a girl who is student of Bless kids paradise");
    }
}
