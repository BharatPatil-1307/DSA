public class Program6
{
    public static void main(String[] args)
    {
        int[] Arr = {13 , 11 , 2 , 56 , 34};

        int start = 0;
        int end = Arr.length -1;

        while(start < end)
        {
            int temp = Arr[start];

            Arr[start] = Arr[end];
            Arr[end] = temp;

            start++;
            end--;
        }

        for(int i = 0; i < Arr.length; i++)
        {
            System.out.print(Arr[i] + "\t");
        }
    }
}
