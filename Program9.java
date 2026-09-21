public class Program9
{
    public static void main(String[] args)
    {
        int[] Arr = {10, 20, 30, 40, 50};

        int start = Arr[0];
        int end = Arr.length - 1;

        while(start < end)
        {
            int temp = start;
            start = end;
            end = temp;
            start++;
            end--;
        }

        for(int i = 0; i < Arr.length; i++)
        {
            System.out.print(Arr[i] + "\t");
        }
    }
}
