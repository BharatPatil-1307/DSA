public class Program11
{
    public static void main(String[] args)
    {
        int[] Arr = {10, 20, 30, 20, 40, 10};

        int icount = 0;
        for(int i = 0; i < Arr.length; i++)
        {
            for(int j = i + 1; j < Arr.length; j++)
            {
                if(Arr[i] == Arr[j])
                {
                    System.out.println(Arr[i]);
                }
            }
        }
    }
}
