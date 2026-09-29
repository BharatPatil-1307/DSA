public class Program13
{
    public static void main(String[] args)
    {
        int[] Arr = {1, 2, 4, 5};

        int iSum = 0;
        for(int i = 0; i < Arr.length; i++)
        {
            iSum += Arr[i];
        }

        int n = Arr.length + 1;

        int expectedSum  = n * (n + 1) / 2;
        int missing = expectedSum - iSum;

        System.out.println("Missing number is : "+ missing);
    }
}
