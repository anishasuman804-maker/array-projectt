class array
{
    public static void main(String[] args)
    {
        int arr[] = {5, 2, 9, 1, 6};  
        int i, j, temp;
        for(i = 0; i < 5; i++)
        {
            for(j = i + 1; j < 5; j++)
            {
                if(arr[i] > arr[j])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Sorted Array:");

        for(i = 0; i < 5; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}