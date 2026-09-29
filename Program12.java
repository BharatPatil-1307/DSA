public class Program12
{
    public static void main(String[] args)
    {
        int[] Arr = {0, 1, 0, 3, 12};

        int index = 0;

        for(int i = 0; i < Arr.length; i++)
        {
            if(Arr[i] != 0)
            {
                Arr[index] = Arr[i];
                index++;
            }
        }

        while(index < Arr.length)
        {
            Arr[index] = 0;
            index++;
        }

        for(int i = 0; i < Arr.length; i++)
        {
            System.out.print(Arr[i] + "\t");
        }
    }
}