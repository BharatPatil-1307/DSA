public class Program2
{
    public static void main(String[] args)
    {
        int[] Arr = {13 , 34 , 2 , 56 , 34};

        int iSum = 0;

        for(int i = 0; i < Arr.length; i++)
        {
            iSum = iSum + Arr[i];
        }

        System.out.println("Sum is : " + iSum);
    }
}
